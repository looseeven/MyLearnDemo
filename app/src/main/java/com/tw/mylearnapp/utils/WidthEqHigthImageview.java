package com.tw.mylearnapp.utils;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

public class WidthEqHigthImageview extends AppCompatImageView {
    public WidthEqHigthImageview(Context context) {
        super(context);
    }

    public WidthEqHigthImageview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WidthEqHigthImageview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
