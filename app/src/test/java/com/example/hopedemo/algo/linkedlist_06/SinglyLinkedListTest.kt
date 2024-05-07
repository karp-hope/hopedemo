package com.example.hopedemo.algo.linkedlist_06

import com.example.hopedemo.aglo.linkedlist_06.SinglyLinkedList
import org.junit.Assert
import org.junit.Test

/**
 * description: com.example.hopedemo.algo.linkedlist_06
 * *
 * author: developer
 * *
 * create: 2024/5/7
 */
class SinglyLinkedListTest {

    @Test
    fun palindromeTest(){
        var singlyList = SinglyLinkedList()
//        val data = intArrayOf(1,2,3,5,6,7)
//        val data = intArrayOf(1,2,3,2,1)
        val data = intArrayOf(1,2,3,4,2,1)
        for (i in data){
            singlyList.insertToHead(i)
        }

        singlyList.printAll()

        Assert.assertFalse(singlyList.palindrome())
//        Assert.assertTrue(singlyList.palindrome())
    }
}