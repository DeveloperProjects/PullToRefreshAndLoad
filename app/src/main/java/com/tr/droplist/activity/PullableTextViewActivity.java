package com.tr.droplist.activity;

import android.app.Activity;
import android.os.Bundle;

import com.tr.droplist.R;
import com.tr.droplist.utils.PullToRefreshLayout;

public class PullableTextViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);
        ((PullToRefreshLayout) findViewById(R.id.refresh_view)).setOnRefreshListener(new MyListener());
    }
}
