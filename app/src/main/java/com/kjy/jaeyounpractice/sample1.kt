package com.kjy.jaeyounpractice

fun main() {
}

// 4. 조건식

fun maxBy(a: Int, b: Int): Int {
    if(a > b) {
        return a
    }else {
        return b
    }

}
fun maxBy2(a: Int, b: Int)  = if(a>b) a else b

fun checkNum(score: Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
    }
    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b : ${b}")
    when(score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}


// Expression vs Statement

// 5. Array and List

// Array

// List. 1. List 2. MutableList
fun array() {
    val array   = arrayOf(1,2,3)
    val list    = listOf(1,2,3)

    val array2  = arrayOf(1, "d", 3.4f)
    val list2   = listOf(1, "d", 11L)

    //  array는 값 변경이 가능하지만, list 는 값을 가져오는것만 가능하다.
    array[0] = 3
    var result  = list.get(0)

    val arrayList       = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20
}

// 6. For / While ==   반복문
fun forAndWhile() {
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for (name    in students) {
        println("${name}")
    }

    for((index, name) in students.withIndex()) {
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for(i   in 1 until 100) { // 1..100
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10 ) {
        println("current index : ${index}")
        index++
    }
}

// 7. Nullable / NonNull
fun nullcheck(){
    // NPE : Null Point Exception

    var name = "joyce"

    var nullName : String? = null

    var nameInUpperCase      = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase()

    // ?:

    val lastName : String? = "Hong"

    val fullName = name + (lastName?: "No lastName")
    println(fullName)
}









// 1. 함수

fun helloWorld() {
    println("Hello World")
}

// 어떤 것을 return 하려면 타입 생략 불가
fun add(a: Int, b: Int): Int {
    return a+b
}

// 2. val vs var
// val = value
fun hi() {

    val a : Int = 10

    var b : Int = 9

    b = 100

    val c = 10
    var d = 100

}