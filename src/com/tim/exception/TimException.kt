package com.tim.exception

/**
 * @Author donnie {donnie4w@gmail.com}
 * @Date 2017/7/13
 */
class TimException:Exception{
    constructor(message :String):super(message){}
    constructor(e:Exception):super(e){}
    constructor(message: String,e:Exception):super(message,e){}
}