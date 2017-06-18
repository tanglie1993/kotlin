package introduction

/**
 * Created by Administrator on 2017/5/21 0021.
 */

private fun getList(): List<Int> {
    return arrayListOf(1, 5, 2).sortedDescending()//TODO("return the list sorted in descending order")
}
fun main(args : Array<String>){
    println(getList())
}