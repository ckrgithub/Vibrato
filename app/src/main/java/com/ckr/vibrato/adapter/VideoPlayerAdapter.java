package com.ckr.vibrato.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ckr.pageview.adapter.BasePageAdapter;
import com.ckr.vibrato.R;
import com.ckr.vibrato.player.PlayerManager;
import com.google.android.exoplayer2.ui.PlayerView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created on 2018/8/6
 *
 * @author ckr
 *         Github: https://github.com/ckrgithub/Vibrato
 */

public class VideoPlayerAdapter extends BasePageAdapter<String, VideoPlayerAdapter.VideoHolder> {
	private static final String TAG = "VideoPlayerAdapter";
	
	private PlayerManager playerManager;

	public VideoPlayerAdapter(Context context) {
		super(context);
	}

	@Override
	public int getItemCount() {
		return 1;
	}

	@Override
	protected int getLayoutId(int viewType) {
		return R.layout.item_video_player;
	}

	@Override
	protected VideoHolder getViewHolder(View itemView, int viewType) {
		return new VideoHolder(itemView, viewType);
	}

	@Override
	protected void convert(VideoHolder holder, int originalPos, String originalItem, int adjustedPos, String adjustedItem) {
		playerManager = new PlayerManager(mContext);
		playerManager.init(mContext, holder.playerView);
	}


	class VideoHolder extends RecyclerView.ViewHolder {
		@BindView(R.id.playerView)
		PlayerView playerView;

		public VideoHolder(View itemView, int viewType) {
			super(itemView);
			ButterKnife.bind(this,itemView);
		}
	}
}
