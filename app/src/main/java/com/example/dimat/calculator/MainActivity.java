package com.example.dimat.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPoint;
    Button buttonDel;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMul;
    Button buttonDiv;
    Button buttonRes;
    TextView textView;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonPoint = findViewById(R.id.buttonPoint);
        buttonDel = findViewById(R.id.buttonDel);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonRes = findViewById(R.id.buttonRes);
        textView = findViewById(R.id.textView);
        resultText = findViewById(R.id.resultText);

        View.OnClickListener oclBtn0 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append(button0.getText());
            }
        };

        View.OnClickListener oclBtn1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append(button1.getText());
            }
        };

        View.OnClickListener oclBtn2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append(button2.getText());
            }
        };

        View.OnClickListener oclBtn3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append(button3.getText());
            }
        };

        View.OnClickListener oclBtn4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append(button4.getText());
            }
        };

        View.OnClickListener oclBtn5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append(button5.getText());
            }
        };

        View.OnClickListener oclBtn6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append(button6.getText());
            }
        };

        View.OnClickListener oclBtn7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append(button7.getText());
            }
        };

        View.OnClickListener oclBtn8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append(button8.getText());
            }
        };

        View.OnClickListener oclBtn9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append(button9.getText());
            }
        };

        View.OnClickListener oclBtnPoint = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String abc = textView.getText().toString();

                if (!abc.isEmpty())
                    textView.append(buttonPoint.getText());
            }
        };

        View.OnClickListener oclBtnPlus = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String abc = textView.getText().toString();

                if (!abc.isEmpty())
                    textView.append(buttonPlus.getText());
            }
        };

        View.OnClickListener oclBtnMinus = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String abc = textView.getText().toString();

                if (!abc.isEmpty())
                    textView.append(buttonMinus.getText());
            }
        };

        View.OnClickListener oclBtnMul = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String abc = textView.getText().toString();

                if (!abc.isEmpty())
                    textView.append(buttonMul.getText());
            }
        };

        View.OnClickListener oclBtnDiv = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String abc = textView.getText().toString();

                if (!abc.isEmpty())
                    textView.append(buttonDiv.getText());
            }
        };

        View.OnClickListener oclBtnDel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textView.getText().toString();
                if (!text.isEmpty()){
                    textView.setText(text.substring(0, text.length()-1));
                }
            }
        };

        View.OnClickListener oclBtnRes = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "", b = "";
                double res = 0;
                boolean exc = false;
                String abc = textView.getText().toString();

                if (abc.indexOf("+") != -1){
                    a += abc.substring(0, abc.indexOf("+"));
                    b += abc.substring(abc.indexOf("+")+1, abc.length());
                    if (a != "" && b != "")
                        res = parseDouble(a)+parseDouble(b);
                }

                if (abc.indexOf("-") != -1){
                    a += abc.substring(0, abc.indexOf("-"));
                    b += abc.substring(abc.indexOf("-")+1, abc.length());
                    if (a != "" && b != "")
                        res = parseDouble(a)-parseDouble(b);
                }

                if (abc.indexOf("*") != -1){
                    a += abc.substring(0, abc.indexOf("*"));
                    b += abc.substring(abc.indexOf("*")+1, abc.length());
                    if (a != "" && b != "")
                        res = parseDouble(a) * parseDouble(b);
                }

                if (abc.indexOf("/") != -1){
                    try {
                        a += abc.substring(0, abc.indexOf("/"));
                        b += abc.substring(abc.indexOf("/")+1, abc.length());
                        if (b.equals("0")){
                            throw new ArithmeticException();
                        }else{
                            if (a != "" && b != ""){
                                res = parseDouble(a) / parseDouble(b);
                            }
                        }
                    } catch (ArithmeticException e){
                        resultText.setText("Division by zero");
                        exc = true;
                    }
                }

                if (!exc) {
                    resultText.setText(String.valueOf(res));
                }
            }
        };

        button0.setOnClickListener(oclBtn0);
        button1.setOnClickListener(oclBtn1);
        button2.setOnClickListener(oclBtn2);
        button3.setOnClickListener(oclBtn3);
        button4.setOnClickListener(oclBtn4);
        button5.setOnClickListener(oclBtn5);
        button6.setOnClickListener(oclBtn6);
        button7.setOnClickListener(oclBtn7);
        button8.setOnClickListener(oclBtn8);
        button9.setOnClickListener(oclBtn9);
        buttonPoint.setOnClickListener(oclBtnPoint);
        buttonPlus.setOnClickListener(oclBtnPlus);
        buttonMinus.setOnClickListener(oclBtnMinus);
        buttonMul.setOnClickListener(oclBtnMul);
        buttonDiv.setOnClickListener(oclBtnDiv);
        buttonDel.setOnClickListener(oclBtnDel);
        buttonRes.setOnClickListener(oclBtnRes);
    }
}
