package com.xiaos.pinnedheaderexpandable;


import com.xiaos.view.PinnedHeaderExpandableListView;
import com.xiaos.view.PinnedHeaderExpandableListView.HeaderAdapter;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;

import java.util.ArrayList;
import java.util.List;

import com.example.androidclient.DetailCiyu;
import com.example.androidclient.returnpandc;
import com.example.tergel.MainActivity;
import com.example.tergel.MyApp;
import com.example.tergel.R;
import com.xiaos.adapter.PinnedHeaderExpandableAdapter;
import com.xiaos.view.PinnedHeaderExpandableListView;

public class Groups extends Activity implements OnItemClickListener {
	private PinnedHeaderExpandableListView explistview;
	private String[][] childrenData = new String[10][10];
	//private String[] groupData = new String[7];
	private int expandFlag = -1;//控制列表的展开  
	private PinnedHeaderExpandableAdapter adapter;
	//private List<child> fruitList=new  ArrayList<Fruit>();
	  private MyApp myApp;  
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.groups);
		//Toast.makeText(Groups.this, "sss", Toast.LENGTH_SHORT).show();
		

 myApp = (MyApp)getApplication();  
 




		//判断是词语还是橘子
		Intent intent= getIntent();
	  	final String wors = intent.getStringExtra("wors");//1 表示词语，2 表示句子
	  	int judge=Integer.valueOf(wors).intValue();
	  	String[] groupData = null;
	  	int change3=judge;
	  	change3=change3-1;
	  	change3=change3*3;//judge 0表示词语，非0表示句子
	  	if(change3==0){
	  	String[] p = new String[7];
	  	groupData=p;
	  	}
	  	else{
	  		String[] p = new String[4];
	  		groupData=p;
	  	}
	  	/**
		 * 初始化VIEW
		 */
		explistview = (PinnedHeaderExpandableListView)findViewById(R.id.explistview);
		
		 if((myApp.getName()).equals("1")){
			
				/**
				 * 初始化数据
				 */
				for(int i=0;i<7-change3;i++){
					int iadd=i+1;
					groupData[i] = ""+iadd;
					String t=i+"";
					groupData[i]=groupData[i]+returnpandc.tou(t,judge);
					

				}
				
				for(int i=0;i<7-change3;i++){
					for(int j=0;j<10;j++){
						int iadd=i+1;
						int jadd=j+1;
						childrenData[i][j] ="";
						
						int p=i*10+j;
						String t=p+"";
						String a =returnpandc.ciyu(t,2,judge);
						String b =returnpandc.ciyu(t,1,judge);
						String c =returnpandc.ciyu(t,3,judge);
						childrenData[i][j]=childrenData[i][j]+a+"("+b+")"+"    "+c;

					}
				}
		 }
		 if((myApp.getName()).equals("2")){
			
				/**
				 * 初始化数据
				 */
				for(int i=0;i<7-change3;i++){
					int iadd=i+1;
					groupData[i] = ""+iadd;
					String t=i+"";
					groupData[i]=groupData[i]+returnpandc.tou(t,judge);
					

				}
				
				for(int i=0;i<7-change3;i++){
					Toast.makeText(myApp,"chinese second", Toast.LENGTH_SHORT).show();
					for(int j=0;j<10;j++){
						int iadd=i+1;
						int jadd=j+1;
						childrenData[i][j] ="";
						
						int p=i*10+j;
						String t=p+"";
						String a =returnpandc.ciyu(t,3,judge);
						String b =returnpandc.ciyu(t,1,judge);
						String c =returnpandc.ciyu(t,2,judge);
						childrenData[i][j]=childrenData[i][j]+a+"("+b+")"+"     "+c;

					}
				}
		 }
		 if((myApp.getName()).equals("3")){
				/**
				 * 初始化数据
				 */
				for(int i=0;i<7-change3;i++){
					int iadd=i+1;
					groupData[i] = ""+iadd;
					String t=i+"";
					groupData[i]=groupData[i]+returnpandc.tou(t,judge);
					

				}
				
				for(int i=0;i<7-change3;i++){
					for(int j=0;j<10;j++){
						int iadd=i+1;
						int jadd=j+1;
						childrenData[i][j] ="";
						
						int p=i*10+j;
						String t=p+"";
						String a =returnpandc.ciyu(t,3,judge);
						String b =returnpandc.ciyu(t,2,judge);
						String c =returnpandc.ciyu(t,1,judge);
						childrenData[i][j]=childrenData[i][j]+a+"      "+b+"("+c+")";

					}
				}
		 }
		
		
		

		//设置悬浮头部VIEW
		explistview.setHeaderView(getLayoutInflater().inflate(R.layout.group_head,
				explistview, false));
		adapter = new PinnedHeaderExpandableAdapter(childrenData, groupData, getApplicationContext(),explistview);
		explistview.setAdapter(adapter);
		
		explistview.setOnChildClickListener(new OnChildClickListener() {
			

			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				Intent intent = new Intent(Groups.this, DetailCiyu.class);
				int p=childPosition+groupPosition*10;
				String d=p+"";
				intent.putExtra("extra_datas",d);
				intent.putExtra("wors",wors);
				//intent.setData(Uri.parse(adapter.getList().get(groupPosition).get(childPosition).url));
				startActivity(intent);
				return true;
			}
		});
		
		



	}
	
   public void onItemClick(AdapterView<?> parent, View view, int position,
           long id) {
    Toast.makeText(this, "短按显示", 0).show();
   }


	


	
	class GroupClickListener implements OnGroupClickListener{
		@Override
		public boolean onGroupClick(ExpandableListView parent, View v,
				int groupPosition, long id) {
			Intent i2= new Intent (Groups.this,MainActivity.class);
			startActivity(i2);
			
			Toast.makeText(Groups.this, "sddss", Toast.LENGTH_SHORT).show();
			
			if (expandFlag == -1) {
				// 展开被选的group
				explistview.expandGroup(groupPosition);
				// 设置被选中的group置于顶端
				explistview.setSelectedGroup(groupPosition);
				Toast.makeText(Groups.this, "zhankai", Toast.LENGTH_SHORT).show();
				expandFlag = groupPosition;
			} else if (expandFlag ==                                                                                                                                                                 groupPosition) {
				explistview.collapseGroup(expandFlag);
				expandFlag = -1;
			} else {
				explistview.collapseGroup(expandFlag);
				// 展开被选的group
				explistview.expandGroup(groupPosition);
				// 设置被选中的group置于顶端
				explistview.setSelectedGroup(groupPosition);
				expandFlag = groupPosition;
			}
			return true;
		}
	}
}
