package com.example.bookinghotel;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		android_large___1
	 *	@date 		Saturday 23rd of March 2024 09:07:52 PM
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

public class android_large___1_activity extends Activity {

	
	private View _bg__android_large___1_ek2;
	private View ellipse_1;
	private View ellipse_2;
	private View ellipse_3;
	private ImageView ellipse_4;
	private ImageView ellipse_5;
	private ImageView ellipse_6;
	private TextView unleash_your_inner_traveller;
	private TextView your_passport_to_a_world_of_extraordinary_hotel_experiences__join_us_today_and_unlock_a_realm_of_comfort__luxury__and_adventure_;
	private TextView _already_have_an_account__login;
	private View _rectangle_1;
	private TextView start_exploring;
	private View _bg__fluent_arrow_up_12_filled_ek1;
	private ImageView vector;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_large___1);

		
		_bg__android_large___1_ek2 = (View) findViewById(R.id._bg__android_large___1_ek2);
		ellipse_1 = (View) findViewById(R.id.ellipse_1);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		ellipse_3 = (View) findViewById(R.id.ellipse_3);
		ellipse_4 = (ImageView) findViewById(R.id.ellipse_4);
		ellipse_5 = (ImageView) findViewById(R.id.ellipse_5);
		ellipse_6 = (ImageView) findViewById(R.id.ellipse_6);
		unleash_your_inner_traveller = (TextView) findViewById(R.id.unleash_your_inner_traveller);
		your_passport_to_a_world_of_extraordinary_hotel_experiences__join_us_today_and_unlock_a_realm_of_comfort__luxury__and_adventure_ = (TextView) findViewById(R.id.your_passport_to_a_world_of_extraordinary_hotel_experiences__join_us_today_and_unlock_a_realm_of_comfort__luxury__and_adventure_);
		_already_have_an_account__login = (TextView) findViewById(R.id._already_have_an_account__login);
		_rectangle_1 = (View) findViewById(R.id._rectangle_1);
		start_exploring = (TextView) findViewById(R.id.start_exploring);
		_bg__fluent_arrow_up_12_filled_ek1 = (View) findViewById(R.id._bg__fluent_arrow_up_12_filled_ek1);
		vector = (ImageView) findViewById(R.id.vector);
	
		
		_already_have_an_account__login.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___4_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	