package com.example.hopedemo.algo.sorts_11

import com.example.hopedemo.aglo.sorts_11.Sorts
import org.junit.Test

/**
 * description: com.example.hopedemo.algo.sorts_11
 * *
 * author: developer
 * *
 * create: 2024/5/13
 */
class SortsTest {

    @Test fun testBubbleTest(){
        val sorts = Sorts()

        sorts.bubbleSort(intArrayOf(1, 2), 1)
        sorts.printAll(intArrayOf(1,2,3,4,5))

    }
}