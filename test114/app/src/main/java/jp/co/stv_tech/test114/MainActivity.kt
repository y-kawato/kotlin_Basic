package jp.co.stv_tech.test114

import android.accounts.Account
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val account = Account()
        account.result()



    }
     class Account{
         var name: String = "山田花子"
         var age: Int = 23
         var gender: String = "女性"
         var lang: String = "kotlin"

         val introduce =
                 when {
                     gender == "男性" -> "「${name}君は、${lang}が得意な${age}歳です。」"
                     else -> "「${name}さんは、${lang}が得意な${age}歳です。」"
                 }
         fun result() {
             println(introduce)
         }

    }




}
