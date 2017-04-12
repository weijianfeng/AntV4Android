package com.wjf.antvlibrary.ui.g2mobile;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import com.google.gson.Gson;
import com.wjf.antvlibrary.jsbridge.CallBackFunction;
import com.wjf.antvlibrary.jsbridge.DefaultHandler;
import com.wjf.antvlibrary.ui.AntVChartFunc;
import com.wjf.antvlibrary.ui.entity.AntVMobileChartEntity;
import com.wjf.antvlibrary.webview.AntVWebView;

import java.util.List;

/**
 * Created by weijianfeng on 2017/3/27.
 */

public class AntVMobileLine extends AntVWebView implements AntVChartFunc {

    private List<AntVMobileChartEntity> dataList;

    public AntVMobileLine(Context context) {
        super(context);
    }

    public AntVMobileLine(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AntVMobileLine(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public AntVMobileLine setData(List<AntVMobileChartEntity> dataList) {
        this.dataList = dataList;
        return this;
    }

    @Override
    public void draw() {
        String data = new Gson().toJson(this.dataList);

        this.setDefaultHandler(new DefaultHandler());
        this.callHandler("functionInJs", data, new CallBackFunction() {
            @Override
            public void onCallBack(String data) {
                Log.i("AntVMobileLine", "reponse data from js " + data);
            }
        });

        this.loadUrl("file:///android_asset/line.html");
    }


}
