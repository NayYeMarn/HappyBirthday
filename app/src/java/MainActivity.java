package com.mycompany.birth;

import android.app.*;
import android.media.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import com.mycompany.birth.*;
import android.widget.*;
import android.content.*;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class MainActivity extends Activity 
{
	MediaPlayer sound;

	Button bmusic,b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Toast.makeText(this, "Developed by Nay Ye Marn", 1).show();
		
		bmusic=(Button)findViewById(R.id.bmusic);
		b1=(Button)findViewById(R.id.b1);
		b2=(Button)findViewById(R.id.b2);
		b3=(Button)findViewById(R.id.b3);
		b4=(Button)findViewById(R.id.b4);
		b1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent i=new Intent(getApplicationContext(),ONE.class);
					startActivity(i);
				}});
		b2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent i=new Intent(getApplicationContext(),TWO.class);
					startActivity(i);
				}});
		b3.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent i=new Intent(getApplicationContext(),THREE.class);
					startActivity(i);
				}});
		b4.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent i=new Intent(getApplicationContext(),FOUR.class);
					startActivity(i);
				}});
		bmusic.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {

					if(sound!=null){
						if(sound.isPlaying()){
							sound.stop();
						}
						sound=MediaPlayer.create(MainActivity.this, R.raw.m1);
						sound.start();
					}
					else{
						sound=MediaPlayer.create(MainActivity.this, R.raw.m1);
						sound.start();
					}

				

			
    
}});}


	public void onClick(View arg0) {

		if(sound!=null){
			if(sound.isPlaying()){
				sound.stop();
			}
			sound=MediaPlayer.create(MainActivity.this, R.raw.m1);
			sound.start();
		}
		else{
			sound=MediaPlayer.create(MainActivity.this, R.raw.m1);
			sound.start();}}

    public void onBackPressed() {

        AlertDialog alert_back = new AlertDialog.Builder(this).create();


        alert_back.setTitle("Want To Quit?");


        alert_back.setMessage("choose yes or no");


        alert_back.setButton("Yes", new DialogInterface.OnClickListener() {

				@Override
				public void onClick(DialogInterface dialog, int which) {


					MainActivity.this.finish();
					if(sound!=null){
						if(sound.isPlaying()){
							sound.stop();
						}
					}
				}
			});


        alert_back.setButton2("No", new DialogInterface.OnClickListener() {

				@Override
				public void onClick(DialogInterface dialog, int which) {


					dialog.dismiss();
				}
			});


        alert_back.show();  
	}

}

