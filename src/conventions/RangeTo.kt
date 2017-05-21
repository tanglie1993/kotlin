package conventions

/**
 * Created by Administrator on 2017/5/21 0021.
 */
operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)

class DateRange(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate> {
    operator fun iterator(): Iterator<MyDate> {

    }
}

private fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}