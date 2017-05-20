/**
 * Created by Administrator on 2017/5/20 0020.
 */

fun containsEven(collection: Collection<Int>): Boolean = collection.any { i -> i % 2 == 0 }

fun main(args : Array<String>){
    val numbers: MutableList<Int> = mutableListOf()
    numbers.add(1)
    println(containsEven(numbers))
    numbers.add(2)
    println(containsEven(numbers))
}