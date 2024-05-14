package com.example.hopedemo.aglo.sorts_11

/**
 * description: com.example.hopedemo.aglo.sorts_11
 * *
 * author: developer
 * *
 * create: 2024/5/13
 */
class Sorts {
    /**
     * 冒泡排序，时间复杂度 最大O平方，最小O n，是原地排序算法，是稳定排序算法
     */
    fun bubbleSort(array:IntArray, len:Int){
        for(i in 0 until len step 1){
            var isSwaped = false
            for (j in 0 until (len - i - 1) step 1) {
                if (array[j] > array[j + 1]) {
                    //此次冒泡有数据交换
                    isSwaped = true
                    ////因为这里有3个赋值语句，所以导致冒泡排序不如插入排序效率高（插入排序只有一个赋值语句）
                    var temp = array[j + 1]
                    array[j + 1] = array[j]
                    array[j] = temp
                }
            }
            if(!isSwaped){///没有数据交换了，说明已经是有顺序的了，此时不用遍历了
                break;
            }
        }
    }

    /**
     * 插入排序，时间复杂度 最大O平方，最小O n，是原地排序算法，是稳定排序算法,
     * 因为里面的for循环涉及到了一次交换过程，这里是比冒泡更好的地方
     */
    fun insertionSort(array: IntArray, len: Int){
        for(i in 1 until len step 1){
            var tempVal = array[i]
            var m = i - 1 ///在以排序区间 从后到前好处理一些

            ///查找要插入的位置并移动数据
            for(j in i - 1 downTo  0 step 1){///因为j和m一样命名在kotlin中还是2个变量，所以没共用
                if(array[j] > tempVal){
                    ////这里涉及到了一次交换过程，这里是比冒泡更好的地方
                    array[j + 1] = array[j]
                }else{
                    break
                }
                m--
            }
            array[m + 1] = tempVal
        }
    }

    /**
     * 选择排序，时间复杂度 最大O平方，最小O平方，是原地排序算法，但是不是稳定排序算法，而且最好最坏的时间复杂度
     * 都一样，所以不实用，只做了解
     */
    fun selectionSorts(array: IntArray, len: Int){
        if(array == null || array.isEmpty() || array.size == 1){
            return
        }

        for(i in 0 until len step 1){
            var minValue = array[i]
            var minIndex = i
            for (j in i until len step 1) {
                if (array[j] < minValue) {
                    minValue = array[j]
                    minIndex = j
                }
            }

            array[i] = array[minIndex]
            array[minIndex] = minValue
        }
    }

    fun printAll(array: IntArray):String {
        return array.joinToString()
    }
}