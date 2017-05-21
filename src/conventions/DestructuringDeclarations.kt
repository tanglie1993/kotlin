package conventions

/**
 * Created by Administrator on 2017/5/21 0021.
 */
data class MyDate1(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDate1): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}