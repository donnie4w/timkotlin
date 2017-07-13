package com.tim.listener

import com.tim.packet.TimAckBean
import com.tim.packet.TimMBean
import com.tim.packet.TimPBean

/**
 * @Author donnie {donnie4w@gmail.com}
 * @Date 2017/7/13
 */
open interface AckListener {
    fun AckListener(ab: TimAckBean)
}

open interface MessageListener {
    fun processMessage(mbean: TimMBean)
    fun processMessage(mbeans: Array<TimMBean>)
    fun loadMessage(mbean: TimMBean)
}

open interface PresenceListener {
    fun processPresence(pbean: TimPBean)
}