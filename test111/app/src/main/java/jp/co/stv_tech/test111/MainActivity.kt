package jp.co.stv_tech.test111

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val number = 200

        val a: Boolean = (number==100)
        val b: Boolean = (number==200)

        println("変数aは${a}です")
        println("変数bは${b}です")

        val t :String = "ありがとう"
        println(t)

        val i :Int = 10
        println(i)

        val d :Double = 1.0
        println(d)




    }
}
