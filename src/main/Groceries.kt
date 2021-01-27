fun main() {
    println("Please enter order")
    val orderString: String = readLine() as String
    println(calculate(orderString))
}

/**
 * @param orderString a string comprised of 0 or more instances of "apple" and "orange" separated by "," and/or " "
 * @return a formatted string reporting the order and price
 */
fun calculate(orderString: String):String {

    val applePrice: Double = 0.60
    val orangePrice: Double = 0.25
    val orderList: List<String> = orderString.split(" ", ",")
    var appleCount: Int = 0
    var orangeCount: Int = 0

    for (item in orderList) {
        if (item == "apple") {
            appleCount++
        } else if (item == "orange") {
            orangeCount++
        }
    }
    val appleTotal = (appleCount / 2 + appleCount % 2) * 0.6
    val orangeTotal = (orangeCount / 3 * 2 + orangeCount % 3) * 0.25
    return "the cost of $appleCount apples and $orangeCount oranges is: $${String.format("%.2f", appleTotal + orangeTotal)}"
}
