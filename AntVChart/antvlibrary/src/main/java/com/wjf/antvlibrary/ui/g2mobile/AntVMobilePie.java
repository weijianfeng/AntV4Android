package com.wjf.antvlibrary.ui.g2mobile;

import android.content.Context;
import android.util.AttributeSet;

import com.wjf.antvlibrary.ui.AntVChartFunc;
import com.wjf.antvlibrary.webview.AntVWebView;

/**
 * Created by weijianfeng on 2017/4/12.
 */

public class AntVMobilePie extends AntVWebView implements AntVChartFunc {

    public AntVMobilePie(Context context) {
        super(context);
    }

    public AntVMobilePie(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AntVMobilePie(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void draw() {
        this.loadUrl("file:///android_asset/pie.html");
    }
}
