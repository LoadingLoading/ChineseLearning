package com.example.tergel;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.androidclient.DetailPinyin;
import com.example.tergel.R;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class Pinyin extends Activity {//implements OnClickListener  {
	
	 private Button btn4;
	 
	    private Button mP011;
	    private Button mP012;
	    private Button mP014;
	    private Button mP015;
	    private Button mP021;
	    private Button mP022;
	    private Button mP024;
	    private Button mP025;
	    private Button mP031;
	    private Button mP032;
	    private Button mP033;
	    private Button mP034;
	    private Button mP035;
	    private Button mP041;
	    private Button mP042;
	    private Button mP045;
	    private Button mP051;
	    private Button mP053;
	    private Button mP054;
	    private Button mP055;
	    private Button mP061;
	    private Button mP063;
	    private Button mP064;
	    private Button mP065;
	    private Button mP071;
	    private Button mP073;
	    private Button mP074;
	    private Button mP075;
	    private Button mP076;
	    private Button mP081;

	    private Button mP083;
	    private Button mP084;
	    private Button mP085;
	    private Button mP086;
	    private Button mP091;
	    private Button mP093;
	    private Button mP095;
	    private Button mP101;
	    private Button mP103;
	    private Button mP105;
	    private Button mP111;
	    private Button mP113;
	    private Button mP115;
	    private Button mP124;
	    private Button mP126;
	    private Button mP134;
	    private Button mP136;
	    private Button mP144;
	    private Button mP146;
	    private Button mP151;
	    private Button mP153;
	    private Button mP154;
	    private Button mP155;
	    private Button mP161;
	    private Button mP163;
	    private Button mP164;
	    private Button mP165;
	    private Button mP171;
	    private Button mP173;
	    private Button mP174;
	    private Button mP175;
	    private Button mP181;
	    private Button mP183;
	    private Button mP184;
	    private Button mP185;
	    private Button mP191;
	    private Button mP193;
	    private Button mP194;
	    private Button mP195;
	    private Button mP201;
	    private Button mP203;
	    private Button mP204;
	    private Button mP205;
	    private Button mP211;
	    private Button mP213;
	    private Button mP214;
	    private Button mP215;
	    private Button mP221;
	    private Button mP222;
	    private Button mP223;
	    private Button mP224;
	    private Button mP226;
	    private Button mP231;
	    private Button mP232;
	    private Button mP235;
	 
	    private GridView gview;
	    private List<Map<String, Object>> data_list;
	    private SimpleAdapter sim_adapter;
	    // 图片封装为一个数组


	 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pinyin);
		
        List<Button> list = new ArrayList<Button>();
        list=initlist();


        
      //判定是哪个键，并且判定是新建还是查看，并打开相应界面
      for(int i=0; i<list.size(); i++){
          final Button btn1 = list.get(i);  
          String change=null;
          change = btn1.getText().toString();
          //final String number=String.valueOf(i);
          
 

          final String judge=change;

          btn1.setOnClickListener(new View.OnClickListener(){
  			public void onClick(View v){
  				Intent add;
  				
//  				if(judge==null){
  					add = new Intent (Pinyin.this,DetailPinyin.class);
//  				}else{
//  					//add = new Intent (Pinyin.this,Pinyin.class);
//  				}
  				add.putExtra("extra_data",judge);
  				startActivity(add);
  			}
  		});    
      

	}
			
			
			
			
			
		}




	public  List<Button> initlist(){
		List<Button> list = new ArrayList<Button>();
	    // Content View Elements



	    // End Of Content View Elements

	   

	        mP011 = (Button) findViewById(R.id.p011);
	        list.add(mP011);
	        mP012 = (Button) findViewById(R.id.p012);
	        list.add(mP012);
	        mP014 = (Button) findViewById(R.id.p014);
	         list.add(mP014);mP015 = (Button) findViewById(R.id.p015);
	         list.add(mP015);mP021 = (Button) findViewById(R.id.p021);
	         list.add(mP021);mP022 = (Button) findViewById(R.id.p022);
	         list.add(mP022);mP024 = (Button) findViewById(R.id.p024);
	         list.add(mP024);mP025 = (Button) findViewById(R.id.p025);
	         list.add(mP025);mP031 = (Button) findViewById(R.id.p031);
	         list.add(mP031);mP032 = (Button) findViewById(R.id.p032);
	         list.add(mP032);mP033 = (Button) findViewById(R.id.p033);
	         list.add(mP033);mP034 = (Button) findViewById(R.id.p034);
	         list.add(mP034);mP035 = (Button) findViewById(R.id.p035);
	         list.add(mP035);mP041 = (Button) findViewById(R.id.p041);
	         list.add(mP041);mP042 = (Button) findViewById(R.id.p042);
	         list.add(mP042);mP045 = (Button) findViewById(R.id.p045);
	         list.add(mP045);mP051 = (Button) findViewById(R.id.p051);
	         list.add(mP051);mP053 = (Button) findViewById(R.id.p053);
	         list.add(mP053);mP054 = (Button) findViewById(R.id.p054);
	         list.add(mP054);mP055 = (Button) findViewById(R.id.p055);
	         list.add(mP055);mP061 = (Button) findViewById(R.id.p061);
	         list.add(mP061);mP063 = (Button) findViewById(R.id.p063);
	         list.add(mP063);mP064 = (Button) findViewById(R.id.p064);
	         list.add(mP064);mP065 = (Button) findViewById(R.id.p065);
	         list.add(mP065);mP071 = (Button) findViewById(R.id.p071);
	         list.add(mP071);mP073 = (Button) findViewById(R.id.p073);
	         list.add(mP073);mP074 = (Button) findViewById(R.id.p074);
	         list.add(mP074);mP075 = (Button) findViewById(R.id.p075);
	         list.add(mP075);mP076 = (Button) findViewById(R.id.p076);
	         list.add(mP076);mP081 = (Button) findViewById(R.id.p081);
	         list.add(mP081);mP083 = (Button) findViewById(R.id.p083);
	         list.add(mP083);mP084 = (Button) findViewById(R.id.p084);
	         list.add(mP084);mP085 = (Button) findViewById(R.id.p085);
	         list.add(mP085);mP086 = (Button) findViewById(R.id.p086);
	         list.add(mP086);mP091 = (Button) findViewById(R.id.p091);
	         list.add(mP091);mP093 = (Button) findViewById(R.id.p093);
	         list.add(mP093);mP095 = (Button) findViewById(R.id.p095);
	         list.add(mP095);mP101 = (Button) findViewById(R.id.p101);
	         list.add(mP101);mP103 = (Button) findViewById(R.id.p103);
	         list.add(mP103);mP105 = (Button) findViewById(R.id.p105);
	         list.add(mP105);mP111 = (Button) findViewById(R.id.p111);
	         list.add(mP111);mP113 = (Button) findViewById(R.id.p113);
	         list.add(mP113);mP115 = (Button) findViewById(R.id.p115);
	         list.add(mP115);mP124 = (Button) findViewById(R.id.p124);
	         list.add(mP124);mP126 = (Button) findViewById(R.id.p126);
	         list.add(mP126);mP134 = (Button) findViewById(R.id.p134);
	         list.add(mP134);mP136 = (Button) findViewById(R.id.p136);
	         list.add(mP136);mP144 = (Button) findViewById(R.id.p144);
	         list.add(mP144);mP146 = (Button) findViewById(R.id.p146);
	         list.add(mP146);mP151 = (Button) findViewById(R.id.p151);
	         list.add(mP151);mP153 = (Button) findViewById(R.id.p153);
	         list.add(mP153);mP154 = (Button) findViewById(R.id.p154);
	         list.add(mP154);mP155 = (Button) findViewById(R.id.p155);
	         list.add(mP155);mP161 = (Button) findViewById(R.id.p161);
	         list.add(mP161);mP163 = (Button) findViewById(R.id.p163);
	         list.add(mP163);mP164 = (Button) findViewById(R.id.p164);
	         list.add(mP164);mP165 = (Button) findViewById(R.id.p165);
	         list.add(mP165);mP171 = (Button) findViewById(R.id.p171);
	         list.add(mP171);mP173 = (Button) findViewById(R.id.p173);
	         list.add(mP173);mP174 = (Button) findViewById(R.id.p174);
	         list.add(mP174);mP175 = (Button) findViewById(R.id.p175);
	         list.add(mP175);mP181 = (Button) findViewById(R.id.p181);
	         list.add(mP181);mP183 = (Button) findViewById(R.id.p183);
	         list.add(mP183);mP184 = (Button) findViewById(R.id.p184);
	         list.add(mP184);mP185 = (Button) findViewById(R.id.p185);
	         list.add(mP185);mP191 = (Button) findViewById(R.id.p191);
	         list.add(mP191);mP193 = (Button) findViewById(R.id.p193);
	         list.add(mP193);mP194 = (Button) findViewById(R.id.p194);
	         list.add(mP194);mP195 = (Button) findViewById(R.id.p195);
	         list.add(mP195);mP201 = (Button) findViewById(R.id.p201);
	         list.add(mP201);mP203 = (Button) findViewById(R.id.p203);
	         list.add(mP203);mP204 = (Button) findViewById(R.id.p204);
	         list.add(mP204);mP205 = (Button) findViewById(R.id.p205);
	         list.add(mP205);mP211 = (Button) findViewById(R.id.p211);
	         list.add(mP211);mP213 = (Button) findViewById(R.id.p213);
	         list.add(mP213);mP214 = (Button) findViewById(R.id.p214);
	         list.add(mP214);mP215 = (Button) findViewById(R.id.p215);
	         list.add(mP215);mP221 = (Button) findViewById(R.id.p221);
	         list.add(mP221);mP222 = (Button) findViewById(R.id.p222);
	         list.add(mP222);mP223 = (Button) findViewById(R.id.p223);
	         list.add(mP223);mP224 = (Button) findViewById(R.id.p224);
	         list.add(mP224);mP226 = (Button) findViewById(R.id.p226);
	         list.add(mP226);mP231 = (Button) findViewById(R.id.p231);
	         list.add(mP231);mP232 = (Button) findViewById(R.id.p232);
	         list.add(mP232);mP235 = (Button) findViewById(R.id.p235);
	         list.add(mP235);


        

		return list;
		
	}
	
	
	
    

}
