package com.example.bestlistview.base;

import java.util.ArrayList;


import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
/***
 * 
 * @author wangsj
 *
 * @param <T> 泛型为Adapter展示view所需的数据对象类型
 */
public abstract class BasicAdapter<T> extends BaseAdapter{
	
	private ArrayList<T> list;

	public BasicAdapter(ArrayList<T> list) {
		this.list = list;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@SuppressWarnings("unchecked")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// 1. 初始化holder
		BaseViewHolder<T> viewHolder = null;
		if (convertView == null) {
			viewHolder = getHolder();
		} else {
			viewHolder = (BaseViewHolder<T>) convertView.getTag();
		}
		// 2. 绑定数据
		viewHolder.bindData(list.get(position));
		
		return viewHolder.holderView;
	}
	/**
	 * 子类实现 ： 提供Adapter所需要的BaseHolder子类对象 
	 * @return 
	 */
	public abstract BaseViewHolder<T> getHolder();
}
