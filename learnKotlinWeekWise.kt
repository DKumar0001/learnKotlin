------|Week1|------INTRODUCTION TO KOTLIN---------------

fun main() {
    // Use print statements to output image
    println("     .....")
    println("  .         .")
    println(" .   0  0    .")
    println("  ...........")
    println("   .. __ ..")
    println("  . .|C_|. .")
    println(" .  ......  .")
    println("     .  .")
    println("     .  .")

    // Use a single print statement to output image
    println("     .....\n  .         .\n .   0  0    .\n  ...........\n   .. __ ..\n  . .|C_|. .\n .  ......  .\n     .  .\n     .  .  ")
}

----------|Week2|---------DATA TYPE VARIABLES---------------

fun main() { 
    
    // This program determines the user's age using  an arithmetic magic trick. 
    
    val userName = "Galina"
    var magicNum: Int

    magicNum = 2 * 5 

    magicNum += 3 

    magicNum *= 2 

    magicNum += 5

    magicNum -= 6
    
    println("$userName's age is $magicNum") 
}

-------------|Week 3|----------------Conditional Expressions--------

fun main() {
    val quizAnswer1 = 15
    var quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

    // Write your code below
    
    // Creating Quiz Questions
    println("What is 75 / 5?: ")
    var studentAnswer1 = Integer.valueOf(readLine())

    println("What is the value of y: 6 * 2y = 36")
    val studentAnswer2 = Integer.valueOf(readLine())

    println("What is the name of a triangle that has two equal sides: ")
    val studentAnswer3 = readLine()

    println("What is the value of 8 * 6 - (3 - 2): ")
    val studentAnswer4 = Integer.valueOf(readLine())


    // Grading the Quiz
    var points = 0
    // Question 1
    if(studentAnswer1 == quizAnswer1) {
        points += 25
    }

    // Question 2
    if (studentAnswer2 == quizAnswer2) {
        points += 25
    } else if (studentAnswer2 == quizAnswer2++ || studentAnswer2 == quizAnswer2--) {
        points += 20
        println("The answer $studentAnswer2 is within 1 point of $quizAnswer2")
    } else {
        points += 1
    }

    // Question 3
    if (studentAnswer3 == quizAnswer3) {
        points += 25
    } else if (studentAnswer3 == "equilateral") {
        points += 10
    } else {
        points += 1
    }

    // Question 4
    if (studentAnswer4 == quizAnswer4) {
        points += 25
    } else if (studentAnswer4 in 44..54) {
        points += 20
    } else {
        points += 1
    }


    // Returning a Final Grade
    when (points) {
        in 0..59 -> println("$points points is an F.")
        in 60..69 -> println("$points points is a D.")
        in 70..79 -> println("$points points is a C.")
        in 80..89 -> println("$points points is a B.")
        in 90..99 -> println("$points points is an A.")
        in 100..110 -> println("$points points is an A+.")
        else -> println("Not a valid value.")
    }
}

---------------|Week4|-------------COLLECTIONS

