package com.mycompany.birth;

import javax.net.ssl.*;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class THREE extends Activity
{
	String test=".........";
	int charlength=0;
	TextView textV;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.three);

		textV = (TextView)findViewById(R.id.nayye);
		textV.setTextSize(20);
		AnimateText(test);
		Toast.makeText(this, "မွေးနေ့ ဆုတောင်း (၃)", 1).show();

	}



	private void AnimateText(final CharSequence text)
	{
		if(charlength<text.length()){
			charlength+=1;
			CharSequence mtext=text.subSequence(0, charlength);
			textV.setText(mtext);
		}
		new Handler().postDelayed(new Runnable(){

				@Override
				public void run()
				{
					AnimateText(text);
				}

			},150);

    }





}
