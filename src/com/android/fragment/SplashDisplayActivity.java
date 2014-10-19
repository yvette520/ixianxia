package com.android.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashDisplayActivity extends Activity {
 	 private final int SPLASH_DISPLAY_LENGHT = 1000; // 延迟3秒  
	  
	    @Override  
	    protected void onCreate(Bundle savedInstanceState) {  
	        super.onCreate(savedInstanceState);  
	        setContentView(R.layout.splash);  
	  
	        new Handler().postDelayed(new Runnable() {  
	            @Override
				public void run() {  
	                Intent mainIntent =new Intent("android.fragment.action.webview");  
	                HomepageActivity.this.startActivity(mainIntent);  
	                HomepageActivity.this.finish();  
	            }  
	  
	        }, SPLASH_DISPLAY_LENGHT);  
	    }
    }
   
