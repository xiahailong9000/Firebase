using System.Collections;
using System.Collections.Generic;
using topifish.sdk;
using UnityEngine;

public class C_Test : MonoBehaviour {
    firebaseAnalysisSDK firebaseAnalysisSDK;
    IEnumerator Start () {
        yield return new WaitForSeconds(0.3f);
        firebaseAnalysisSDK = new firebaseAnalysisSDK();
        firebaseAnalysisSDK.Init();
    }
	
	// Update is called once per frame
	void Update () {
		
	}
}
