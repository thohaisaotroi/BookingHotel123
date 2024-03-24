package com.example.bookinghotel;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		android_large___10
	 *	@date 		Sunday 24th of March 2024 04:37:11 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	



import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class android_large___10_activity extends Activity {

	
	private View _bg__android_large___10;
	private TextView booking_summary;
	private View _bg___ep_back_ek1;
	private ImageView vector;
	private ImageView vector_ek1;
	private ImageView rectangle_77;
	private TextView ayana_resort;
	private TextView bali__indonesia;
	private TextView booking_date;
	private TextView check_in;
	private TextView chcek_out;
	private TextView guests;
	private TextView room_s_;
	private TextView amount;
	private TextView tax;
	private TextView total;
	private TextView __350_usd__night;
	private TextView _1_oct_2023;
	private TextView __350_x_2;
	private TextView __30;
	private TextView __730;
	private TextView _24_oct_2023;
	private TextView _26_oct_2023;
	private TextView _3;
	private TextView _1;
	private ImageView line_8;
	private View _rectangle_83;
	private TextView continue_to_payment;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_large___10);

		
		_bg__android_large___10 = (View) findViewById(R.id._bg__android_large___10);
		booking_summary = (TextView) findViewById(R.id.booking_summary);
		_bg___ep_back_ek1 = (View) findViewById(R.id._bg___ep_back_ek1);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		rectangle_77 = (ImageView) findViewById(R.id.rectangle_77);
		ayana_resort = (TextView) findViewById(R.id.ayana_resort);
		bali__indonesia = (TextView) findViewById(R.id.bali__indonesia);
		booking_date = (TextView) findViewById(R.id.booking_date);
		check_in = (TextView) findViewById(R.id.check_in);
		chcek_out = (TextView) findViewById(R.id.chcek_out);
		guests = (TextView) findViewById(R.id.guests);
		room_s_ = (TextView) findViewById(R.id.room_s_);
		amount = (TextView) findViewById(R.id.amount);
		tax = (TextView) findViewById(R.id.tax);
		total = (TextView) findViewById(R.id.total);
		__350_usd__night = (TextView) findViewById(R.id.__350_usd__night);
		_1_oct_2023 = (TextView) findViewById(R.id._1_oct_2023);
		__350_x_2 = (TextView) findViewById(R.id.__350_x_2);
		__30 = (TextView) findViewById(R.id.__30);
		__730 = (TextView) findViewById(R.id.__730);
		_24_oct_2023 = (TextView) findViewById(R.id._24_oct_2023);
		_26_oct_2023 = (TextView) findViewById(R.id._26_oct_2023);
		_3 = (TextView) findViewById(R.id._3);
		_1 = (TextView) findViewById(R.id._1);
		line_8 = (ImageView) findViewById(R.id.line_8);
		_rectangle_83 = (View) findViewById(R.id._rectangle_83);
		continue_to_payment = (TextView) findViewById(R.id.continue_to_payment);
	
		
		_rectangle_83.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___11_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	