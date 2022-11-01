fun main() {
    print(solution(239017))
}

fun solution(n: Int): Boolean {
    val tempNumberString = n.toString()
    val firstHalf = tempNumberString.substring(0, tempNumberString.length / 2)
    val secondHalf = tempNumberString.substring(tempNumberString.length / 2, tempNumberString.length)

    var sumFirstHalf = 0
    var sumSecondHalf = 0

    for (i in firstHalf.indices) {
        sumFirstHalf += firstHalf[i].digitToInt()
        sumSecondHalf += secondHalf[i].digitToInt()
    }

    return sumFirstHalf == sumSecondHalf
}