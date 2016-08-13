package com.example.bestlistview.holder;

import android.view.View;
import android.widget.TextView;

import com.example.bestlistview.R;
import com.example.bestlistview.base.BaseViewHolder;
import com.example.bestlistview.global.MyAppliction;

public class MainHolder extends BaseViewHolder<String> {


	private TextView tv;

	@Override
	public View getHolderView() {
		
		View view = View.inflate(MyAppliction.context, R.layout.item, null);
		tv = (TextView) view.findViewById(R.id.tv);
		
		return view;
	}

	@Override
	public void bindData(String data) {
		tv.setText(data);
	}
}
