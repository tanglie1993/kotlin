package conventions

import java.util.*

/**
 * Created by Administrator on 2017/5/21 0021.
 */

class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return MyIterator(start, end)
    }
}

class MyIterator(start: MyDate, end: MyDate) : Iterator<MyDate> {
    var tmp = MyDate(start.year, start.month, start.dayOfMonth)
    var tmpEnd = MyDate(end.year, end.month, end.dayOfMonth)
    override fun hasNext(): Boolean {
        return tmp <= tmpEnd
    }

    override fun next(): MyDate {
        var res = tmp
        tmp = tmp.nextDay()
        return res
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}

import java.util.Calendar

fun MyDate.nextDay() = addTimeIntervals(TimeInterval.DAY, 1)

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate {
    val c = Calendar.getInstance()
    c.set(year + if (timeInterval == TimeInterval.YEAR) number else 0, month, dayOfMonth)
    var timeInMillis = c.getTimeInMillis()
    val millisecondsInADay = 24 * 60 * 60 * 1000L
    timeInMillis += number * when (timeInterval) {
        TimeInterval.DAY -> millisecondsInADay
        TimeInterval.WEEK -> 7 * millisecondsInADay
        TimeInterval.YEAR -> 0L
    }
    val result = Calendar.getInstance()
    result.setTimeInMillis(timeInMillis)
    return MyDate(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar.DATE))
}