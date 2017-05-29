package properties

/**
 * Created by Administrator on 2017/5/29 0029.
 */
class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy {
        var result = initializer()
        result
    }
}