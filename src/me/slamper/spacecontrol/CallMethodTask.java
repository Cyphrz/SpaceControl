package me.slamper.spacecontrol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.URL;
import java.net.URLConnection;
import java.security.NoSuchAlgorithmException;

import android.os.AsyncTask;

public class CallMethodTask extends AsyncTask<String,Void,String>{
public CallMethodTask(){
	
}
   	@Override
   	protected String doInBackground(String... params) {
   	    try {
   	        final URL url = new URL("http://"+params[0]+":"+params[1]+"/call?method=" + params[2]
   	               + "&args=" + params[3] + "&key=" + Utilities.crypt(params[2]+params[4]));
   	     //final URL url = new URL("http://192.168.2.23:2011/call?method=getServer&args=[]&key=f93e8fd0b71d6ba9be1c632303ca50bebdd963668f6c0696584c4f55a1e1d8f7");
   	        final URLConnection connection = url.openConnection();
   	        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
   	        final StringBuffer stringBuffer = new StringBuffer();
   	        String line;
   	        while ((line = bufferedReader.readLine()) != null)
   	            stringBuffer.append(line);
   	        bufferedReader.close();
   	        return stringBuffer.toString();
   	    } catch (final ConnectException e) {
   	      
   	    return null;
   	} catch (IOException e) {
   			e.printStackTrace();
   			return null;
   		} catch (NoSuchAlgorithmException e) {
   		e.printStackTrace();
   	return null;
   	}

   	}
   	@Override
   	protected void onPostExecute(String result) {
   	}
   	}
