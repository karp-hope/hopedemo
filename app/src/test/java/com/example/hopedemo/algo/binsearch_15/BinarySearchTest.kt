package com.example.hopedemo.algo.binsearch_15

import com.example.hopedemo.aglo.binsearch_15.BinarySearch
import org.junit.Assert
import org.junit.Test

/**
 * description: com.example.hopedemo.algo.binsearch_15
 * *
 * author: developer
 * *
 * create: 2024/5/22
 */
class BinarySearchTest {

    @Test fun testBinarySearch(){
        BinarySearch.binarySearch(intArrayOf(1,3,5,7,9,11,13), 11).also {
            Assert.assertEquals(5, it)
        }
    }
}