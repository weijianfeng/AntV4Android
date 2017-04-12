package com.wjf.antvchart;

import android.app.Activity;
import android.os.Bundle;

import com.wjf.antvlibrary.ui.g2mobile.AntVMobileLine;
import com.wjf.antvlibrary.ui.entity.AntVMobileChartEntity;

import java.util.ArrayList;
import java.util.List;

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

        List<AntVMobileChartEntity> list = new ArrayList<>();
        list.add(new AntVMobileChartEntity("2016-08-08 00:00:00", 10));
        list.add(new AntVMobileChartEntity("2016-08-08 00:10:00", 22));
        list.add(new AntVMobileChartEntity("2016-08-08 00:30:00", 20));
        list.add(new AntVMobileChartEntity("2016-08-09 00:35:00", 26));
        list.add(new AntVMobileChartEntity("2016-08-09 01:00:00", 20));
        list.add(new AntVMobileChartEntity("2016-08-09 01:20:00", 26));
        list.add(new AntVMobileChartEntity("2016-08-10 01:40:00", 28));
        list.add(new AntVMobileChartEntity("2016-08-10 02:00:00", 20));
        list.add(new AntVMobileChartEntity("2016-08-10 02:20:00", 28));

        mAntVMobileLine.setData(list).draw();

    }
}
