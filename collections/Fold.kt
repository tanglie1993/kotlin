package collections

/**
 * Created by Administrator on 2017/5/29 0029.
 */
//listOf(1, 2, 3, 4).fold(1, {
//    partProduct, element ->
//    element * partProduct
//}) == 24

fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    return customers.fold(customers[0].orders.flatMap { it.products }.toSet(), {
        accumulatedSet, element ->
        accumulatedSet.intersect(element.orders.flatMap { it.products })
    })
}