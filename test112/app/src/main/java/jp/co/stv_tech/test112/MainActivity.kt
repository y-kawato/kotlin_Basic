package jp.co.stv_tech.test112

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mylist = arrayListOf(1 to "CPU", 2 to "dog" ,3 to "orange")
        println(mylist)

        val id = 1
        val name = "秋元"
        val map = hashMapOf(id to name)
        println(map)

        val iterable = listOf(1, 1, 2, 2, 2, 3, 3)
        val result: HashSet<Int> = iterable.toHashSet()
        println(result)


    }
}
