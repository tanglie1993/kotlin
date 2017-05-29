package collections

/**
 * Created by Administrator on 2017/5/29 0029.
 */
// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.maxBy { it.orders.size }

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? = orders.flatMap { it.products.toSet() }.maxBy { it.price }