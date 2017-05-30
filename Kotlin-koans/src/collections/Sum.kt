package collections

/**
 * Created by Administrator on 2017/5/29 0029.
 */
fun Customer.getTotalOrderPrice(): Double = orders.flatMap { it.products }.sumByDouble { it.price }