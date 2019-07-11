package com.tw.mylearnapp.view;

import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewSpaceDividerItemDecoration extends RecyclerView.ItemDecoration {
    int mSpace;
    public RecyclerViewSpaceDividerItemDecoration(int space){
        mSpace = space;
    }

    /**
     *
     * @param outRect 边距
     * @param view itemView
     * @param parent RecyclerView
     * @param state RecyclerView状态
     */
    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.left = mSpace;
        outRect.bottom = mSpace;
        outRect.right = mSpace;

        //判断item是否为每行第一个item
        if(parent.getChildLayoutPosition(view) % 5 == 0){
//            outRect.left = 0;
        }

        //view margin
        //margin 为正 Vie会距离边界相距一个距离
        //margin 为负 view会超出边界一个距离
//        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) parent.getLayoutParams();
//        layoutParams.leftMargin = - mSpace;
//        parent.setLayoutManager(layoutParams);
    }
}
