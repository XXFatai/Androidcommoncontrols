package com.trf.commoncontrols;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends Activity {
	private TextView resultView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		resultView = (TextView)findViewById(R.id.result);
		Intent intent = getIntent();
		String factorOne = intent.getStringExtra("one");
		String factorTwo = intent.getStringExtra("two");
		int factorOneInt = Integer.parseInt(factorOne);
		int factorTwoInt = Integer.parseInt(factorTwo);
		int result = factorOneInt * factorTwoInt;
		resultView.setText(result + "");
	}
	
}
