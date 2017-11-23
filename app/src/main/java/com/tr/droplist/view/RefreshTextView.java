package com.tr.droplist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.tr.droplist.impl.Refresh;

public class RefreshTextView extends TextView implements Refresh {

    public RefreshTextView(Context context) {
        super(context);
    }

    public RefreshTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RefreshTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean canPullDown() {
        return true;
    }

    @Override
    public boolean canPullUp() {
        return true;
    }

}
