package com.example.ds;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class TestActivity extends Activity {
	Button loginButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test_relative);
		loginButton  =	 (Button) findViewById(R.id.loginbutton);//��view��������ת�ͳ���������button
		//14��15�в��ܽ�������ΪҪ���������֣��������������ҵ�id
		
		loginButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				/*
				 * Toast����ʾ�Ի��������activity��context��һ������
				 * Toast�ں���һ�㵱��������ʾ���
				 */
				Toast.makeText(TestActivity.this
						, "��½�ɹ�", Toast.LENGTH_LONG).show();
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test, menu);
		return true;
	}

}
