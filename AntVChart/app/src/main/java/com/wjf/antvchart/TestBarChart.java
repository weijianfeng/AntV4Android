package com.wjf.antvchart;

import android.app.Activity;
import android.os.Bundle;

import com.wjf.antvlibrary.ui.g2mobile.AntVMobileBar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weijianfeng on 2017/3/27.
 */

public class TestBarChart extends Activity {

    private AntVMobileBar mAntVMobileBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barchart);

        mAntVMobileBar = (AntVMobileBar) findViewById(R.id.chart);

        List<String> x = new ArrayList<>();
        x.add("a");
        x.add("b");
        x.add("c");

        List<Integer> y = new ArrayList<>();
        y.add(10);
        y.add(20);
        y.add(30);

        mAntVMobileBar.setX(x).setY(y).draw();
    }

}
