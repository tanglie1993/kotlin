package properties

/**
 * Created by Administrator on 2017/5/30 0030.
 */
class Lazy(val initializer: () -> Int) {
    var test:Int? = null
    val lazy: Int
        get() {
            if(test == null){
                test = initializer()
            }
            return test as Int
        }
}