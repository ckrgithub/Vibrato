package com.ckr.vibrato;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.ckr.baseframework.BaseFrameWorkFragment;
import com.ckr.pageview.view.PageView;

import butterknife.BindView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends BaseFrameWorkFragment {

	@BindView(R.id.pageView)
	PageView pageView;

	public static MainFragment newInstance() {

		Bundle args = new Bundle();

		MainFragment fragment = new MainFragment();
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	protected void init() {

	}

	@Override
	protected int getLayoutId() {
		return R.layout.fragment_main;
	}

}
