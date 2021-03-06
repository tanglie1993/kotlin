package introduction

/**
 * Created by Administrator on 2017/5/20 0020.
 */
fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        introduction.foo("a"),
        introduction.foo("b", number = 1),
        introduction.foo("c", toUpperCase = true),
        introduction.foo(name = "d", number = 2, toUpperCase = true)
)

fun main(args : Array<String>){
    println(introduction.useFoo())
}