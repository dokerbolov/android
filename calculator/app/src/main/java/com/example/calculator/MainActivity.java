package com.example.calculator;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input;
    String sign, value1, value2;
    Double num1, num2, result;
    boolean hasDot;
    boolean hasoper=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        if(savedInstanceState!=null) {
            String firts,number1,number2,oper;
            boolean dot,haser;
            input.setText(savedInstanceState.getString("first_Value"));
            value1=savedInstanceState.getString("number1");
            sign=savedInstanceState.getString("operation");
            value2=savedInstanceState.getString("number2");
            hasDot=savedInstanceState.getBoolean("dot");
            hasoper=savedInstanceState.getBoolean("haser");
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("first_Value",input.getText().toString());
        outState.putString("number1",value1);
        outState.putString("operation",sign);
        outState.putString("number2",value2);
        outState.putBoolean("dot",hasDot);
        outState.putBoolean("haser",hasoper);


    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getString("first_Value");
        savedInstanceState.getString("number1");
        savedInstanceState.getString("operation");
        savedInstanceState.getString("number2");
        savedInstanceState.getBoolean("dot");
        savedInstanceState.getBoolean("haser");

    }

    public void btnClick_0(View view) {
        String s=input.getText().toString();
        if( s.equals("0")){

        }
        else{
            input.setText(input.getText()+"0");
        }
        if(s.equals("math error")){
            input.setText(null);
            input.setText(input.getText()+"0");
        }

    }
    public void btnClick_1(View view) {
        String s=input.getText().toString();
        if(s.equals("math error")){
            input.setText(null);
            input.setText(input.getText()+"1");
        }
        else {
            if (s.equals("0")) {
                input.setText(null);
                input.setText(input.getText() + "1");
            } else {
                input.setText((input.getText() + "1"));
            }
        }
    }
    public void btnClick_2(View view) {
        String s=input.getText().toString();
        if(s.equals("math error")){
            input.setText(null);
            input.setText(input.getText()+"2");
        }
        else{
            if(s.equals("0")){
                input.setText(null);
                input.setText(input.getText()+"2");}
            else{
                input.setText((input.getText()+"2"));
            }}
    }


    public void btnClick_3(View view){
        String s=input.getText().toString();
        if(s.equals("math error")){
            input.setText(null);
            input.setText("3");
        }
        else{
            if(s.equals("0")){
                input.setText(null);
                input.setText("3");
            }
            else{
                input.setText(input.getText()+"3");
            }
        }

    }

    public void btnClick_4(View view) {
        String s=input.getText().toString();
        if(s.equals("math error")){
            input.setText(null);
            input.setText(input.getText()+"4");
        }
        else{
            if(s.equals("0")){
                input.setText(null);
                input.setText(input.getText()+"4");}
            else{
                input.setText((input.getText()+"4"));
            }}

    }
    public void btnClick_5(View view) {
        String s=input.getText().toString();
        if(s.equals("math error")){
            input.setText(null);
            input.setText(input.getText()+"5");
        }
        else{
            if(s.equals("0")){
                input.setText(null);
                input.setText(input.getText()+"5");}
            else{
                input.setText((input.getText()+"5"));
            }}
    }
    public void btnClick_6(View view) {
        String s=input.getText().toString();
        if(s.equals("math error")){
            input.setText(null);
            input.setText(input.getText()+"6");
        }
        else {
            if (s.equals("0")) {
                input.setText(null);
                input.setText(input.getText() + "6");
            } else {
                input.setText((input.getText() + "6"));
            }
        }
    }
    public void btnClick_7(View view) {
        String s=input.getText().toString();
        if(s.equals("math error")){
            input.setText(null);
            input.setText(input.getText()+"7");
        }
        else {
            if (s.equals("0")) {
                input.setText(null);
                input.setText(input.getText() + "7");
            } else {
                input.setText((input.getText() + "7"));
            }
        }
    }
    public void btnClick_8(View view) {
        String s=input.getText().toString();
        if(s.equals("math error")){
            input.setText(null);
            input.setText(input.getText()+"8");
        }
        else{
            if(s.equals("0")){
                input.setText(null);
                input.setText(input.getText()+"8");}
            else{
                input.setText((input.getText()+"8"));
            }}

    }
    public void btnClick_9(View view) {
        String s=input.getText().toString();

        if(s.equals("math error")){
            input.setText(null);
            input.setText("9");
        }
        else{
            if(s.equals("0")){
                input.setText(null);
                input.setText(input.getText()+"9");}
            else{
                input.setText((input.getText()+"9"));
            }
        }
    }


    public void btnClick_plus(View view) {
        if(!hasoper){
            sign = "+";
            value1 = input.getText().toString();
            input.setText(null);
            hasoper=true;
            hasDot = false;}
        else{
            sign="+";
        }
    }

    public void btnClick_minus(View view) {
        if(!hasoper){
            sign = "-";
            value1 = input.getText().toString();
            input.setText(null);
            hasoper=true;
            hasDot = false;}
        else {
            sign="-";
        }
    }

    public void btnClick_multip(View view) {
        if(!hasoper){
            sign = "*";
            value1 = input.getText().toString();
            input.setText(null);
            hasoper=true;
            hasDot = false;}
        else{
            sign="*";
        }
    }

    public void btnClick_devid(View view) {
        String s = input.getText().toString();
        if (s.equals("math error")) {
            input.setText("math error");
        } else {
            if (!hasoper) {
                sign = "/";
                value1 = input.getText().toString();
                hasoper = true;
                input.setText(null);
                hasDot = false;
            } else {
                sign = "/";
            }
        }
    }

    public void btnClick_dota(View view) {
        if (!hasDot) {
            if (input.getText().equals("")) {

                input.setText("0.");
            } else {

                input.setText(input.getText() + ".");
            }

            hasDot = true;
        }
    }

    public void btnClick_koren(View view) {

        String s= input.getText().toString();
        if(s.equals("math error"))
        {
            s = "0";
        }
        double koren = Double.parseDouble(s);
        input.setText(Math.sqrt(koren) + "");
        hasDot = true;

    }

    public void btnClick_kvadr(View view) {
        String s= input.getText().toString();
        if(s.equals("math error"))
        {
            s = "0";
        }
        double t= Double.parseDouble(s);
        input.setText(Math.pow(t,2)+"");
        hasDot=true;
    }

    public void btnClick_clear(View view) {
        input.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
        hasDot = false;
    }


    public void btnClick_delete (View view){

        String s=input.getText().toString();
        if(s.equals(""))
        {

        }
        else {
            int t = s.length();
            String s1 = s.substring(0, t - 1);
            input.setText(s1 + "");
        }
    }
    public void btnClick_rovno(View view) {
        if (sign == null) {
            {

            }
        } else if (input.getText().equals("")) {
            {}
        }
        else {
            switch (sign) {
                default:
                    break;
                case "+":
                    if(value1=="" || value1.equals("Infinit") || value1.equals("Infini") || value1.equals("Infin") || value1.equals("Infi") || value1.equals("Inf") || value1.equals("In") || value1.equals("I") || value1.equals("math error")){value1="0";}
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 + num2;
                    input.setText(result + "");
                    hasDot=true;
                    hasoper=false;
                    sign = null;
                    break;
                case "-":
                    if(value1=="" || value1.equals("Infinit") || value1.equals("Infini") || value1.equals("Infin") || value1.equals("Infi") || value1.equals("Inf") || value1.equals("In") || value1.equals("I") || value1.equals("math error")){value1="0";}
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 - num2;
                    input.setText(result + "");
                    hasDot=true;
                    hasoper=false;
                    sign = null;
                    break;
                case "*":
                    if(value1=="" || value1.equals("Infinit") || value1.equals("Infini") || value1.equals("Infin") || value1.equals("Infi") || value1.equals("Inf") || value1.equals("In") || value1.equals("I") || value1.equals("math error")){value1="0";}
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 * num2;
                    input.setText(result + "");
                    hasDot=true;
                    hasoper=false;
                    sign = null;
                    break;
                case "/":
                    if(value1=="" || value1.equals("Infinit") || value1.equals("Infini") || value1.equals("Infin") || value1.equals("Infi") || value1.equals("Inf") || value1.equals("In") || value1.equals("I") || value1.equals("math error")){value1="0";}
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 / num2;
                    if(result.toString().equals("Infinity") || result.toString().equals("NaN")){
                        input.setText("math error");
                    }
                    else {
                        input.setText(result + "");}
                    hasDot=true;
                    sign = null;
                    hasoper=false;
                    break;
                case "kor":
                    if(value1=="" || value1.equals("Infinit") || value1.equals("Infini") || value1.equals("Infin") || value1.equals("Infi") || value1.equals("Inf") || value1.equals("In") || value1.equals("I") || value1.equals("math error")){value1="0";}
                    value2=input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = Math.pow(Math.E, Math.log(num1)/num2);
                    input.setText(result + "");
                    hasDot=true;
                    sign = null;
                    hasoper=false;
                    break;
                case "^":
                    if(value1=="" || value1.equals("Infinit") || value1.equals("Infini") || value1.equals("Infin") || value1.equals("Infi") || value1.equals("Inf") || value1.equals("In") || value1.equals("I") || value1.equals("math error")){value1="0";}
                    int t;
                    value2=input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = Math.pow(num1,(num2));
                    input.setText(result + "");
                    hasDot=true;
                    sign = null;
                    hasoper=false;
                    break;
            }

        }
    }

    public void btnClick_sin(View view) {
        String s= input.getText().toString();
        if(s.equals("math error"))
        {
            s = "0";
        }
        double f= Double.parseDouble(s);
        input.setText(Math.cos(f)+"");
    }

    public void btnClick_cos(View view) {
        String s=input.getText().toString();
        if(s.equals("math error"))
        {
            s = "0";
        }
        double f=Double.parseDouble(s);
        input.setText(Math.cos(f)+"");
    }

    public void btnClick_tan(View view) {
        String s= input.getText().toString();
        if(s.equals("math error"))
        {
            s = "0";
        }
        double f= Double.parseDouble(s);
        input.setText(Math.tan(f)+"");
    }

    public void btnClick_persent(View view) {
        String s= input.getText().toString();
        if(s.equals("math error"))
        {
            s = "0";
        }
        double f= Double.parseDouble(s);
        f=f*0.01;
        input.setText(f+"");
    }

    public void btnClick_ln(View view) {
        String s= input.getText().toString();
        if(s.equals("")){

        }else{
            if(s.equals("math error"))
            {
                s = "0";
            }
            double f= Double.parseDouble(s);
            f=Math.log(f);
            input.setText(f+"");}
    }

    public void btnClick_log(View view) {
        String s= input.getText().toString();
        if(s.equals("math error"))
        {
            s = "0";
        }
        double f= Double.parseDouble(s);
        f=Math.log10(f);
        input.setText(f+"");
    }


    public void btnClick_ndar(View view) {
        String s = input.getText().toString();
        if (s.equals("math error")) {
            input.setText("math error");
        } else {
            if (!hasoper) {
                sign = "^";
                value1 = input.getText().toString();
                hasoper = true;
                input.setText(null);
                hasDot = false;
            } else {
                sign = "^";
            }
        }
    }

    public void btnClick_nkoren(View view) {
        String s=input.getText().toString();
        if(s.equals("math error"))
        {
            s = "0";
        }
        value1=s;
        if(!hasoper){
            sign="kor";
            value1=input.getText().toString();
            hasoper=true;
            input.setText(null);
            hasDot=false;
        }
        else{
            sign="kor";
        }

    }

    public void btnClick_factorial(View view) {

        String s=input.getText().toString();
        if(s.equals("math error"))
        {
            s = "0";
        }
        boolean ok = true;
        long a = Long.parseLong(s);
        if((a == 1) || a == 0)
        {
            a = 1;
            input.setText(a+"");
        }
        else
        {
            if(a > 60)
            {
                input.setText("math error");
            }
            else
            {
                double fact = 1;
                for(int i = 2; i <= a; i++)
                {
                    fact = fact * i;
                }
                input.setText(fact+"");
            }
        }


    }
}
