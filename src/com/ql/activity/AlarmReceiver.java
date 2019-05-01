/**
 * 
 */
package com.ql.activity;

import com.example.tergel.Notifi;
import com.example.tergel.R;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.RemoteViews;
/**
 * @author lql
 *
 */
public class AlarmReceiver extends BroadcastReceiver {
	private static final int NOTIFICATION_FLAG = 1;
	/* (non-Javadoc)
	 * @see android.content.BroadcastReceiver#onReceive(android.content.Context, android.content.Intent)
	 */
	@Override
	public void onReceive(Context arg0, Intent data) {
		Log.d(Alarm.TAG, "the time is up,start the alarm...");
		
		

		

		
		
		
		
		
		
		
		
		Toast.makeText(arg0, "It is time to study Chinese!", Toast.LENGTH_SHORT).show();
	}
	
	
	
	
	
	
	

	
}