fun main() {
    // Write your code below 🏞
  
    val responsibilities = mutableListOf("feed the chimps", "play a random game", "conduct a health check on Foxie")
    var responsibilitiesComplete = 0
    var timeSpent = 0
    var totalShiftTime = 4
    val foxiesHealthCheck = mutableMapOf<String, Any?>()

    var chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

    // First responsibility
    println("First, ${responsibilities[0]}")

    println("Feeding Bonnie...")
    chimpsHaveEaten["Bonnie"] = true
    println("Feeding Jubilee...")
    chimpsHaveEaten["Jubilee"] = true
    println("Feeding Frodo...")
    chimpsHaveEaten["Frodo"] = true
    println("Feeding Foxie...")
    chimpsHaveEaten["Foxie"] = true
    timeSpent += 1
    responsibilitiesComplete++
    
    println("All chimps have now been fed! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

    // Second responsibility
    println("\nNext, ${responsibilities[1]}")

    val games = mutableSetOf("tug-of-war with a blanket", "catch and throw", "number game")
    val randomGame = games.random()

    println(randomGame)
    timeSpent += 1
    responsibilitiesComplete++
    println("Each animal has now played a game of $randomGame. You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

    // Third responsibility
    println("\nNext, ${responsibilities[2]}")

    foxiesHealthCheck.put("Temperature", 37.2)
    foxiesHealthCheck.put("Mood", "Happy")
    println("Foxie has a temperature of ${foxiesHealthCheck["Temperature"]} and is feeling ${foxiesHealthCheck["Mood"]}.")

    timeSpent += 1
    responsibilitiesComplete++
    println("You've now completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

    // Wrap up 
    if (timeSpent <= totalShiftTime && responsibilitiesComplete == responsibilities.size) {
        println("\nAwesome work! You've completed all of your responsibilites for the day, and you can clock out.")
    } else if (timeSpent >= totalShiftTime && responsibilitiesComplete == responsibilities.size){
        println("Great job today! You've completed all of your responsibilities but with over time.")
    } else {
        println("You went over time and did not complete all of your responsibilites.")
    }
}
------------|Week 5|------------LOOPS

fun main() {

  // Square Variables
  val sqSide = 7
  val sqChar1 = "X  "
  val sqChar2 = "O  "

  // Write your code below
  for (i in 1..sqSide) {
    for (j in 1..sqSide) {
      if (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 ==1) {
        print(sqChar1)
      } else {
        print(sqChar2)
      }
    }
    println()
  }
​
  // Triangle Variables
  val triRows = 10
  var triCount = 0
  var triRowLen = triRows
  val triChar1 = "/  "
  val triChar2 = "   "
  
  // Write your code below
  for (i in triRows downTo 1) {
    while (triCount < triRowLen) {
      triCount++
      print(triChar1)
    }
    println()
    triCount = 0
    triRowLen--
  }
​
  triRowLen = triRows
  for (i in triRows downTo 1) {
    while (triCount < triRowLen) {
      triCount++
      if (triCount != 1 && triCount != triRowLen && i != triRows) {
        print(triChar2)
      } else {
        print(triChar1)
      }
    }
    println()
    triCount = 0
    triRowLen--
  }
}

----------------|Week 6|-------------FUNCTIONS

fun getListOfNumbers(): List<Int> {
    var myList = mutableListOf<Int>()
    for (i in 1..7) {
        println("Enter a number")
        var numberInput = Integer.valueOf(readLine())
        myList.add(numberInput)
    }
    return myList
}

fun findMax(myList: List<Int>): Int {
    var largestNumber = myList[0]
    for (i in myList) {
        if (i > largestNumber) {
            largestNumber = i
        }
    }
    return largestNumber
}

fun findMin(myList: List<Int>): Int {
    var smallestNumber = myList[0]
    for (i in myList) {
        if (i < smallestNumber) {
            smallestNumber = i
        }
    }
    return smallestNumber
}

fun findAverage(myList: List<Int>): Int {
    var sum = 0
    for (i in myList) {
        sum += i
    }
    return sum / myList.size
}

fun checkForValue(myList: List<Int>, numToFind: Int): Boolean {
    for (i in myList) {
        if (i == numToFind) {
            return true
        }
    }
    return false
}
fun main() {
    var values = getListOfNumbers()
    println(values)
    var largestValue = findMax(values)
    println("The largest number is $largestValue.")
    var smallestValue = findMin(values)
    println("The smallest number is $smallestValue.")
    var average = findAverage(values)
    println("The average is $average.")
    println("What number should I check for?")
    var numToFind = Integer.valueOf(readLine())
    var containsValue = checkForValue(values, numToFind)

    if (containsValue) {
        println("$numToFind exists in the list.")
    } else {
        println("$numToFind does not exist in the list.")
    }

}

-------------------|Week 7|--------------CLASSES

class Calculator(val name: String) {

  init {
    println("$name's Calculator 🧮")
  }
  
  fun add(a: Int, b: Int): Int {
    return a + b
  }
  
  fun subtract(a: Int, b: Int): Int {
    return a - b
  }
  
  fun multiply(a: Int, b: Int): Int {
    return a * b
  }
  
  fun divide(a: Int, b: Int): Any {
    if (b == 0) {
      return "Error! Dividing by zero is not allowed." 
    } else {
      return a / b
    } 
  }
  
  fun power(a: Int, b: Int): Int {
    var result = 1

    for (i in 1..b) {
      result *= a
    } 
    return result
  } 
}
  
fun main() {
  var myCalculator = Calculator("Codey")
  println(myCalculator.add(5, 7))
  println(myCalculator.subtract(45, 11))
  println(myCalculator.divide(8, 0))
  println(myCalculator.power(2, 1))
}
