package com.example.hopedemo.algo.sorts_11

import com.example.hopedemo.aglo.sorts_11.Sorts
import org.junit.Assert
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
        var sourceArr = intArrayOf(4,5,6,3,2,1)
        val sorts = configBubbleSorts(sourceArr)
        Assert.assertEquals("1, 2, 3, 4, 5, 6", sorts.printAll(sourceArr))
    }

    @Test fun testBubbleSepcialTest(){
        var sourceArr = intArrayOf(1)
        val sorts = configBubbleSorts(sourceArr)
        Assert.assertEquals("1", sorts.printAll(sourceArr))
    }

    @Test fun testBubbleEmptyTest(){
        var sourceArr = intArrayOf()
        val sorts = configBubbleSorts(sourceArr)
        Assert.assertEquals("", sorts.printAll(sourceArr))
    }

    @Test fun testInsertion(){
        var sourceArr = intArrayOf(4,5,6,3,2,1)
        val sorts = configInsertSorts(sourceArr)
        Assert.assertEquals("1, 2, 3, 4, 5, 6", sorts.printAll(sourceArr))
    }

    @Test fun testInsertionEmpty(){
        var sourceArr = intArrayOf()
        val sorts = configInsertSorts(sourceArr)
        Assert.assertEquals("", sorts.printAll(sourceArr))
    }

    @Test fun testSelectionSort(){
        var sourceArr = intArrayOf(4,5,6,3,2,1)
        val sorts = Sorts().also {
            it.insertionSort(sourceArr, sourceArr.size)
        }
        Assert.assertEquals("1, 2, 3, 4, 5, 6", sorts.printAll(sourceArr))
    }

    private fun configBubbleSorts(array: IntArray):Sorts{
        return Sorts().also {
            it.bubbleSort(array, array.size)
        }
    }

    private fun configInsertSorts(array: IntArray):Sorts{
        return Sorts().also {
            it.insertionSort(array, array.size)
        }
    }
}