package com.tim.client

import com.tim.packet.*

/**
 * @Author donnie {donnie4w@gmail.com}
 * @Date 2017/7/26
 */
open class  IfaceImpl : ITim.Iface {
    override fun timRemoteUserEdit(p0: Tid?, p1: TimUserBean?, p2: TimAuth?): TimRemoteUserBean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timResponseMessage(p0: TimMBean?, p1: TimAuth?): TimResponseBean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timRemoteUserGet(p0: Tid?, p1: TimAuth?): TimRemoteUserBean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timStream(p0: TimParam?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timLogin(p0: Tid?, p1: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timResponsePresenceList(p0: TimPBeanList?, p1: TimAuth?): TimResponseBean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timResponsePresence(p0: TimPBean?, p1: TimAuth?): TimResponseBean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timAck(p0: TimAckBean?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timMessageList(p0: TimMBeanList?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timPing(p0: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timPresenceList(p0: TimPBeanList?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timResponseMessageIq(p0: TimMessageIq?, p1: String?, p2: TimAuth?): TimMBeanList {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timPresence(p0: TimPBean?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timMessage(p0: TimMBean?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timLogout() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timProperty(p0: TimPropertyBean?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timStarttls() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timMessageIq(p0: TimMessageIq?, p1: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timError(p0: TimError?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timRoser(p0: TimRoster?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timRemoteUserAuth(p0: Tid?, p1: String?, p2: TimAuth?): TimRemoteUserBean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timMessageResult(p0: TimMBean?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timRegist(p0: Tid?, p1: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun timResponseMessageList(p0: TimMBeanList?, p1: TimAuth?): TimResponseBean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}