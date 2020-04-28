package com.example.calculator_na_kotline

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var input: TextView
    internal var sign: String? = null
    internal var value1: String? = null
    internal var value2: String? = null
    internal var num1: Double? = null
    internal var num2: Double? = null
    internal var result: Double? = null
    internal var hasDot: Boolean = false
    internal var hasoper: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input = findViewById(R.id.input)
        if(savedInstanceState != null){
            input.text = savedInstanceState.getString("first_Value")
            value1 = savedInstanceState.getString("number1")
            value2 = savedInstanceState.getString("number2")
            sign = savedInstanceState.getString("sign")
            hasDot = savedInstanceState.getBoolean("dot")
            hasoper = savedInstanceState.getBoolean("haser")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("first_Value", input.text.toString())
        outState.putString("sign", sign)
        outState.putString("number1", value1)
        outState.putString("number2", value2)
        outState.putBoolean("dot", hasDot)
        outState.putBoolean("haser", hasoper)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        savedInstanceState.getString("first_Value")
        savedInstanceState.getString("number1")
        savedInstanceState.getString("number2")
        savedInstanceState.getString("sign")
        savedInstanceState.getBoolean("dot")
        savedInstanceState.getBoolean("haser")
    }

    fun btnClick_0(view: View?) {
        val s = input.text.toString()
        if (s == "0") {
        } else {
            input.text = input.text.toString() + "0"
        }
        if (s == "math error") {
            input.text = null
            input.text = input.text.toString() + "0"
        }
    }

    fun btnClick_1(view: View?) {
        val s = input.text.toString()
        if (s == "math error") {
            input.text = null
            input.text = input.text.toString() + "1"
        } else {
            if (s == "0") {
                input.text = null
                input.text = input.text.toString() + "1"
            } else {
                input.text = input.text.toString() + "1"
            }
        }
    }

    fun btnClick_2(view: View?) {

        val s = input.text.toString()
        if (s == "math error") {
            input.text = null
            input.text = input.text.toString() + "2"
        } else {
            if (s == "0") {
                input.text = null
                input.text = input.text.toString() + "2"
            } else {
                input.text = input.text.toString() + "2"
            }
        }
    }

    fun btnClick_3(view: View?) {
        val s = input.text.toString()
        if (s == "math error") {
            input.text = null
            input.text = input.text.toString() + "3"
        } else {
            if (s == "0") {
                input.text = null
                input.text = input.text.toString() + "3"
            } else {
                input.text = input.text.toString() + "3"
            }
        }
    }

    fun btnClick_4(view: View?) {
        val s = input.text.toString()
        if (s == "math error") {
            input.text = null
            input.text = input.text.toString() + "4"
        } else {
            if (s == "0") {
                input.text = null
                input.text = input.text.toString() + "4"
            } else {
                input.text = input.text.toString() + "4"
            }
        }
    }

    fun btnClick_5(view: View?) {
        val s = input.text.toString()
        if (s == "math error") {
            input.text = null
            input.text = input.text.toString() + "5"
        } else {
            if (s == "0") {
                input.text = null
                input.text = input.text.toString() + "5"
            } else {
                input.text = input.text.toString() + "5"
            }
        }
    }

    fun btnClick_6(view: View?) {
        val s = input.text.toString()
        if (s == "math error") {
            input.text = null
            input.text = input.text.toString() + "6"
        } else {
            if (s == "0") {
                input.text = null
                input.text = input.text.toString() + "6"
            } else {
                input.text = input.text.toString() + "6"
            }
        }
    }

    fun btnClick_7(view: View?) {
        val s = input.text.toString()
        if (s == "math error") {
            input.text = null
            input.text = input.text.toString() + "7"
        } else {
            if (s == "0") {
                input.text = null
                input.text = input.text.toString() + "7"
            } else {
                input.text = input.text.toString() + "7"
            }
        }
    }

    fun btnClick_8(view: View?) {
        val s = input.text.toString()
        if (s == "math error") {
            input.text = null
            input.text = input.text.toString() + "8"
        } else {
            if (s == "0") {
                input.text = null
                input.text = input.text.toString() + "8"
            } else {
                input.text = input.text.toString() + "8"
            }
        }
    }

    fun btnClick_9(view: View?) {
        val s = input.text.toString()
        if (s == "math error") {
            input.text = null
            input.text = input.text.toString() + "9"
        } else {
            if (s == "0") {
                input.text = null
                input.text = input.text.toString() + "9"
            } else {
                input.text = input.text.toString() + "9"
            }
        }
    }

    fun btnClick_plus(view: View?) {
        if (!hasoper) {
            sign = "+"
            value1 = input.text.toString()
            input.text = null
            hasoper = true
            hasDot = false
        } else {
            sign = "+"
        }
    }

    fun btnClick_minus(view: View?) {
        if (!hasoper) {
            sign = "-"
            value1 = input.text.toString()
            input.text = null
            hasoper = true
            hasDot = false
        } else {
            sign = "-"
        }
    }

    fun btnClick_multip(view: View?) {
        if (!hasoper) {
            sign = "*"
            value1 = input.text.toString()
            input.text = null
            hasoper = true
            hasDot = false
        } else {
            sign = "*"
        }
    }

    fun btnClick_devid(view: View?) {
        val s = input.text.toString()
        if (s == "math error") {
            input.text = "math error"
        } else {
            if (!hasoper) {
                sign = "/"
                value1 = input.text.toString()
                hasoper = true
                input.text = null
                hasDot = false
            } else {
                sign = "/"
            }
        }
    }

    fun btnClick_dota(view: View?) {
        if (!hasDot) {
            if (input.text == "") {
                input.text = "0."
            } else {
                input.text = input.text.toString() + "."
            }
            hasDot = true
        }
    }

    fun btnClick_koren(view: View?) {
        var s = input.text.toString()
        if (s == "math error") {
            s = "0"
        }
        val koren = s.toDouble()
        input.text = Math.sqrt(koren).toString() + ""
        hasDot = true
    }

    fun btnClick_kvadr(view: View?) {
        var s = input.text.toString()
        if (s == "math error") {
            s = "0"
        }
        val t = s.toDouble()
        input.text = Math.pow(t, 2.0).toString() + ""
        hasDot = true
    }

    fun btnClick_clear(view: View?) {
        input.text = null
        value1 = null
        value2 = null
        sign = null
        hasDot = false
    }


    fun btnClick_delete(view: View?) {
        val s = input.text.toString()
        if (s == "") {
        } else {
            val t = s.length
            val s1 = s.substring(0, t - 1)
            input.text = s1 + ""
        }
    }

    fun btnClick_rovno(view: View?) {
        if (sign == null) {
            run {}
        } else if (input.text == "") {
            run {}
        } else {
            when (sign) {
                "+" -> {
                    if (value1 === "" || value1 == "Infinit" || value1 == "Infini" || value1 == "Infin" || value1 == "Infi" || value1 == "Inf" || value1 == "In" || value1 == "I" || value1 == "math error") {
                        value1 = "0"
                    }
                    value2 = input.text.toString()
                    num1 = value1!!.toDouble()
                    num2 = value2!!.toDouble()
                    result = num1!! + num2!!
                    input.text = result.toString() + ""
                    hasDot = true
                    hasoper = false
                    sign = null
                }
                "-" -> {
                    if (value1 === "" || value1 == "Infinit" || value1 == "Infini" || value1 == "Infin" || value1 == "Infi" || value1 == "Inf" || value1 == "In" || value1 == "I" || value1 == "math error") {
                        value1 = "0"
                    }
                    value2 = input.text.toString()
                    num1 = value1!!.toDouble()
                    num2 = value2!!.toDouble()
                    result = num1!! - num2!!
                    input.text = result.toString() + ""
                    hasDot = true
                    hasoper = false
                    sign = null
                }
                "*" -> {
                    if (value1 === "" || value1 == "Infinit" || value1 == "Infini" || value1 == "Infin" || value1 == "Infi" || value1 == "Inf" || value1 == "In" || value1 == "I" || value1 == "math error") {
                        value1 = "0"
                    }
                    value2 = input.text.toString()
                    num1 = value1!!.toDouble()
                    num2 = value2!!.toDouble()
                    result = num1!! * num2!!
                    input.text = result.toString() + ""
                    hasDot = true
                    hasoper = false
                    sign = null
                }
                "/" -> {
                    if (value1 === "" || value1 == "Infinit" || value1 == "Infini" || value1 == "Infin" || value1 == "Infi" || value1 == "Inf" || value1 == "In" || value1 == "I" || value1 == "math error") {
                        value1 = "0"
                    }
                    value2 = input.text.toString()
                    num1 = value1!!.toDouble()
                    num2 = value2!!.toDouble()
                    result = num1!! / num2!!
                    if (result.toString() == "Infinity" || result.toString() == "NaN") {
                        input.text = "math error"
                    } else {
                        input.text = result.toString() + ""
                    }
                    hasDot = true
                    sign = null
                    hasoper = false
                }
                "kor" -> {
                    if (value1 === "" || value1 == "Infinit" || value1 == "Infini" || value1 == "Infin" || value1 == "Infi" || value1 == "Inf" || value1 == "In" || value1 == "I" || value1 == "math error") {
                        value1 = "0"
                    }
                    value2 = input.text.toString()
                    num1 = value1!!.toDouble()
                    num2 = value2!!.toDouble()
                    result = Math.pow(Math.E, Math.log(num1!!) / num2!!)
                    input.text = result.toString() + ""
                    hasDot = true
                    sign = null
                    hasoper = false
                }
                "^" -> {
                    if (value1 === "" || value1 == "Infinit" || value1 == "Infini" || value1 == "Infin" || value1 == "Infi" || value1 == "Inf" || value1 == "In" || value1 == "I" || value1 == "math error") {
                        value1 = "0"
                    }
                    var t: Int
                    value2 = input.text.toString()
                    num1 = value1!!.toDouble()
                    num2 = value2!!.toDouble()
                    result = Math.pow(num1!!, num2!!)
                    input.text = result.toString() + ""
                    hasDot = true
                    sign = null
                    hasoper = false
                }
                else -> {
                }
            }
        }
    }

    fun btnClick_sin(view: View?) {
        var s = input.text.toString()
        if (s == "math error") {
            s = "0"
        }
        val f = s.toDouble()
        input.text = Math.cos(f).toString() + ""
    }

    fun btnClick_cos(view: View?) {
        var s = input.text.toString()
        if (s == "math error") {
            s = "0"
        }
        val f = s.toDouble()
        input.text = Math.cos(f).toString() + ""
    }

    fun btnClick_tan(view: View?) {
        var s = input.text.toString()
        if (s == "math error") {
            s = "0"
        }
        val f = s.toDouble()
        input.text = Math.tan(f).toString() + ""
    }

    fun btnClick_persent(view: View?) {
        var s = input.text.toString()
        if (s == "math error") {
            s = "0"
        }
        var f = s.toDouble()
        f = f * 0.01
        input.text = f.toString() + ""
    }

    fun btnClick_ln(view: View?) {
        var s = input.text.toString()
        if (s == "") {
        } else {
            if (s == "math error") {
                s = "0"
            }
            var f = s.toDouble()
            f = Math.log(f)
            input.text = f.toString() + ""
        }
    }

    fun btnClick_log(view: View?) {
        var s = input.text.toString()
        if (s == "math error") {
            s = "0"
        }
        var f = s.toDouble()
        f = Math.log10(f)
        input.text = f.toString() + ""
    }


    fun btnClick_ndar(view: View?) {
        val s = input.text.toString()
        if (s == "math error") {
            input.text = "math error"
        } else {
            if (!hasoper) {
                sign = "^"
                value1 = input.text.toString()
                hasoper = true
                input.text = null
                hasDot = false
            } else {
                sign = "^"
            }
        }
    }

    fun btnClick_nkoren(view: View?) {
        var s = input.text.toString()
        if (s == "math error") {
            s = "0"
        }
        value1 = s
        if (!hasoper) {
            sign = "kor"
            value1 = input.text.toString()
            hasoper = true
            input.text = null
            hasDot = false
        } else {
            sign = "kor"
        }
    }

    fun btnClick_factorial(view: View?) {
        var s = input.text.toString()
        if (s == "math error") {
            s = "0"
        }
        val ok = true
        var a = s.toLong()
        if (a == 1L || a == 0L) {
            a = 1
            input.text = a.toString() + ""
        } else {
            if (a > 60) {
                input.text = "math error"
            } else {
                var fact = 1.0
                for (i in 2..a) {
                    fact = fact * i
                }
                input.text = fact.toString() + ""
            }
        }
    }

}
