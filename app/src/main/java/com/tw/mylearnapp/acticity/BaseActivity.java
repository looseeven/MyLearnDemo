package com.tw.mylearnapp.acticity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.blankj.utilcode.util.BarUtils;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BarUtils.setStatusBarAlpha(this,0); //状态栏透明度
        setContentView(getContentView());
        initView();
    }

    protected void initView() {

    }


    public abstract int getContentView();

    protected <T extends View> T fd(int id){
        return  findViewById(id);
    }
}
