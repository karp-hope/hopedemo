package com.example.hopedemo.aglo.sorts_13

/**
 * description: com.example.hopedemo.aglo.sorts_13
 * *
 * author: developer
 * *
 * create: 2024/5/20
 */
class BucketSort {

    companion object{
        fun bucketSort(array: IntArray, bucketSize:Int){
            if(array.size < 2){
                return
            }

            var minValue = array[0]
            var maxValue = array[1]
            array.forEachIndexed { index, i ->
                if(i < minValue)
                    minValue = i

                if(i > maxValue)
                    maxValue = i
            }



        }
    }
}