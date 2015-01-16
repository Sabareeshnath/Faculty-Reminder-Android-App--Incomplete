package com.example.facutlyreminder;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
	int myProgress=0;
	ProgressBar myProgressBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myProgressBar=(ProgressBar)findViewById(R.id.progressbar);

		new Thread(myThread).start(); 
		}

		private Runnable myThread = new Runnable()
		{

		@Override 
		public void run() 
		{ 	
		
		// TODO Auto-generated method stub 
		while (myProgress<100) 
		{ 
		try 
		{ 
		myHandle.sendMessage(myHandle.obtainMessage()); 
		Thread.sleep(50); 
		} 
		catch(Throwable t) 
		{ 
			
		}
	
		}
		
		Intent intent= new Intent(MainActivity.this,MainLog.class);
		startActivity(intent);
		finish();
		}

		@SuppressLint("HandlerLeak")
		Handler myHandle = new Handler() 
		{

		@Override 
		public void handleMessage(Message msg) 
		{ 
		// TODO Auto-generated method stub 
		myProgress++; 
		myProgressBar.setProgress(myProgress); 
		
		
		} 
		
		}; 
		
		};


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	}
	
}
