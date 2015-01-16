package com.example.facutlyreminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Display extends Activity
{
	TextView text;
	
    ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		
		//text=(TextView)findViewById(R.id.disp);
		setContentView(R.layout.activity_display);
		super.onCreate(savedInstanceState);
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
	    		  Toast.makeText(Display.this, listname, Toast.LENGTH_SHORT).show();
	    		  
	                // Launching new Activity on selecting single List Item
	    		  
	                Intent i1 = new Intent(Display.this,DisplayMain.class);
	                i1.putExtra("listname",listname);
	                // sending data to new activity
	               
	                startActivity(i1);
	               
	            }
	          });
	      }
}
	    

	

		
	/*		
        File sdCard = Environment.getExternalStorageDirectory();
	
		File file=new File(sdCard,"faculty.txt");
		
		
		StringBuilder data=new StringBuilder();
		
		try
		{
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line;
			
			while((line=br.readLine())!=null )
			{
				data.append(line);
				data.append('\n');
			}
			br.close();
		}
		
		catch(IOException e)
		{
			
			
		}
	TextView text=(TextView)findViewById(R.id.disp);
		text.setText(data);
		
	}
	*/




		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*try
		{
		 File myFile = new File("/sdcard/mysdfile.txt");
         FileInputStream fIn = new FileInputStream(myFile);
         BufferedReader myReader = new BufferedReader(
                 new InputStreamReader(fIn));
         String aDataRow = "";
         String aBuffer = "";
         while ((aDataRow = myReader.readLine()) != null) {
             aBuffer += aDataRow + "\n";
         }
     
		ed.setText(aBuffer + "dsaa");
         myReader.close();
         Toast.makeText(getBaseContext(),
                 "Done reading SD 'mysdfile.txt'",
                 Toast.LENGTH_SHORT).show();
     } catch (Exception e) {
         Toast.makeText(getBaseContext(), e.getMessage(),
                 Toast.LENGTH_SHORT).show();
     }
		
		*
		*
		*
		*
		*
		*/
	/*path=new File(getFilesDir ( ) +* "/" + FILENAME);
			
	
		
		
	
				
	
	
		path=new File(getFilesDir ( ) + "/" + FILENAME);
			
	
		
		
		String name = new File(path.toString()).getName();
		file_path=name;
		
		Toast.makeText(getBaseContext(),path.toString(), Toast.LENGTH_LONG).show();
	}
 */
		/*try {
		    FileInputStream fis = openFileInput(file_path);
		    byte[] dataArray = new byte[fis.available()];
		    while (fis.read(dataArray) != -1) {
		     read_data = new String(dataArray);
		   
		    }
		    fis.close();

		    text.setText(read_data);

		   } 
		catch (FileNotFoundException e)
		{

		    e.printStackTrace();
		   } catch (IOException e) {

		    e.printStackTrace();
		   }

		
	}
	}
	
		
		
		
	
		*/
		/*try {
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
		
		/*try {
			text.setText(readTxt());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	
	
		
		
/*	 private String readTxt() throws FileNotFoundException{

		 file= new File(getFilesDir ( ) + "/" + "faculty_reminder");
	     FileInputStream inputStream =new FileInputStream(file);
	     
	     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	     
	     int i;
	  try {
	   i = inputStream.read();
	   while (i != -1)
	      {
	       byteArrayOutputStream.write(i);
	       i = inputStream.read();
	      }
	      inputStream.close();
	  } catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  
	     return byteArrayOutputStream.toString();
	    }

	//loc=context.getFilesDir ( ) + "/" + file;
		
	     /* try{
	         FileInputStream fin = openFileInput(file);
	         int c;
	         String temp="";
	         while( (c = fin.read()) != -1)
	         {
	            temp = temp + Character.toString((char)c);
	         }
	         text.setText(temp);
	         Toast.makeText(getBaseContext(),"file read",
	         Toast.LENGTH_SHORT).show();

	      }
	      catch(Exception e){

	
	   }*/
		  		   
		



