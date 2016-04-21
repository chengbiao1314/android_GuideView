package com.chengbiao.ricky.guideview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private GuideViewUtil mGuideViewUtil;
	private Button mButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mButton=(Button)findViewById(R.id.bt_1);
		mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this, SecondActivity.class);
				startActivity(intent);
				finish();
			}
		});
		mGuideViewUtil=new GuideViewUtil(this, R.drawable.xinshou1);
	}
}
