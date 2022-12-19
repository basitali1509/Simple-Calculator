package com.example.calculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.CursorAdapter
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager

class MainActivity : AppCompatActivity() {
    private val tvInput by lazy { findViewById<TextView>(R.id.tvInput) }
    private val btn0 by lazy { findViewById<Button>(R.id.btn0) }
    private val btn1 by lazy { findViewById<AppCompatButton>(R.id.btn1) }
    private val btn2 by lazy { findViewById<AppCompatButton>(R.id.btn2) }
    private val btn3 by lazy { findViewById<AppCompatButton>(R.id.btn3) }
    private val btn4 by lazy { findViewById<AppCompatButton>(R.id.btn4) }
    private val btn5 by lazy { findViewById<AppCompatButton>(R.id.btn5) }
    private val btn6 by lazy { findViewById<AppCompatButton>(R.id.btn6) }
    private val btn7 by lazy { findViewById<AppCompatButton>(R.id.btn7) }
    private val btn8 by lazy { findViewById<AppCompatButton>(R.id.btn8) }
    private val btn9 by lazy { findViewById<AppCompatButton>(R.id.btn9) }
    private val btnC by lazy { findViewById<AppCompatButton>(R.id.btnC) }
    private val btnPercentage by lazy { findViewById<Button>(R.id.btnPercentage) }
    private val btnDecimal by lazy { findViewById<AppCompatButton>(R.id.btnDecimal) }
    private val btnAdd by lazy { findViewById<AppCompatButton>(R.id.btnAdd) }
    private val btnSubtract by lazy { findViewById<AppCompatButton>(R.id.btnSubtract) }
    private val btnMultiply by lazy { findViewById<AppCompatButton>(R.id.btnMultiply) }
    private val btnDivide by lazy { findViewById<AppCompatButton>(R.id.btnDivide) }
    private val btnBackSpace by lazy { findViewById<AppCompatButton>(R.id.btnBackSpace) }
    private val btnEqual by lazy { findViewById<AppCompatButton>(R.id.btnEqual) }
    private val tvOutput by lazy { findViewById<TextView>(R.id.tvOutput) }
    private lateinit var  numberInput : String



    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvInput.isCursorVisible = true
        tvInput.movementMethod = ScrollingMovementMethod()
        tvInput.isActivated = true
        tvInput.isPressed = true
        tvOutput.movementMethod = ScrollingMovementMethod()
        tvOutput.isActivated = true
        tvOutput.isPressed = true

        btn0.setOnClickListener {

            if (tvInput.text.toString().endsWith(".")) {
                numberInput = tvInput.text.toString() + "0"
                inputText(numberInput)
                outputText()
            }


            else{
                textSet()
                tvInput.append("0")
                inputText(tvInput.text.toString())
                outputText()
                //numberInput = tvInput.text.toString()
                //tvInput.text = numberInput + "0"
            }




        }

        btn1.setOnClickListener{

            tvInput.textSize = 35F
            tvInput.height = 95
            tvInput.setTextColor(Color.parseColor("#FFFFFFFF"))
            tvOutput.textSize = 29F
            tvOutput.height = 57
            tvOutput.setTextColor(Color.parseColor("#B2FFFFFF"))

            numberInput = tvInput.text.toString()
            tvInput.append("1")
            inputText(tvInput.text.toString())
            outputText()


        }

        btn2.setOnClickListener{
            textSet()

            if(tvInput.text.toString().startsWith("0")){
                numberInput = tvInput.text.toString().replace("0","") + "2"
                inputText(numberInput)
                outputText()
            }
            else{
                numberInput = tvInput.text.toString() + "2"
                inputText(numberInput)
                outputText()
            }

        }

        btn3.setOnClickListener{
            textSet()
            if(tvInput.text.toString().startsWith("0")){
                numberInput = tvInput.text.toString().replace("0","") + "3"
                inputText(numberInput)
                outputText()
            }
            else{
                numberInput = tvInput.text.toString() + "3"
                inputText(numberInput)
                outputText()
            }

        }

