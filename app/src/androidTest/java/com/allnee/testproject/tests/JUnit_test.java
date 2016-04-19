package com.allnee.testproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import android.widget.EditText;

import com.allnee.testproject.MainActivity;
import com.allnee.testproject.R;

/**
 * Created by nguyenbui on 4/13/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;

    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();

        final EditText editText=(EditText) mainActivity.findViewById(R.id.editText3);
        final EditText firstNumber = (EditText) mainActivity.findViewById(R.id.editText);
        final EditText secondNumber = (EditText) mainActivity.findViewById(R.id.editText2);
        final EditText result     = (EditText) mainActivity.findViewById(R.id.editText3);

        String num1 = firstNumber.getText().toString();
        String num2 = secondNumber.getText().toString();

        String tester = editText.getText().toString();
        assertEquals(String.valueOf(Integer.parseInt(num1)+
                Integer.parseInt(num2)), tester);
    }


}
