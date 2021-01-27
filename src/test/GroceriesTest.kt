package test
import calculate
import org.junit.Test
import kotlin.test.assertEquals

class GroceriesTest {
    @Test
    fun test1Apple0Orange() {
        assertEquals("the cost of 1 apples and 0 oranges is: $0.60", calculate("apple"))
    }
    @Test
    fun test2Apple1Orange() {
        assertEquals("the cost of 2 apples and 1 oranges is: $1.45", calculate("apple apple orange"))
    }
}