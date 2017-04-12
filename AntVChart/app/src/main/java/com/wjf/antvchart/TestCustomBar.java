package com.wjf.antvchart;

import android.app.Activity;
import android.os.Bundle;

import com.wjf.antvlibrary.ui.g2.AntVCustomBar;
import com.wjf.antvlibrary.ui.g2mobile.AntVMobilePie;

/**
 * Created by weijianfeng on 2017/4/12.
 */

public class TestCustomBar extends Activity {

    private AntVCustomBar mAntVCustomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custombar);
        mAntVCustomBar = (AntVCustomBar)findViewById(R.id.chart);
        mAntVCustomBar.draw();
    }
}
