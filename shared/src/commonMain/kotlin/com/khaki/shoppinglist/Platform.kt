package com.khaki.shoppinglist

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform