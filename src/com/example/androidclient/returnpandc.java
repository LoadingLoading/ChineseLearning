package com.example.androidclient;

public class returnpandc {
	public static String ciyu(String number,int id, int judge){
		if(judge==1){
			return ciyude(number,id);
		}else{
			return juzide(number,id);
		}
		
	}
	
	public static String tou(String number, int judge){
		if(judge==1){
			return ciyutou(number);
		}else{
			return juzitou(number);
		}
		
	}
	
	
	public static String ciyutou(String number){
		int n=0;
		n= Integer.valueOf(number).intValue();
		int p=0;
		if(n==p){
			return " :家庭称呼。  \nHow to call a family member.";
		}p++;
		if(n==p){
			return " :数字。  \nNumbers.";
		}p++;
		if(n==p){
			return " :身体部位。  \nParts of body.";
		}p++;
		if(n==p){
			return " :颜色。  \ncolor.";
		}p++;
		if(n==p){
			return " :代词。  \npronoun.";
		}p++;
		if(n==p){
			return " :动词。  \nverb.";
		}p++;
		if(n==p){
			return " :助词。  \nauxiliary word.";
		}p++;
		
		return null;
	}
	
	public static String juzitou(String number){
		int n=0;
		n= Integer.valueOf(number).intValue();
		int p=0;
		if(n==p){
			return " :第一次见面。  \nFirst meet.";
		}p++;
		if(n==p){
			return " :吃饭。  \nHave a meal.";
		}p++;
		if(n==p){
			return " :时间。  \nIt is time to go.";
		}p++;
		if(n==p){
			return " :使用助词。  \nHow to use auxiliary word.";
		}p++;

		return null;
	}
	
	public static String juzide(String number,int id){
		int n=0;
		int p=0;
		n= Integer.valueOf(number).intValue();
		if(n==p){
			if(id==1){
				return "ni2/(3) hao3";
			}
			if(id==2){
				return "你好";
			}
			if(id==3){
				return "Hello!";
			}
		}
		p++;
		if(n==p){
			if(id==1){
				return "zao3 shang4 hao3";
			}
			if(id==2){
				return "早上好";
			}
			if(id==3){
				return "Good morning!";
			}
		}p++;
		if(n==p){
			if(id==1){
				return "xia1 wu3 hao3";
			}
			if(id==2){
				return "下午好";
			}
			if(id==3){
				return "Good afternoon!";
			}
		}p++;
		if(n==p){
			if(id==1){
				return "wan3 an1";
			}
			if(id==2){
				return "晚安";
			}
			if(id==3){
				return "Good night!";
			}
		}p++;
		if(n==p){
			if(id==1){
				return "zui4 jin4 zen3 me yang4";
			}
			if(id==2){
				return "最近怎么样";
			}
			if(id==3){
				return "How are you recently?";
			}
		}p++;
		if(n==p){
			if(id==1){
				return "wo3 hen2/(3) hao3";
			}
			if(id==2){
				return "我很好";
			}
			if(id==3){
				return "I am fine!";
			}
		}p++;
		if(n==p){
			if(id==1){
				return "ni3 ne";
			}
			if(id==2){
				return "你呢";
			}
			if(id==3){
				return "And you?";
			}
		}p++;
		if(n==p){
			if(id==1){
				return "wo2/(3) ye3 hen2/(3) hao3";
			}
			if(id==2){
				return "我也很好";
			}
			if(id==3){
				return "Me too.";
			}
		}p++;
		if(n==p){
			if(id==1){
				return "hao2/(3) jiu3 bu2 jian4";
			}
			if(id==2){
				return "好久不见";
			}
			if(id==3){
				return "Long time no see!";
			}
		}p++;
		if(n==p){
			if(id==1){
				return "zai4 jian4";
			}
			if(id==2){
				return "再见";
			}
			if(id==3){
				return "Good bye.";
			}
		}p++;
		
		if(n==p){	if(id==1){return "wo3 men yi2 gong4 san1 ge4 ren2";}//0
					if(id==2){return "我们一共三个人";}
					if(id==3){return "There are 3 people of our all.";}}p++;
		if(n==p){	if(id==1){return "qing2/(3) ba3 cai4 dan1 na2 lai2";}
					if(id==2){return "请把菜单拿来";}
					if(id==3){return "Menu pleas.";}}p++;
		if(n==p){	if(id==1){return "cai4 dan1 shang4 you3 chao2/(3) bing3 si ma?";}
					if(id==2){return "菜单上有炒饼丝吗";}
					if(id==3){return "Do you have sauted pancakes on the menu?";}}p++;
		if(n==p){	if(id==1){return "wo2/(3) xiang3 chi1 bao1 zi.";}
					if(id==2){return "我想吃包子";}
					if(id==3){return "I want to eat steamed stuffed buns.";}}p++;	
		if(n==p){	if(id==1){return "zhe4 ge4 la4 jiao1 tai4 la4 le";}
					if(id==2){return "这个辣椒太辣了";}
					if(id==3){return "This chili is too spicy!";}}p++;
		if(n==p){	if(id==1){return "zhe4 ge4 kai1 wei4 cai4 hen2/(3) hao3 chi1";}
					if(id==2){return "这个开胃菜很好吃";}
					if(id==3){return "This starter is delicious!";}}p++;
		if(n==p){	if(id==1){return "zhe4 ge4 wu3 fen1 shu2 de niu2 pai2 hen3 nan2 chi1";}
					if(id==2){return "这个五分熟的牛排很难吃";}
					if(id==3){return "This steak medium cooked is unpalatable.";}}p++;
		if(n==p){	if(id==1){return "nv3 fu2 wu4 yuan2 hen3 re4 qing2.";}
					if(id==2){return "女服务员很热情";}
					if(id==3){return "The hostess is bery welcoming";}}p++;
		if(n==p){	if(id==1){return "wo2/(3) xi3 huan1 he1 ka1 fei1";}
					if(id==2){return "我喜欢喝咖啡";}
					if(id==3){return "I like drinking coffee";}}p++;
		if(n==p){	if(id==1){return "wo2/(3) tao3 yan4 chi1 ji1 rou4.";}
					if(id==2){return "我讨厌吃鸡肉";}
					if(id==3){return "I hate eating chicken";}}p++;//9
					
		if(n==p){	if(id==1){return "jin1 tian1 hen3 re4";}//0
					if(id==2){return "今天很热";}
					if(id==3){return "It is hot today";}}p++;
		if(n==p){	if(id==1){return "zuo2 tian1 hen3 len3";}
					if(id==2){return "昨天很冷";}
					if(id==3){return "It is cold yesterday";}}p++;
		if(n==p){	if(id==1){return "ming2 tian1 hui4 xia4 yu3";}
					if(id==2){return "明天会下雨";}
					if(id==3){return "It will be rain tomorrow";}}p++;
		if(n==p){	if(id==1){return "jin1 tian1 wo3 yao4 qu4 shang4 hai3";}
					if(id==2){return "今天我要去上海";}
					if(id==3){return "I will go to Shanghai today";}}p++;	
		if(n==p){	if(id==1){return "ming2 tian1 wo3 yao4 zuo4 fei1 ji1";}
					if(id==2){return "明天我要坐飞机";}
					if(id==3){return "I will catch a plane tomorrow";}}p++;
		if(n==p){	if(id==1){return "wo3 san1 dian3 yao4 kai1 hui4";}
					if(id==2){return "我三点要开会";}
					if(id==3){return "I will have a meetting tomorrow";}}p++;
		if(n==p){	if(id==1){return "wo3 mei3 tian1 wu2/(3) dian3 chi1 wan3 fan4";}
					if(id==2){return "我每天五点吃晚饭";}
					if(id==3){return "I have dinner at 5 everyday";}}p++;
		if(n==p){	if(id==1){return "qin3 wen4 ni3 ji3 dian3 xia4 ban1";}
					if(id==2){return "请问你几点下班";}
					if(id==3){return "When will you finish your work?";}}p++;
		if(n==p){	if(id==1){return "ta1 zuo2 tian1 qu4 na3";}
					if(id==2){return "他昨天去哪了";}
					if(id==3){return "where did he go?";}}p++;
		if(n==p){	if(id==1){return "wo3 jin1 tian1 hen3 kai1 xin1";}
					if(id==2){return "我今天很开心";}
					if(id==3){return "I am very happy today.";}}p++;//9
					
		if(n==p){	if(id==1){return "wo3 chi1 fan4 le";}//0
					if(id==2){return "我吃饭了";}
					if(id==3){return "I have had meal.";}}p++;
		if(n==p){	if(id==1){return "wo3 yao4 qu4 da3 qiu2";}
					if(id==2){return "我要去打球";}
					if(id==3){return "I will go to paly ball.";}}p++;
		if(n==p){	if(id==1){return "ta1 zheng4 zai4 xue2 xi2";}
					if(id==2){return "他正在学习";}
					if(id==3){return "He is studying";}}p++;
		if(n==p){	if(id==1){return "wo2(3) yi3 jing1 zuo4 wan2 zuo4 ye4 le";}
					if(id==2){return "我已经做完作业了";}
					if(id==3){return "I have finished my homework";}}p++;	
		if(n==p){	if(id==1){return "ta1 mei2 you3 chi2 dao4";}
					if(id==2){return "他没有迟到";}
					if(id==3){return "He was not late";}}p++;
		if(n==p){	if(id==1){return "wo3 bu4 hui2 jia1";}
					if(id==2){return "我不回家";}
					if(id==3){return "I will not go home";}}p++;
		if(n==p){	if(id==1){return "zhe4 shi4 wo3 de shu1, bu2 shi4 ni3 de shu1";}
					if(id==2){return "这是我的书，不是你的书";}
					if(id==3){return "This is my book, not your book";}}p++;
		if(n==p){	if(id==1){return "wo3 men yi4 qi3 chu1 qu4 wan2";}
					if(id==2){return "我们一起出去玩";}
					if(id==3){return "We have fun together";}}p++;
		if(n==p){	if(id==1){return "ta1 shi4 ge4 hao3 ren2";}
					if(id==2){return "他是个好人";}
					if(id==3){return "He is a good man";}}p++;
		if(n==p){	if(id==1){return "hao3 de";}
					if(id==2){return "好的";}
					if(id==3){return "OK";}}p++;//9
					


					
		
		return null;
	}
	
