package com.example.tergel;


import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RemoteViews;
import android.widget.Toast;

public class Notifi extends Activity {
	private static final int NOTIFICATION_FLAG = 1;

	private int shijian=0;

    private MyApp myApp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notifi);
		
	}

	public void notificationMethod(View view) {
		// ��Android����֪ͨ����������Ҫ��ϵͳ������֪ͨ������NotificationManager������һ��ϵͳService��
		final NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		switch (view.getId()) {
		// Ĭ��֪ͨ
		case R.id.tongzhi:
			
			
			EditText mEditText = null; 

			mEditText = (EditText)this.findViewById(R.id.tian); 
			String p=mEditText.getText().toString();
			int a=Integer.valueOf(p);
			mEditText = (EditText)this.findViewById(R.id.xiaoshi); 
			int b=Integer.valueOf(mEditText.getText().toString());
			mEditText = (EditText)this.findViewById(R.id.fenzhong); 
			int c=Integer.valueOf(mEditText.getText().toString());
			mEditText = (EditText)this.findViewById(R.id.miao); 
			int d=Integer.valueOf(mEditText.getText().toString());
			
			int shijian=1000*d+1000*60*c+1000*60*60*b+1000*60*60*24*a;
			//Toast.makeText(myApp, "I will let you study chinese "+a +" day "+ b+" hour "+c+" min "+d+" sec!", Toast.LENGTH_SHORT).show();
			Toast.makeText(getApplicationContext(),  "I will let you study chinese "+a +" day "+ b+" hour "+c+" min "+d+" sec!",Toast.LENGTH_SHORT).show();  

			// ����һ��PendingIntent����Intent���ƣ���ͬ�������ڲ������ϵ��ã���Ҫ������״̬��������activity�����Բ��õ���PendingIntent,�����Notification��ת�������ĸ�Activity
			PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,
					new Intent(this, Notifi.class), 0);
			// ���������Android 2.x�汾�ǵĴ���ʽ
			// Notification notify1 = new Notification(R.drawable.message,
			// "TickerText:" + "�����¶���Ϣ����ע����գ�", System.currentTimeMillis());
			final Notification notify1 = new Notification();
			notify1.icon = R.drawable.popwindow_add_help;
			notify1.tickerText = "TickerText:�����¶���Ϣ����ע����գ�"+System.currentTimeMillis();
			notify1.when =shijian+ System.currentTimeMillis();
			notify1.setLatestEventInfo(this, "Study chinese!",
					"come on~ I am waiting for you!", pendingIntent);
			notify1.number = 1;
			notify1.flags |= Notification.FLAG_AUTO_CANCEL; // FLAG_AUTO_CANCEL������֪ͨ���û����ʱ��֪ͨ���������
			// ͨ��֪ͨ������������֪ͨ�����id��ͬ����ÿclick����statu��������һ����ʾ
			
			
			


			
			
			TimerTask task = new TimerTask(){
			  public void run(){
			  //execute the task
					manager.notify(NOTIFICATION_FLAG, notify1);
			  }
			};
			Timer timer = new Timer();

			timer.schedule(task, shijian);
			break;

		case R.id.btn2:
//			PendingIntent pendingIntent2 = PendingIntent.getActivity(this, 0,
//					new Intent(this, MainActivity.class), 0);
//			// ͨ��Notification.Builder������֪ͨ��ע��API Level
//			// API11֮���֧��
//			Notification notify2 = new Notification.Builder(this)
//					.setSmallIcon(R.drawable.popwindow_add_help) // ����״̬���е�СͼƬ���ߴ�һ�㽨����24��24�����ͼƬͬ��Ҳ��������״̬��������ʾ�������������Ҫ���������ͼƬ������ʹ��setLargeIcon(Bitmap
//														// icon)
//					.setTicker("TickerText:" + "�����¶���Ϣ����ע����գ�")// ������status
//																// bar����ʾ����ʾ����
//					.setContentTitle("Notification Title")// ����������status
//															// bar��Activity���������е�NotififyMessage��TextView����ʾ�ı���
//					.setContentText("This is the notification message")// TextView����ʾ����ϸ����
//					.setContentIntent(pendingIntent2) // ����PendingIntent
//					.setNumber(1) // ��TextView���ҷ���ʾ�����֣��ɷŴ�ͼƬ���������Ҳࡣ���numberͬʱҲ��һ�����кŵ����ң��������������֪ͨ��ͬһID��������ָ����ʾ��һ����
//					.getNotification(); // ��Ҫע��build()����API level
//			// 16��֮�����ӵģ���API11�п���ʹ��getNotificatin()������
//			notify2.flags |= Notification.FLAG_AUTO_CANCEL;
//			manager.notify(NOTIFICATION_FLAG, notify2);
			break;
		// Ĭ��֪ͨ API16��֮�����
		case R.id.btn3:
//			PendingIntent pendingIntent3 = PendingIntent.getActivity(this, 0,
//					new Intent(this, MainActivity.class), 0);
//			// ͨ��Notification.Builder������֪ͨ��ע��API Level
//			// API16֮���֧��
//			Notification notify3 = new Notification.Builder(this)
//					.setSmallIcon(R.drawable.popwindow_add_help)
//					.setTicker("TickerText:" + "�����¶���Ϣ����ע����գ�")
//					.setContentTitle("Notification Title")
//					.setContentText("This is the notification message")
//					.setContentIntent(pendingIntent3).setNumber(1).build(); // ��Ҫע��build()����API
//																			// level16��֮�����ӵģ�API11����ʹ��getNotificatin()�����
//			notify3.flags |= Notification.FLAG_AUTO_CANCEL; // FLAG_AUTO_CANCEL������֪ͨ���û����ʱ��֪ͨ���������
//			manager.notify(NOTIFICATION_FLAG, notify3);// ����4��ͨ��֪ͨ������������֪ͨ�����id��ͬ����ÿclick����status��������һ����ʾ
			break;
		// �Զ���֪ͨ
		case R.id.btn4:
//			// Notification myNotify = new Notification(R.drawable.message,
//			// "�Զ���֪ͨ�������¶���Ϣ�ˣ���ע����գ�", System.currentTimeMillis());
//			Notification myNotify = new Notification();
//			myNotify.icon = R.drawable.popwindow_add_help;
//			myNotify.tickerText = "TickerText:�����¶���Ϣ����ע����գ�";
//			myNotify.when = System.currentTimeMillis();
//			myNotify.flags = Notification.FLAG_NO_CLEAR;// ���ܹ��Զ����
//			RemoteViews rv = new RemoteViews(getPackageName(),
//					R.layout.my_notification);
//			rv.setTextViewText(R.id.text_content, "hello wrold!");
//			myNotify.contentView = rv;
//			Intent intent = new Intent(Intent.ACTION_MAIN);
//			PendingIntent contentIntent = PendingIntent.getActivity(this, 1,
//					intent, 1);
//			myNotify.contentIntent = contentIntent;
//			manager.notify(NOTIFICATION_FLAG, myNotify);
			break;
		case R.id.btn5:
			// ���idΪNOTIFICATION_FLAG��֪ͨ
			manager.cancel(NOTIFICATION_FLAG);
			// ������е�֪ͨ
			// manager.cancelAll();
			break;
		default:
			break;
		}
	}
}
