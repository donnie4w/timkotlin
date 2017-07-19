package com.tim.client

import com.tim.config.Config
import com.tim.exception.TimException
import com.tim.listener.AckListener
import com.tim.listener.MessageListener
import com.tim.listener.PresenceListener



/**
 * @Author donnie {donnie4w@gmail.com}
 * @Date 2017/7/19
 */
interface  Client{
    /** 登陆  */
    @Throws(TimException::class)
    fun login(name: String, pwd: String)

    /** 发送信息  */
    @Throws(TimException::class)
    fun sendMessage(toName: String, msg: String, tidType: TidEnum)

    /** 关闭  */
    fun close()

    /** 注册消息监听器  */
    fun addMessageListener(messageListener: MessageListener)

    /** 注册出席协议监听器  */
    fun addPresenceListener(presenceListener: PresenceListener)

    /** 注册回执监听器  */
    fun addAckListener(ackListener: AckListener)

    /** 是否已经连接  */
    fun isConnect(): Boolean

    /** 是否已经登陆  */
    fun isLogin(): Boolean

    /** 流程节点  */
    fun setFlow(flow: Flow)

    /** 流程节点  */
    fun getFlow(): Flow

    /** 配置  */
    fun getConifg(): Config

    /** 是否有效  */
    fun isValid(): Boolean

    /** 加载信息  */
    @Throws(TimException::class)
    fun loadMessage(toNameList: List<String>, fromstamp: String, toStamp: String, limitCount: Int)

    /** 删除信息  */
    @Throws(TimException::class)
    fun delMessage(toName: String, mid: String)

    /** 删除信息  */
    @Throws(TimException::class)
    fun delAllMessage(toName: String)

    fun setValid(valid: Boolean)

    fun addPing()

    fun initPing()

    fun processError(error: Boolean)
}