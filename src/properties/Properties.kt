package properties

/**
 * Created by Administrator on 2017/5/29 0029.
 */
class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(v: Int?) {
            field = v
            counter++
        }
}