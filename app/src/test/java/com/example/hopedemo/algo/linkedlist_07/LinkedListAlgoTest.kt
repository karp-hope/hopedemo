package com.example.hopedemo.algo.linkedlist_07

import com.example.hopedemo.aglo.linkedlist_07.LinkedListAlgo
import org.junit.Assert
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

    @Test
    fun `test circlr list`() {
        var listAlgo = LinkedListAlgo()
        insertValueToList(intArrayOf(10, 5, 4, 3, 2, 1), listAlgo)
        Assert.assertFalse(listAlgo.checkCircle(listAlgo.head))
    }

    @Test
    fun `test real circlr`(){
        var listAlgo = LinkedListAlgo()
        insertValueToList(intArrayOf(10, 5, 4, 3, 2, 1), listAlgo)
        Assert.assertFalse(listAlgo.checkCircle(listAlgo.head))

        listAlgo.transformListToCircle()
        Assert.assertTrue(listAlgo.checkCircle(listAlgo.head))
    }

    @Test fun testMergeSortedList(){
        createListAlgo(intArrayOf(10, 5, 4, 3, 2, 1)).let {
            var info = it.mergeSortedList(createListAlgo(intArrayOf(2,3,6,8,10)).head,
                createListAlgo(intArrayOf(1,3,5,7,9)).head)

            it.printAll(info)
        }
//        LinkedListAlgo().printAll(result)
    }

    private fun createListAlgo(sourceArray: IntArray):LinkedListAlgo{
        var listAlgo = LinkedListAlgo()
        insertValueToList(sourceArray, listAlgo)
        return listAlgo
    }

    private fun insertValueToList(sourceArray: IntArray, destList:LinkedListAlgo){
        for(i in sourceArray){
            destList.insertToHead(i)
        }
    }
}