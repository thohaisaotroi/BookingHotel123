package com.example.bookinghotel;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		android_large___2
	 *	@date 		Saturday 23rd of March 2024 09:09:16 PM
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

public class android_large___2_activity extends Activity {

	
	private View _bg__android_large___2;
	private View _bg__fa6_solid_map_location_dot_ek1;
	private ImageView vector;
	private TextView _wanderstay;
	private TextView find_your_stay__your_way;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_large___2);

		
		_bg__android_large___2 = (View) findViewById(R.id._bg__android_large___2);
		_bg__fa6_solid_map_location_dot_ek1 = (View) findViewById(R.id._bg__fa6_solid_map_location_dot_ek1);
		vector = (ImageView) findViewById(R.id.vector);
		_wanderstay = (TextView) findViewById(R.id._wanderstay);
		find_your_stay__your_way = (TextView) findViewById(R.id.find_your_stay__your_way);
	
		
		_wanderstay.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	