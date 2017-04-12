package com.wjf.antvchart;

import android.app.Activity;
import android.os.Bundle;

import com.wjf.antvlibrary.ui.AntVMobileLine;
import com.wjf.antvlibrary.ui.AntVMultiPie;

/**
 * Created by weijianfeng on 2017/4/12.
 */

public class TestPieChart extends Activity {

    private AntVMultiPie mAntVMultiPie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piechart);
        mAntVMultiPie = (AntVMultiPie)findViewById(R.id.chart);

        mAntVMultiPie.draw();
    }
}
