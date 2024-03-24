package com.example.bookinghotel;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		android_large___5
	 *	@date 		Saturday 23rd of March 2024 09:10:12 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */




import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class android_large___5_activity extends Activity {

	
	private View _bg__android_large___5;
	private ImageView m__an_to_n;
	private TextView _01_26;
	private TextView _2;
	private TextView please_enter_the_verification_code_sent_to_example_gmail_com;
	private TextView didn_t_receive_code__resend_again;
	private View _rectangle_2;
	private TextView verify;
	private View _bg___ep_back_ek1;
	private ImageView vector;
	private ImageView vector_ek1;
	private View rectangle_6;
	private View rectangle_7;
	private View rectangle_8;
	private View rectangle_9;
	private ImageView line_4;
	private ImageView image_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_large___5);

		
		_bg__android_large___5 = (View) findViewById(R.id._bg__android_large___5);
		m__an_to_n = (ImageView) findViewById(R.id.m__an_to_n);
		_01_26 = (TextView) findViewById(R.id._01_26);
		_2 = (TextView) findViewById(R.id._2);
		please_enter_the_verification_code_sent_to_example_gmail_com = (TextView) findViewById(R.id.please_enter_the_verification_code_sent_to_example_gmail_com);
		didn_t_receive_code__resend_again = (TextView) findViewById(R.id.didn_t_receive_code__resend_again);
		_rectangle_2 = (View) findViewById(R.id._rectangle_2);
		verify = (TextView) findViewById(R.id.verify);
		_bg___ep_back_ek1 = (View) findViewById(R.id._bg___ep_back_ek1);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		rectangle_6 = (View) findViewById(R.id.rectangle_6);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		rectangle_8 = (View) findViewById(R.id.rectangle_8);
		rectangle_9 = (View) findViewById(R.id.rectangle_9);
		line_4 = (ImageView) findViewById(R.id.line_4);
		image_1 = (ImageView) findViewById(R.id.image_1);
	
		
		_rectangle_2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___4_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	