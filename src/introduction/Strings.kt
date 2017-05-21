package introduction

/**
 * Created by Administrator on 2017/5/20 0020.
 */
val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = "\\d{2} ${introduction.month} \\d{4}"

private fun testMatch(date: String) = date.matches(introduction.getPattern().toRegex())
private fun testMismatch(date: String) = date.matches(introduction.getPattern().toRegex())

fun main(args : Array<String>){
    println(introduction.testMatch("11 MAR 1952"))
    println(introduction.testMatch("24 AUG 1957"))
    println(introduction.testMismatch("24 RRR 1957"))
}