        btn4.setOnClickListener{

            textSet()
            if(tvInput.text.toString().startsWith("0")){
                numberInput = tvInput.text.toString().replace("0","") + "4"
                inputText(numberInput)
                outputText()
            }
            else{
                numberInput = tvInput.text.toString() + "4"
                inputText(numberInput)
                outputText()
            }
        }

        btn5.setOnClickListener{
            textSet()
            if(tvInput.text.toString().startsWith("0")){
                numberInput = tvInput.text.toString().replace("0","") + "5"
                inputText(numberInput)
                outputText()
            }
            else{
                numberInput = tvInput.text.toString() + "5"
                inputText(numberInput)
                outputText()
            }

        }

        btn6.setOnClickListener{
            textSet()
            if(tvInput.text.toString().startsWith("0")){
                numberInput = tvInput.text.toString().replace("0","") + "6"
                inputText(numberInput)
                outputText()
            }
            else{
                numberInput = tvInput.text.toString() + "6"
                inputText(numberInput)
                outputText()
            }

        }

        btn7.setOnClickListener{

            textSet()

            if(tvInput.text.toString().startsWith("0")){
                numberInput = tvInput.text.toString().replace("0","") + "7"
                inputText(numberInput)
                outputText()
            }
            else{
                numberInput = tvInput.text.toString() + "7"
                inputText(numberInput)
                outputText()
            }

        }

        btn8.setOnClickListener{
            textSet()

            if(tvInput.text.toString().startsWith("0")){
                numberInput = tvInput.text.toString().replace("0","") + "8"
                inputText(numberInput)
                outputText()
            }
            else{
                numberInput = tvInput.text.toString() + "8"
                inputText(numberInput)
                outputText()
            }

        }

        btn9.setOnClickListener{

            textSet()

            if(tvInput.text.toString().startsWith("0")){
                numberInput = tvInput.text.toString().replace("0","") + "9"
                inputText(numberInput)
                outputText()
            }
            else{
                numberInput = tvInput.text.toString() + "9"
                inputText(numberInput)
                outputText()
            }

        }

        btnAdd.setOnClickListener{
            textSet()
            if(tvInput.text.toString().indexOf(" ") == 0){
                numberInput = tvInput.text.toString()
                inputText(numberInput)
            }
            if(tvInput.text.toString().endsWith("*") || tvInput.text.toString().endsWith("+") || tvInput.text.toString().endsWith("-") ||
                tvInput.text.toString().endsWith("/") || tvInput.text.toString().endsWith("%")){

                numberInput = tvInput.text.toString()
                inputText(numberInput)
            }
            else{
                numberInput = tvInput.text.toString()
                tvInput.text = "$numberInput+"
                inputText(tvInput.text.toString())
                outputText()
            }


        }

        btnSubtract.setOnClickListener{
            textSet()

            if(tvInput.text.toString().endsWith("*") || tvInput.text.toString().endsWith("+") || tvInput.text.toString().endsWith("-") ||
                tvInput.text.toString().endsWith("/") || tvInput.text.toString().endsWith("%")){

                numberInput = tvInput.text.toString()
                inputText(numberInput)
            }
            else{
                numberInput = tvInput.text.toString()
                tvInput.text = "$numberInput-"
                inputText(tvInput.text.toString())
                outputText()
            }
        }

        btnMultiply.setOnClickListener{
            textSet()
            if(tvInput.text.toString().endsWith("*") || tvInput.text.toString().endsWith("+") || tvInput.text.toString().endsWith("-") ||
                tvInput.text.toString().endsWith("/") || tvInput.text.toString().endsWith("%")){

                numberInput = tvInput.text.toString()
                inputText(numberInput)
            }
            else{
                numberInput = tvInput.text.toString()
                tvInput.text = "$numberInput*"
                inputText(tvInput.text.toString())
                outputText()
            }
        }

