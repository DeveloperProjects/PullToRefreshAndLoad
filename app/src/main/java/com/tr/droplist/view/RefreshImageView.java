package com.tr.droplist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.tr.droplist.impl.Refresh;

public class RefreshImageView extends ImageView implements Refresh {

    public RefreshImageView(Context context) {
        super(context);
    }

    public RefreshImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RefreshImageView(Context context, AttributeSet attrs, int defStyle) {
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
