fun main() {
    val amount = 100_000_000
    val fee = 0.0075
    val minFee = 3500
    val resultFee = if ((amount * fee) <= minFee ) amount - minFee else amount - (amount * fee)
    println(resultFee.toInt())

}

