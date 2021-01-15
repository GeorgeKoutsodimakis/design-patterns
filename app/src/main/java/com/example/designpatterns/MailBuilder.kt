package com.example.designpatterns

class MailBuilder(@JvmField val to: String) {
    private var mail: Mail = Mail(to)

    fun title(title: String): MailBuilder {
        mail.title = title
        return this
    }

    fun message(msg:String):MailBuilder{
        mail.msg = msg
        return this
    }

    fun build(): Mail {
        return mail
    }


}