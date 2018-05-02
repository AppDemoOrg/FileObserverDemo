package com.abt.fileobserver.sample;

import android.os.FileObserver;
import com.orhanobut.logger.Logger;

/**
 * @描述： @SD卡中的目录创建监听器
 * @作者： @黄卫旗
 * @创建时间： @2018/5/2
 */
public class SDCardListener extends FileObserver {

    public SDCardListener(String path) {
        /**
        * 这种构造方法是默认监听所有事件的,如果使用 super(String,int)这种构造方法，
        * 则int参数是要监听的事件类型.
        */
        super(path);
    }

    @Override
    public void onEvent(int event, String path) {
        switch(event) {
            case FileObserver.ALL_EVENTS:
                Logger.d( "all path:"+ path);
                break;
            case FileObserver.CREATE:
                Logger.d( "create path:"+ path);
                break;
        }
    }
}