package com.tr.droplist.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.tr.droplist.R;
import com.tr.droplist.adapter.ViewAdapter;
import com.tr.droplist.impl.MyListener;
import com.tr.droplist.utils.PullToRefreshLayout;

public class MainActivity extends Activity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((PullToRefreshLayout) findViewById(R.id.refresh_view)).setOnRefreshListener((PullToRefreshLayout.OnRefreshListener) new MyListener());
        listView = (ListView) findViewById(R.id.content_view);
        initListView();
    }

    /**
     * ListView初始化方法
     */
    private void initListView() {
        List<String> items = new ArrayList<String>();
        items.add("Refresh ListView");
        items.add("Refresh GridView");
        items.add("Refresh ExpandableListView");
        items.add("Refresh SrcollView");
        items.add("Refresh WebView");
        items.add("Refresh ImageView");
        items.add("Refresh TextView");

        ViewAdapter adapter = new ViewAdapter(this, items);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, " LongClick on " + parent.getAdapter().getItemId(position),
                        Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent it = new Intent();
                switch (position) {
                    case 0:
                        it.setClass(MainActivity.this, RefreshListViewActivity.class);
                        break;
                    case 1:
                        it.setClass(MainActivity.this, RefreshGridViewActivity.class);
                        break;
                    case 2:
                        it.setClass(MainActivity.this, RefreshExpandableListViewActivity.class);
                        break;
                    case 3:
                        it.setClass(MainActivity.this, RefreshScrollViewActivity.class);
                        break;
                    case 4:
                        it.setClass(MainActivity.this, RefreshWebViewActivity.class);
                        break;
                    case 5:
                        it.setClass(MainActivity.this, RefreshImageViewActivity.class);
                        break;
                    case 6:
                        it.setClass(MainActivity.this, RefreshTextViewActivity.class);
                        break;

                    default:
                        break;
                }
                startActivity(it);
            }
        });
    }
}
