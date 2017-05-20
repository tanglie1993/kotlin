/**
 * Created by Administrator on 2017/5/20 0020.
 */
fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right);
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun main(args : Array<String>){
    println(eval(Num(2)))
    println(eval(Sum(Num(2), Num(1))))
    println(eval(Sum(Sum(Num(1), Num(2)), Num(3))))
}

