package com.pstreets.demo;

//--------------------------------- IMPORTS ------------------------------------
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class BootupReceiver extends BroadcastReceiver{

	/* (non-Javadoc)
	 * @see android.content.BroadcastReceiver
	 * #onReceive(android.content.Context, android.content.Intent)
	 */
	@Override
	public void onReceive(Context context, Intent intent) {
		Log.i("bootupreceiver","接收到广播"+intent.toString());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {  e.printStackTrace(); }

		Intent i = new Intent(context, BootupDemoActivity.class);                  
		i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);                
		context.startActivity(i); 
		
	}

}
