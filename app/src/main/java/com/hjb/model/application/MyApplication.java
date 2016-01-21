package com.hjb.model.application;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * Created by hjb on 2016/1/13.
 */
public class MyApplication extends Application {
    private static Context mContext;
    private static Handler handler;
    private static Thread mainThread;
    private static int mainThreadId;
    @Override
    public void onCreate() {
        super.onCreate();
        //handler,Context,主线程,主线程id
        mContext = getApplicationContext();
        handler = new Handler();
        mainThread = Thread.currentThread();
        //获取当前线程的id,当前线程主线程
        mainThreadId = android.os.Process.myTid();

    }

    public static Context getContext() {
        return mContext;
    }

    public static Handler getHandler() {
        return handler;
    }

    public static Thread getMainThread() {
        return mainThread;
    }

    public static int getMainThreadId() {
        return mainThreadId;
    }
}
