package com.example.hopedemo.aglo.sorts_12

/**
 * description: com.example.hopedemo.aglo.sorts_12
 * *
 * author: developer
 * *
 * create: 2024/5/16
 */
class MergeSort {

    fun mergeSortArray(array:IntArray, length:Int){
        mergeSortInternal(array, 0, length - 1)
    }

    private fun mergeSortInternal(array: IntArray, begin:Int, end:Int){
        if(begin >= end)//递归终止条件
            return;

        var middle = begin + (end - begin) / 2
        mergeSortInternal(array, begin, middle)
        mergeSortInternal(array, middle + 1, end)

//        mergeIntoArray(array, begin, end, middle)
        mergeBySentry(array, begin, end, middle)
    }

    ///合并两个有序的数组
    private fun mergeIntoArray(array: IntArray, begin: Int, end: Int, middle:Int){
        var tempArray = IntArray(end - begin + 1) //申请一个大小跟a[p...r]一样的临时数组
        var first = begin
        var second = middle + 1
        var kIndex = 0

        while (first <= middle && second <= end) {
            if (array[first] > array[second]) {
                tempArray[kIndex] = array[second]
                second++
            } else {
                tempArray[kIndex] = array[first]
                first++
            }
            kIndex++
        }

        // 判断哪个子数组中有剩余的数据
        var tempStart = first
        var tempEnd = middle
        if(second <= end){
            tempStart = second
            tempEnd = end
        }

        // 将剩余的数据拷贝到临时数组tmp
        while (tempStart <= tempEnd){
            tempArray[kIndex++] = array[tempStart]
            tempStart++
        }
        ///将temp数组拷贝回原来数组
        for(i in 0 .. (end-begin) step 1){
            array[i + begin] = tempArray[i]
        }
    }

    private fun mergeBySentry(array: IntArray, begin: Int, end: Int, middle:Int){
        var leftTempArray = IntArray(middle - begin + 2)
        var rightTempArray = IntArray(end - middle + 1)

        for(i in begin .. middle step 1){
            leftTempArray[i - begin] = array[i]
        }
        leftTempArray[middle - begin + 1] = Int.MAX_VALUE

        for(i in middle + 1 .. end step 1){
            rightTempArray[i - middle - 1] = array[i]
        }
        rightTempArray[end - middle] = Int.MAX_VALUE

        var leftIdx = 0
        var rightIdx = 0
        var tempIdx = begin
        while (tempIdx <= end){
            if(leftTempArray[leftIdx] > rightTempArray[rightIdx]){
                array[tempIdx] = rightTempArray[rightIdx]
                rightIdx++
            }else{
                array[tempIdx] = leftTempArray[leftIdx]
                leftIdx++
            }
            tempIdx++
        }
    }
}