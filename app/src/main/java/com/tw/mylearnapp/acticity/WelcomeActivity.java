package com.tw.mylearnapp.acticity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.tw.mylearnapp.MainActivity;
import com.tw.mylearnapp.R;
import java.util.Timer;

public class WelcomeActivity extends Activity {

    int time = 4;

    private Handler mhandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message message) {
            switch (message.what) {
                case 100:
                    mhandler.removeMessages(100);
                    if (time == 0){
                        Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                    textView.setText(""+(time--));
                    mhandler.sendEmptyMessageDelayed(100, 1000);
                    break;
            }
            return false;
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * setGravity     : 设置吐司位置
         * setBgColor     : 设置背景颜色
         * setBgResource  : 设置背景资源
         * setMsgColor: 设置消息颜色
         * showShort      : 显示短时吐司
         * showLong       : 显示长时吐司
         * showCustomShort: 显示短时自定义吐司
         * showCustomLong : 显示长时自定义吐司
         * cancel         : 取消吐司显示
         */
//        ToastUtils.showShort("启动开始界面");
//        ToastUtils.setGravity(Gravity.LEFT, 100, 100);
//        ToastUtils.setBgResource(R.mipmap.bg_pressed);
//        ToastUtils.setMsgColor(R.color.colorPrimary);
        setContentView(R.layout.wclcome_layout);
        textView = findViewById(R.id.welcome_tv);
        welcome_im = findViewById(R.id.welcome_im);
        Glide.with(this).load(R.mipmap.welcome_gif).asGif().into(welcome_im);
        mhandler.sendEmptyMessage(100);
    }
    TextView textView;
    ImageView welcome_im;
}
