package com.wjf.antvchart;

import android.app.Activity;
import android.os.Bundle;

import com.wjf.antvlibrary.ui.g2mobile.AntVMobilePie;

/**
 * Created by weijianfeng on 2017/4/12.
 */

public class TestPieChart extends Activity {

    private AntVMobilePie mAntVMobilePie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piechart);
        mAntVMobilePie = (AntVMobilePie)findViewById(R.id.chart);
        mAntVMobilePie.draw();
    }
}
