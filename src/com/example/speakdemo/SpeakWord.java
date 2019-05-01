package com.example.speakdemo;





import java.util.Locale;


import com.example.tergel.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SpeakWord extends Activity {
    
      private EditText mEditText = null; 
      private Button readButton = null; 
      private Button saveButton = null; 
      private Button clear = null; 
      private CheckBox mCheckBox = null; 
      private TextToSpeech mTextToSpeech=null;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speakword);
        

        
	
        mEditText = (EditText)this.findViewById(R.id.speakwords); 
        readButton = (Button)this.findViewById(R.id.speakit); 
        saveButton = (Button)this.findViewById(R.id.savebutton); 
        mCheckBox = (CheckBox)this.findViewById(R.id.mcheckbox); 
        clear = (Button)this.findViewById(R.id.clear); 
        
        
        //�ж��Ƿ��Ǵ��ⲿ��������Ϊ1������Ϊ2
        Intent intent= getIntent();
	  	String data = intent.getStringExtra("waimian");     
	  	mEditText.setText(data);
//  	if(!data.equals("2")){
//  	  mEditText.setText("");
//	  	}

        
        
        //ʵ������ʼ��TTS����
        mTextToSpeech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            
            @Override
            public void onInit(int status) {
                if (status==TextToSpeech.SUCCESS) {
                    //�����ʶ�����
                    int supported=mTextToSpeech.setLanguage(Locale.US);
                    if ((supported!=TextToSpeech.LANG_AVAILABLE)&&(supported!=TextToSpeech.LANG_COUNTRY_AVAILABLE)) {
                        Toast.makeText(SpeakWord.this, "��֧�ֵ�ǰ���ԣ�", 1).show();
                    }
                }
                
            }
        });
        
        //�ʶ�������ť
        readButton.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View arg0) {
                //�ʶ�EditText�������
                mTextToSpeech.speak(mEditText.getText().toString(), TextToSpeech.QUEUE_FLUSH, null); 
            }
        });
        
        //�ʶ�������ť
        clear.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View arg0) {
                //�ʶ�EditText�������
            	mEditText.setText("");
            }
        });
        
        //���水ť����
        saveButton.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View arg0) {
                //��EditText������ݱ���Ϊ�����ļ�
                int r = mTextToSpeech.synthesizeToFile(mEditText.getText().toString(), null, "/mnt/sdcard/speak.wav"); 
                if (r==TextToSpeech.SUCCESS) {
                    Toast.makeText(SpeakWord.this, "����ɹ���", 1).show();
                }
            }
        });
        

        
      //EditText���ݱ仯����
      mEditText.addTextChangedListener(mTextWatcher); 
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        
        if (mTextToSpeech!=null) {
            mTextToSpeech.shutdown();//�ر�TTS
        }
    }
    
    private TextWatcher mTextWatcher = new TextWatcher(){

        @Override
        public void afterTextChanged(Editable s) {
             //����Ǳ�д�߶� 
            if(mCheckBox.isChecked()&&(s.length()!=0)){
              //���EditText���������� 
              String t = s.toString();         
              mTextToSpeech.speak(t.substring(s.length()-1), TextToSpeech.QUEUE_FLUSH, null); 
            }
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int before,
                int count) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before,
                int count) {
            // TODO Auto-generated method stub
            
        }        
    };    
}