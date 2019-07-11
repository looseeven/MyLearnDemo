package com.tw.mylearnapp;

import android.content.Context;
import com.blankj.utilcode.util.Utils;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this); //初始化AndroidUtilsCode库
    }
}
