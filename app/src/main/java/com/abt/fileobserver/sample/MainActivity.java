package com.abt.fileobserver.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private SDCardListener mListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        listenDir("/sdcard/DCIM/");
    }

    private void listenDir(String path) {
        mListener = new SDCardListener(path);
        //开始监听
        mListener.startWatching();
        /*
         * 在这里做一些操作，比如创建目录什么的
         */
    }

    @Override
    protected void onStop() {
        super.onStop();
        //停止监听
        mListener.stopWatching();
    }
}
