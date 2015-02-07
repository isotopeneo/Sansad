package com.jujitsutech.sansad.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jujitsutech.sansad.MainActivity;
import com.jujitsutech.sansad.R;
import com.jujitsutech.sansad.adapter.BillsAdapter;

public class BillsInParliament extends Fragment {

	private View view;
	ListView billsList;
	
	public static BillsInParliament newInstance() {
		BillsInParliament fragment = new BillsInParliament();
		return fragment;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.bills_details, container, false);
		init();
		return view;
	}
	
	public void init() {
		billsList = (ListView) view.findViewById(R.id.lv_bills);
		billsList.setAdapter(new BillsAdapter(getActivity()));
	}
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		((MainActivity) activity).onSectionAttached(2);
	}
}
