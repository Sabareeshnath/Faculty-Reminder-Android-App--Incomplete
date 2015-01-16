package com.example.facutlyreminder;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("unused")
public class Scheduler extends Activity {
	
	ListView listView;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scheduler);
		
		
		listView=(ListView)findViewById(R.id.list);
		
		String[] values=new String[]{"MONDAY",
									 "TUESDAY",
									 "WEDNESDAY",
									 "THURSDAY",
									 "FRIDAY",
									 "SATURDAY"};
		
				
		 ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	              android.R.layout.simple_list_item_1, android.R.id.text1, values);
	    listView.setAdapter(adapter);
	    
	    
	    listView.setOnItemClickListener(new OnItemClickListener()
	    {
	    	public void onItemClick(AdapterView<?> parent, View view,
	                int position, long id) {
	                 
	                
	    		 // String listname=listView.getSelectedItem().toString();
	    		
	    		String listname = (String)parent.getItemAtPosition(position); 
	    		  Toast.makeText(Scheduler.this, listname, Toast.LENGTH_SHORT).show();
	    		  
	                // Launching new Activity on selecting single List Item
	    		  
	                Intent i1 = new Intent(Scheduler.this,DataArea.class);
	                i1.putExtra("listname",listname);
	                // sending data to new activity
	               
	                startActivity(i1);
	               
	            }
	          });
	      }
	    
	    

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.scheduler, menu);
		return true;
	}

}
