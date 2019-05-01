package com.example.sample;


import com.example.tergel.MainActivity;
import com.example.tergel.R;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

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
import com.example.speakdemo.SpeakWord;
import com.example.tergel.MainActivity;
import com.example.tergel.R;
import com.xiaos.adapter.PinnedHeaderExpandableAdapter;
import com.xiaos.view.PinnedHeaderExpandableListView;

public class WidgetProvider extends AppWidgetProvider {
    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        super.onDeleted(context, appWidgetIds);
        //widget被从屏幕移除
    }

    @Override
    public void onDisabled(Context context) {
        super.onDisabled(context);
        //最后一个widget被从屏幕移除
        context.stopService(new Intent(context,SpeakWord.class));
    }

    @Override
    public void onEnabled(Context context) {
        super.onEnabled(context);
        //widget添加到屏幕上执行
        context.startService(new Intent(context,SpeakWord.class));
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
      
        Intent intent = new Intent(context,SpeakWord.class);
        intent.putExtra("waimian","");
        //Intent fullIntent=new Intent(context,MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);  
        RemoteViews remoteViews=new RemoteViews(context.getPackageName(), R.layout.widget);
        remoteViews.setOnClickPendingIntent(R.id.ivIcon, pendingIntent);
        appWidgetManager.updateAppWidget(appWidgetIds, remoteViews);
       

        //刷新的时候执行widget
        //remoteView  AppWidgetManager
    }
}