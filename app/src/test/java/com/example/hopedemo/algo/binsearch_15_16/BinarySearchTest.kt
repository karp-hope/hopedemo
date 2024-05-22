package com.example.hopedemo.algo.binsearch_15_16

import com.example.hopedemo.aglo.binsearch_15_16.BinarySearch
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
        BinarySearch.binarySearch(intArrayOf(8), 8).also {
            Assert.assertEquals(0, it)
        }
        BinarySearch.binarySearch(IntArray(0), 8).also {
            Assert.assertEquals(-1, it)
        }

        BinarySearch.binarySearchFirst(intArrayOf(1,3,4,5,6,8,8,8,11,18), 8).also {
            Assert.assertEquals(5, it)
        }
        BinarySearch.binarySearchFirst(intArrayOf(8), 8).also {
            Assert.assertEquals(0, it)
        }
        BinarySearch.binarySearchFirst(IntArray(0), 8).also {
            Assert.assertEquals(-1, it)
        }
    }
}