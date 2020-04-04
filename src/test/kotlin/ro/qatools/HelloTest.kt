package ro.qatools

import kotlin.test.Test
import kotlin.test.assertEquals

class HelloTest {
    @Test
    fun test(){
        println("Kotlin test")
    }

    @Test
    fun failTest(){
        println("Kotlin failTest")
        //assertEquals(100, 200, "should fail")
    }
}
