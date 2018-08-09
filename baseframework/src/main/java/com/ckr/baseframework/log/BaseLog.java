package com.ckr.baseframework.log;

import android.util.Log;

/**
 * Created on 2018/8/8
 *
 * @author ckr
 *         Github: https://github.com/ckrgithub/Vibrato
 */

public class BaseLog {
	private static final String TAG = "BaseLog";
	private static boolean isDebug = false;

	public static void debug() {
		isDebug = true;
	}

	public static void Logd(String msg) {
		Logd("", msg);
	}

	public static void Logd(String tag, String msg) {
		if (isDebug) {
			Log.d(TAG, tag + "--->" + msg);
		}
	}

	public static void Logi(String msg) {
		Logi("", msg);
	}

	public static void Logi(String tag, String msg) {
		if (isDebug) {
			Log.i(TAG, tag + "--->" + msg);
		}
	}

	public static void Logw(String msg) {
		Logw("", msg);
	}

	public static void Logw(String tag, String msg) {
		if (isDebug) {
			Log.w(TAG, tag + "--->" + msg);
		}
	}

	public static void Loge(String msg) {
		Loge("", msg);
	}

	public static void Loge(String tag, String msg) {
		if (isDebug) {
			Log.e(TAG, tag + "--->" + msg);
		}
	}
}
