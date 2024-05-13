package com.example.hopedemo.aglo.sorts_11

import java.lang.RuntimeException

/**
 * description: com.example.hopedemo.aglo.sorts_11
 * *
 * author: developer
 * *
 * create: 2024/5/13
 */
class Sorts {
    fun bubbleSort(array:IntArray, len:Int){
        array.forEachIndexed { index, value ->

        }
    }

    fun printAll(array: IntArray) {
        val result = StringBuffer(100)
        array.forEachIndexed { index, i ->
            result.append("${i},")
        }
        println("result:${result}")
    }
}