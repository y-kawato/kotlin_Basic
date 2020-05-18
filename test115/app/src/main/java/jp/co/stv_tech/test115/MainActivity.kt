package jp.co.stv_tech.test115

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val teacher = Teacher()
        teacher.result()

        val fiveYearsTeacher = FiveYearsTeacher()
        fiveYearsTeacher.result()

        val tenYearsTeacher = TenYearsTeacher()
        tenYearsTeacher.result()


    }

    open class Teacher(){
        var name: String = "山田花子"
        var age: Int = 23
        var gender: String = "女性"
        var salary: Double = 200000.0

        var introduce = "「${name}さんは、${age}歳で給料は${salary}円です。」"

        open fun result() {
            println(introduce)
        }

    }
    class FiveYearsTeacher() :Teacher(){
        override fun result() {
            introduce = "「${name}さんは、${age}歳で給料は${salary*1.1}円です。」"
            println(introduce)
        }


    }
    class TenYearsTeacher() :Teacher(){
        override fun result() {
            introduce = "「${name}さんは、${age}歳で給料は${salary*1.3}円です。」"
            println(introduce)
        }
    }
}
