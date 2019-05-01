package com.example.tergel;





import android.app.Activity;
import android.app.Fragment;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidclient.DetailPinyin;

import com.xiaos.adapter.*;
import com.xiaos.pinnedheaderexpandable.*;
import com.xiaos.view.*;


public class MainActivity extends Activity  {


    private RelativeLayout btn1;
    private RelativeLayout btn2;
    private RelativeLayout btn3;
    private RelativeLayout btn4;
    public static int shunxu=2;
    private MyApp myApp; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
     myApp = (MyApp)getApplication();  
      myApp.setName("1");  
        
        btn1=(RelativeLayout) this.findViewById(R.id.re_weixin);
        btn2=(RelativeLayout) this.findViewById(R.id.re_contact_list);
        btn3=(RelativeLayout) this.findViewById(R.id.re_find);
        btn4=(RelativeLayout) this.findViewById(R.id.re_profile);
        

        
      
		btn1.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent i2= new Intent (MainActivity.this,Pinyin.class);
				
				startActivity(i2);
			}
		});
		btn2.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				
				Intent i2= new Intent (MainActivity.this,Groups.class);
				i2.putExtra("wors","1");
				startActivity(i2);
			}
		});
		btn3.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent i2= new Intent (MainActivity.this,Groups.class);
				i2.putExtra("wors","2");
				startActivity(i2);
			}
		});
		btn4.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent i2= new Intent (MainActivity.this,Me.class);
				
				startActivity(i2);
			}
		});
    }
 }