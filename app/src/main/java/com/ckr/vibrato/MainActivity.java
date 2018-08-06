package com.ckr.vibrato;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction transaction = fragmentManager.beginTransaction();
		if (savedInstanceState == null) {
			transaction.add(R.id.main_container, MainFragment.newInstance(), MainFragment.class.getSimpleName()).commit();
		} else {
			Fragment fragment = fragmentManager.findFragmentByTag(MainFragment.class.getSimpleName());
			transaction.show(fragment).commit();
		}
	}

}
