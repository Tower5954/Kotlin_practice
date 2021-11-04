package com.example.kotlin_three

fun main(){


    // var and val

    var age : Int = 39
   // var candy : String


    // strings

   // candy = "cadburys"

    // ------------------------------ maths in kotlin --------------------------------------------

   // var wallet : Int = 15 // starting wallet amount

    // wallet = 10 // after shops

    // wallet = 30 // after work

    // wallet = wallet - 10 // after night out
    // wallet -= 10

    //wallet += 40 // same principal as previous code, just another way of writing it

    //println(wallet)

//    var pi = 3.14159265358 // called a 'Double' not a Float
//    var radius = 5
//
//    var circumference = pi * radius * 2
//    println(circumference)
//
//    var circum = pi.toInt() * radius * 2
//    println(circum)
//
//    var weight = 20
//
//    weight -= 5
//    println(weight)

    // ----------------------------- If statements and Booleans --------------------------------

    var isTheLightOn : Boolean = true

    // if statement

//    if (isTheLightOn) {
//
//        println("Walk across the room")
//    } else {
//
//        println ("Don't move a muscle")
//    }
//
//    var canRide : Boolean = age > 40
//
//        if (canRide) {
//            println("Enjoy your night")
//        } else {
//            println("Sorry son...try another night ")
//        }

    // age >= 20 (means 20 or older the following argument means older than 20)
//    if (age > 20) {
//        println("Enjoy your night")
//    } else {
//        println("Sorry son...try another night ")
//    }

    // ----------------------- list and arrays---------------------------------------------

//    var topChocolate = listOf("Cadburys", "Double Decker", "Flake")
//    var topChocolate : List<String> = listOf("Cadburys", "Double Decker", "Flake")

//    var topShows : Array<String> = arrayOf("Sopranos", "The Wire", "Rick & Morty")
//    topShows[2] = "Breaking Bad"

//    var newTopShows  = mutableListOf("Sopranos", "The Wire", "Breaking Bad")
//    newTopShows.add(2, "Rick & Morty")
//    newTopShows.remove("Breaking Bad")
//    newTopShows.add(3, "Loki")
//
//    println(topChocolate[1])
//    println(topShows[1])
//    println(newTopShows[2])
//    println(newTopShows[3])

//    for (x in 1..10){
//        println(x)
//    }
//
//    for (x in newTopShows){
//        println(x)
//    }
//
//    for (x in 0..newTopShows.size-1) {
//        newTopShows[x] = "##" + newTopShows[x] + "##"
//        println(newTopShows[x])
//
//    }
//
//    for (num in 1..1000) if (num > 453){
//        println(num)
//    }
    // ---------------------------- Functions ----------------------------------------------
//    fun printHello(){
//        println("HELLO WORLD!")
//    }
//    printHello()


//    fun addTwoNumbers(number1 : Int, number2 : Int){
//        println(number1 + number2)
//
//    }


//    fun addTwoNumbers(number1 : Int, number2: Int ) : Int{
//        return number1 + number2
//
//    }
//
//    var newNumber = addTwoNumbers(50, 9)
//
//    var newerNumber = addTwoNumbers(addTwoNumbers(15, 15), addTwoNumbers(20,9) )
//
//    println(newNumber)
//
//    println(newerNumber)
//
//
//    fun dogInfo(name:String, age:Int) : String{
//        return "Hello, this is " + name + ", I am " + age + " years old"
//    }
//
//    dogInfo("geoff", 32)
//    println(dogInfo("geoff", 32))


    //-----------------------------Classes---------------------------------------#

    class Dog() {
        var name = ""
        var age = 0
        var furColour = ""

    }

    var myDog = Dog()
    myDog.age = 42
    myDog.name = "Geoff"
    myDog.furColour = "Purple"

    class DogInfo() {
        var name = ""
        var age = 0
        var furColour = ""
        var temprament = ""

        fun dogInfo(): String {
            return name + " is " + age + " he has " + furColour + " fur and is " + temprament
        }

    }

    var sale = DogInfo()
    sale.name = "Dave"
    sale.age = 38
    sale.furColour = "white"
    sale.temprament = "a little bit strange."


    println(sale.dogInfo())


}


