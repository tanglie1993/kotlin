package introduction

/**
 * Created by Administrator on 2017/5/20 0020.
 */
fun eval(expr: introduction.Expr): Int =
        when (expr) {
            is introduction.Num -> expr.value
            is introduction.Sum -> introduction.eval(expr.left) + introduction.eval(expr.right);
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : introduction.Expr
class Sum(val left: introduction.Expr, val right: introduction.Expr) : introduction.Expr

fun main(args : Array<String>){
    println(introduction.eval(Num(2)))
    println(introduction.eval(Sum(Num(2), Num(1))))
    println(introduction.eval(Sum(Sum(Num(1), Num(2)), Num(3))))
}

