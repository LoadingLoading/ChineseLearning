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
	//组件
	private ImageView voice = null;
	private TextView result = null;
	private Toast mToast = null;
	
	//语音识别
	private final String APP_ID = "514fb8d7";
	private final static String KEY_GRAMMAR_ID = "grammar_id";
	private RecognizerDialog recognizerDialog = null;
	private String grammarText = null;
	private String grammarID = null;
	
	//语音朗读
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
		//初始化识别
		mToast = Toast.makeText(this,"",Toast.LENGTH_SHORT);
		mToast.setMargin(0f, 0.2f);
		recognizerDialog = new RecognizerDialog(this,"appid="+APP_ID);
		SpeechUser.getUser().login(this, null, null, "appid="+APP_ID, loginListener);
		
		// 读取保存的语法ID
		SharedPreferences preference = this.getSharedPreferences("abnf",MODE_PRIVATE);
		grammarID =preference.getString(KEY_GRAMMAR_ID, null);
		grammarText = readAbnfFile();
		
		
		this.voice.setOnClickListener(new Voice());
		
		//用于显示汉字和拼音
	  	String shendiao=null;
	  	String hanzi=null;
		
	  	for(int i=1;i<3;i++){
	  		int judge=Integer.valueOf(wors).intValue();
	  		if(i==judge){
		//开始朗读
		texTextView = (TextView)this.findViewById(R.id.a11c); 
		myTextView = (TextView)this.findViewById(R.id.a1c); //anniu
		translate = (TextView)this.findViewById(R.id.a21c);
	  	shendiao=returnpandc.ciyu(data,1,judge);//显示不同的声调,data 表示他所在的位置，对应一个词语， 1 表示这是声调，judge表示这是词语还是橘子，1表示词语，2表示句子
	  	myTextView.setText(shendiao);
	  	hanzi=returnpandc.ciyu(data,2,judge);//显示不同的汉字
	  	texTextView.setText(hanzi);
	  	hanzi=returnpandc.ciyu(data,3,judge);//显示不同的翻译
	  	translate.setText(hanzi);
	  		}
	  	}
		

		
		texTextView5 = (TextView)this.findViewById(R.id.resultc); 
		
	
        
        //实例并初始化TTS对象
        mTextToSpeech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            
            @Override
            public void onInit(int status) {
                if (status==TextToSpeech.SUCCESS) {
                    //设置朗读语言
                    int supported=mTextToSpeech.setLanguage(Locale.US);
                    if ((supported!=TextToSpeech.LANG_AVAILABLE)&&(supported!=TextToSpeech.LANG_COUNTRY_AVAILABLE)) {
                        Toast.makeText(DetailCiyu.this, "不支持当前语言！", 1).show();
                    }
                }
                
            }
        });
        
        //朗读监听按钮
        myTextView.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View arg0) {
                //朗读EditText里的内容
                mTextToSpeech.speak(texTextView.getText().toString(), TextToSpeech.QUEUE_FLUSH, null); 
            }
        });

        
        //朗读所获得的结果
        texTextView5.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View arg0) {
                //朗读EditText里的内容
                mTextToSpeech.speak(texTextView5.getText().toString(), TextToSpeech.QUEUE_FLUSH, null); 
            }
        });
        

        
      //EditText内容变化监听
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
	
	//语音识别用户登录监听器
	private SpeechListener loginListener = new SpeechListener()
	{

		@Override
		public void onData(byte[] arg0) {
		}

		@Override
		public void onEnd(SpeechError error) {
			if(error != null) 
			{
				mToast.setText("登录失败");
				mToast.show();
			}
			else
			{
				mToast.setText("登录成功");
				mToast.show();
			}
		}

		@Override
		public void onEvent(int arg0, Bundle arg1) {
		}		
	};
	
	//读取语音识别语法
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
	//识别结果回调
	private RecognizerDialogListener mRecoListener = new RecognizerDialogListener()
	{
		@Override
		public void onResults(ArrayList<RecognizerResult> results,boolean isLast) {
			String text = "";
			text = results.get(0).text;
			mToast.setText("识别结果为："+text);
			mToast.show();
			result.setText("\n\n "+text);
			
			
			
			
			correctc.setTextSize((float) 120);
			if((text.equals((texTextView.getText().toString())))){
				correctc.setText("  √");
			}
			else{
				correctc.setText("  ×");
			
			}
		}

		@Override
		public void onEnd(SpeechError error) {
			DetailCiyu.this.voice.setImageResource(R.drawable.voice);
		}
		
	};
	
	
	//开始朗读
	  @Override
	    protected void onDestroy() {
	        super.onDestroy();
	        
	        if (mTextToSpeech!=null) {
	            mTextToSpeech.shutdown();//关闭TTS
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
