package com.example.zhanglongxiang.myiatdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;
import com.iflytek.cloud.SpeechRecognizer;
import com.iflytek.cloud.SpeechUtility;




public class MainActivity extends Activity {
    private Button startButton = null;
    private android.speech.SpeechRecognizer iatRecognizer;

    private String engine = "iat";
    private String rate = "16000";
    private EditText mResultText = null;//识别结果显示
    private Toast mToast;

    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        mToast = Toast.makeText(this,"",Toast.LENGTH_SHORT);

        startButton = (Button)findViewById(R.id.button_start);
        mResultText = (EditText)findViewById(R.id.editText);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mResultText.setText("Hello world");
            }
        });



       // SpeechUtility.createUtility(this,SpeechConstant.APPID+"=563cafe2");
    }



//    public void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        SpeechUtility.createUtility(Context,SpeechConstant.APPID+"=563cafe2");
//
//        mToast = Toast.makeText(this,"",Toast.LENGTH_LONG);
//        mResultText = (EditText)findViewById(R.id.editText);
//        startButton = (Button)findViewById(R.id.button_start);
//        startButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//    }
}
