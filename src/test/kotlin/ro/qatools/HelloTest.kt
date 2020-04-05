package ro.qatools

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.*


class HelloTest {
    @Test
    fun test(){
        val a = 100
        println("Kotlin test")
        hello()
        assertThat(100).isEqualTo(a);
    }

    @Test
    fun failTest(){
        println("Kotlin failTest")
        //assertEquals(100, 200, "should fail")
    }
}
