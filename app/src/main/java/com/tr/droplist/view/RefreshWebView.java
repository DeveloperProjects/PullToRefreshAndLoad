package com.tr.droplist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

import com.tr.droplist.impl.Refresh;

public class RefreshWebView extends WebView implements Refresh {

    public RefreshWebView(Context context) {
        super(context);
    }

    public RefreshWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RefreshWebView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean canPullDown() {
        if (getScrollY() == 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean canPullUp() {
        if (getScrollY() >= getContentHeight() * getScale() - getMeasuredHeight())
            return true;
        else
            return false;
    }
}
