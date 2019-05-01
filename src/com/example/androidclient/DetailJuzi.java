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

public class DetailJuzi extends Activity{
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
    private EditText jieguo = null; 
    private Button but1 = null; 
    private Button but2 = null; 
    

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.detail_juzi);
		
		Intent intent= getIntent();
	  	String data = intent.getStringExtra("extra_datas");
	  	
	  	String wors = intent.getStringExtra("wors");

	  	

	  
	  
		
		this.voice = (ImageView)super.findViewById(R.id.ting);
		this.jieguo = (EditText)super.findViewById(R.id.jieguo);

		
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
		

		

		
		jieguo = (EditText)this.findViewById(R.id.jieguo); 
		
	
        

        

        


	}
	
	

	
	private class Voice implements OnClickListener {

		@Override
		public void onClick(View v) {
			DetailJuzi.this.voice.setImageResource(R.drawable.voicelight);
		
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
			mToast.setText("You said: "+text);
			mToast.show();
			jieguo.setText(""+text);
			
			
			
			

		}

		@Override
		public void onEnd(SpeechError error) {
			DetailJuzi.this.voice.setImageResource(R.drawable.voice);
		}
		
	};
	
	
	
	
}
