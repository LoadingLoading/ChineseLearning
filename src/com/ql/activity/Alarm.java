package com.ql.activity;

import java.nio.Buffer;
import java.util.Calendar;

import com.example.tergel.MainActivity;
import com.example.tergel.Me;
import com.example.tergel.Notifi;
import com.example.tergel.R;

import android.R.integer;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class Alarm extends Activity {
	public static final String TAG = "Alarm";
	private Calendar calendar ;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm);
        //获取日历实例
        calendar = Calendar.getInstance();
        //获取时间按钮
        final Button timeBtn = (Button)findViewById(R.id.timeBtn);
        //设置时间
        timeBtn.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Log.d(TAG, "click the time button to set time");
				calendar.setTimeInMillis(System.currentTimeMillis());
				new TimePickerDialog(Alarm.this,new TimePickerDialog.OnTimeSetListener() {
					@Override
					public void onTimeSet(TimePicker arg0, int h, int m) {
						//更新按钮上的时间
						timeBtn.setText(formatTime(h,m));
						//设置日历的时间，主要是让日历的年月日和当前同步
						calendar.setTimeInMillis(System.currentTimeMillis());
						//设置日历的小时和分钟
						calendar.set(Calendar.HOUR_OF_DAY, h);
						calendar.set(Calendar.MINUTE, m);
						//将秒和毫秒设置为0
						calendar.set(Calendar.SECOND, 0);
						calendar.set(Calendar.MILLISECOND, 0);
						//建立Intent和PendingIntent来调用闹钟管理器
						Intent intent = new Intent(Alarm.this,AlarmReceiver.class);
						PendingIntent pendingIntent = PendingIntent.getBroadcast(Alarm.this, 0, intent, 0);
						//获取闹钟管理器
						AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
						//设置闹钟
						alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),pendingIntent);
						
						//alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 10 * 1000, pendingIntent);

					        
						
					     long interval = DateUtils.SECOND_IN_MILLIS ;   
						//alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),interval*60*60*24, pendingIntent);
						Toast.makeText(Alarm.this, "Wake me up and I will study chinese at "+String.valueOf(h)+":"+String.valueOf(m), Toast.LENGTH_SHORT).show();
						Log.d(TAG, "set the time to "+formatTime(h,m));
					}
				},calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),true).show();				
			}
        });
        
        //取消闹钟按钮事件监听
        final Button cancelAlarmBtn = (Button)findViewById(R.id.cancelAlarmBtn);
        cancelAlarmBtn.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Alarm.this,AlarmReceiver.class);
				PendingIntent pendingIntent = PendingIntent.getBroadcast(Alarm.this, 0, intent, 0);
				//获取闹钟管理器
				AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
				alarmManager.cancel(pendingIntent);
				Toast.makeText(Alarm.this, "I do not want to study chinese any more!", Toast.LENGTH_SHORT).show();
			}
        });
        
        

        

        
    }
    
    /**
     * 格式化时间为00:00   

     * @param m           
     * @return 
     */
    public String formatTime(int h , int m) {
    	StringBuffer buf = new StringBuffer();
    	if(h<10){
    		buf.append("0"+h);
    	}else {
			buf.append(h);
		}
    	buf.append(" : ");
    	if(m<10){
    		buf.append("0"+m);
    	}else {
    		buf.append(m);
		}
		return buf.toString();
	}
}