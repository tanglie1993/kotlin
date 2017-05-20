/**
 * Created by Administrator on 2017/5/20 0020.
 */
fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){
    if(client?.personalInfo?.email != null && message != null){
        mailer.sendMessage(client.personalInfo.email, message)
    }
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}