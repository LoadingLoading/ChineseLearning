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

public class DetailPinyin extends Activity{
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
    
    private TextView myTextView2 = null; 
    private TextView texTextView2 = null; 
    private TextView translate2 = null; 
    
    private TextView myTextView3 = null; 
    private TextView texTextView3 = null; 
    private TextView translate3 = null; 
    
    private TextView myTextView4 = null; 
    private TextView texTextView4 = null; 
    private TextView translate4 = null; 
    
    private TextView myTextView5 = null; 
    private TextView texTextView5 = null; 
    
    private TextView correct = null; 


    private TextToSpeech mTextToSpeech=null;
  
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.detail_pinyin);
		
		Intent intent= getIntent();
	  	String data = intent.getStringExtra("extra_data");

	  	

	  
	  
		
		this.voice = (ImageView)super.findViewById(R.id.voice);
		this.result = (TextView)super.findViewById(R.id.result);
		this.correct = (TextView)this.findViewById(R.id.correctt);//to judge what tone is saying
		
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
		
		//��ʼ�ʶ�
		texTextView = (TextView)this.findViewById(R.id.a11); 
		myTextView = (TextView)this.findViewById(R.id.a1); //anniu
		translate = (TextView)this.findViewById(R.id.a21);
	  	shendiao=returnpandc.shendiao(data,1);//��ʾ��ͬ������
	  	myTextView.setText(shendiao);
	  	hanzi=returnpandc.hanzi(data,1);//��ʾ��ͬ�ĺ���
	  	texTextView.setText(hanzi);
	  	hanzi=returnpandc.hanzi(data,5);//��ʾ��ͬ�ķ���
	  	translate.setText(hanzi);
	  	
		
		texTextView2 = (TextView)this.findViewById(R.id.a12); 
		myTextView2 = (TextView)this.findViewById(R.id.a2);
		translate2 = (TextView)this.findViewById(R.id.a22);
	  	shendiao=returnpandc.shendiao(data,2);
	  	myTextView2.setText(shendiao);
	  	hanzi=returnpandc.hanzi(data,2);//��ʾ��ͬ�ĺ���
	  	texTextView2.setText(hanzi);
	  	hanzi=returnpandc.hanzi(data,6);//��ʾ��ͬ�ķ���
	  	translate2.setText(hanzi);
		
		texTextView3 = (TextView)this.findViewById(R.id.a13); 
		myTextView3 = (TextView)this.findViewById(R.id.a3);
		translate3 = (TextView)this.findViewById(R.id.a23);
	  	shendiao=returnpandc.shendiao(data,3);//��ʾ��ͬ������
	  	myTextView3.setText(shendiao);
	  	hanzi=returnpandc.hanzi(data,3);//��ʾ��ͬ�ĺ���
	  	texTextView3.setText(hanzi);
	  	hanzi=returnpandc.hanzi(data,7);//��ʾ��ͬ�ķ���
	  	translate3.setText(hanzi);
		
		texTextView4 = (TextView)this.findViewById(R.id.a14); 
		myTextView4 = (TextView)this.findViewById(R.id.a4);
		translate4 = (TextView)this.findViewById(R.id.a24);
	  	shendiao=returnpandc.shendiao(data,4);
	  	myTextView4.setText(shendiao);
	  	hanzi=returnpandc.hanzi(data,4);//��ʾ��ͬ�ĺ���
	  	texTextView4.setText(hanzi);
	  	hanzi=returnpandc.hanzi(data,8);//��ʾ��ͬ�ķ���
	  	translate4.setText(hanzi);
		
		texTextView5 = (TextView)this.findViewById(R.id.result); 
		
		
		

        
        //ʵ������ʼ��TTS����
        mTextToSpeech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            
            @Override
            public void onInit(int status) {
                if (status==TextToSpeech.SUCCESS) {
                    //�����ʶ�����
                    int supported=mTextToSpeech.setLanguage(Locale.US);
                    if ((supported!=TextToSpeech.LANG_AVAILABLE)&&(supported!=TextToSpeech.LANG_COUNTRY_AVAILABLE)) {
                        Toast.makeText(DetailPinyin.this, "��֧�ֵ�ǰ���ԣ�", 1).show();
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
        //�ʶ�������ť
        myTextView2.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View arg0) {
                //�ʶ�EditText�������
                mTextToSpeech.speak(texTextView2.getText().toString(), TextToSpeech.QUEUE_FLUSH, null); 
            }
        });
        //�ʶ�������ť
        myTextView3.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View arg0) {
                //�ʶ�EditText�������
                mTextToSpeech.speak(texTextView3.getText().toString(), TextToSpeech.QUEUE_FLUSH, null); 
            }
        });
        //�ʶ�������ť
        myTextView4.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View arg0) {
                //�ʶ�EditText�������
                mTextToSpeech.speak(texTextView4.getText().toString(), TextToSpeech.QUEUE_FLUSH, null); 
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
        
        
////        correct = (TextView)this.findViewById(R.id.correctt);//to judge what tone is saying
//        if(texTextView5.getText().toString().equals("\n\n Here is your result!")){
//        	
//        }
//        if((texTextView5.getText().toString().equals((myTextView.getText().toString())))){
//        	correct.setText("\n Your tone is ��");
//        }
//else if((texTextView5.getText().toString().equals((myTextView2.getText().toString())))){
//	correct.setText("\n Your tone is ��");
//        }
//else if((texTextView5.getText().toString().equals((myTextView3.getText().toString())))){
//	correct.setText("\n Your tone is �@");
//}
//else if((texTextView5.getText().toString().equals((myTextView4.getText().toString())))){
//	correct.setText("\n Your tone is ��");
//}
//else if((texTextView5.getText().toString().equals((myTextView4.getText().toString())))){
//	correct.setText("\n Your tone is �A");
//}
//else{
//	correct.setText("\n You were wrong~");
//}
        
		
	}
	
	

	
	private class Voice implements OnClickListener {

		@Override
		public void onClick(View v) {
			
			DetailPinyin.this.voice.setImageResource(R.drawable.voicelight);
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
			result.setText("\n "+text+"\n");
			text="\n "+text;
			
			
	        if(text.equals((texTextView.getText().toString()))){
	        	correct.setText("\n Your tone is ��");
	        }
	else if((text.equals((texTextView2.getText().toString())))){
		correct.setText("\n Your tone is �@");
	        }
	else if((text.toString().equals((texTextView3.getText().toString())))){
		correct.setText("\n Your tone is ��");
	}
	else if((text.equals((texTextView4.getText().toString())))){
		correct.setText("\n Your tone is �A");
	}
	else{
		correct.setText("\n You were wrong~");
	
	}


		}

		@Override
		public void onEnd(SpeechError error) {
			DetailPinyin.this.voice.setImageResource(R.drawable.voice);
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
