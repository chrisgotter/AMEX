package test
import calculatePrice
import org.junit.Test
import kotlin.test.assertEquals

class GroceriesTest {
    @Test
    fun test10Apple0Orange() {
        assertEquals(3.00, calculatePrice("apple apple apple apple apple apple apple apple apple apple"))
    }
    @Test
    fun test9Apple0Orange() {
        assertEquals(3.00, calculatePrice("apple apple apple apple apple apple apple apple apple"))
    }
    @Test
    fun test9Apple4Orange() {
        assertEquals(3.75, calculatePrice("apple apple apple apple apple apple apple apple apple orange orange orange orange"))
    }
    @Test
    fun test0Apple4Orange() {
        assertEquals(0.75, calculatePrice("orange orange orange orange"))
    }
    @Test
    fun test0Apple5Orange() {
        assertEquals(1.00, calculatePrice("orange orange orange orange orange"))
    }
    @Test
    fun test0Apple6Orange() {
        assertEquals(1.00, calculatePrice("orange orange orange orange orange orange"))
    }
}