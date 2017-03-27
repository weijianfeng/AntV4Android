package com.wjf.antvchart;

import android.app.Activity;
import android.os.Bundle;

import com.wjf.antvlibrary.ui.AntVMobileLine;

/**
 * Created by weijianfeng on 2017/3/27.
 */

public class TestLineChart extends Activity{

    private AntVMobileLine mAntVMobileLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linechart);
        mAntVMobileLine = (AntVMobileLine)findViewById(R.id.chart);

        mAntVMobileLine.loadUrl("file:///android_asset/line.html");
    }
}
