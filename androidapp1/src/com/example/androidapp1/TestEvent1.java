package com.example.androidapp1;


import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TestEvent1 extends Activity {
	private static final String TAG = "TestEvent1";
	public TestEvent1() {
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextView Text = (TextView) findViewById(R.id.text1); 
		final Button Button1 = (Button) findViewById(R.id.button1);
		final Button Button2 = (Button) findViewById(R.id.button2);
		Button1.setOnClickListener(new OnClickListener() { 
		public void onClick(View v) {
		Text.setBackgroundColor(Color.RED);
		}
		});
		Button2.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
		Text.setBackgroundColor(Color.GREEN);
		}
		});
	}

	

}
