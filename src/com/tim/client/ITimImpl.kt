package com.tim.client

import com.tim.packet.TimAckBean
import com.tim.packet.TimMBeanList
import com.tim.packet.TimMBean
import com.tim.packet.TimMessageIq
import com.tim.packet.Tid
import com.tim.packet.TimError
import com.tim.packet.TimPBean
import com.tim.packet.TimParam
import org.apache.thrift.TException


/**
 * @Author donnie {donnie4w@gmail.com}
 * @Date 2017/7/26
 */
class ITimImpl: IfaceImpl {
    // private static final Log logger = Log.getLogger();
    var connect: IConnect
    var client: Client

    constructor(connect: IConnect, client: Client){
        this.connect = connect
        this.client = client
    }

    @Throws(TException::class)
    override fun timStream(param: TimParam?) {

    }

    @Throws(TException::class)
    override fun timStarttls() {
    }

    @Throws(TException::class)
    override fun timLogin(tid: Tid?, pwd: String?) {
    }

    @Throws(TException::class)
    override fun timAck(ab: TimAckBean?) {
        val ackType = ab!!.getAckType()
        val ackStatus = ab.getAckStatus()
        client.initPing()
        if (ackType != null) {
            when (ackType) {
                "login" -> if ("200" == ackStatus) {
                    client.setFlow(Flow.AUTH)
                    client.setValid(true)
                }
            }
            try {
                connect.getAckListener().processAck(ab)
            } catch (e: Exception) {
                throw TException(e)
            }

        }
    }

    @Throws(TException::class)
    override fun timPresence(pbean: TimPBean?) {
        connect.getC2sClient().timAck(TimAckBean().setAckType("presence").setAckStatus("200").setId(pbean!!.getThreadId()))
        try {
            connect.getPresenceListener().processPresence(pbean)
        } catch (e: Exception) {
            throw TException(e)
        }

    }

    @Throws(TException::class)
    override fun timMessage(mbean: TimMBean?) {
        connect.getC2sClient().timAck(TimAckBean().setAckType("message").setAckStatus("200").setId(mbean!!.getThreadId()))
        try {
            connect.getMessageListener().processMessage(mbean)
        } catch (e: Exception) {
            throw TException(e)
        }

    }

    @Throws(TException::class)
    override fun timPing(threadId: String?) {
        if (client.getFlow() === Flow.AUTH) {
            connect.getC2sClient().timAck(TimAckBean().setAckType("ping").setId(threadId))
        }
    }

    @Throws(TException::class)
    override fun timError(e: TimError?) {
    }

    @Throws(TException::class)
    override fun timLogout() {
        client.close()
    }

    @Throws(TException::class)
    override fun timRegist(tid: Tid?, auth: String?) {
    }

    @Throws(TException::class)
    override fun timMessageIq(timMsgIq: TimMessageIq?, iqType: String?) {
    }

    @Throws(TException::class)
    override fun timMessageResult(mbean: TimMBean?) {
        connect.getC2sClient().timAck(TimAckBean().setAckType("message").setId(mbean!!.getThreadId()))
        connect.getMessageListener().loadMessage(mbean)
    }

    @Throws(TException::class)
    override fun timMessageList(mbeanList: TimMBeanList?) {
        connect.getC2sClient().timAck(TimAckBean().setAckType("message").setAckStatus("200").setId(mbeanList!!.getThreadId()))
        try {
            connect.getMessageListener().processMessage(mbeanList!!.getTimMBeanList())
        } catch (e: Exception) {
            throw TException(e)
        }
    }
}