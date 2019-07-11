package com.tw.mylearnapp.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tw.mylearnapp.R;

public class myReLinAdpater extends RecyclerView.Adapter<myReLinAdpater.ViewHolder> {

    Context mContext;
    private View itemView;
    private RecyclerView mRv;
    private boolean isHeigth = false;

    public myReLinAdpater(Context context, RecyclerView recyclerView) {
        mContext = context;
        mRv = recyclerView;
    }

    /**
     * 1.获取itemview高度
     * 2.获取数量
     * 3.itemview高度*数量
     */
    private void setReViewHigth() {
        if(isHeigth || mRv == null) return;
        isHeigth = true;
        RecyclerView.LayoutParams itemrp = (RecyclerView.LayoutParams) itemView.getLayoutParams();
        int itemcount = getItemCount();
        int reviewHeight = itemcount * itemrp.height;
        //设置review高度
        LinearLayout.LayoutParams relp = (LinearLayout.LayoutParams) mRv.getLayoutParams();
        relp.height = reviewHeight;
        mRv.setLayoutParams(relp);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemView = LayoutInflater.from(mContext).inflate(R.layout.re_lin_item_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        setReViewHigth();
    }

    @Override
    public int getItemCount() {
        return 8;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
