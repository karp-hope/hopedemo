package com.example.hopedemo.algo.sorts_12

import com.example.hopedemo.aglo.sorts_12.MergeSort
import org.junit.Assert
import org.junit.Test

/**
 * description: com.example.hopedemo.algo.sorts_12
 * *
 * author: developer
 * *
 * create: 2024/5/17
 */
class MergeSortTest {

    @Test
    fun testMerge() {
        var srcArray = intArrayOf(1, 4, 6, 2, 3, 5, 8, 9)
//        var srcArray = intArrayOf(2,1)
        MergeSort().mergeSortArray(srcArray, srcArray.size)
        println(srcArray.joinToString())
        Assert.assertTrue(srcArray.joinToString().equals("1, 2, 3, 4, 5, 6, 8, 9"))
    }
}