package com.example.hopedemo

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)

        var result = if( 1 == 2){
            println("111111")
            1
        }else{
            println("222222")
            2
        }

        println("result:${result}")
    }
}
