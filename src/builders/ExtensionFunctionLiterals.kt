package builders

/**
 * Created by Administrator on 2017/5/29 0029.
 */
fun task(): List<Boolean> {
    val isEven: Int.() -> Boolean = { this % 2 == 0  }
    val isOdd: Int.() -> Boolean = { this % 2 != 0 }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}