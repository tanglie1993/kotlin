package introduction

/**
 * Created by Administrator on 2017/5/20 0020.
 */
data class Person(val name: String, val age: Int)

fun getPeople(): List<introduction.Person> {
    return listOf(introduction.Person("Alice", 29), introduction.Person("Bob", 31))
}

fun main(args : Array<String>){
    println(introduction.getPeople())
}