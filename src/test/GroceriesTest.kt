package test
import calculate
import org.junit.Test
import kotlin.test.assertEquals

class GroceriesTest {
    @Test
    fun test10Apple0Orange() {
        assertEquals("the cost of 10 apples and 0 oranges is: $3.00", calculate("apple apple apple apple apple apple apple apple apple apple"))
    }
    @Test
    fun test9Apple0Orange() {
        assertEquals("the cost of 9 apples and 0 oranges is: $3.00", calculate("apple apple apple apple apple apple apple apple apple"))
    }
    @Test
    fun test9Apple4Orange() {
        assertEquals("the cost of 9 apples and 4 oranges is: $3.75", calculate("apple apple apple apple apple apple apple apple apple orange orange orange orange"))
    }
    @Test
    fun test0Apple4Orange() {
        assertEquals("the cost of 0 apples and 4 oranges is: $0.75", calculate("orange orange orange orange"))
    }
    @Test
    fun test0Apple5Orange() {
        assertEquals("the cost of 0 apples and 5 oranges is: $1.00", calculate("orange orange orange orange orange"))
    }
    @Test
    fun test0Apple6Orange() {
        assertEquals("the cost of 0 apples and 6 oranges is: $1.00", calculate("orange orange orange orange orange orange"))
    }
}