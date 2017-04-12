package com.wjf.antvlibrary.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import com.google.gson.Gson;
import com.wjf.antvlibrary.jsbridge.CallBackFunction;
import com.wjf.antvlibrary.jsbridge.DefaultHandler;
import com.wjf.antvlibrary.ui.entity.AntVMobileChartEntity;
import com.wjf.antvlibrary.webview.AntVWebView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weijianfeng on 2017/3/7.
 */

public class AntVMobileBar extends AntVWebView implements AntVChartFunc{

    private List<String> AxisX = new ArrayList<>();
    private List<Integer> AxisY = new ArrayList<>();
    private String data;

    public AntVMobileBar(Context context) {
        super(context);
    }

    public AntVMobileBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AntVMobileBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public AntVMobileBar setX(List<String> axisX) {
        this.AxisX = axisX;
        return this;
    }

    public AntVMobileBar setY(List<Integer> axisY) {
        this.AxisY = axisY;
        return this;
    }

    @Deprecated
    public AntVMobileBar setData(String data) {
        this.data = data;
        return this;
    }

    @Override
    public void draw () {
        List<AntVMobileChartEntity> list = new ArrayList<>();
        int size = AxisX.size();
        for (int i = 0; i < size; i++) {
            list.add(new AntVMobileChartEntity(AxisX.get(i), AxisY.get(i)));
        }

        String data = new Gson().toJson(list);

        this.setDefaultHandler(new DefaultHandler());
        this.callHandler("functionInJs", data, new CallBackFunction() {
            @Override
            public void onCallBack(String data) {
                Log.i("AntVMobileChart", "reponse data from js " + data);
            }
        });

        this.loadUrl("file:///android_asset/bar.html");
    }
}
