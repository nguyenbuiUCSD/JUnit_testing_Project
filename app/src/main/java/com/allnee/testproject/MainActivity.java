package com.allnee.testproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button  addButton = (Button) findViewById(R.id.button);
        final EditText firstNumber = (EditText) findViewById(R.id.editText);
        final EditText secondNumber = (EditText) findViewById(R.id.editText2);
        final EditText result     = (EditText) findViewById(R.id.editText3);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = null;
                String num2 = null;
                num1 = firstNumber.getText().toString();
                num2 = secondNumber.getText().toString();

                result.setText(String.valueOf(Integer.parseInt(num1)+
                                                Integer.parseInt(num2)));
            }
        });
    }

}
