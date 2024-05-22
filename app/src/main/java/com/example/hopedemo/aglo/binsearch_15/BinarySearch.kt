package com.example.hopedemo.aglo.binsearch_15

/**
 * description: com.example.hopedemo.aglo.bitsearch_15
 * *
 * author: developer
 * *
 * create: 2024/5/22
 */
object BinarySearch {
    /**
     * 这种简单二分查找，元素不能重复
     */
    fun binarySearch(array: IntArray, searchValue:Int):Int{
        if(array.isEmpty())
            return -1

        var low = 0
        var high = array.size - 1

        while (low <= high){
            ///kotlin移位操作符：左移（shl）和右移（shr）,对计算机来说移位比除法效率高得多
            val mid = low + ((high - low) shr 1)
            if(array[mid] == searchValue){
                return mid
            }else if(array[mid] < searchValue){
                low = mid + 1
            }else {
                high = mid - 1
            }
        }
        return -1
    }

}