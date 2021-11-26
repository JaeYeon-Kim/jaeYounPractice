package com.kjy.jaeyounpractice

import java.lang.Exception


//// lateinit 키워드 사용
//
//lateinit var data1: Int // 오류
//lateinit var data2:String   // 성공
//lateinit val data3          // 오류
//
//// lateinit의 규칙
//// var 키워드로 선언한 변수에만 사용
//// int, Long, Short, Double, Float, Boolean, Byte 타입에는 사용불가

//// lazy 키워드 사용
//val data4: Int by lazy {
//    println("I'm lazy ........")
//    10
//}
//
//fun main() {
//    println("in lazy.............")
//    println("in lazy2............")1
//    println(data4+10)
//    println(data4+20)


// int 타입에 null 대입과 메서드 이용
// 코틀린의 모든 변수는 객체이다.
//
//fun someFun() {
//    var data1: Int = 10
//    var data2: Int? = null
//
//    data1 = data1 + 10
//    data1 = data1.plus(10)
//




// 기초 데이터 타입
//
//val a1: Byte = 0b00001011
//val a2: Int = 123
//val a3: Short = 123
//val a4: Long = 123L
//val a5: Double = 10.0
//val a6: Float = 11.0f
//
//val a7: Boolean = true
//val a8: Char = 'a'


// - 문자열 표현: 큰따옴표와 삼중 따옴표의 차이

// - 문자열 템플릿: 결과값 표현시 $ 달러표시 사용
//fun main() {
//    val str1 = "Hello \n World"
//    val str2 = """
//        Hello
//        World
//    """
//    println("str1: ${str1}")
//    println("str2: ${str2}")
//

// 문자열 사용 예
//fun main() {
//    fun sum(no: Int): Int {
//        var sum = 0
//        for (i in 1..no) {
//            sum += i
//        }
//        return sum
//    }
//    val name: String = "kkang"
//
//    println("name: ${name}, sum: ${sum(10)}, plus: ${(10+20)}")
//

// 타입별 정리

// Any - 모든 타입 가능
//val data1: Any = 10
//val data2: Any = "hello"
//
//class User
//val data3:Any = User()

//// Unit - 반환문이 없는 함수
//val data1: Unit = Unit
//
//
//// Unit - 타입 사용 예 - 반환문이 없는 함수
//fun some(): Unit {
//    println(10+20)
//}
//
//// 반환 타입을 생락한 예
//fun some() {
//    println(10+20)
//


// Nothing - null이나 예외를 반환하는 함수 = 의미있는 데이터가 아니라 특수한 상황 표현
// Nothing 으로 선언한 변수에는 null만 대입 가능, Nothing으로 선언한 변수는 데이터로서의 의미가 없다.

//val data1:Nothing? = null
//
//fun some1(): Nothing? {
//    return null
//}
//fun some2(): Nothing {
//    throw Exception()
//}


// 널 허용과 불허용
//
//var data1: Int = 10
//data1 = null
//
//var data2: Int? = 20
//data2 = null
//

// 함수 선언하기

// 함수 선언 형식: fun 함수명(매개변수명: 타입): 반환타입명 {...}

//// 반환 타입이 있는 함수 선언
//fun some(data1: Int):Int {
//    return data1 * 10
//}
//
//fun main() {
//    println(some(10))
//
//}

// 매개변숫값 변경 오류
// 함수의 매개변수에는 val이 자동 적용되어 함수 안에서 매개변숫값 변경 불가
// 매개변숫값 오류 예시
//fun some(data1: Int):Int {
//    data1 = 20
//}


// 기본값 활용
//fun main() {
//    fun some(data1: Int, data2: Int = 10):Int {
//        return data1 * data2
//    }
//    println(some(10))
//    println(some(20))
//}

// 매개변숫값 생략
// 매개변수명 순서대로 할당 및 매개변수명 지정하여 호출 = 명명된 매개변수
//fun main() {
//    fun some(data1: Int, data2: Int): Int {
//        return data1 * data2
//    }
//    println(some(data2 = 20, data1 = 10))
//}

