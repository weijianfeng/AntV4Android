package com.wjf.antvchart;

import android.app.Activity;
import android.os.Bundle;

import com.wjf.antvlibrary.ui.g2.AntVMultiPie;

/**
 * Created by weijianfeng on 2017/4/12.
 */

public class TestMultiPie extends Activity {

    private AntVMultiPie mAntVMultiPie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multipie);
        mAntVMultiPie = (AntVMultiPie)findViewById(R.id.chart);
        mAntVMultiPie.draw();
    }
}
