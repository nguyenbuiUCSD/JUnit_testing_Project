package com.allnee.testproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

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

        final Button  addButton = (Button) mainActivity.findViewById(R.id.button);
        final EditText editText=(EditText) mainActivity.findViewById(R.id.editText3);
        final EditText firstNumber = (EditText) mainActivity.findViewById(R.id.editText);
        final EditText secondNumber = (EditText) mainActivity.findViewById(R.id.editText2);
        final EditText result     = (EditText) mainActivity.findViewById(R.id.editText3);

        firstNumber.setText("100");
        secondNumber.setText("200");

        addButton.performClick();

        String tester = editText.getText().toString();
        assertEquals("300", tester);
    }


}
