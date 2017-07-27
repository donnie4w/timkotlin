package com.tim.client

import com.tim.listener.*
import com.tim.packet.ITim


/**
 * @Author donnie {donnie4w@gmail.com}
 * @Date 2017/7/27
 */
interface  IConnect{
    fun getMessageListener(): MessageListener

    fun setMessageListener(ml: MessageListener)

    fun getPresenceListener(): PresenceListener

    fun setPresenceListener(pl: PresenceListener)

    fun getAckListener(): AckListener

    fun setAckListener(al: AckListener)

    fun getC2sClient(): C2sClient

    fun getTimClient(): ITim.Client

    fun getFlow(): FlowConnect

    fun setFlow(fw: FlowConnect)

    fun close()
}