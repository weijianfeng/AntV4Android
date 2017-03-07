package com.wjf.antvchart.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.wjf.antvchart.jsbridge.BridgeWebView;

/**
 * Created by weijianfeng on 2017/3/7.
 */

public class AntVWebView extends BridgeWebView {

    public AntVWebView(Context context) {
        super(context);
        initWebSettings();
    }

    public AntVWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initWebSettings();
    }

    public AntVWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initWebSettings();
    }

    public void initWebSettings() {
        final WebSettings webSettings = this.getSettings();

        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        webSettings.setAppCacheEnabled(true);
//        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setLoadsImagesAutomatically(true);

        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);

        webSettings.setSavePassword(false);
        webSettings.setSaveFormData(false);

        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);

        webSettings.setSupportZoom(true);
        //webSettings.setBuiltInZoomControls(false);
    }
}
