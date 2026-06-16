fun getGrade(percentage: Double): String {
    if (percentage >= 90) {
        return "A"
    } else if (percentage >= 75) {
        return "B"
    } else if (percentage >= 60) {
        return "C"
    } else if (percentage >= 45) {
        return "D"
    } else {
        return "Fail"
    }
}

fun main() {
    val totalSubjects = 5
    var total = 0

    println("Enter marks of 5 subjects (out of 100):")

    for (i in 1..totalSubjects) {
        print("Subject $i: ")
        val mark = readLine()!!.toInt()
        total = total + mark
    }

    val percentage = total / 5.0
    val grade = getGrade(percentage)

    println("Total: $total")
    println("Percentage: $percentage%")
    println("Grade: $grade")
}