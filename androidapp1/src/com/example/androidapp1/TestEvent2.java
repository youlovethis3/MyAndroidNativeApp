package com.example.androidapp1;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.util.Log;

public class TestEvent2 extends Activity implements OnClickListener {
	
	private static final String TAG = "TestEvent2";
	private TextView mText;
	private Button mButton1;
	private Button mButton2;

	public TestEvent2() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mText = (TextView) findViewById(R.id.text1);
		mButton1 = (Button) findViewById(R.id.button1);
		mButton1.setOnClickListener(this); 
		mButton2 = (Button) findViewById(R.id.button2);
		mButton2.setOnClickListener(this); 
	}

	public void onClick(View v) {
		Log.v(TAG, "onClick()");
		switch (v.getId()) { 
		case R.id.button1:
			mText.setBackgroundColor(Color.YELLOW);
			break;
		case R.id.button2:
			mText.setBackgroundColor(Color.GREEN);
			break;
		default:
			Log.v(TAG, "other");
			break;
		}
	}
}