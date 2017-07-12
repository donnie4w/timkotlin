package com.tim.config

import com.tim.packet.timConstants



/**
 * @Author donnie {donnie4w@gmail.com}
 * @Date 2017/7/12
 */
class Config{
    companion object {
        val ENCODE = "utf-8"
        val NS = "timkotlin"
        val VERSION = timConstants.protocolversionName
    }
    var domain = "donnie4w@gmail.com"
    var ip = "127.0.0.1"
    var port = 3737
    var heartbeat = 30// default 30second
    var reconnectionAllowed = true
    var connectTimeout = 10000 // default 30second
    var resource = "timclient"
    var loginName: String? = null
    var password: String? = null
    var TLS = false
    var TsslPort = 5757

}