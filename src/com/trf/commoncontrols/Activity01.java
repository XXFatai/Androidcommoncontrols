package com.trf.commoncontrols;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;

public class Activity01 extends Activity {
	private Button button;
	private EditText factorOne;
	private EditText factorTwo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity01);
		button 	  = (Button)findViewById(R.id.Button);
		factorOne = (EditText)findViewById(R.id.EditText1);
		factorTwo = (EditText)findViewById(R.id.EditText2);
		button.setOnClickListener(new ButtonClickListener());
	}
	class ButtonClickListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String factorOneStr = factorOne.getText().toString();
			String factorTwoStr = factorTwo.getText().toString();
			Intent intent = new Intent();
			intent.putExtra("one", factorOneStr);
			intent.putExtra("two", factorTwoStr);
			intent.setClass(Activity01.this, Result.class);
			Activity01.this.startActivity(intent);
		}
	}
}
