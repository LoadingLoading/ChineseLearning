package com.example.tergel;




import com.example.androidclient.DetailJuzi;
import com.example.speakdemo.SpeakWord;
import com.ql.activity.Alarm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Me extends Activity {
    private RelativeLayout btn4;
    private RelativeLayout btnlisten;
    
    private RelativeLayout btnalarm;
    private RelativeLayout btnnotifi;
    private RelativeLayout setting;
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.me);
		
		btn4=(RelativeLayout) this.findViewById(R.id.re_xiangce);
        

        
		final Intent i3= new Intent (Me.this,SpeakWord.class);
		 i3.putExtra("waimian","我爱都柏林学院!");
		btn4.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){

				startActivity(i3);
			}
		});
		
		
		
		btnlisten=(RelativeLayout) this.findViewById(R.id.re_shoucang);
		btnlisten.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent i2= new Intent (Me.this,DetailJuzi.class);
				
				startActivity(i2);
			}
		});
		
		
		btnalarm=(RelativeLayout) this.findViewById(R.id.re_money_bag);
		btnalarm.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent i2= new Intent (Me.this,Alarm.class);
				startActivity(i2);
			}
		});
		
		
		
		btnnotifi=(RelativeLayout) this.findViewById(R.id.re_card_bag);
		btnnotifi.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent i2= new Intent (Me.this,Notifi.class);
				
				startActivity(i2);
			}
		});
		
		

		
		
		
		
		setting=(RelativeLayout) this.findViewById(R.id.re_setting);
		setting.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent i2= new Intent (Me.this,Setting.class);
				startActivity(i2);
			}
		});
		
		
		
		
		
		
		
		
		
		}
}
