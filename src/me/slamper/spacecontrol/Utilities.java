package me.slamper.spacecontrol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

import org.json.JSONArray;
import org.json.JSONObject;

import android.os.AsyncTask;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;

public class Utilities {
	 public static String crypt(final String string) throws NoSuchAlgorithmException {
	        final MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        digest.reset();
	        byte[] input = null;
	        try {
	            input = digest.digest(string.getBytes("UTF-8"));
	            final StringBuffer hexString = new StringBuffer();
	            for (final byte element : input) {
	                final String hex = Integer.toHexString(0xFF & element);
	                if (hex.length() == 1)
	                    hexString.append('0');
	                hexString.append(hex);
	            }
	            return hexString.toString();
	        } catch (final UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	        return "UnsupportedEncodingException";
	    }
	    public static String sendMethod(final String method, final String[] arguments,final String salt,final String ip,final String port ){
			 CallMethodTask task = new CallMethodTask();
			 JSONArray argument_json = new JSONArray();
			 for(String argument:arguments){
				 argument_json.put(argument);
			 }
			  task.execute(new String[] { ip,port,method,argument_json.toString(),salt });
			  
			 try {
				return task.get();
			} catch (InterruptedException e) {
				return null;
			} catch (ExecutionException e) {
			return null;
			}
		 }
	


		}

	
