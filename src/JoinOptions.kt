/**
 * Created by Administrator on 2017/5/20 0020.
 */

fun joinOptions(options: Collection<String>) = options.joinToString(", ","[", "]")

fun main(args : Array<String>){
    println(joinOptions(listOf("yes", "no", "may be")))
}