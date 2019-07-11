package com.tw.mylearnapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.blankj.utilcode.util.BarUtils;
import com.tw.mylearnapp.acticity.BaseActivity;
import com.tw.mylearnapp.adapter.myReGirdAdpater;
import com.tw.mylearnapp.adapter.myReLinAdpater;
import com.tw.mylearnapp.view.RecyclerViewSpaceDividerItemDecoration;

public class MainActivity extends BaseActivity {
    private RecyclerView mRv_grid,mRv_lin;
    private myReGirdAdpater myGridAdapter;
    private myReLinAdpater myLinAdapter;


    @Override
    protected void initView() {
        mRv_grid = findViewById(R.id.re_grid);
        mRv_grid.setLayoutManager(new GridLayoutManager(this, 5));
        mRv_grid.addItemDecoration(new RecyclerViewSpaceDividerItemDecoration(getResources().getDimensionPixelOffset(R.dimen.recyclecspace)));
        mRv_grid.setNestedScrollingEnabled(false);//解决滑动冲突
        myGridAdapter = new myReGirdAdpater(this);
        mRv_grid.setAdapter(myGridAdapter);

        mRv_lin = findViewById(R.id.re_lin);
        mRv_lin.setLayoutManager(new LinearLayoutManager(this));
        mRv_lin.addItemDecoration(new RecyclerViewSpaceDividerItemDecoration(getResources().getDimensionPixelOffset(R.dimen.recyclecspace)));
        mRv_lin.setNestedScrollingEnabled(false);
        myLinAdapter = new myReLinAdpater(this,mRv_lin);
        mRv_lin.setAdapter(myLinAdapter);
    }

    @Override
    public int getContentView() {
        return R.layout.activity_main;
    }
}
