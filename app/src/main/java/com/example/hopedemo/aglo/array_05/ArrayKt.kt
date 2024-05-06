package com.example.hopedemo.aglo.array_05

/**
 * description: com.example.hopedemo.aglo
 * *
 * author: developer
 * *
 * create: 2024/4/23
 */
class ArrayKt constructor(private val capacity: Int){
    private var secondProp = "sendProp:${capacity}".also(::println)

    //数组
    private var data: IntArray = IntArray(capacity)
    //数组大小
    private var count: Int = 0


    fun find(index: Int):Int{
        if(index !in (0 until count)){
            return -1;
        }
        return data[index];
    }

    fun insert(index: Int, value: Int):Boolean{
        if(count == capacity){
            "int array is full".also(::println)
            return false
        }

        if(index !in 0..count){
            "pos has element".also(::println)
            return false
        }

        count++;
        data[index] = value;
        return true
    }

    fun delete(index: Int):Boolean{
        if(index !in 0 until count){
            "index is wrong".also(::println)
            return false
        }
        ((index + 1) until count).forEach {
            data[it -1] = data[it]
        }
        --count;
        return true
    }

    fun printAll(){
        (0 until count).forEach {
            println("${data[it]}")
        }
    }
}