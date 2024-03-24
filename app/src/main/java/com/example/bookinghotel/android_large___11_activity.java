package com.example.bookinghotel;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		android_large___11
	 *	@date 		Sunday 24th of March 2024 04:36:51 AM
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

public class android_large___11_activity extends Activity {

	
	private View _bg__android_large___11;
	private TextView payment;
	private View _bg___ep_back_ek1;
	private ImageView vector;
	private ImageView vector_ek1;
	private View _rectangle_83;
	private View ellipse_12;
	private View ellipse_13;
	private View _bg__tabler_location_filled_ek1;
	private View _bg__group_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private TextView pay_now;
	private View rectangle_76;
	private TextView card_holder_name;
	private ImageView rectangle_73;
	private TextView _5__vst_included;
	private TextView card_number;
	private TextView your_name;
	private ImageView rectangle_78;
	private TextView expiry_date;
	private TextView mm_yy;
	private TextView _______________;
	private TextView cvv;
	private TextView _____;
	private TextView total_price;
	private TextView __750_00;
	private ImageView image_1;
	private View rectangle_82;
	private View rectangle_3;
	private TextView payment_method;
	private View rectangle_83_ek1;
	private View rectangle_13;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_large___11);

		
		_bg__android_large___11 = (View) findViewById(R.id._bg__android_large___11);
		payment = (TextView) findViewById(R.id.payment);
		_bg___ep_back_ek1 = (View) findViewById(R.id._bg___ep_back_ek1);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		_rectangle_83 = (View) findViewById(R.id._rectangle_83);
		ellipse_12 = (View) findViewById(R.id.ellipse_12);
		ellipse_13 = (View) findViewById(R.id.ellipse_13);
		_bg__tabler_location_filled_ek1 = (View) findViewById(R.id._bg__tabler_location_filled_ek1);
		_bg__group_ek1 = (View) findViewById(R.id._bg__group_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		pay_now = (TextView) findViewById(R.id.pay_now);
		rectangle_76 = (View) findViewById(R.id.rectangle_76);
		card_holder_name = (TextView) findViewById(R.id.card_holder_name);
		rectangle_73 = (ImageView) findViewById(R.id.rectangle_73);
		_5__vst_included = (TextView) findViewById(R.id._5__vst_included);
		card_number = (TextView) findViewById(R.id.card_number);
		your_name = (TextView) findViewById(R.id.your_name);
		rectangle_78 = (ImageView) findViewById(R.id.rectangle_78);
		expiry_date = (TextView) findViewById(R.id.expiry_date);
		mm_yy = (TextView) findViewById(R.id.mm_yy);
		_______________ = (TextView) findViewById(R.id._______________);
		cvv = (TextView) findViewById(R.id.cvv);
		_____ = (TextView) findViewById(R.id._____);
		total_price = (TextView) findViewById(R.id.total_price);
		__750_00 = (TextView) findViewById(R.id.__750_00);
		image_1 = (ImageView) findViewById(R.id.image_1);
		rectangle_82 = (View) findViewById(R.id.rectangle_82);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		payment_method = (TextView) findViewById(R.id.payment_method);
		rectangle_83_ek1 = (View) findViewById(R.id.rectangle_83_ek1);
		rectangle_13 = (View) findViewById(R.id.rectangle_13);
	
		
		_rectangle_83.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___12_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	