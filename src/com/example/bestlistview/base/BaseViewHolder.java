package com.example.bestlistview.base;

import android.view.View;

public abstract class BaseViewHolder<T> {
	//getView要展示的view对象
	public View holderView;
	
	public BaseViewHolder() {
		holderView = getHolderView();
		holderView.setTag(this);
	}
	/**
	 * 为getholderView中的控件赋值
	 * @param t 需要显示的条目的bean对象
	 */ 
	public abstract void bindData(T t);//这里不知道具体页面需要展示的内容是什么数据 所以可以采用泛型来接收
	/**
	 * 功能： 初始化holderView inflate布局文件，findviewbyid控件
	 * @return
	 */
	public abstract View getHolderView();
}
