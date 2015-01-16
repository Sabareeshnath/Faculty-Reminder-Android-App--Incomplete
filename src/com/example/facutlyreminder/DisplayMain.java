package com.example.facutlyreminder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.widget.TextView;

public class DisplayMain extends Activity{
	
	
	String location;
	TextView day;
	StringBuilder data;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.displayscheduler);
		
		day=(TextView)findViewById(R.id.day);
		
		   Intent i1=getIntent();
		  location = i1.getStringExtra("listname");
		day.setText(location);
		
		File sdCard = Environment.getExternalStorageDirectory();
	
		try
		{
			if(location.equals("MONDAY"))
			{
			
			File file=new File(sdCard,"monday.txt");
			
			
			 data=new StringBuilder();
			
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line;
			
			while((line=br.readLine())!=null )
			{
				data.append(line);
				data.append('\n');
			}
			br.close();
			}
			if(location.equals("TUESDAY"))
			{
			
			File file=new File(sdCard,"tuesday.txt");
			
			
			 data=new StringBuilder();
			
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line;
			
			while((line=br.readLine())!=null )
			{
				data.append(line);
				data.append('\n');
			}
			br.close();
			}
			if(location.equals("WEDNESDAY"))
			{
			
			File file=new File(sdCard,"wednesday.txt");
			
			
			 data=new StringBuilder();
			
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line;
			
			while((line=br.readLine())!=null )
			{
				data.append(line);
				data.append('\n');
			}
			br.close();
			}
			if(location.equals("THURSDAY"))
			{
			
			File file=new File(sdCard,"thursday.txt");
			
			
			 data=new StringBuilder();
			
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line;
			
			while((line=br.readLine())!=null )
			{
				data.append(line);
				data.append('\n');
			}
			br.close();
			}
			if(location.equals("FRIDAY"))
			{
			
			File file=new File(sdCard,"friday.txt");
			
			
			 data=new StringBuilder();
			
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line;
			
			while((line=br.readLine())!=null )
			{
				data.append(line);
				data.append('\n');
			}
			br.close();
			}
			if(location.equals("SATURDAY"))
			{
			
			File file=new File(sdCard,"saturday.txt");
			
			
			 data=new StringBuilder();
			
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line;
			
			while((line=br.readLine())!=null )
			{
				data.append(line);
				data.append('\n');
			}
			br.close();
			}
		}
		
		catch(IOException e)
		{
			
			
		}
	TextView text=(TextView)findViewById(R.id.textView1);
		text.setText(data);
		
	}
}

