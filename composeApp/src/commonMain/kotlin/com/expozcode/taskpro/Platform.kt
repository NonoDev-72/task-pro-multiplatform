package com.expozcode.taskpro

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform