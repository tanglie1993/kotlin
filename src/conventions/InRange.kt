package conventions

/**
 * Created by Administrator on 2017/5/21 0021.
 */
operator fun DateRange.contains(date : MyDate) : Boolean =
        start <= date && date <= endInclusive


private fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}