        btnDivide.setOnClickListener{
            textSet()

            if(tvInput.text.toString().endsWith("*") || tvInput.text.toString().endsWith("+") || tvInput.text.toString().endsWith("-") ||
                tvInput.text.toString().endsWith("/") || tvInput.text.toString().endsWith("%")){

                numberInput = tvInput.text.toString()
                inputText(numberInput)
                outputText()
            }
            else{
                numberInput = tvInput.text.toString()
                tvInput.text = "$numberInput/"
                inputText(tvInput.text.toString())
                outputText()
            }
        }

        btnDecimal.setOnClickListener{
            textSet()
            if(tvInput.text.toString().endsWith(".") && tvInput.text.toString().contains("+") || tvInput.text.toString().contains("-") || tvInput.text.toString().contains("*") ||
                tvInput.text.toString().contains("/") || tvInput.text.toString().contains("%")   ){
                numberInput = tvInput.text.toString() + "."
                inputText(numberInput)
                outputText()
            }

            if(tvInput.text.toString().contains(".")){
                numberInput = tvInput.text.toString().replace(".", ".")
                inputText(numberInput)
                outputText()

            }
            else{
                numberInput = tvInput.text.toString() + "."
                inputText(numberInput)
                outputText()
            }

        }

        btnPercentage.setOnClickListener{
            textSet()


            if(tvInput.text.toString().endsWith("*") || tvInput.text.toString().endsWith("+") || tvInput.text.toString().endsWith("-") ||
                tvInput.text.toString().endsWith("/") || tvInput.text.toString().endsWith("%")){

                numberInput = tvInput.text.toString()
                inputText(numberInput)
            }

            else{
                numberInput = tvInput.text.toString()
                tvInput.text = "$numberInput/100"
                inputText(tvInput.text.toString())
                outputText()
            }
        }

        btnBackSpace.setOnClickListener{
            if(tvInput.text.toString().isNotEmpty()) {

                val lastIndex = tvInput.text.toString().lastIndex
                textSet()
                numberInput = tvInput.text.toString().substring(0, lastIndex)
                inputText(numberInput)
                tvOutput.text = " "
                outputText()
            }

            else{
                tvOutput.text = " "
                inputText(" ")
                outputText()
            }

            /*Handler(Looper.getMainLooper()).postDelayed({
                tvOutput.text = " "
                inputText(" ")
                outputText()
            },10000)*/
        }

        btnC.setOnClickListener{

            tvInput.textSize = 45F
            tvInput.height = 90
            tvInput.setTextColor(Color.parseColor("#FFFFFFFF"))


            numberInput = tvOutput.text.toString()
            tvInput.text = numberInput


            tvOutput.textSize = 35F
            tvOutput.height = 70
            tvOutput.setTextColor(Color.parseColor("#B2FFFFFF"))
            tvOutput.text = " "
            inputText(" ")

            outputText()
        }

        btnEqual.setOnClickListener{

            tvInput.textSize = 26F
            tvInput.height = 65
            tvInput.setTextColor(Color.parseColor("#B2FFFFFF"))
            numberInput = tvInput.text.toString()


            tvOutput.textSize = 40F
            tvOutput.height = 130
            tvOutput.setTextColor(Color.parseColor("#FFFFFFFF"))
            tvOutput.text = tvOutput.text.toString()


        }

    }
    private fun textSet(){

        tvInput.textSize = 40F
        tvInput.height = 100
        tvInput.setTextColor(Color.parseColor("#FFFFFFFF"))
        tvOutput.textSize = 29F
        tvOutput.height = 90
        tvOutput.setTextColor(Color.parseColor("#B2FFFFFF"))

    }
    private fun inputText(str:String){
        tvInput.text = str
    }

    private fun outputText(){
        val numberOutput = tvInput.text.toString()

        val engine : ScriptEngine = ScriptEngineManager().getEngineByName("rhino")

        try {
            val store = engine.eval(numberOutput)
            if (store.toString().endsWith(".0")){
                tvOutput.text = store.toString().replace(".0", "")

            }
            else{
                tvOutput.text = store.toString()
            }
        }
        catch (e:Exception){
            tvInput.text = tvInput.text.toString()
            tvOutput.text = tvOutput.text.toString()
        }
    }
}

