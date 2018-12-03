using System.Collections;
using System.Collections.Generic;
using topifish.sdk;
using UnityEngine;
using UnityEngine.UI;
public class FirebaseAnalysisTest : MonoBehaviour {
    public Button sendEventButton,
        sendUserPropertyButton,
        sendScreenButton;
    void Start() {
        // 记录没有参数的事件。
        FirebaseAnalysisSDK.GetInstance.LogEvent("","","");
        FirebaseAnalysisSDK.GetInstance.SetUserId("testUserId");
        //用浮点参数记录事件
        sendEventButton.onClick.AddListener(delegate () {
            FirebaseAnalysisSDK.GetInstance.LogEvent("progress-" + Random.Range(0, 10), "percent-" + Random.Range(0, 10), Random.Range(0.3f, 20.3f)+"");
        });
        //用户属性上报
        sendEventButton.onClick.AddListener(delegate () {
            FirebaseAnalysisSDK.GetInstance.SetUserProperty("TestProperty", "你妹的去死,,=====djsoooookkkkk__" + Random.Range(0, 20));
        });
        //用户属性上报
        sendScreenButton.onClick.AddListener(delegate () {
            FirebaseAnalysisSDK.GetInstance.SetCurrentScreen("screenName_"+ Random.Range(0, 20), "screenClass_" + Random.Range(0, 20));
        });
    }
	
	void Update () {
		
	}
}
