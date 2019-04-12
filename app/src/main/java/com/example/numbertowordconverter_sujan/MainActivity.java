package com.example.numbertowordconverter_sujan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText EtNumber;
TextView Tvword;
Button BtnConvert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EtNumber=findViewById(R.id.EtNumber);
        Tvword=findViewById(R.id.Tvword);
        BtnConvert=findViewById(R.id.BtnConvert);

        BtnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(EtNumber.getText().toString()))
                {
                    EtNumber.setError("Enter Three Digit Number");
                    EtNumber.requestFocus();
                    return;
                }
                else if(EtNumber.length()>=4)
                {
                    EtNumber.setError("Only Three digit Number is valid");
                    EtNumber.setText("");
                    EtNumber.requestFocus();
                    return;
                }
                int number;
                number= Integer.parseInt(EtNumber.getText().toString());

                NumberToWordsConverter_Sujan convert= new NumberToWordsConverter_Sujan(number);
                Tvword.setText(convert.Conversion());

                InputMethodManager i = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                i.hideSoftInputFromWindow(BtnConvert.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);
            }
        });
    }
}
