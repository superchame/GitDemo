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
		loginButton  =	 (Button) findViewById(R.id.loginbutton);//将view对象向下转型成它的子类button
		//14行15行不能交换，因为要先声明布局，后面的组件才能找到id
		
		loginButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				/*
				 * Toast是提示对话框组件，activity是context的一个子类
				 * Toast在后期一般当做调试显示语句
				 */
				Toast.makeText(TestActivity.this
						, "登陆成功", Toast.LENGTH_LONG).show();
				
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
