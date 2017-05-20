/**
 * Created by Administrator on 2017/5/20 0020.
 */
data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun main(args : Array<String>){
    println(getPeople())
}