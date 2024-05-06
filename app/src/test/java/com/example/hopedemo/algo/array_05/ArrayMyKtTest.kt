package com.example.hopedemo.algo.array_05

import com.example.hopedemo.aglo.array_05.ArrayKt
import org.junit.Test

/**
 * description: com.example.hopedemo.algo
 * *
 * author: developer
 * *
 * create: 2024/4/24
 */
class ArrayMyKtTest {

    @Test fun `test init`(){
        val arrayKt = ArrayKt(5)
        arrayKt.printAll()

//        arrayKt.insert(0, 3)
        arrayKt.insert(0, 4)
        arrayKt.insert(1, 5)
//        arrayKt.insert(3, 9)
        arrayKt.insert(3, 10)

        arrayKt.printAll()
    }
}