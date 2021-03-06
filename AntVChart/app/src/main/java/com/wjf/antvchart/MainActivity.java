package com.wjf.antvchart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> data = new ArrayList<>();
        data.add("Bar Chart");
        data.add("Line Chart");
        data.add("Pie Chart");
        data.add("**CustomBar Chart");
        data.add("**MultiPie Chart");

        mListView = (ListView) findViewById(R.id.list);
        mListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data));

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(MainActivity.this, TestBarChart.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, TestLineChart.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, TestPieChart.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, TestCustomBar.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(MainActivity.this, TestMultiPie.class);
                        startActivity(intent4);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
