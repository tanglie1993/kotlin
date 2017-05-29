package collections

/**
 * Created by Administrator on 2017/5/29 0029.
 */
val Customer.orderedProducts: Set<Product> get() {
    return this.orders.flatMap{it.products.toSet()}.toSet()
}

// Return all products that were ordered by at least one customer
val Shop.allOrderedProducts: Set<Product> get() {
    return this.customers.flatMap { it.orderedProducts }.toSet()
}