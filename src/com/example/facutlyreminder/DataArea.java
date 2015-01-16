package com.example.facutlyreminder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
 
public class DataArea extends Activity
{
	Spinner Hour1,Hour2,Hour3,Hour4,Hour5,Hour6,Hour7,Hour8;
	Button button;
	String data[]=new String[8];
	TextView text;
	String read_data;
	
    FileOutputStream fOut;
	String separator = System.getProperty("line.separator");
	public String location="";
	
	
	
	
	public boolean isSDCardWritable()
	{
		String status=Environment.getExternalStorageState();
		if(Environment.MEDIA_MOUNTED.equals(status))
		{
			return true;
		}
		return false;
	}
 
	public boolean isSDCardReadable()
	{
		String status=Environment.getExternalStorageState();
		if(Environment.MEDIA_MOUNTED.equals(status) || Environment.MEDIA_MOUNTED_READ_ONLY.equals(status))
		{
			return true;
		}
		return false;
	}
 
		
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_area);
        
        
       Intent i1=getIntent();
      location = i1.getStringExtra("listname");
        
       
        
		addListenerOnButton();
		
		text=(TextView)findViewById(R.id.tvv);
		addListenerOnSpinnerItemSelection();
       
		
	   
    }
 
   
    public void addListenerOnSpinnerItemSelection()
    {
    	
    	
		Hour1 = (Spinner) findViewById(R.id.Hour1);
		Hour1.setOnItemSelectedListener(new MyOnItemSelectedListener());


		
		Hour2 = (Spinner) findViewById(R.id.Hour2);
		Hour2.setOnItemSelectedListener(new MyOnItemSelectedListener());
		
		Hour3 = (Spinner) findViewById(R.id.Hour3);
		Hour3.setOnItemSelectedListener(new MyOnItemSelectedListener());
		
		Hour4 = (Spinner) findViewById(R.id.Hour4);
		Hour4.setOnItemSelectedListener(new MyOnItemSelectedListener());
		
		Hour5 = (Spinner) findViewById(R.id.Hour5);
		Hour5.setOnItemSelectedListener(new MyOnItemSelectedListener());
		
		Hour6 = (Spinner) findViewById(R.id.Hour6);
		Hour6.setOnItemSelectedListener(new MyOnItemSelectedListener());
	
		Hour7 = (Spinner) findViewById(R.id.Hour7);
		Hour7.setOnItemSelectedListener(new MyOnItemSelectedListener());
		
		Hour8 = (Spinner) findViewById(R.id.Hour8);
		Hour8.setOnItemSelectedListener(new MyOnItemSelectedListener());
		
		
	  }
    
    
    @SuppressLint("WorldReadableFiles")
	public void addListenerOnButton() {

	Hour1=(Spinner) findViewById(R.id.Hour1);
	Hour2=(Spinner) findViewById(R.id.Hour2);
	Hour3=(Spinner) findViewById(R.id.Hour3);
	Hour4=(Spinner) findViewById(R.id.Hour4);
	Hour5=(Spinner) findViewById(R.id.Hour5);
	Hour6=(Spinner) findViewById(R.id.Hour6);
	Hour7=(Spinner) findViewById(R.id.Hour7);
	Hour8=(Spinner) findViewById(R.id.Hour8);
	
	  
	 
		button = (Button) findViewById(R.id.button1);
		
	
		
		button.setOnClickListener(new OnClickListener()
		{

	
		
		  public void onClick(View v)
		  {
				data[0]=Hour1.getSelectedItem().toString();
				data[1]=Hour2.getSelectedItem().toString();
				data[2]=Hour3.getSelectedItem().toString();
				data[3]=Hour4.getSelectedItem().toString();
				data[4]=Hour5.getSelectedItem().toString();
				data[5]=Hour6.getSelectedItem().toString();
				data[6]=Hour7.getSelectedItem().toString();
				data[7]=Hour8.getSelectedItem().toString();
				
				
			//	File sdCard=Environment.getExternalStorageDirectory();
			
			//directory.mkdirs();
				
				//File file=new File(directory,"monday.txt");
				
				//File file=new File("monday.txt");
			//	int i=0;
				
			/*	try {
					FileOutputStream fos=new FileOutputStream(file);
					OutputStreamWriter osw=new OutputStreamWriter(fos);
					
					
					osw.write(data[0]);
					osw.flush();
					osw.close();
					
				}
					
				 catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				*/
				
				
				
				
				
			 try {
				 
			if(location.equals("MONDAY"))
			{
			
					File myFile = new File("/sdcard/monday.txt");	
					
				  		 
					
			
			            myFile.createNewFile();
			            FileOutputStream fOut = new FileOutputStream(myFile);
			            OutputStreamWriter myOutWriter = 
			                                    new OutputStreamWriter(fOut);
					
			            int i=0;
			            while(i!=8)
			            {
			            
			            	if((i+1)== 1)
			            	{
			            myOutWriter.append(data[i] + "     		-   " + (i+1) + "st Hour"+ '\n');
			            i++;
			            	}
			            	
			            	else if((i+1)== 2)
			            	{
			            myOutWriter.append(data[i] + "     		-   " + (i+1) + "nd Hour"+ '\n');
			            i++;
			            	}
			            	else if((i+1)== 3)
			            	{
			            myOutWriter.append(data[i] + "     		-   " + (i+1) + "rd Hour"+ '\n');
			            i++;
			            	}
			            	
			            	else
			            	{
			            myOutWriter.append(data[i] + "     		-   " + (i+1) + "th Hour"+ '\n');
			            i++;
			            	}
			            }
			            
			            
			            myOutWriter.close();
			            fOut.close();
			
			}
			 
			if(location.equals("TUESDAY"))
					{
					File myFile = new File("/sdcard/tuesday.txt");	
					
				  		 
					
			
			            myFile.createNewFile();
			            FileOutputStream fOut = new FileOutputStream(myFile);
			            OutputStreamWriter myOutWriter = 
			                                    new OutputStreamWriter(fOut);
					
			            int i=0;
			            while(i!=8)
			            {
			            
			            	if((i+1)== 1)
			            	{
			            myOutWriter.append(data[i] + "     		-   " + (i+1) + "st Hour"+ '\n');
			            i++;
			            	}
			            	
			            	else if((i+1)== 2)
			            	{
			            myOutWriter.append(data[i] + "     		-   " + (i+1) + "nd Hour"+ '\n');
			            i++;
			            	}
			            	else if((i+1)== 3)
			            	{
			            myOutWriter.append(data[i] + "     		-   " + (i+1) + "rd Hour"+ '\n');
			            i++;
			            	}
			            	
			            	else
			            	{
			            myOutWriter.append(data[i] + "     		-   " + (i+1) + "th Hour"+ '\n');
			            i++;
			            	}
			            }
			            
			            
			            myOutWriter.close();
			            fOut.close();
			          }
			      
			 
			if(location.equals("WEDNESDAY"))
			{
			File myFile = new File("/sdcard/wednesday.txt");	
			
		  		 
			
	
	            myFile.createNewFile();
	            FileOutputStream fOut = new FileOutputStream(myFile);
	            OutputStreamWriter myOutWriter = 
	                                    new OutputStreamWriter(fOut);
			
	            int i=0;
	            while(i!=8)
	            {
	            
	            	if((i+1)== 1)
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "st Hour"+ '\n');
	            i++;
	            	}
	            	
	            	else if((i+1)== 2)
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "nd Hour"+ '\n');
	            i++;
	            	}
	            	else if((i+1)== 3)
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "rd Hour"+ '\n');
	            i++;
	            	}
	            	
	            	else
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "th Hour"+ '\n');
	            i++;
	            	}
	            }
	            
	            
	            myOutWriter.close();
	            fOut.close();
	          }
	      
			if(location.equals("THURSDAY"))
			{
			File myFile = new File("/sdcard/thursday.txt");	
			
		  		 
			
	
	            myFile.createNewFile();
	            FileOutputStream fOut = new FileOutputStream(myFile);
	            OutputStreamWriter myOutWriter = 
	                                    new OutputStreamWriter(fOut);
			
	            int i=0;
	            while(i!=8)
	            {
	            
	            	if((i+1)== 1)
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "st Hour"+ '\n');
	            i++;
	            	}
	            	
	            	else if((i+1)== 2)
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "nd Hour"+ '\n');
	            i++;
	            	}
	            	else if((i+1)== 3)
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "rd Hour"+ '\n');
	            i++;
	            	}
	            	
	            	else
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "th Hour"+ '\n');
	            i++;
	            	}
	            }
	            
	            
	            myOutWriter.close();
	            fOut.close();
	          }
	      
				 
				 
			if(location.equals("FRIDAY"))
			{
			File myFile = new File("/sdcard/friday.txt");	
			
		  		 
			
	
	            myFile.createNewFile();
	            FileOutputStream fOut = new FileOutputStream(myFile);
	            OutputStreamWriter myOutWriter = 
	                                    new OutputStreamWriter(fOut);
			
	            int i=0;
	            while(i!=8)
	            {
	            
	            	if((i+1)== 1)
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "st Hour"+ '\n');
	            i++;
	            	}
	            	
	            	else if((i+1)== 2)
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "nd Hour"+ '\n');
	            i++;
	            	}
	            	else if((i+1)== 3)
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "rd Hour"+ '\n');
	            i++;
	            	}
	            	
	            	else
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "th Hour"+ '\n');
	            i++;
	            	}
	            }
	            
	            
	            myOutWriter.close();
	            fOut.close();
	          }
	      
				 
			if(location.equals("SATURDAY"))
			{
			File myFile = new File("/sdcard/saturday.txt");	
			
		  		 
			
	
	            myFile.createNewFile();
	            FileOutputStream fOut = new FileOutputStream(myFile);
	            OutputStreamWriter myOutWriter = 
	                                    new OutputStreamWriter(fOut);
			
	            int i=0;
	            while(i!=8)
	            {
	            
	            	if((i+1)== 1)
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "st Hour"+ '\n');
	            i++;
	            	}
	            	
	            	else if((i+1)== 2)
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "nd Hour"+ '\n');
	            i++;
	            	}
	            	else if((i+1)== 3)
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "rd Hour"+ '\n');
	            i++;
	            	}
	            	
	            	else
	            	{
	            myOutWriter.append(data[i] + "     		-   " + (i+1) + "th Hour"+ '\n');
	            i++;
	            	}
	            }
	            
	            
	            myOutWriter.close();
	            fOut.close();
	          }
		 
			 } catch (Exception e) {
			            Toast.makeText(getBaseContext(), e.getMessage(),
			                    Toast.LENGTH_SHORT).show();
			        }
			    
				

			
			
			/*----------------------------------------------------------------------*/
			Toast.makeText(DataArea.this,"Saved Successfully", Toast.LENGTH_SHORT).show();
			Intent go=new Intent(DataArea.this,MainLog.class);
			startActivity(go);
		  }
			
		  
		  
		});
	  }
    
      }



/*	path=new File(getFilesDir ( ) + "/" + FILENAME);

if(path.exists())
{
path.delete();
for(int i=0;i<8;i++)
{
try {
  
  fOut = openFileOutput(FILENAME,Context.MODE_WORLD_READABLE);	         
     fOut.write(data[i].getBytes());
     fOut.write(separator.getBytes());
     fOut.close();
  }
catch (Exception e) {

  
     e.printStackTrace();
  }  
}

}

/*--------------------------------------Dispaly__________________*/	 				

/*	try {
FileInputStream fis = openFileInput(FILENAME);
byte[] dataArray = new byte[fis.available()];
while (fis.read(dataArray) != -1) {
 read_data = new String(dataArray);
}
fis.close();

text.setText(read_data);

} catch (FileNotFoundException e) {

e.printStackTrace();
} catch (IOException e) {

e.printStackTrace();
}



*/