// Array 배열 표현
// Array 클래스의 생성자
//<init>(size: Int, init: (Int) -> T)
//// 배열 선언 예
// 다음의 배열은 0으로 초기화한 데이터를 3개 나열한 정수형 배열을 선언한다.
//val data1: Array<Int> = Array(3, {0})

// 배열의 데이터에 접근하는 예
// 예시
//fun main() {
//    val data1: Array<Int> = Array(3, {0})
//    data1[0] = 10
//    data1[1] = 20
//    data1.set(2, 30)
//
//    println(
//        """
//    array size: ${data1.size}
//    array data: ${data1[0]}, ${data1[1]}, ${data1.get(2)}
//            """
//    )
//
//}

// 기초 타입 배열 선언
val data1: IntArray = IntArray(3, {0})
val data2: BooleanArray = BooleanArray(3, { false})

// 배열 선언과 동시에 값 할당

/*
fun main() {
    val data1 = arrayOf<Int>(10, 20, 30)        // 크기가 3인 Int배열을 선언하고 10, 20, 30으로 할당
    println(
        """
    array size: ${data1.size}
    array data: ${data1[0]}, ${data1[1]}, ${data1.get(2)}
            """
        )
}
 */

// 기초 타입 arrayOf()함수
/*
val data1 = intArrayOf(10, 20, 30)
val data2 = booleanArrayOf(true, false, false)

 */

// List, Set, Map

/*
- Collection 인터페이스 타입으로 표현한 클래스
List: 순서가 있는 데이터의 집합으로 데이터의 중복을 허용한다.
Set: 순서가 없으며 데이터의 중복을 허용하지 않는다.
Map: 키와 값으로 이루어진 데이터 집합으로 순서가 없으며 키의 중복을 허용하지 않는다.

코틀린에서는 가변과 불변이라는 2가지 타입으로 클래스를 제공

불변 - 초기에 데이터를 대입하면 더 이상 변경할 수 없는 타입
가변 - 초깃값을 대입한 이후에도 데이터를 추가하거나 변경할 수 있다. (Mutable)
 */

// 리스트의 사용 예
/*
fun main() {
    var list = listOf<Int>(10, 20, 30)
    println(
        """
    list size = ${list.size}
    list data = ${list[0]}, ${list[1]}, ${list.get(2)}
      """
    )
}

 */

// 가변 리스트 사용 예
/*
fun main() {
    var mutableList = mutableListOf<Int>(10, 20, 30)
    mutableList.add(3, 40)
    mutableList.set(0, 50)
    println(
        """
    mutableList size : ${mutableList.size}
    mutableList data : ${mutableList[0]}, ${mutableList[1]}, 
                       ${mutableList[2]}, ${mutableList.get(3)}
    """
    )
}

 */

// Map 객체는 키와 값으로 이루어진 데이터의 집합
// Map 객체의 키와 값은 Pair 객체를 이용할 수도 있고 '키 to 값'형태로 이용 가능

// Map 집합 사용 예
/*
fun main() {
    var map = mapOf<String, String>(Pair("one", "Hello"), "two" to "World")
    println(
        """
    map size : ${map.size}
    map data : ${map.get("one")}, ${map.get("two")}
            """
    )
}
 */

// 조건문과 반복문
// 조건문  if ~ else 와 표현식: 프로그램의 흐름 제어
/*
fun main() {
    var data = 10
    if(data > 0) {
        println("data > 0")
    }else {
        println("data <= 0")
    }
}

 */
/*
조건을 여러개 나열한 예
fun main() {
    var data = 10
    if(data > 10) {
        println("data > 10")
    }else if(data <= 10 && data > 0) {
        println("data <= 10 && data> 0")
    }else {
        println("data <= 0")

    }
}
 */
/*
// 표현식으로 사용
fun main() {
    var data = 10
    val result = if(data > 0) {
        println("data > 0")
        true
    }else {
        println("data <= 0")
        false
    }
    println(result)             // 반환 결과값 표
}
 */