package com.example.designpatterns.Patterns

import java.util.concurrent.atomic.AtomicInteger

object Singleton{

    private val counter = AtomicInteger(0)
    fun increment() = counter.incrementAndGet()

}