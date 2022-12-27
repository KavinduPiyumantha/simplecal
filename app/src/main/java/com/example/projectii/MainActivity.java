package com.example.projectii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button addBtn;
    private Button mulBtn;
    private Button subBtn;
    private Button divBtn;

    private TextView ansTxt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        addBtn = (Button)findViewById(R.id.addBtn);
        divBtn = (Button)findViewById(R.id.divBtn);
        mulBtn = (Button)findViewById(R.id.mulBtn);
        subBtn = (Button)findViewById(R.id.subBtn);
        ansTxt = (TextView)findViewById(R.id.ansTxt);

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 =Integer.parseInt (num1.getText().toString());
                int number2 =Integer.parseInt (num2.getText().toString());
                int mul = number1*number2;
                ansTxt.setText("Answer is : " + mul);
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 =Integer.parseInt (num1.getText().toString());
                int number2 =Integer.parseInt (num2.getText().toString());
                int sum = number1+number2;
                ansTxt.setText("Answer is : " + sum);
            }

        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 =Integer.parseInt (num1.getText().toString());
                int number2 =Integer.parseInt (num2.getText().toString());
                int sub = number1-number2;
                ansTxt.setText("Answer is : " + sub);
            }
        });



        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double number1 = Double.parseDouble (num1.getText().toString());
                Double number2 = Double.parseDouble (num2.getText().toString());
                if (number2==0){
                    ansTxt.setText("Invalid Input");
                }else {
                    Double div = number1/number2;
                    ansTxt.setText("Answer is : " + div);
                }
            }
        });
    }
    ;
}