package introduction

/**
 * Created by Administrator on 2017/5/21 0021.
 */

private fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    java.util.Collections.sort(arrayList, { o1, o2 -> if (o1 > o2) -1 else 1 })
    return arrayList
}

fun main(args : Array<String>){
    println(getList())
}
