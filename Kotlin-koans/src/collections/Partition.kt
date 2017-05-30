package collections

/**
 * Created by Administrator on 2017/5/29 0029.
 */

fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.filter {
    val partition = it.orders.partition { it.isDelivered }
    partition.first.size < partition.second.size
}.toSet()