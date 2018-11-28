package com.firebase.unity3dlibrary;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.player.UnityPlayer;

public class AnalysisSDK {
    AnalysisSDK(){}
    static AnalysisSDK instance;
    public static AnalysisSDK GetInstance(){
        Log.e("AnalysisSDK","AnalysisSDK------------GetInstance");
        if(instance==null){
            instance=new AnalysisSDK();
            instance.context= UnityPlayer.currentActivity;
        }

        return instance;
    }
    IListener listener;
    public void SetListener(IListener listener){
        Log.e("AnalysisSDK","AnalysisSDK------------SetListener");
        this.listener=listener;
        if(listener!=null){
            listener.onEvent("hhh","3333333333","hhhh555555555555555");
        }
    }
    Context context;
    public void S_SetActivity(Context context){
        this.context=context;
    }




    FirebaseAnalytics mFirebaseAnalytics;
    public void S_Init(){
        Log.e("AnalysisSDK","AnalysisSDK------------S_Init");
        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(context);
        S_LogEvent();
    }


    void S_LogEvent(){
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "id-hhhhh");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "name-kkkddjdjd");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
        if(listener!=null){
            listener.onEvent("hhh","消息发送成功了","hhhh回电话打电话");
        }
    }
}

