package jp.techacademy.yokoyama.atsushi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAddition.setOnClickListener(this)
        btnSubtraction.setOnClickListener(this)
        btnMultiplication.setOnClickListener(this)
        btnDivision.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        var a :Float = editText1.text.toString().toFloat()
        var b :Float = editText2.text.toString().toFloat()
        when(v.id){
            R.id.btnAddition->addion(a, b)
            R.id.btnSubtraction->subtraction(a, b)
            R.id.btnMultiplication->multiplication(a, b)
            R.id.btnDivision->division(a, b)
        }

    }

    fun addion(a: Float, b: Float){
        val intent = Intent(this, SecondCalcApp::class.java)
        intent.putExtra("task", a + b)
        startActivity(intent)
    }

    fun subtraction(a: Float, b: Float){
        val intent = Intent(this, SecondCalcApp::class.java)
        intent.putExtra("task", a - b)
        startActivity(intent)
    }

    fun multiplication(a: Float, b: Float){
        val intent = Intent(this, SecondCalcApp::class.java)
        intent.putExtra("task", a * b)
        startActivity(intent)
    }

    fun division(a: Float, b: Float){
        val intent = Intent(this, SecondCalcApp::class.java)
        intent.putExtra("task", a / b)
        startActivity(intent)
    }
}
