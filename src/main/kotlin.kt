package main

fun myFunction(fname: String, age: Int)
{
    println(fname + " is " + age)
    println("I just got executed!")
}

fun newFunction(x: Int): Int
{
    return (x + 5)
}

fun thirdFunction(x: Int, y: Int): Int /* after paranthesis can be written like this = x + y */
{
    return (x + y)
}

class Car {
    var brand = ""
    var model = ""
    var year = 0
    fun drive() {
        println("Wroom!")
    }
    fun speed(maxSpeed: Int) {
        println("Max speed is: " + maxSpeed)
    }
}

class Cars(var brand: String, var model: String, var year:Int)


fun main() {
    val myNum = 1.997
    val mynumb = 1.886
    val calc : Double = mynumb + myNum
    println(calc)

    val x: Int = 5
    val y: Long = x.toLong()
    println(y)

    var firstName = "Razvan"
    var lastName = "Bustiuc"
    println("My name is " + firstName + " " + lastName)

    val isKotlinFun = true
    val isFishTasty = false
    println("Is kotlin fun? " + isKotlinFun)
    println("Is fish tasty? " + isFishTasty)

    val xy = 10
    val yx  = 9
    println(xy == yx)


    val numberOne = 28
    val numberTwo = 28
    if (numberOne > numberTwo){
        println("$numberOne is greater than $numberTwo")
    } else if (numberOne < numberTwo){
        println("$numberOne is not greater than $numberTwo")
    } else {
        println("The numbers are equal")
    }


    val time = 20
    val greeting = if(time < 10)"Good morning" else "Good evening"
    println(greeting)


    val day = 7
    val result = when (day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)


    var i = 0
    while (i < 5){
        println(i)
        i++
    }


    var b = 0
    do {
        println(b)
        b++
    }
        while(b > 5)


    var k = 0
    while (k < 10){
        println(k)
        k++
        if (k == 4) {
            break
        }
    }


    var l = 0
    while (l < 10) {
        if (l == 4) {
            l++
            continue
        }
        println(l)
        l++
    }


    val cars = arrayOf("Volvo" , "BMW" , "Ford" , "Mazda")
    cars[0] = "Skoda"
    println(cars[0])
    println(cars.size)


    val myCars = arrayOf("Skoda" , "Dacia" , "Mazda")
    if ("Lada" in myCars) {
        println("You had this car")
    } else {
        println("You didn't have this car")
    }


    val newCars = arrayOf("Volvo" , "BMW" , "Ford" , "Mazda")
    for (x in newCars) {
        println(x)
    }


    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }

    for(chars in 'a'..'x') {
        println(chars)
    }


    for (myNewNr in 5..15) {
        println(myNewNr)
    }


    val myNumbers = arrayOf(2, 4, 6, 8)
    if (2 in myNumbers) {
        println("It exists")
    } else {
        println("It does not exist.")
    }


    for (nums in 5..15) {
        if (nums == 10) {
            break
        }
        println(nums)
    }


    myFunction("John", 35)
    myFunction("Jane", 32)
    myFunction("George", 15)

    var results = newFunction(3)
    println(results)

    var newResult = thirdFunction(3, 5)
    println(newResult)


    val c1 = Car()
    c1.brand = "Skoda"
    c1.model = "Octavia"
    c1.year = 2019
    c1.drive()
    c1.speed(200)

    val c2 = Car()
    c2.brand = "Mazda"
    c2.model = "CX5"
    c2.year = 2012
    c2.drive()
    c2.speed(180)

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    println(c2.brand)
    println(c2.model)
    println(c2.year)


}