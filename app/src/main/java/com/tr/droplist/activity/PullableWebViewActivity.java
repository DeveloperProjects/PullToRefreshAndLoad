package com.tr.droplist.activity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.tr.droplist.R;
import com.tr.droplist.utils.PullToRefreshLayout;

public class PullableWebViewActivity extends Activity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        ((PullToRefreshLayout) findViewById(R.id.refresh_view)).setOnRefreshListener(new MyListener());
        webView = (WebView) findViewById(R.id.content_view);
        webView.loadUrl("http://blog.csdn.net/zhongkejingwang");
    }
}
