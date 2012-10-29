package com.hks.crmsearch;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("loadUrlTimeoutValue", 60000);
      	super.loadUrl("file:///android_asset/www/index.html");
      	
      	this.appView.getSettings().setJavaScriptEnabled(true);
        this.appView.addJavascriptInterface(new Console(), "console"
        );
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }

    
}
