package com.example.bestlistview.global;

import android.app.Application;
import android.content.Context;

public class MyAppliction extends Application {
	public static Context context;
	
	@Override
	public void onCreate() {
		super.onCreate();
		context = this;
	}
}
