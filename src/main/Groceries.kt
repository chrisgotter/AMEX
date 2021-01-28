const val APPLE_PRICE: Double = 0.60
const val ORANGE_PRICE: Double = 0.25
var appleStock: Int = 20
var orangeStock: Int = 20
fun main() {
    println("Please enter order")
    val orderString: String = readLine() as String
    calculatePrice(orderString)
}

/**
 * @param orderString a string comprised of 0 or more instances of "apple" and "orange" separated by "," and/or " "
 * @return the total price
 */
fun calculatePrice(orderString: String): Double {

    var apples: Int = 0
    var oranges: Int = 0
    orderString.split(" ", ",").forEach{
        if (it == "apple") {
            apples++
        } else if (it == "orange") {
            oranges++
        }
    }
    when {
        appleStock < apples && orangeStock < oranges ->
            throw Exception("only %d apples and %d oranges in stock".format(apples, oranges))
        appleStock < apples ->
            throw Exception("only %d apples in stock".format(apples))
        orangeStock < oranges ->
            throw Exception("only %d oranges in stock".format(oranges))
    }
    appleStock -= apples
    orangeStock -= oranges
    val total: Double = (apples / 2 + apples % 2) * APPLE_PRICE + (oranges / 3 * 2 + oranges % 3) * ORANGE_PRICE
    println("the cost of %2d apples and %2d oranges is: $%.2f".format(oranges, apples, total))
    return total
}
