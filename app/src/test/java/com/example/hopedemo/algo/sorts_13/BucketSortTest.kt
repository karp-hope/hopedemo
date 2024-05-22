package com.example.hopedemo.algo.sorts_13

import com.example.hopedemo.aglo.sorts_13.BucketSort
import org.junit.Test
import java.util.Collections

/**
 * description: com.example.hopedemo.algo.sorts_13
 * *
 * author: developer
 * *
 * create: 2024/5/20
 */
class BucketSortTest {

    @Test
    fun testBucketSort(){
        var intArray = intArrayOf(1, 4, 6, 2, 3, 5, 8, 9)
        BucketSort.bucketSort(intArray, 10)

    }
}