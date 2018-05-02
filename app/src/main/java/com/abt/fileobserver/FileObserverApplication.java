package com.abt.fileobserver;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * @描述： @FileObserverApplication
 * @作者： @黄卫旗
 * @创建时间： @2018/5/2
 */
public class FileObserverApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

}
