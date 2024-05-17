package com.example.hopedemo.algo.sorts_12

import com.example.hopedemo.aglo.sorts_12.QuickSort
import org.junit.Assert
import org.junit.Test

/**
 * description: com.example.hopedemo.algo.sorts_12
 * *
 * author: developer
 * *
 * create: 2024/5/17
 */
class QuickSortTest {

    @Test fun testQuickSort(){
        var array = intArrayOf(1, 4, 6, 2, 3, 5, 8, 9)
        QuickSort.quickSortArray(array)
        Assert.assertTrue(array.joinToString() == "1, 2, 3, 4, 5, 6, 8, 9")
    }

}