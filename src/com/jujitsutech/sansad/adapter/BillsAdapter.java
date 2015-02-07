package com.jujitsutech.sansad.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.jujitsutech.sansad.view.BillsHolderView;

public class BillsAdapter extends BaseAdapter{

	private Context context;
	
	public BillsAdapter(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		return 10;
	}

	@Override
	public Object getItem(int arg0) {
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int arg0, View convertView, ViewGroup arg2) {
		BillsHolderView holderView;
		if (null != convertView && convertView instanceof BillsHolderView) {
			holderView = (BillsHolderView) convertView;
		} else {
			holderView = new BillsHolderView(context);
		}
		holderView.bindView("Testing" + arg0);
		return holderView;
	}

}
