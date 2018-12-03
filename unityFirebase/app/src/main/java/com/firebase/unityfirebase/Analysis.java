package com.firebase.unityfirebase;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.player.UnityPlayer;

public class Analysis {
    Analysis(){}
    static Analysis instance;
    public static Analysis getInstance(){
        Log.e("AnalysisSDK","AnalysisSDK------------GetInstance");
        if(instance==null){
            instance=new Analysis();
            if(UnityPlayer.currentActivity!=null){
                instance.activity = UnityPlayer.currentActivity;
            }
        }

        return instance;
    }
    Activity activity;
    public void setActivity(Activity context){
        this.activity =context;
    }


    IListener listener;
    public void setListener(IListener listener){
        Log.e("AnalysisSDK","AnalysisSDK------------SetListener");
        this.listener=listener;
        if(listener!=null){
            listener.onEvent("hhh","3333333333","hhhh555555555555555");
        }
    }


    FirebaseAnalytics mFirebaseAnalytics;
    public void init(){
        Log.e("AnalysisSDK","AnalysisSDK------------S_Init");
        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(activity);
    }


    public void logEvent(String var1,String var2,String nnn){
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, var1);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,var2);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, nnn);
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
        if(listener!=null){
            listener.onEvent("hhh","消息发送成功了","hhhh回电话打电话");
        }
    }
    public void setUserId(String userId){
        mFirebaseAnalytics.setUserId(userId);
    }

    public void setUserProperty(String var1,String var2){
        mFirebaseAnalytics.setUserProperty(var1,var2);
    }
    public void setCurrentScreen(String var1,String var2,String nnn){
        //mFirebaseAnalytics.setCurrentScreen(var1,var2,nnn);
    }
}

