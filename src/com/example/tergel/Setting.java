package com.example.tergel;




import com.example.androidclient.DetailJuzi;
import com.example.speakdemo.SpeakWord;
import com.ql.activity.Alarm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Setting extends Activity {
    private Button btn4;
    private RadioGroup mSex_group; 
    private RadioButton zhong; 
    private RadioButton pinyin;
    private RadioButton yinwen;

    private MyApp myApp; 
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setting);
		
		btn4=(Button) this.findViewById(R.id.accept);


        myApp = (MyApp)getApplication();  


		
		btn4.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				RadioGroup radioGroup = (RadioGroup)findViewById(R.id.zaiqian);
				RadioButton radioButton = (RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());
				final String text = radioButton.getText().toString();
				if(text.equals("ÄãºÃ! (ni2/(3) hao3)  Hello!")){
				      myApp.setName("1"); 
				}
				if(text.equals("Hello! (ni2/(3) hao3)   ÄãºÃ!")){
				      myApp.setName("2"); 
				}
				
				if(text.equals("Hello!   ÄãºÃ!(ni2/(3) hao3)")){
				      myApp.setName("3"); 
				}
				
				Toast.makeText(myApp, "Setting Success!", Toast.LENGTH_SHORT).show();
				
			}
		});
		

		


		

		
		
		
		
		
		}

    
    
    
    
    
    
    
    
    
}
