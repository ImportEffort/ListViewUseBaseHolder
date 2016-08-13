package com.example.bestlistview.activitt;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.bestlistview.R;
import com.example.bestlistview.adapter.MainAdapter;

public class MainActivity extends Activity {

	private ListView listView;
	private ArrayList<String> list = new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listView = (ListView) findViewById(R.id.lv);
		
		for (int i = 0; i < 30; i++) {
			list.add("这是条目： "+i+" ");
		}
		
		MainAdapter adapter = new MainAdapter(list);
		listView.setAdapter(adapter);
	}

}
