import collections.City
import collections.Customer
import collections.Shop

]package collections

/**
 * Created by Administrator on 2017/5/29 0029.
 */
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy { it.city }