	public static String ciyude(String number,int id){
		int n=0;
		n= Integer.valueOf(number).intValue();
		if(n==0){
			if(id==1){
				return "xiong1 di4";
			}
			if(id==2){
				return "兄弟";
			}
			if(id==3){
				return "brother";
			}
		}
		if(n==1){
			if(id==1){
				return "jie3 mei4";
			}
			if(id==2){
				return "姐妹";
			}
			if(id==3){
				return "sister";
			}
		}
		if(n==2){
			if(id==1){
				return "ba4 ba";
			}
			if(id==2){
				return "爸爸";
			}
			if(id==3){
				return "father";
			}
		}
		if(n==3){
			if(id==1){
				return "ma1 ma";
			}
			if(id==2){
				return "妈妈";
			}
			if(id==3){
				return "mother";
			}
		}
		if(n==4){
			if(id==1){
				return "ye2 ye";
			}
			if(id==2){
				return "爷爷";
			}
			if(id==3){
				return "grandfather";
			}
		}
		if(n==5){
			if(id==1){
				return "nai3 nai";
			}
			if(id==2){
				return "奶奶";
			}
			if(id==3){
				return "grandmother";
			}
		}
		if(n==6){
			if(id==1){
				return "er2 zi";
			}
			if(id==2){
				return "儿子";
			}
			if(id==3){
				return "son";
			}
		}
		if(n==7){
			if(id==1){
				return "nv3 er2";
			}
			if(id==2){
				return "女儿";
			}
			if(id==3){
				return "daughter";
			}
		}
		if(n==8){
			if(id==1){
				return "sun1 zi";
			}
			if(id==2){
				return "孙子";
			}
			if(id==3){
				return "grandson";
			}
		}
		if(n==9){
			if(id==1){
				return "hou4 ma1";
			}
			if(id==2){
				return "后妈";
			}
			if(id==3){
				return "step-mother";
			}
		}
		if(n==10){
			if(id==1){
				return "yi1";
			}
			if(id==2){
				return "一";
			}
			if(id==3){
				return "one";
			}
		}
		if(n==11){
			if(id==1){
				return "er4";
			}
			if(id==2){
				return "二";
			}
			if(id==3){
				return "two";
			}
		}
		if(n==12){
			if(id==1){
				return "san1";
			}
			if(id==2){
				return "三";
			}
			if(id==3){
				return "three";
			}
		}
		if(n==13){
			if(id==1){
				return "si4";
			}
			if(id==2){
				return "四";
			}
			if(id==3){
				return "four";
			}
		}
		if(n==14){
			if(id==1){
				return "wu3";
			}
			if(id==2){
				return "五";
			}
			if(id==3){
				return "five";
			}
		}
		if(n==15){
			if(id==1){
				return "liu4";
			}
			if(id==2){
				return "六";
			}
			if(id==3){
				return "six";
			}
		}
		if(n==16){
			if(id==1){
				return "qi1";
			}
			if(id==2){
				return "七";
			}
			if(id==3){
				return "seven";
			}
		}
		if(n==17){
			if(id==1){
				return "ba1";
			}
			if(id==2){
				return "八";
			}
			if(id==3){
				return "eight";
			}
		}
		if(n==18){
			if(id==1){
				return "jiu3";
			}
			if(id==2){
				return "九";
			}
			if(id==3){
				return "nine";
			}
		}
		if(n==19){
			if(id==1){
				return "shi2";
			}
			if(id==2){
				return "十";
			}
			if(id==3){
				return "ten";
			}
		}
		if(n==20){
			if(id==1){
				return "tou2";
			}
			if(id==2){
				return "头";
			}
			if(id==3){
				return "head";
			}
		}
		if(n==21){
			if(id==1){
				return "bo2 zi";
			}
			if(id==2){
				return "脖子";
			}
			if(id==3){
				return "neck";
			}
		}
		if(n==22){
			if(id==1){
				return "shou3";
			}
			if(id==2){
				return "手";
			}
			if(id==3){
				return "hand";
			}
		}
		if(n==23){
			if(id==1){
				return "xiong1";
			}
			if(id==2){
				return "胸";
			}
			if(id==3){
				return "chaste";
			}
		}
		if(n==24){
			if(id==1){
				return "du4 zi";
			}
			if(id==2){
				return "肚子";
			}
			if(id==3){
				return "tummy";
			}
		}
		if(n==25){
			if(id==1){
				return "tui3";
			}
			if(id==2){
				return "腿";
			}
			if(id==3){
				return "leg";
			}
		}
		if(n==26){
			if(id==1){
				return "jiao3";
			}
			if(id==2){
				return "脚";
			}
			if(id==3){
				return "foot";
			}
		}
		if(n==27){
			if(id==1){
				return "yan3 jing";
			}
			if(id==2){
				return "眼睛";
			}
			if(id==3){
				return "eyes";
			}
		}
		if(n==28){
			if(id==1){
				return "bi2 zi";
			}
			if(id==2){
				return "鼻子";
			}
			if(id==3){
				return "nose";
			}
		}
		if(n==29){
			if(id==1){
				return "mao2";
			}
			if(id==2){
				return "毛";
			}
			if(id==3){
				return "hair";
			}
		}

		if(n==30){
			if(id==1){
				return "hong2 se4";
			}
			if(id==2){
				return "红色";
			}
			if(id==3){
				return "red";
			}
		}
		if(n==31){
			if(id==1){
				return "nv4 se4";
			}
			if(id==2){
				return "绿色";
			}
			if(id==3){
				return "green";
			}
		}
		if(n==32){
			if(id==1){
				return "zi3 se4";
			}
			if(id==2){
				return "紫色";
			}
			if(id==3){
				return "purple";
			}
		}
		if(n==33){
			if(id==1){
				return "hei1 se4";
			}
			if(id==2){
				return "黑色";
			}
			if(id==3){
				return "black";
			}
		}
		if(n==34){
			if(id==1){
				return "bai2 se4";
			}
			if(id==2){
				return "白色";
			}
			if(id==3){
				return "white";
			}
		}
		if(n==35){
			if(id==1){
				return "cheng2 se4";
			}
			if(id==2){
				return "橙色";
			}
			if(id==3){
				return "orange";
			}
		}
		if(n==36){
			if(id==1){
				return "hui1 se4";
			}
			if(id==2){
				return "灰色";
			}
			if(id==3){
				return "grey";
			}
		}
		if(n==37){
			if(id==1){
				return "lan2 se4";
			}
			if(id==2){
				return "蓝色";
			}
			if(id==3){
				return "blue";
			}
		}
		if(n==38){
			if(id==1){
				return "fen3 se4";
			}
			if(id==2){
				return "粉色";
			}
			if(id==3){
				return "pink";
			}
		}
		if(n==39){
			if(id==1){
				return "zong1 se4";
			}
			if(id==2){
				return "棕色";
			}
			if(id==3){
				return "brown";
			}
		}
		int p=40;
if(n==p){	if(id==1){return "wo3";}//40
			if(id==2){return "我";}
			if(id==3){return "I/me";}}p++;
if(n==p){	if(id==1){return "wo3 men";}
			if(id==2){return "我们";}
			if(id==3){return "we/us";}}p++;
if(n==p){	if(id==1){return "ni3";}
			if(id==2){return "你";}
			if(id==3){return "you";}}p++;
if(n==p){	if(id==1){return "ni3 men";}
			if(id==2){return "你们";}
			if(id==3){return "you(plural)";}}p++;	
if(n==p){	if(id==1){return "ta1";}
			if(id==2){return "他";}
			if(id==3){return "he/him";}}p++;
if(n==p){	if(id==1){return "ta1";}
			if(id==2){return "她";}
			if(id==3){return "she/her";}}p++;
if(n==p){	if(id==1){return "ta1 men";}
			if(id==2){return "他们";}
			if(id==3){return "they";}}p++;
if(n==p){	if(id==1){return "ta1";}
			if(id==2){return "它";}
			if(id==3){return "it";}}p++;	
if(n==p){	if(id==1){return "wo3 de";}
			if(id==2){return "我的";}
			if(id==3){return "my/mine";}}p++;//49
			
if(n==p){	if(id==1){return "xi3 huan1";}//50
			if(id==2){return "喜欢";}
			if(id==3){return "like";}}p++;
if(n==p){	if(id==1){return "tao3 yan4";}
			if(id==2){return "讨厌";}
			if(id==3){return "dislike";}}p++;
if(n==p){	if(id==1){return "ai4";}
			if(id==2){return "爱";}
			if(id==3){return "love";}}p++;
if(n==p){	if(id==1){return "da3";}
			if(id==2){return "打";}
			if(id==3){return "hit";}}p++;	
if(n==p){	if(id==1){return "chi1";}
			if(id==2){return "吃";}
			if(id==3){return "eat";}}p++;
if(n==p){	if(id==1){return "he1";}
			if(id==2){return "喝";}
			if(id==3){return "drink";}}p++;
if(n==p){	if(id==1){return "xue2 xi2";}
			if(id==2){return "学习";}
			if(id==3){return "study";}}p++;
if(n==p){	if(id==1){return "wan2";}
			if(id==2){return "玩";}
			if(id==3){return "play";}}p++;	
if(n==p){	if(id==1){return "sha1";}
			if(id==2){return "杀";}
			if(id==3){return "kill";}}p++;//59		
			
if(n==p){	if(id==1){return "le";}//60
			if(id==2){return "了";}
			if(id==3){return "did";}}p++;
if(n==p){	if(id==1){return "yao4";}
			if(id==2){return "要";}
			if(id==3){return "will";}}p++;
if(n==p){	if(id==1){return "zheng4 zai4";}
			if(id==2){return "正在";}
			if(id==3){return "is doing";}}p++;
if(n==p){	if(id==1){return "yi3 jing1";}
			if(id==2){return "已经";}
			if(id==3){return "already";}}p++;	
if(n==p){	if(id==1){return "mei2 you3";}
			if(id==2){return "没有";}
			if(id==3){return "did not";}}p++;
if(n==p){	if(id==1){return "bu4";}
			if(id==2){return "不";}
			if(id==3){return "no/will not";}}p++;
if(n==p){	if(id==1){return "de";}
			if(id==2){return "的";}
			if(id==3){return "'s";}}p++;
if(n==p){	if(id==1){return "men";}
			if(id==2){return "们";}
			if(id==3){return "plural";}}p++;	
if(n==p){	if(id==1){return "hao3";}
			if(id==2){return "好";}
			if(id==3){return "good/yes";}}p++;//69		
			
if(n==p){	if(id==1){return "mei2";}//70
			if(id==2){return "没";}
			if(id==3){return "not yet";}}p++;
if(n==p){	if(id==1){return "bu4 hao3";}
			if(id==2){return "不好";}
			if(id==3){return "No";}}p++;
if(n==p){	if(id==1){return "hao3 de";}
			if(id==2){return "好的";}
			if(id==3){return "OK";}}p++;
if(n==p){	if(id==1){return "";}
			if(id==2){return "";}
			if(id==3){return "";}}p++;	
if(n==p){	if(id==1){return "";}
			if(id==2){return "";}
			if(id==3){return "";}}p++;
if(n==p){	if(id==1){return "";}
			if(id==2){return "";}
			if(id==3){return "";}}p++;
if(n==p){	if(id==1){return "";}
			if(id==2){return "";}
			if(id==3){return "";}}p++;
if(n==p){	if(id==1){return "";}
			if(id==2){return "";}
			if(id==3){return "";}}p++;	
if(n==p){	if(id==1){return "";}
			if(id==2){return "";}
			if(id==3){return "";}}p++;//79	
			


			return null;
	}
	
	
	
	
	public static String hanzi(String pinyino,int shendiao){
		String hanzi=null;
		if(pinyino.equals("ba")){
			if(shendiao==1){
				hanzi="\n 八";
			}
			if(shendiao==2){
				hanzi="\n 拔";
			}
			if(shendiao==3){
				hanzi="\n 把";
			}
			if(shendiao==4){
				hanzi="\n 爸";
			}
			if(shendiao==5){
				hanzi="\n eight";
			}
			if(shendiao==6){
				hanzi="\n pull";
			}
			if(shendiao==7){
				hanzi="\n let";
			}
			if(shendiao==8){
				hanzi="\n dad";
			}
		}
		if(pinyino.equals("bo")){
			if(shendiao==1){
				hanzi="\n 波";
			}
			if(shendiao==2){
				hanzi="\n 伯";
			}
			if(shendiao==3){
				hanzi="\n 簸";
			}
			if(shendiao==4){
				hanzi="\n 簸";
			}
			if(shendiao==5){
				hanzi="\n wave";
			}
			if(shendiao==6){
				hanzi="\n uncle";
			}
			if(shendiao==7){
				hanzi="\n no meaning";
			}
			if(shendiao==8){
				hanzi="\n no meaning";
			}
		}
		if(pinyino.equals("bi")){
			if(shendiao==1){
				hanzi="\n 逼";
			}
			if(shendiao==2){
				hanzi="\n 鼻";
			}
			if(shendiao==3){
				hanzi="\n 比";
			}
			if(shendiao==4){
				hanzi="\n 闭";
			}
			if(shendiao==5){
				hanzi="\n pussy";
			}
			if(shendiao==6){
				hanzi="\n nose";
			}
			if(shendiao==7){
				hanzi="\n compare";
			}
			if(shendiao==8){
				hanzi="\n close";
			}
		}
		if(pinyino.equals("bu")){
			if(shendiao==1){
				hanzi="\n ";
			}
			if(shendiao==2){
				hanzi="\n ";
			}
			if(shendiao==3){
				hanzi="\n 补";
			}
			if(shendiao==4){
				hanzi="\n 不";
			}
			if(shendiao==5){
				hanzi="\n ";
			}
			if(shendiao==6){
				hanzi="\n ";
			}
			if(shendiao==7){
				hanzi="\n mend";
			}
			if(shendiao==8){
				hanzi="\n no";
			}
		}
		if(pinyino.equals("pa")){
			if(shendiao==1){
				hanzi="\n 啪";
			}
			if(shendiao==2){
				hanzi="\n 爬";
			}
			if(shendiao==3){
				hanzi="\n ";
			}
			if(shendiao==4){
				hanzi="\n 怕";
			}
			if(shendiao==5){
				hanzi="\n make love";
			}
			if(shendiao==6){
				hanzi="\n climb";
			}
			if(shendiao==7){
				hanzi="\n ";
			}
			if(shendiao==8){
				hanzi="\n afraid";
			}
		}
		if(pinyino.equals("po")){
			if(shendiao==1){
				hanzi="\n 坡";
			}
			if(shendiao==2){
				hanzi="\n 婆";
			}
			if(shendiao==3){
				hanzi="\n 叵";
			}
			if(shendiao==4){
				hanzi="\n 破";
			}
			if(shendiao==5){
				hanzi="\n slope";
			}
			if(shendiao==6){
				hanzi="\n old woman";
			}
			if(shendiao==7){
				hanzi="\n no meaning";
			}
			if(shendiao==8){
				hanzi="\n broken";
			}
		}
		if(pinyino.equals("pi")){
			if(shendiao==1){
				hanzi="\n 披";
			}
			if(shendiao==2){
				hanzi="\n 皮";
			}
			if(shendiao==3){
				hanzi="\n 痞";
			}
			if(shendiao==4){
				hanzi="\n 屁";
			}
			if(shendiao==5){
				hanzi="\n wrap";
			}
			if(shendiao==6){
				hanzi="\n skin";
			}
			if(shendiao==7){
				hanzi="\n ruffian";
			}
			if(shendiao==8){
				hanzi="\n fart";
			}
		}
		if(pinyino.equals("pu")){
			if(shendiao==1){
				hanzi="\n 铺";
			}
			if(shendiao==2){
				hanzi="\n 仆";
			}
			if(shendiao==3){
				hanzi="\n 普";
			}
			if(shendiao==4){
				hanzi="\n 瀑";
			}
			if(shendiao==5){
				hanzi="\n pave";
			}
			if(shendiao==6){
				hanzi="\n servant";
			}
			if(shendiao==7){
				hanzi="\n normal";
			}
			if(shendiao==8){
				hanzi="\n waterfall";
			}
		}
		if(pinyino.equals("ma")){
			if(shendiao==1){
				hanzi="\n 妈";
			}
			if(shendiao==2){
				hanzi="\n 麻";
			}
			if(shendiao==3){
				hanzi="\n 马";
			}
			if(shendiao==4){
				hanzi="\n 骂";
			}
			if(shendiao==5){
				hanzi="\n mon";
			}
			if(shendiao==6){
				hanzi="\n marihuana";
			}
			if(shendiao==7){
				hanzi="\n horse";
			}
			if(shendiao==8){
				hanzi="\n curse";
			}
		}
		if(pinyino.equals("mo")){
			if(shendiao==1){
				hanzi="\n 摸";
			}
			if(shendiao==2){
				hanzi="\n 魔";
			}
			if(shendiao==3){
				hanzi="\n 抹";
			}
			if(shendiao==4){
				hanzi="\n 末";
			}
			if(shendiao==5){
				hanzi="\n touch";
			}
			if(shendiao==6){
				hanzi="\n magic";
			}
			if(shendiao==7){
				hanzi="\n wipe";
			}
			if(shendiao==8){
				hanzi="\n end";
			}
		}
			if(pinyino.equals("me")){
				if(shendiao==1){
					hanzi="\n 么";
				}
				if(shendiao==2){
					hanzi="\n ";
				}
				if(shendiao==3){
					hanzi="\n ";
				}
				if(shendiao==4){
					hanzi="\n ";
				}
				if(shendiao==5){
					hanzi="\n to ask";
				}
				if(shendiao==6){
					hanzi="\n ";
				}
				if(shendiao==7){
					hanzi="\n ";
				}
				if(shendiao==8){
					hanzi="\n ";
				}
			}
			if(pinyino.equals("mi")){
				if(shendiao==1){
					hanzi="\n 咪";
				}
				if(shendiao==2){
					hanzi="\n 迷";
				}
				if(shendiao==3){
					hanzi="\n 米";
				}
				if(shendiao==4){
					hanzi="\n 密";
				}
				if(shendiao==5){
					hanzi="\n tit";
				}
				if(shendiao==6){
					hanzi="\n weird";
				}
				if(shendiao==7){
					hanzi="\n rice";
				}
				if(shendiao==8){
					hanzi="\n crowded";
				}
			}
			if(pinyino.equals("mu")){
				if(shendiao==1){
					hanzi="\n ";
				}
				if(shendiao==2){
					hanzi="\n 模";
				}
				if(shendiao==3){
					hanzi="\n 母";
				}
				if(shendiao==4){
					hanzi="\n 穆";
				}
				if(shendiao==5){
					hanzi="\n ";
				}
				if(shendiao==6){
					hanzi="\n model";
				}
				if(shendiao==7){
					hanzi="\n famale";
				}
				if(shendiao==8){
					hanzi="\n Muslim";
				}
			}
			if(pinyino.equals("fa")){
				if(shendiao==1){
					hanzi="\n 发";
				}
				if(shendiao==2){
					hanzi="\n 罚";
				}
				if(shendiao==3){
					hanzi="\n 法";
				}
				if(shendiao==4){
					hanzi="\n 髮";
				}
				if(shendiao==5){
					hanzi="\n become rich";
				}
				if(shendiao==6){
					hanzi="\n punish";
				}
				if(shendiao==7){
					hanzi="\n law";
				}
				if(shendiao==8){
					hanzi="\n hair";
				}
			}
			if(pinyino.equals("fo")){
				if(shendiao==1){
					hanzi="\n ";
				}
				if(shendiao==2){
					hanzi="\n 佛";
				}
				if(shendiao==3){
					hanzi="\n ";
				}
				if(shendiao==4){
					hanzi="\n ";
				}
				if(shendiao==5){
					hanzi="\n ";
				}
				if(shendiao==6){
					hanzi="\n Buddha";
				}
				if(shendiao==7){
					hanzi="\n ";
				}
				if(shendiao==8){
					hanzi="\n ";
				}
			}
			if(pinyino.equals("fu")){
				if(shendiao==1){
					hanzi="\n 夫";
				}
				if(shendiao==2){
					hanzi="\n 福";
				}
				if(shendiao==3){
					hanzi="\n 斧";
				}
				if(shendiao==4){
					hanzi="\n 富";
				}
				if(shendiao==5){
					hanzi="\n husband";
				}
				if(shendiao==6){
					hanzi="\n happy";
				}
				if(shendiao==7){
					hanzi="\n axe";
				}
				if(shendiao==8){
					hanzi="\n rich";
				}
			}
			if(pinyino.equals("da")){
				if(shendiao==1){
					hanzi="\n 哒";
				}
				if(shendiao==2){
					hanzi="\n 答";
				}
				if(shendiao==3){
					hanzi="\n 打";
				}
				if(shendiao==4){
					hanzi="\n 大";
				}
				if(shendiao==5){
					hanzi="\n da";
				}
				if(shendiao==6){
					hanzi="\n answer";
				}
				if(shendiao==7){
					hanzi="\n hit";
				}
				if(shendiao==8){
					hanzi="\n big";
				}
			}
			if(pinyino.equals("de")){
				if(shendiao==1){
					hanzi="\n ";
				}
				if(shendiao==2){
					hanzi="\n 德";
				}
				if(shendiao==3){
					hanzi="\n ";
				}
				if(shendiao==4){
					hanzi="\n ";
				}
				if(shendiao==5){
					hanzi="\n ";
				}
				if(shendiao==6){
					hanzi="\n Germany";
				}
				if(shendiao==7){
					hanzi="\n ";
				}
				if(shendiao==8){
					hanzi="\n ";
				}
			}
			if(pinyino.equals("di")){
				if(shendiao==1){
					hanzi="\n 滴";
				}
				if(shendiao==2){
					hanzi="\n 笛";
				}
				if(shendiao==3){
					hanzi="\n 底";
				}
				if(shendiao==4){
					hanzi="\n 弟";
				}
				if(shendiao==5){
					hanzi="\n drip";
				}
				if(shendiao==6){
					hanzi="\n flute";
				}
				if(shendiao==7){
					hanzi="\n botton";
				}
				if(shendiao==8){
					hanzi="\n brother";
				}
			}
			
if(pinyino.equals("du")){	if(shendiao==1){hanzi="\n 都";}if(shendiao==2){hanzi="\n 毒";}if(shendiao==3){hanzi="\n 赌";}if(shendiao==4){hanzi="\n 度";}
						if(shendiao==5){hanzi="\n capital";}if(shendiao==6){hanzi="\n poison";}if(shendiao==7){hanzi="\n gambler";}if(shendiao==8){hanzi="\n degree";}}

if(pinyino.equals("ta")){	if(shendiao==1){hanzi="\n 他";}
						if(shendiao==2){hanzi="\n ";}
						if(shendiao==3){hanzi="\n 塔";}
						if(shendiao==4){hanzi="\n 踏";}
						if(shendiao==5){hanzi="\n he";}
						if(shendiao==6){hanzi="\n ";}
						if(shendiao==7){hanzi="\n tower";}
						if(shendiao==8){hanzi="\n tread";}}

if(pinyino.equals("te")){	
if(shendiao==1){hanzi="\n ";}
if(shendiao==2){hanzi="\n ";}
if(shendiao==3){hanzi="\n ";}
if(shendiao==4){hanzi="\n 特";}
if(shendiao==5){hanzi="\n ";}
if(shendiao==6){hanzi="\n ";}
if(shendiao==7){hanzi="\n ";}
if(shendiao==8){hanzi="\n very";}}

if(pinyino.equals("ti")){	
if(shendiao==1){hanzi="\n 梯";}
if(shendiao==2){hanzi="\n 题";}
if(shendiao==3){hanzi="\n 体";}
if(shendiao==4){hanzi="\n 剃";}
if(shendiao==5){hanzi="\n ladder";}
if(shendiao==6){hanzi="\n question";}
if(shendiao==7){hanzi="\n body";}
if(shendiao==8){hanzi="\n shave";}}

if(pinyino.equals("tu")){	
if(shendiao==1){hanzi="\n 秃";}
if(shendiao==2){hanzi="\n 涂";}
if(shendiao==3){hanzi="\n 土";}
if(shendiao==4){hanzi="\n 吐";}
if(shendiao==5){hanzi="\n bald";}
if(shendiao==6){hanzi="\n smear";}
if(shendiao==7){hanzi="\n earth";}
if(shendiao==8){hanzi="\n vomitus";}}

if(pinyino.equals("na")){	
if(shendiao==1){hanzi="\n ";}
if(shendiao==2){hanzi="\n 拿";}
if(shendiao==3){hanzi="\n 哪";}
if(shendiao==4){hanzi="\n 那";}
if(shendiao==5){hanzi="\n ";}
if(shendiao==6){hanzi="\n catch";}
if(shendiao==7){hanzi="\n where";}
if(shendiao==8){hanzi="\n there";}}

if(pinyino.equals("ne")){	
if(shendiao==1){hanzi="\n 呢";}
if(shendiao==2){hanzi="\n ";}
if(shendiao==3){hanzi="\n ";}
if(shendiao==4){hanzi="\n ";}
if(shendiao==5){hanzi="\n ne";}
if(shendiao==6){hanzi="\n ";}
if(shendiao==7){hanzi="\n ";}
if(shendiao==8){hanzi="\n ";}}

if(pinyino.equals("ni")){	
if(shendiao==1){hanzi="\n ";}
if(shendiao==2){hanzi="\n 泥";}
if(shendiao==3){hanzi="\n 你";}
if(shendiao==4){hanzi="\n 腻";}
if(shendiao==5){hanzi="\n ";}
if(shendiao==6){hanzi="\n mud";}
if(shendiao==7){hanzi="\n you";}
if(shendiao==8){hanzi="\n greasy";}}

if(pinyino.equals("nu")){	
if(shendiao==1){hanzi="\n ";}
if(shendiao==2){hanzi="\n 奴";}
if(shendiao==3){hanzi="\n 努";}
if(shendiao==4){hanzi="\n 怒";}
if(shendiao==5){hanzi="\n ";}
if(shendiao==6){hanzi="\n slave";}
if(shendiao==7){hanzi="\n hardworking";}
if(shendiao==8){hanzi="\n angry";}}

if(pinyino.equals("nü")){	
if(shendiao==1){hanzi="\n ";}
if(shendiao==2){hanzi="\n ";}
if(shendiao==3){hanzi="\n nǚ";}
if(shendiao==4){hanzi="\n ";}
if(shendiao==5){hanzi="\n ";}
if(shendiao==6){hanzi="\n ";}
if(shendiao==7){hanzi="\n 女";}
if(shendiao==8){hanzi="\n ";}}

if(pinyino.equals("la")){	
if(shendiao==1){hanzi="\n ";}
if(shendiao==2){hanzi="\n ";}
if(shendiao==3){hanzi="\n ";}
if(shendiao==4){hanzi="\n ";}
if(shendiao==5){hanzi="\n ";}
if(shendiao==6){hanzi="\n ";}
if(shendiao==7){hanzi="\n ";}
if(shendiao==8){hanzi="\n ";}}

if(pinyino.equals("le")){ 
if(shendiao==1){hanzi="\n 了";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n";}
if(shendiao==4){hanzi="\n 乐";}
if(shendiao==5){hanzi="\n le";}
if(shendiao==6){hanzi="\n";}
if(shendiao==7){hanzi="\n";}
if(shendiao==8){hanzi="\n happy";}}

if(pinyino.equals("li")){ 
if(shendiao==1){hanzi="\n 哩";}
if(shendiao==2){hanzi="\n 离";}
if(shendiao==3){hanzi="\n 里";}
if(shendiao==4){hanzi="\n 力";}
if(shendiao==5){hanzi="\n li";}
if(shendiao==6){hanzi="\n leave";}
if(shendiao==7){hanzi="\n in";}
if(shendiao==8){hanzi="\n power";}} 

if(pinyino.equals("lu")){ 
if(shendiao==1){hanzi="\n 撸";}
if(shendiao==2){hanzi="\n 炉";}
if(shendiao==3){hanzi="\n 掳";}
if(shendiao==4){hanzi="\n 路";}
if(shendiao==5){hanzi="\n lu";}
if(shendiao==6){hanzi="\n furnace";}
if(shendiao==7){hanzi="\n captive";}
if(shendiao==8){hanzi="\n road";}}

if(pinyino.equals("lü")){ 
if(shendiao==1){hanzi="\n";}
if(shendiao==2){hanzi="\n 驴";}
if(shendiao==3){hanzi="\n 铝";}
if(shendiao==4){hanzi="\n 绿";}
if(shendiao==5){hanzi="\n";}
if(shendiao==6){hanzi="\n donkey";}
if(shendiao==7){hanzi="\n aluminum";}
if(shendiao==8){hanzi="\n green";}}

if(pinyino.equals("ga")){ 
if(shendiao==1){hanzi="\n 伽";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n 嘎";}
if(shendiao==4){hanzi="\n 尬";}
if(shendiao==5){hanzi="\n no meaning";}
if(shendiao==6){hanzi="\n";}
if(shendiao==7){hanzi="\n ga";}
if(shendiao==8){hanzi="\n embarrassed";}} 

if(pinyino.equals("ge")){ 
if(shendiao==1){hanzi="\n 哥";}
if(shendiao==2){hanzi="\n 隔";}
if(shendiao==3){hanzi="\n 镉";}
if(shendiao==4){hanzi="\n 个";}
if(shendiao==5){hanzi="\n older brother";}
if(shendiao==6){hanzi="\n partition";}
if(shendiao==7){hanzi="\n ge";}
if(shendiao==8){hanzi="\n individual";}} 

if(pinyino.equals("gu")){ 
if(shendiao==1){hanzi="\n 估";}
if(shendiao==2){hanzi="\n ";}
if(shendiao==3){hanzi="\n 古";}
if(shendiao==4){hanzi="\n 固";}
if(shendiao==5){hanzi="\n estimate";}
if(shendiao==6){hanzi="\n ";}
if(shendiao==7){hanzi="\n ancient";}
if(shendiao==8){hanzi="\n stable";}} 

if(pinyino.equals("ka")){ 
if(shendiao==1){hanzi="\n 咖";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n 卡";}
if(shendiao==4){hanzi="\n";}
if(shendiao==5){hanzi="\n coffee";}
if(shendiao==6){hanzi="\n ";}
if(shendiao==7){hanzi="\n card";}
if(shendiao==8){hanzi="\n ";}} 

if(pinyino.equals("ke")){ 
if(shendiao==1){hanzi="\n 科";}
if(shendiao==2){hanzi="\n 咳";}
if(shendiao==3){hanzi="\n 渴";}
if(shendiao==4){hanzi="\n 客";}
if(shendiao==5){hanzi="\n subject";}
if(shendiao==6){hanzi="\n cough";}
if(shendiao==7){hanzi="\n thirst";}
if(shendiao==8){hanzi="\n guest";}} 

if(pinyino.equals("ku")){ 
if(shendiao==1){hanzi="\n 哭";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n 苦";}
if(shendiao==4){hanzi="\n 酷";}
if(shendiao==5){hanzi="\n cry";}
if(shendiao==6){hanzi="\n ";}
if(shendiao==7){hanzi="\n bitter";}
if(shendiao==8){hanzi="\n cool";}} 

if(pinyino.equals("ha")){ 
if(shendiao==1){hanzi="\n 哈";}
if(shendiao==2){hanzi="\n 蛤";}
if(shendiao==3){hanzi="\n";}
if(shendiao==4){hanzi="\n";}
if(shendiao==5){hanzi="\n ha";}
if(shendiao==6){hanzi="\n clam";}
if(shendiao==7){hanzi="\n";}
if(shendiao==8){hanzi="\n";}} 

if(pinyino.equals("he")){ 
if(shendiao==1){hanzi="\n 呵";}
if(shendiao==2){hanzi="\n 河";}
if(shendiao==3){hanzi="\n";}
if(shendiao==4){hanzi="\n 赫";}
if(shendiao==5){hanzi="\n he";}
if(shendiao==6){hanzi="\n river";}
if(shendiao==7){hanzi="\n";}
if(shendiao==8){hanzi="\n illustrious";}} 

if(pinyino.equals("hu")){ 
if(shendiao==1){hanzi="\n 呼";}
if(shendiao==2){hanzi="\n 湖";}
if(shendiao==3){hanzi="\n";}
if(shendiao==4){hanzi="\n 护";}
if(shendiao==5){hanzi="\n exhale";}
if(shendiao==6){hanzi="\n lake";}
if(shendiao==7){hanzi="\n";}
if(shendiao==8){hanzi="\n protect";}} 

if(pinyino.equals("ji")){ 
if(shendiao==1){hanzi="\n 鸡";}
if(shendiao==2){hanzi="\n 急";}
if(shendiao==3){hanzi="\n 挤";}
if(shendiao==4){hanzi="\n 记";}
if(shendiao==5){hanzi="\n chicken";}
if(shendiao==6){hanzi="\n hurry";}
if(shendiao==7){hanzi="\n squeeze";}
if(shendiao==8){hanzi="\n remember";}} 

if(pinyino.equals("ju")){ 
if(shendiao==1){hanzi="\n 狙";}
if(shendiao==2){hanzi="\n 菊";}
if(shendiao==3){hanzi="\n";}
if(shendiao==4){hanzi="\n 句";}
if(shendiao==5){hanzi="\n snipe";}
if(shendiao==6){hanzi="\n ass";}
if(shendiao==7){hanzi="\n";}
if(shendiao==8){hanzi="\n sentence";}} 

if(pinyino.equals("jia")){ 
if(shendiao==1){hanzi="\n 家";}
if(shendiao==2){hanzi="\n 夹";}
if(shendiao==3){hanzi="\n 假";}
if(shendiao==4){hanzi="\n 嫁";}
if(shendiao==5){hanzi="\n home";}
if(shendiao==6){hanzi="\n clamp";}
if(shendiao==7){hanzi="\n fake";}
if(shendiao==8){hanzi="\n marry";}} 

if(pinyino.equals("qi")){ 
if(shendiao==1){hanzi="\n 七";}
if(shendiao==2){hanzi="\n 奇";}
if(shendiao==3){hanzi="\n 起";}
if(shendiao==4){hanzi="\n 气";}
if(shendiao==5){hanzi="\n seven";}
if(shendiao==6){hanzi="\n strange";}
if(shendiao==7){hanzi="\n rise";}
if(shendiao==8){hanzi="\n air";}} 

if(pinyino.equals("qu")){ 
if(shendiao==1){hanzi="\n 蛆";}
if(shendiao==2){hanzi="\n 渠";}
if(shendiao==3){hanzi="\n 娶";}
if(shendiao==4){hanzi="\n 去";}
if(shendiao==5){hanzi="\n maggot";}
if(shendiao==6){hanzi="\n canal";}
if(shendiao==7){hanzi="\n marry";}
if(shendiao==8){hanzi="\n go";}} 

if(pinyino.equals("qia")){ 
if(shendiao==1){hanzi="\n 掐";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n ";}
if(shendiao==4){hanzi="\n 髂";}
if(shendiao==5){hanzi="\n pinch";}
if(shendiao==6){hanzi="\n";}
if(shendiao==7){hanzi="\n ";}
if(shendiao==8){hanzi="\n ilium";}} 

if(pinyino.equals("xi")){ 
if(shendiao==1){hanzi="\n 西";}
if(shendiao==2){hanzi="\n 习";}
if(shendiao==3){hanzi="\n 喜";}
if(shendiao==4){hanzi="\n 细";}
if(shendiao==5){hanzi="\n west";}
if(shendiao==6){hanzi="\n study";}
if(shendiao==7){hanzi="\n happy";}
if(shendiao==8){hanzi="\n wee";}} 

if(pinyino.equals("xu")){ 
if(shendiao==1){hanzi="\n 需";}
if(shendiao==2){hanzi="\n 许";}
if(shendiao==3){hanzi="\n 栩";}
if(shendiao==4){hanzi="\n 序";}
if(shendiao==5){hanzi="\n need";}
if(shendiao==6){hanzi="\n promise";}
if(shendiao==7){hanzi="\n vivid";}
if(shendiao==8){hanzi="\n preface";}} 

if(pinyino.equals("xia")){ 
if(shendiao==1){hanzi="\n 虾";}
if(shendiao==2){hanzi="\n 侠";}
if(shendiao==3){hanzi="\n";}
if(shendiao==4){hanzi="\n 下";}
if(shendiao==5){hanzi="\n shrimp";}
if(shendiao==6){hanzi="\n chivalrous";}
if(shendiao==7){hanzi="\n";}
if(shendiao==8){hanzi="\n down";}} 


if(pinyino.equals("zha")){ 
if(shendiao==1){hanzi="\n 渣";}
if(shendiao==2){hanzi="\n 闸";}
if(shendiao==3){hanzi="\n";}
if(shendiao==4){hanzi="\n 炸";}
if(shendiao==5){hanzi="\n residue";}
if(shendiao==6){hanzi="\n hoist";}
if(shendiao==7){hanzi="\n";}
if(shendiao==8){hanzi="\n fry";}} 

if(pinyino.equals("zhe")){ 
if(shendiao==1){hanzi="\n 着";}
if(shendiao==2){hanzi="\n 哲";}
if(shendiao==3){hanzi="\n 褶";}
if(shendiao==4){hanzi="\n 浙";}
if(shendiao==5){hanzi="\n worry";}
if(shendiao==6){hanzi="\n philosopy";}
if(shendiao==7){hanzi="\n drape";}
if(shendiao==8){hanzi="\n zhe";}} 

if(pinyino.equals("zhu")){ 
if(shendiao==1){hanzi="\n 猪";}
if(shendiao==2){hanzi="\n 竹";}
if(shendiao==3){hanzi="\n 主";}
if(shendiao==4){hanzi="\n 住";}
if(shendiao==5){hanzi="\n pig";}
if(shendiao==6){hanzi="\n bamboo";}
if(shendiao==7){hanzi="\n host";}
if(shendiao==8){hanzi="\n live";}} 

if(pinyino.equals("cha")){ 
if(shendiao==1){hanzi="\n 插";}
if(shendiao==2){hanzi="\n 查";}
if(shendiao==3){hanzi="\n ";}
if(shendiao==4){hanzi="\n 差";}
if(shendiao==5){hanzi="\n insert";}
if(shendiao==6){hanzi="\n";}
if(shendiao==7){hanzi="\n check";}
if(shendiao==8){hanzi="\n bad";}} 

if(pinyino.equals("che")){ 
if(shendiao==1){hanzi="\n 车";}
if(shendiao==2){hanzi="\n ";}
if(shendiao==3){hanzi="\n 扯";}
if(shendiao==4){hanzi="\n 撤";}
if(shendiao==5){hanzi="\n car";}
if(shendiao==6){hanzi="\n ";}
if(shendiao==7){hanzi="\n pull";}
if(shendiao==8){hanzi="\n retreat";}} 

if(pinyino.equals("chi")){ 
if(shendiao==1){hanzi="\n 吃";}
if(shendiao==2){hanzi="\n 迟";}
if(shendiao==3){hanzi="\n 尺";}
if(shendiao==4){hanzi="\n 赤";}
if(shendiao==5){hanzi="\n eat";}
if(shendiao==6){hanzi="\n late";}
if(shendiao==7){hanzi="\n ruler";}
if(shendiao==8){hanzi="\n red";}} 

if(pinyino.equals("chu")){ 
if(shendiao==1){hanzi="\n 出";}
if(shendiao==2){hanzi="\n 除";}
if(shendiao==3){hanzi="\n 楚";}
if(shendiao==4){hanzi="\n 畜";}
if(shendiao==5){hanzi="\n out";}
if(shendiao==6){hanzi="\n remove";}
if(shendiao==7){hanzi="\n chu";}
if(shendiao==8){hanzi="\n livestock";}} 

if(pinyino.equals("sha")){ 
if(shendiao==1){hanzi="\n 杀";}
if(shendiao==2){hanzi="\n 啥";}
if(shendiao==3){hanzi="\n 傻";}
if(shendiao==4){hanzi="\n 刹";}
if(shendiao==5){hanzi="\n kill";}
if(shendiao==6){hanzi="\n sha";}
if(shendiao==7){hanzi="\n stupid";}
if(shendiao==8){hanzi="\n pause";}} 

if(pinyino.equals("she")){ 
if(shendiao==1){hanzi="\n 奢";}
if(shendiao==2){hanzi="\n 蛇";}
if(shendiao==3){hanzi="\n 舍";}
if(shendiao==4){hanzi="\n 射";}
if(shendiao==5){hanzi="\n luxury";}
if(shendiao==6){hanzi="\n snack";}
if(shendiao==7){hanzi="\n not begrudge";}
if(shendiao==8){hanzi="\n shoot";}} 

if(pinyino.equals("shi")){ 
if(shendiao==1){hanzi="\n 师";}
if(shendiao==2){hanzi="\n 石";}
if(shendiao==3){hanzi="\n 史";}
if(shendiao==4){hanzi="\n 是";}
if(shendiao==5){hanzi="\n teacher";}
if(shendiao==6){hanzi="\n stone";}
if(shendiao==7){hanzi="\n history";}
if(shendiao==8){hanzi="\n be";}} 

if(pinyino.equals("shu")){ 
if(shendiao==1){hanzi="\n 叔";}
if(shendiao==2){hanzi="\n 熟";}
if(shendiao==3){hanzi="\n 数";}
if(shendiao==4){hanzi="\n 树";}
if(shendiao==5){hanzi="\n uncle";}
if(shendiao==6){hanzi="\n ripe";}
if(shendiao==7){hanzi="\n number";}
if(shendiao==8){hanzi="\n tree";}} 

if(pinyino.equals("re")){ 
if(shendiao==1){hanzi="\n";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n 惹";}
if(shendiao==4){hanzi="\n 热";}
if(shendiao==5){hanzi="\n";}
if(shendiao==6){hanzi="\n";}
if(shendiao==7){hanzi="\n offend";}
if(shendiao==8){hanzi="\n hot";}} 

if(pinyino.equals("ri")){ 
if(shendiao==1){hanzi="\n";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n";}
if(shendiao==4){hanzi="\n 日";}
if(shendiao==5){hanzi="\n";}
if(shendiao==6){hanzi="\n";}
if(shendiao==7){hanzi="\n";}
if(shendiao==8){hanzi="\n sun";}} 

if(pinyino.equals("ru")){ 
if(shendiao==1){hanzi="\n";}
if(shendiao==2){hanzi="\n 汝";}
if(shendiao==3){hanzi="\n 乳";}
if(shendiao==4){hanzi="\n 入";}
if(shendiao==5){hanzi="\n";}
if(shendiao==6){hanzi="\n you";}
if(shendiao==7){hanzi="\n milk";}
if(shendiao==8){hanzi="\n in";}} 

if(pinyino.equals("za")){ 
if(shendiao==1){hanzi="\n";}
if(shendiao==2){hanzi="\n 砸";}
if(shendiao==3){hanzi="\n 咋";}
if(shendiao==4){hanzi="\n";}
if(shendiao==5){hanzi="\n";}
if(shendiao==6){hanzi="\n smash";}
if(shendiao==7){hanzi="\n za";}
if(shendiao==8){hanzi="\n";}} 

if(pinyino.equals("ze")){ 
if(shendiao==1){hanzi="\n 啧";}
if(shendiao==2){hanzi="\n 责";}
if(shendiao==3){hanzi="\n";}
if(shendiao==4){hanzi="\n";}
if(shendiao==5){hanzi="\n ze";}
if(shendiao==6){hanzi="\n duty";}
if(shendiao==7){hanzi="\n";}
if(shendiao==8){hanzi="\n";}} 

if(pinyino.equals("zi")){ 
if(shendiao==1){hanzi="\n 资";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n 紫";}
if(shendiao==4){hanzi="\n 字";}
if(shendiao==5){hanzi="\n capital";}
if(shendiao==6){hanzi="\n";}
if(shendiao==7){hanzi="\n purpel";}
if(shendiao==8){hanzi="\n character";}} 

if(pinyino.equals("zu")){ 
if(shendiao==1){hanzi="\n 租";}
if(shendiao==2){hanzi="\n 族";}
if(shendiao==3){hanzi="\n 组";}
if(shendiao==4){hanzi="\n";}
if(shendiao==5){hanzi="\n rent";}
if(shendiao==6){hanzi="\n clan";}
if(shendiao==7){hanzi="\n group";}
if(shendiao==8){hanzi="\n";}} 

if(pinyino.equals("ca")){ 
if(shendiao==1){hanzi="\n 擦";}
if(shendiao==2){hanzi="\n ";}
if(shendiao==3){hanzi="\n ";}
if(shendiao==4){hanzi="\n ";}
if(shendiao==5){hanzi="\n rub";}
if(shendiao==6){hanzi="\n ";}
if(shendiao==7){hanzi="\n ";}
if(shendiao==8){hanzi="\n ";}} 

if(pinyino.equals("ce")){ 
if(shendiao==1){hanzi="\n";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n";}
if(shendiao==4){hanzi="\n 测";}
if(shendiao==5){hanzi="\n";}
if(shendiao==6){hanzi="\n";}
if(shendiao==7){hanzi="\n";}
if(shendiao==8){hanzi="\n test";}} 

if(pinyino.equals("ci")){ 
if(shendiao==1){hanzi="\n 呲";}
if(shendiao==2){hanzi="\n 慈";}
if(shendiao==3){hanzi="\n 此";}
if(shendiao==4){hanzi="\n 刺";}
if(shendiao==5){hanzi="\n open";}
if(shendiao==6){hanzi="\n mercy";}
if(shendiao==7){hanzi="\n this";}
if(shendiao==8){hanzi="\n stab";}} 

if(pinyino.equals("cu")){ 
if(shendiao==1){hanzi="\n 粗";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n";}
if(shendiao==4){hanzi="\n 醋";}
if(shendiao==5){hanzi="\n thick";}
if(shendiao==6){hanzi="\n";}
if(shendiao==7){hanzi="\n";}
if(shendiao==8){hanzi="\n vinegar";}} 

if(pinyino.equals("sa")){ 
if(shendiao==1){hanzi="\n 仨";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n 撒";}
if(shendiao==4){hanzi="\n 飒";}
if(shendiao==5){hanzi="\n three";}
if(shendiao==6){hanzi="\n";}
if(shendiao==7){hanzi="\n splash";}
if(shendiao==8){hanzi="\n withered";}} 

if(pinyino.equals("se")){ 
if(shendiao==1){hanzi="\n";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n";}
if(shendiao==4){hanzi="\n 色";}
if(shendiao==5){hanzi="\n";}
if(shendiao==6){hanzi="\n";}
if(shendiao==7){hanzi="\n";}
if(shendiao==8){hanzi="\n pornographic";}} 

if(pinyino.equals("si")){ 
if(shendiao==1){hanzi="\n 斯";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n 死";}
if(shendiao==4){hanzi="\n 寺";}
if(shendiao==5){hanzi="\n you";}
if(shendiao==6){hanzi="\n";}
if(shendiao==7){hanzi="\n die";}
if(shendiao==8){hanzi="\n temple";}} 

if(pinyino.equals("su")){ 
if(shendiao==1){hanzi="\n 苏";}
if(shendiao==2){hanzi="\n 俗";}
if(shendiao==3){hanzi="\n";}
if(shendiao==4){hanzi="\n 速";}
if(shendiao==5){hanzi="\n su";}
if(shendiao==6){hanzi="\n custom";}
if(shendiao==7){hanzi="\n";}
if(shendiao==8){hanzi="\n quick";}} 

if(pinyino.equals("ya")){ 
if(shendiao==1){hanzi="\n 压";}
if(shendiao==2){hanzi="\n 牙";}
if(shendiao==3){hanzi="\n 雅";}
if(shendiao==4){hanzi="\n 亚";}
if(shendiao==5){hanzi="\n press";}
if(shendiao==6){hanzi="\n teeth";}
if(shendiao==7){hanzi="\n elegent";}
if(shendiao==8){hanzi="\n second";}} 

if(pinyino.equals("ye")){ 
if(shendiao==1){hanzi="\n 椰";}
if(shendiao==2){hanzi="\n 爷";}
if(shendiao==3){hanzi="\n 也";}
if(shendiao==4){hanzi="\n 叶";}
if(shendiao==5){hanzi="\n coconut";}
if(shendiao==6){hanzi="\n grandfather";}
if(shendiao==7){hanzi="\n also";}
if(shendiao==8){hanzi="\n leaf";}} 

if(pinyino.equals("yi")){ 
if(shendiao==1){hanzi="\n 一";}
if(shendiao==2){hanzi="\n 姨";}
if(shendiao==3){hanzi="\n 以";}
if(shendiao==4){hanzi="\n 意";}
if(shendiao==5){hanzi="\n one";}
if(shendiao==6){hanzi="\n aunt";}
if(shendiao==7){hanzi="\n according to";}
if(shendiao==8){hanzi="\n meaning";}} 

if(pinyino.equals("yu")){ 
if(shendiao==1){hanzi="\n 淤";}
if(shendiao==2){hanzi="\n 鱼";}
if(shendiao==3){hanzi="\n 雨";}
if(shendiao==4){hanzi="\n 遇";}
if(shendiao==5){hanzi="\n mut";}
if(shendiao==6){hanzi="\n fish";}
if(shendiao==7){hanzi="\n rain";}
if(shendiao==8){hanzi="\n meet";}} 

if(pinyino.equals("wa")){ 
if(shendiao==1){hanzi="\n 蛙";}
if(shendiao==2){hanzi="\n 娃";}
if(shendiao==3){hanzi="\n 瓦";}
if(shendiao==4){hanzi="\n 哇";}
if(shendiao==5){hanzi="\n frog";}
if(shendiao==6){hanzi="\n kid";}
if(shendiao==7){hanzi="\n tite";}
if(shendiao==8){hanzi="\n wa";}} 

if(pinyino.equals("wo")){ 
if(shendiao==1){hanzi="\n 窝";}
if(shendiao==2){hanzi="\n";}
if(shendiao==3){hanzi="\n 我";}
if(shendiao==4){hanzi="\n 卧";}
if(shendiao==5){hanzi="\n nest";}
if(shendiao==6){hanzi="\n";}
if(shendiao==7){hanzi="\n I";}
if(shendiao==8){hanzi="\n lie down";}} 

if(pinyino.equals("wu")){ 
if(shendiao==1){hanzi="\n 污";}
if(shendiao==2){hanzi="\n 无";}
if(shendiao==3){hanzi="\n 捂";}
if(shendiao==4){hanzi="\n 误";}
if(shendiao==5){hanzi="\n dirt";}
if(shendiao==6){hanzi="\n none";}
if(shendiao==7){hanzi="\n cover";}
if(shendiao==8){hanzi="\n mistake";}} 






if(pinyino.equals("la")){	
if(shendiao==1){hanzi="\n 拉";}
if(shendiao==2){hanzi="\n ";}
if(shendiao==3){hanzi="\n ";}
if(shendiao==4){hanzi="\n 辣";}
if(shendiao==5){hanzi="\n pull";}
if(shendiao==6){hanzi="\n ";}
if(shendiao==7){hanzi="\n ";}
if(shendiao==8){hanzi="\n spicy";}}
	

			
		
		return hanzi;
	}
	public static String shendiao(String pinyino,int shendiao){

		String pinyin=pinyino;
		String str=pinyino;
		str=str.substring(str.length()-1,str.length());
		pinyin = pinyin.substring(0,pinyin.length() - 1);
		if(str.equals("a")){
			if(shendiao==1){
				str="ā";
			}
			if(shendiao==2){
				str="á";
			}
			if(shendiao==3){
				str="ǎ";
			}
			if(shendiao==4){
				str="à";
			}
		}
		if(str.equals("o")){
			if(shendiao==1){
				str="ō";
			}
			if(shendiao==2){
				str="ó";
			}
			if(shendiao==3){
				str="ǒ";
			}
			if(shendiao==4){
				str="ò";
			}
		}
		if(str.equals("e")){
			if(shendiao==1){
				str="ē";
			}
			if(shendiao==2){
				str="é";
			}
			if(shendiao==3){
				str="ě";
			}
			if(shendiao==4){
				str="è";
			}
		}
		if(str.equals("i")){
			if(shendiao==1){
				str="ī";
			}
			if(shendiao==2){
				str="í";
			}
			if(shendiao==3){
				str="ǐ";
			}
			if(shendiao==4){
				str="ì";
			}
		}
		if(str.equals("u")){
			if(shendiao==1){
				str="ū";
			}
			if(shendiao==2){
				str="ú";
			}
			if(shendiao==3){
				str="ǔ";
			}
			if(shendiao==4){
				str="ù";
			}
		}
		if(str.equals("ü")){
			if(shendiao==1){
				str="ǖ";
			}
			if(shendiao==2){
				str="ǘ";
			}
			if(shendiao==3){
				str="ǚ";
			}
			if(shendiao==4){
				str="ǜ";
			}
		}
		pinyin=pinyin+str;
		return pinyin;
		
	}
}
