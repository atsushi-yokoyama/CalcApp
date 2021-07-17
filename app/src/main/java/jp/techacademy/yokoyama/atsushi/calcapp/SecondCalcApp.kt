package jp.techacademy.yokoyama.atsushi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Half.toFloat
import kotlinx.android.synthetic.main.activity_second_calc_app.*

class SecondCalcApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_calc_app)

        val value1 = intent.getFloatExtra("task", 0.0F)
        textView.text = value1.toString()
    }
}