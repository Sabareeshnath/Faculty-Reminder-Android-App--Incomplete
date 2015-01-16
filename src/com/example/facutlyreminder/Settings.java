package com.example.facutlyreminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class Settings extends Activity {
	Switch toggle;
	Intent go;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		 toggle = (Switch) findViewById(R.id.notification);
		 toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			        if (isChecked)
			        {
			        	
			            // The toggle is enabled
			        	Toast.makeText(getBaseContext(), "Notification Turned On", Toast.LENGTH_SHORT).show();
			        	
			        	      startService(new Intent(getBaseContext(), Voice.class));
			        	
			        } else {
			            // The toggle is disabled
			        	Toast.makeText(getBaseContext(), "Notification Turned Off", Toast.LENGTH_SHORT).show();
			        	 stopService(new Intent(getBaseContext(), Voice.class));
			        }
			    }
			});
		
	}

	
}
