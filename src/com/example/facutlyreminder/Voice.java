package com.example.facutlyreminder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Time;
import java.util.Calendar;
import java.util.Locale;

import android.app.Service;
import android.content.Intent;
import android.os.Environment;
import android.os.IBinder;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.widget.Toast;





public class Voice extends Service implements TextToSpeech.OnInitListener{
String weekDay;
StringBuilder data;
private String str;
private TextToSpeech mTts;
File sdCard = Environment.getExternalStorageDirectory();
private static final String TAG="TTSService";
private int pos;
@SuppressWarnings("deprecation")
int hours = new Time(System.currentTimeMillis()).getHours();
@SuppressWarnings("deprecation")
int min = new Time(System.currentTimeMillis()).getMinutes();
@Override

public IBinder onBind(Intent arg0) {

    return null;
}


@Override
public void onCreate() {

      mTts = new TextToSpeech(this,
                this  // OnInitListener
                );
      mTts.setSpeechRate(0.5f);
      Log.v(TAG, "oncreate_service");
     
     // Toast.makeText(getBaseContext(), "Speech Turned On", Toast.LENGTH_SHORT).show();
 	Calendar calendar = Calendar.getInstance();
	int day = calendar.get(Calendar.DAY_OF_WEEK); 

	switch(day)
	{
	
	case Calendar.SUNDAY:
		weekDay="Sunday";
	    Toast.makeText(Voice.this, weekDay, Toast.LENGTH_SHORT).show();
	    break;
	    

	case Calendar.MONDAY:
		weekDay="Monday";
	    Toast.makeText(Voice.this, weekDay, Toast.LENGTH_SHORT).show();
	    break;

	case Calendar.TUESDAY:
		weekDay="Tuesday";
	    Toast.makeText(Voice.this, weekDay, Toast.LENGTH_SHORT).show();
	    break;
	    

	case Calendar.WEDNESDAY:
		weekDay="Wednesday";
	    Toast.makeText(Voice.this, weekDay, Toast.LENGTH_SHORT).show();
	    break;

	case Calendar.THURSDAY:
		weekDay="Thursday";
	    Toast.makeText(Voice.this, weekDay, Toast.LENGTH_SHORT).show();
	    break;

	case Calendar.FRIDAY:
		weekDay="Friday";
	    Toast.makeText(Voice.this, weekDay, Toast.LENGTH_SHORT).show();
	    break;

	case Calendar.SATURDAY:
		weekDay="Saturday";
	    Toast.makeText(Voice.this, weekDay, Toast.LENGTH_SHORT).show();
	    break;

	default:
		weekDay="none";
	    Toast.makeText(Voice.this, weekDay, Toast.LENGTH_SHORT).show();
	    break;
	}
	


sdCard = Environment.getExternalStorageDirectory();
	
	try
	{
		if(weekDay.equals("Monday"))
		{
		
		File file=new File(sdCard,"monday.txt");
		
		
		 data=new StringBuilder();
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		String line;
		
		while((line=br.readLine())!=null )
		{
			data.append(line);
			if(data.equals("Select Your Slot"))
					{
				data.append('\n');
					}
			else
			{
			pos = data.length();
			if(pos==1)
			{
				if(hours==8 && min==50)
					str ="Class At" + data.toString();
			}
				
			if(pos==2)
			{
				if(hours==9 && min==40)
					str ="Class At" + data.toString();
			}
			
			if(pos==3)
			{
				if(hours==10 && min==50)
					str ="Class At" + data.toString();
			}
			if(pos==4)
			{
				if(hours==11 && min==40)
					str ="Class At" + data.toString();
			}
				
			if(pos==5)
			{
				if(hours==1 && min==20)
					str ="Class At" + data.toString();
			}
			
			if(pos==6)
			{
				if(hours==2 && min==10)
					str ="Class At" + data.toString();
			}
			
			if(pos==7)
			{
				if(hours==3 && min==10)
					str ="Class At" + data.toString();
			}
			
			if(pos==8)
			{
				if(hours==4 && min==00)
					str ="Class At" + data.toString();
			}
			
			
			}
		br.close();
		}
		}
		if(weekDay.equals("Tuesday"))
		{
	File file=new File(sdCard,"tuesday.txt");
		
		
		 data=new StringBuilder();
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		String line;
		
		while((line=br.readLine())!=null )
		{
			data.append(line);
			if(data.equals("Select Your Slot"))
					{
				data.append('\n');
					}
			else
			{
			pos = data.length();
			if(pos==1)
			{
				if(hours==8 && min==50)
					str ="Class At" + data.toString();
			}
				
			if(pos==2)
			{
				if(hours==9 && min==40)
					str ="Class At" + data.toString();
			}
			
			if(pos==3)
			{
				if(hours==10 && min==50)
					str ="Class At" + data.toString();
			}
			if(pos==4)
			{
				if(hours==11 && min==40)
					str ="Class At" + data.toString();
			}
				
			if(pos==5)
			{
				if(hours==1 && min==20)
					str ="Class At" + data.toString();
			}
			
			if(pos==6)
			{
				if(hours==2 && min==10)
					str ="Class At" + data.toString();
			}
			
			if(pos==7)
			{
				if(hours==3 && min==10)
					str ="Class At" + data.toString();
			}
			
			if(pos==8)
			{
				if(hours==4 && min==00)
					str ="Class At" + data.toString();
			}
			
		}
		br.close();
		}
		}
		
		if(weekDay.equals("Wednesday"))
		{
		
		File file=new File(sdCard,"wednesday.txt");
		
		
		 data=new StringBuilder();
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		String line;
		
		while((line=br.readLine())!=null )
		{
			data.append(line);
			if(data.equals("Select Your Slot"))
					{
				data.append('\n');
					}
			else
			{
			pos = data.length();
			if(pos==1)
			{
				if(hours==8 && min==50)
					str ="Class At" + data.toString();
			}
				
			if(pos==2)
			{
				if(hours==9 && min==40)
					str ="Class At" + data.toString();
			}
			
			if(pos==3)
			{
				if(hours==10 && min==50)
					str ="Class At" + data.toString();
			}
			if(pos==4)
			{
				if(hours==11 && min==40)
					str ="Class At" + data.toString();
			}
				
			if(pos==5)
			{
				if(hours==1 && min==20)
					str ="Class At" + data.toString();
			}
			
			if(pos==6)
			{
				if(hours==2 && min==10)
					str ="Class At" + data.toString();
			}
			
			if(pos==7)
			{
				if(hours==3 && min==10)
					str ="Class At" + data.toString();
			}
			
			if(pos==8)
			{
				if(hours==4 && min==00)
					str ="Class At" + data.toString();
			}
			}
		br.close();
		}
		}

		if(weekDay.equals("Thursday"))
		{
		
		File file=new File(sdCard,"thursday.txt");
		
		
		 data=new StringBuilder();
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		String line;
		
		while((line=br.readLine())!=null )
		{
			data.append(line);
			if(data.equals("Select Your Slot"))
					{
				data.append('\n');
					}
			else
			{
			pos = data.length();
			if(pos==1)
			{
				if(hours==8 && min==50)
					str ="Class At" + data.toString();
			}
				
			if(pos==2)
			{
				if(hours==9 && min==40)
					str ="Class At" + data.toString();
			}
			
			if(pos==3)
			{
				if(hours==10 && min==50)
					str ="Class At" + data.toString();
			}
			if(pos==4)
			{
				if(hours==11 && min==40)
					str ="Class At" + data.toString();
			}
				
			if(pos==5)
			{
				if(hours==1 && min==20)
					str ="Class At" + data.toString();
			}
			
			if(pos==6)
			{
				if(hours==2 && min==10)
					str ="Class At" + data.toString();
			}
			
			if(pos==7)
			{
				if(hours==3 && min==10)
					str ="Class At" + data.toString();
			}
			
			if(pos==8)
			{
				if(hours==4 && min==00)
					str ="Class At" + data.toString();
			}
					}
		br.close();
		}
		}
		if(weekDay.equals("Friday"))
		{
		
		File file=new File(sdCard,"friday.txt");
		
		
		 data=new StringBuilder();
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		String line;
		
		while((line=br.readLine())!=null )
		{
			data.append(line);
			if(data.equals("Select Your Slot"))
					{
				data.append('\n');
					}
			else
			{
			pos = data.length();
			if(pos==1)
			{
				if(hours==8 && min==50)
					str ="Class At" + data.toString();
			}
				
			if(pos==2)
			{
				if(hours==9 && min==40)
					str ="Class At" + data.toString();
			}
			
			if(pos==3)
			{
				if(hours==10 && min==50)
					str ="Class At" + data.toString();
			}
			if(pos==4)
			{
				if(hours==11 && min==40)
					str ="Class At" + data.toString();
			}
				
			if(pos==5)
			{
				if(hours==1 && min==20)
					str ="Class At" + data.toString();
			}
			
			if(pos==6)
			{
				if(hours==2 && min==10)
					str ="Class At" + data.toString();
			}
			
			if(pos==7)
			{
				if(hours==3 && min==10)
					str ="Class At" + data.toString();
			}
			
			if(pos==8)
			{
				if(hours==4 && min==00)
					str ="Class At" + data.toString();
			}
			
		}
		br.close();
		}
		}
		if(weekDay.equals("Saturday"))
		{
		
		File file=new File(sdCard,"saturday.txt");
		
		
		 data=new StringBuilder();
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		String line;
		
		while((line=br.readLine())!=null )
		{
			data.append(line);
			if(data.equals("Select Your Slot"))
					{
				data.append('\n');
					}
			else
			{
			pos = data.length();
			if(pos==1)
			{
				if(hours==8 && min==50)
					str ="Class At" + data.toString();
			}
				
			if(pos==2)
			{
				if(hours==9 && min==40)
					str ="Class At" + data.toString();
			}
			
			if(pos==3)
			{
				if(hours==10 && min==50)
					str ="Class At" + data.toString();
			}
			if(pos==4)
			{
				if(hours==11 && min==40)
					str ="Class At" + data.toString();
			}
				
			if(pos==5)
			{
				if(hours==1 && min==20)
					str ="Class At" + data.toString();
			}
			
			if(pos==6)
			{
				if(hours==2 && min==10)
					str ="Class At" + data.toString();
			}
			
			if(pos==7)
			{
				if(hours==3 && min==10)
					str ="Class At" + data.toString();
			}
			
			if(pos==8)
			{
				if(hours==4 && min==00)
					str ="Class At" + data.toString();
			}
			
		}
		}
		br.close();
		}
		}
	
	
	catch(IOException e)
	{
		
		
	}

     
     
     
     
    super.onCreate();
}


@Override
public void onDestroy() {
    // TODO Auto-generated method stub
     if (mTts != null) {
            mTts.stop();
            mTts.shutdown();
        }
        super.onDestroy();
}

@SuppressWarnings("deprecation")
@Override
public void onStart(Intent intent, int startId) {


    sayHello(str);

    Log.v(TAG, "onstart_service");
    super.onStart(intent, startId);
}

@Override
public void onInit(int status) {
    Log.v(TAG, "oninit");
     if (status == TextToSpeech.SUCCESS) {
            int result = mTts.setLanguage(Locale.US);
            if (result == TextToSpeech.LANG_MISSING_DATA ||
                result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.v(TAG, "Language is not available.");
            } else {

                sayHello(str);

            }
        } else {
            Log.v(TAG, "Could not initialize TextToSpeech.");
        }
}
private void sayHello(String str) {
	
	Toast.makeText(getBaseContext(), "Speech Turned On", Toast.LENGTH_SHORT).show();
      mTts.speak(str,
                TextToSpeech.QUEUE_FLUSH, 
                null);
}
}