package com.example.hopedemo.algo.linkedlist_07

import com.example.hopedemo.aglo.linkedlist_07.LinkedListAlgo
import org.junit.Test

/**
 * description: com.example.hopedemo.algo.linkedlist_07
 * *
 * author: developer
 * *
 * create: 2024/5/8
 */
class LinkedListAlgoTest {

    @Test fun `test reverse`(){
        LinkedListAlgo().also {
            it.insertToHead(10)
            it.insertToHead(5)
            it.insertToHead(4)
            it.insertToHead(3)
            it.insertToHead(2)
            println("before reverse")
            it.printAll(it.head)
            it.reverse(it.head)
            println("after reverse")
            it.printAll(it.head)
        }

    }
}