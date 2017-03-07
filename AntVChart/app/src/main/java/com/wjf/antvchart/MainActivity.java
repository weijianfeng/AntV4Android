package com.wjf.antvchart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.wjf.antvchart.ui.AntVMobileChart;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AntVMobileChart mAntVMobileChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAntVMobileChart = (AntVMobileChart) findViewById(R.id.chart);

        List<String> x = new ArrayList<>();
        x.add("a");
        x.add("b");
        x.add("c");

        List<Integer> y = new ArrayList<>();
        y.add(10);
        y.add(20);
        y.add(30);

        mAntVMobileChart.setX(x).setY(y).draw();
    }
}
