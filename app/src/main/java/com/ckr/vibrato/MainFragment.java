package com.ckr.vibrato;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.ckr.baseframework.BaseFrameWorkFragment;
import com.ckr.pageview.view.PageView;
import com.ckr.vibrato.adapter.VideoPlayerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.ckr.baseframework.log.BaseLog.Logd;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends BaseFrameWorkFragment {
	private static final String TAG = "MainFragment";

	@BindView(R.id.pageView)
	PageView pageView;

	public static MainFragment newInstance() {

		Bundle args = new Bundle();

		MainFragment fragment = new MainFragment();
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	protected int getLayoutId() {
		return R.layout.fragment_main;
	}

	@Override
	protected void init() {
		Logd(TAG, "init: ");
		pageView.setAdapter(new VideoPlayerAdapter(getContext()));
		List data = new ArrayList<String>();
		data.add("1");
		pageView.updateAll(data);
	}


}
