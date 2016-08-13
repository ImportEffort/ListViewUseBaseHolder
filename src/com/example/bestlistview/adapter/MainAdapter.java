package com.example.bestlistview.adapter;

import java.util.ArrayList;

import com.example.bestlistview.base.BaseViewHolder;
import com.example.bestlistview.base.BasicAdapter;
import com.example.bestlistview.holder.MainHolder;

public class MainAdapter extends BasicAdapter<String>{

	public MainAdapter(ArrayList<String> list) {
		super(list);
	}

	@Override
	public BaseViewHolder<String> getHolder() {
		MainHolder holder = new MainHolder();
		return holder;
	}

}
