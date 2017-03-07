package com.wjf.antvchart.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.google.gson.Gson;
import com.wjf.antvchart.jsbridge.CallBackFunction;
import com.wjf.antvchart.jsbridge.DefaultHandler;
import com.wjf.antvchart.ui.entity.AntVMobileChartEntity;
import com.wjf.antvchart.webview.AntVWebView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weijianfeng on 2017/3/7.
 */

public class AntVMobileChart extends AntVWebView {

    private List<String> AxisX = new ArrayList<>();
    private List<Integer> AxisY = new ArrayList<>();
    private int Color = 0;
    private String data;

    public AntVMobileChart(Context context) {
        super(context);
    }

    public AntVMobileChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AntVMobileChart(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public AntVMobileChart setX(List<String> axisX) {
        this.AxisX = axisX;
        return this;
    }

    public AntVMobileChart setY(List<Integer> axisY) {
        this.AxisY = axisY;
        return this;
    }

    public AntVMobileChart setData(String data) {
        this.data = data;
        return this;
    }

    public AntVMobileChart draw () {

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
        return this;
    }
}
