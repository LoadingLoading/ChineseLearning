package com.example.androidclient;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;

import com.iflytek.speech.RecognizerResult;
import com.iflytek.speech.SpeechError;
import com.iflytek.speech.SpeechListener;
import com.iflytek.speech.SpeechUser;
import com.iflytek.ui.RecognizerDialog;
import com.iflytek.ui.RecognizerDialogListener;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.speakdemo.SpeakWord;
import com.example.tergel.R;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailCiyu extends Activity{
	//���
	private ImageView voice = null;
	private TextView result = null;
	private Toast mToast = null;
	
	//����ʶ��
	private final String APP_ID = "514fb8d7";
	private final static String KEY_GRAMMAR_ID = "grammar_id";
	private RecognizerDialog recognizerDialog = null;
	private String grammarText = null;
	private String grammarID = null;
	
	//�����ʶ�
    private TextView myTextView = null; 
    private TextView texTextView = null; 
    private TextView translate = null; 
    

    private TextView myTextView5 = null; 
    private TextView texTextView5 = null; 

    private TextView correctc = null; 

    private TextToSpeech mTextToSpeech=null;
  
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.detail_ciyu);
		
		Intent intent= getIntent();
	  	String data = intent.getStringExtra("extra_datas");
	  	
	  	String wors = intent.getStringExtra("wors");

	  	

	  
	  
		
		this.voice = (ImageView)super.findViewById(R.id.voicec);
		this.result = (TextView)super.findViewById(R.id.resultc);
		this.correctc = (TextView)this.findViewById(R.id.correcttc);//to judge if you are corrct
		
		//Toast.makeText(DetailPinyin.this, "sss", Toast.LENGTH_SHORT).show();
		//��ʼ��ʶ��
		mToast = Toast.makeText(this,"",Toast.LENGTH_SHORT);
		mToast.setMargin(0f, 0.2f);
		recognizerDialog = new RecognizerDialog(this,"appid="+APP_ID);
		SpeechUser.getUser().login(this, null, null, "appid="+APP_ID, loginListener);
		
		// ��ȡ������﷨ID
		SharedPreferences preference = this.getSharedPreferences("abnf",MODE_PRIVATE);
		grammarID =preference.getString(KEY_GRAMMAR_ID, null);
		grammarText = readAbnfFile();
		
		
		this.voice.setOnClickListener(new Voice());
		
		//������ʾ���ֺ�ƴ��
	  	String shendiao=null;
	  	String hanzi=null;
		
	  	for(int i=1;i<3;i++){
	  		int judge=Integer.valueOf(wors).intValue();
	  		if(i==judge){
		//��ʼ�ʶ�
		texTextView = (TextView)this.findViewById(R.id.a11c); 
		myTextView = (TextView)this.findViewById(R.id.a1c); //anniu
		translate = (TextView)this.findViewById(R.id.a21c);
	  	shendiao=returnpandc.ciyu(data,1,judge);//��ʾ��ͬ������,data ��ʾ�����ڵ�λ�ã���Ӧһ����� 1 ��ʾ����������judge��ʾ���Ǵ��ﻹ�����ӣ�1��ʾ���2��ʾ����
	  	myTextView.setText(shendiao);
	  	hanzi=returnpandc.ciyu(data,2,judge);//��ʾ��ͬ�ĺ���
	  	texTextView.setText(hanzi);
	  	hanzi=returnpandc.ciyu(data,3,judge);//��ʾ��ͬ�ķ���
	  	translate.setText(hanzi);
	  		}
	  	}
		

		
		texTextView5 = (TextView)this.findViewById(R.id.resultc); 
		
	
        
        //ʵ������ʼ��TTS����
        mTextToSpeech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            
            @Override
            public void onInit(int status) {
                if (status==TextToSpeech.SUCCESS) {
                    //�����ʶ�����
                    int supported=mTextToSpeech.setLanguage(Locale.US);
                    if ((supported!=TextToSpeech.LANG_AVAILABLE)&&(supported!=TextToSpeech.LANG_COUNTRY_AVAILABLE)) {
                        Toast.makeText(DetailCiyu.this, "��֧�ֵ�ǰ���ԣ�", 1).show();
                    }
                }
                
            }
        });
        
        //�ʶ�������ť
        myTextView.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View arg0) {
                //�ʶ�EditText�������
                mTextToSpeech.speak(texTextView.getText().toString(), TextToSpeech.QUEUE_FLUSH, null); 
            }
        });

        
        //�ʶ�����õĽ��
        texTextView5.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View arg0) {
                //�ʶ�EditText�������
                mTextToSpeech.speak(texTextView5.getText().toString(), TextToSpeech.QUEUE_FLUSH, null); 
            }
        });
        

        
      //EditText���ݱ仯����
        texTextView.addTextChangedListener(mTextWatcher); 
		
	}
	
	

	
	private class Voice implements OnClickListener {

		@Override
		public void onClick(View v) {
			
			DetailCiyu.this.voice.setImageResource(R.drawable.voicelight);
			recognizerDialog.setListener(mRecoListener);
			recognizerDialog.setEngine(null, "grammar_type=abnf", grammarText);
			recognizerDialog.show();
		}
	}
	
	//����ʶ���û���¼������
	private SpeechListener loginListener = new SpeechListener()
	{

		@Override
		public void onData(byte[] arg0) {
		}

		@Override
		public void onEnd(SpeechError error) {
			if(error != null) 
			{
				mToast.setText("��¼ʧ��");
				mToast.show();
			}
			else
			{
				mToast.setText("��¼�ɹ�");
				mToast.show();
			}
		}

		@Override
		public void onEvent(int arg0, Bundle arg1) {
		}		
	};
	
	//��ȡ����ʶ���﷨
	private String readAbnfFile()
	{
		int len = 0;
		byte []buf = null;
		String grammar = "";
		try {
			InputStream in = getAssets().open("gm_continuous_digit.abnf");			
			len  = in.available();
			buf = new byte[len];
			in.read(buf, 0, len);
			grammar = new String(buf,"gb2312");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return grammar;

	}
	//ʶ�����ص�
	private RecognizerDialogListener mRecoListener = new RecognizerDialogListener()
	{
		@Override
		public void onResults(ArrayList<RecognizerResult> results,boolean isLast) {
			String text = "";
			text = results.get(0).text;
			mToast.setText("ʶ����Ϊ��"+text);
			mToast.show();
			result.setText("\n\n "+text);
			
			
			
			
			correctc.setTextSize((float) 120);
			if((text.equals((texTextView.getText().toString())))){
				correctc.setText("  ��");
			}
			else{
				correctc.setText("  ��");
			
			}
		}

		@Override
		public void onEnd(SpeechError error) {
			DetailCiyu.this.voice.setImageResource(R.drawable.voice);
		}
		
	};
	
	
	//��ʼ�ʶ�
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
