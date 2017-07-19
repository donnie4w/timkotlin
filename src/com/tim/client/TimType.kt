package com.tim.client

/**
 * @Author donnie {donnie4w@gmail.com}
 * @Date 2017/7/19
 */
enum class TimType {
    LOGIN("login"), PING("ping"), MESSAGE("message"), PRESENCE("presence"), OTHER("");

    var type: String

    constructor(type: String) {
        this.type = type;
    }

    companion object {
        fun getTimType(type: String): TimType {
            when (type) {
                "login" -> return LOGIN
                "ping" -> return PING
                "message" -> return MESSAGE
                "presence" -> return PRESENCE
                else -> return OTHER
            }
        }
    }
}