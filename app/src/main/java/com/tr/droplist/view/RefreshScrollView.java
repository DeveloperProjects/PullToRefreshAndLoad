package com.tr.droplist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

import com.tr.droplist.impl.Refresh;

public class RefreshScrollView extends ScrollView implements Refresh {

    public RefreshScrollView(Context context) {
        super(context);
    }

    public RefreshScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RefreshScrollView(Context context, AttributeSet attrs, int defStyle) {
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
        if (getScrollY() >= (getChildAt(0).getHeight() - getMeasuredHeight()))
            return true;
        else
            return false;
    }

}
