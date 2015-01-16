package com.example.facutlyreminder;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainLog extends Activity {
	Button sched,disp,exit,sett;
	
	
	TextView title;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_log);
		
		
		
		
		disp=(Button)findViewById(R.id.Display);
		sched=(Button)findViewById(R.id.Schedule);
		sett=(Button)findViewById(R.id.Settings);
		exit=(Button)findViewById(R.id.Exit);
		
		/*TextView title=(TextView)findViewById(R.id.title);
	      Typeface custom_font = Typeface.createFromAsset(getAssets(),
	      "fonts/segoeuisl.ttf");
	    
	      
	      title.setTypeface(custom_font);*/
		addListenerOnButton();
	
	}
	

	private void addListenerOnButton() {
		// TODO Auto-generated method stub
		final Context context=this;
	
		
		sched.setOnClickListener(new View.OnClickListener()
		{
		
			public void onClick(View v)
			{
			
				Intent i1=new Intent(context,Scheduler.class);
				startActivity(i1);
				
			}
		});
		
		
		
		disp.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
			Intent i2=new Intent(context,Display.class);
			startActivity(i2);
			}
		});
		
		
		sett.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
			Intent i3=new Intent(context,Settings.class);
			startActivity(i3);
			}
		});
		
		exit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.addCategory(Intent.CATEGORY_HOME);
				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(intent);
						
			}
		});
		
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_log, menu);
		return true;
	}

}
