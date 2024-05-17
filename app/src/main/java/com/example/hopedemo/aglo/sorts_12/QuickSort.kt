package com.example.hopedemo.aglo.sorts_12

/**
 * description: com.example.hopedemo.aglo.sorts_12
 * *
 * author: developer
 * *
 * create: 2024/5/16
 */
class QuickSort {
    companion object{
        fun quickSortArray(intArray: IntArray){
            quickSortInter(intArray, 0, intArray.size - 1)
        }

        private fun quickSortInter(intArray: IntArray, begin:Int, end:Int){
            if(begin >= end)
                return

            var partitionIndex = partition(intArray, begin, end)
            quickSortInter(intArray, begin, partitionIndex - 1)
            quickSortInter(intArray, partitionIndex + 1, end)
        }

        private fun partition(intArray: IntArray, begin: Int, end:Int):Int{
           var partition = intArray[end]
            var smallIdx = begin
            var idx = begin

            while (idx <= (end-1) && smallIdx <= (end - 1)){
                if(intArray[idx] < partition){
                    if (smallIdx == idx) {//同一个就不用做交换了
                        smallIdx++
                    } else {
                        var tempSmall = intArray[smallIdx];
                        intArray[smallIdx] = intArray[idx]
                        intArray[idx] = tempSmall
                        smallIdx++
                    }
                }
                idx++
            }
            intArray[end] = intArray[smallIdx]
            intArray[smallIdx] = partition
            return smallIdx
        }
    }
}