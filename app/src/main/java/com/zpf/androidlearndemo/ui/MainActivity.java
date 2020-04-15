package com.zpf.androidlearndemo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.zpf.androidlearndemo.R;
import com.zpf.androidlearndemo.ui.adapter.MainListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ListView listView = findViewById(R.id.listview_main);
        MainListAdapter.MainItem item = new MainListAdapter.MainItem(R.drawable.img_viewpaper, "ViewPaper 示例");
        List<MainListAdapter.MainItem> list = new ArrayList<>();
        list.add(item);
        MainListAdapter adapter = new MainListAdapter(this, R.layout.listview_main, list);
        listView.setAdapter(adapter);
    }
}
