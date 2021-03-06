package com.example.android.calculator;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.*;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,
            button8,button9,buttonMultiply,buttonPlus,buttonMinus,buttonDivision,buttonEqual,
            buttonDot,buttonClear,buttonPercent,buttonOpenBracket,buttonCloseBracket;
    TextView InputTextView,OutputTextView;
    String process;
    boolean checkBracket = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);

        buttonPlus = findViewById(R.id.btnPlus);
        buttonMinus = findViewById(R.id.btnMinus);
        buttonMultiply = findViewById(R.id.btnMultiply);
        buttonDivision = findViewById(R.id.btnDivision);
        buttonPercent = findViewById(R.id.btnPercent);

        buttonEqual = findViewById(R.id.btnEqual);

        buttonClear = findViewById(R.id.btnClear);
        buttonDot = findViewById(R.id.btnDot);
        buttonOpenBracket = findViewById(R.id.btnopenBracket);
        buttonCloseBracket = findViewById(R.id.btncloseBracket);

        InputTextView = findViewById(R.id.input_text_view);
        OutputTextView = findViewById(R.id.output_text_view);


        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputTextView.setText("");
                OutputTextView.setText("");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"9");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"+");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"-");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"×");
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"÷");
            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+"%");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+".");
            }
        });

        buttonOpenBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    process = InputTextView.getText().toString();
                    InputTextView.setText(process+"(");
            }
        });

        buttonCloseBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = InputTextView.getText().toString();
                InputTextView.setText(process+")");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String finalResult = "";
            process = InputTextView.getText().toString();

            process = process.replaceAll("×","*");
            process = process.replaceAll("%","/100");
            process = process.replaceAll("÷","/");

            Expression exp = new Expression(process);
            finalResult = String.valueOf(exp.calculate());

            OutputTextView.setText(finalResult);
            }
        });
    }
}