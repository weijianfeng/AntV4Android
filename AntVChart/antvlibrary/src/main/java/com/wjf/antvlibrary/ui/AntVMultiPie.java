package com.wjf.antvlibrary.ui;

import android.content.Context;
import android.util.AttributeSet;

import com.wjf.antvlibrary.webview.AntVWebView;

/**
 * Created by weijianfeng on 2017/4/12.
 */

public class AntVMultiPie extends AntVWebView implements AntVChartFunc{

    public AntVMultiPie(Context context) {
        super(context);
    }

    public AntVMultiPie(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AntVMultiPie(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void draw() {
        this.loadUrl("file:///android_asset/pie.html");
    }
}
