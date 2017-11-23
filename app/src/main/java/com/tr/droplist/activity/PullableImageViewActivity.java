package com.tr.droplist.activity;


import android.app.Activity;
import android.os.Bundle;

import com.tr.droplist.R;
import com.tr.droplist.utils.PullToRefreshLayout;

public class PullableImageViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);
        ((PullToRefreshLayout) findViewById(R.id.refresh_view)).setOnRefreshListener(new MyListener());
    }
}
