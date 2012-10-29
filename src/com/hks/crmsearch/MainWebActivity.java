package com.hks.crmsearch;

import org.apache.cordova.*;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.IPlugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MainWebActivity extends Activity implements CordovaInterface {
	CordovaWebView mainView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	 super.onCreate(savedInstanceState);
         setContentView(R.layout.main);
         
        mainView =  (CordovaWebView) findViewById(R.id.mainView);
         mainView.loadUrl("file:///android_asset/www/index.html");
    }


	public void cancelLoadUrl() {
		// TODO Auto-generated method stub
		
	}

	public Activity getActivity() {
		// TODO Auto-generated method stub
		return this;
	}


	public Object onMessage(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setActivityResultCallback(IPlugin arg0) {
		// TODO Auto-generated method stub
		
	}

	public void startActivityForResult(IPlugin arg0, Intent arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}


	public Context getContext() {
		// TODO Auto-generated method stub
		return null;
	}

    
}
