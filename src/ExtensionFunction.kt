/**
 * Created by Administrator on 2017/5/20 0020.
 */
fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)
fun main(args : Array<String>){
    println(Pair(2, 3).r())
    println(4.r())
}
