package com.example.user.eightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    backwards compatibility through extension

    EditText questionEditText;
    TextView answerText;
    Button shakeButton;


    @Override
//    annotation, info on what follows.  Flag on mistake on overwriting
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Super, passes to parent class. onCreate, what happens upon start/launch.  Saved state is the state of the app when closed.  Bundle helps to save this info
        setContentView(R.layout.activity_main);
//        Content.  R represents 'res' resources in your app and where the xml file is kept
//        Log.d("EightBall", "Hello World!");
//          Can use Log.d as DEBUGGER TO INPUT A STRING INTO CODE

        questionEditText = (EditText)findViewById(R.id.question);
//                POLYMORHISM, making resultant view an EditText type.  We know result will be a VIEW. pass ID made in activityLayout.  method comes from AppComptActivity parent class
        answerText = (TextView)findViewById(R.id.answer_text);
        shakeButton = (Button)findViewById(R.id.shake_button);
    }

    public void onShakeButtonClicked(View button){
        //        android event driven so will sit until event happens,  we need to say what happens when button is pressed.
        String question = questionEditText.getText().toString();
        Log.d("EightBall", question);

        Answers answer = new Answers();
        answerText.setText(answer.getAnswer());
//        takes Answers class random answer method and pulls through to existing answerText box

    }
}
