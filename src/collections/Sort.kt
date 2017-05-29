package collections

/**
 * Created by Administrator on 2017/5/29 0029.
 */
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> = customers.sortedBy { it.orders.size }