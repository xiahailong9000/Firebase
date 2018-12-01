package com.firebase.analysis_and;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.firebase.unity3dlibrary.AnalysisSDK;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        AnalysisSDK.getInstance().setActivity(this);
        AnalysisSDK.getInstance().init();
        AnalysisSDK.getInstance().logEvent("eventdddd","dsdsd","dsdd");
    }
}
