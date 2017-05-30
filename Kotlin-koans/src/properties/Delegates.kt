package properties

/**
 * Created by Administrator on 2017/5/29 0029.
 */
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class D {
    var date: MyDate by EffectiveDate()
}

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {

    var timeInMillis: Long? = null

    override fun getValue(thisRef: R, property: KProperty<*>): MyDate {
        if(timeInMillis != null){
            return timeInMillis!!.toDate()
        }else{
            return MyDate(0, 0, 0)
        }
    }

    override fun setValue(thisRef: R, property: KProperty<*>, value: MyDate) {
        timeInMillis = value.toMillis()
    }
}