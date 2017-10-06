package com.example.emanuellemenali.beatbox.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.emanuellemenali.beatbox.databinding.ListItemSoundBinding;
import com.example.emanuellemenali.beatbox.model.BeatBox;
import com.example.emanuellemenali.beatbox.model.Sound;
import com.example.emanuellemenali.beatbox.viewmodel.SoundViewModel;

/**
 * Created by emanuellemenali on 04/10/17.
 */

public class SoundHolder extends RecyclerView.ViewHolder{

    private ListItemSoundBinding mBinding;
    private BeatBox mBeatBox;

    public SoundHolder(ListItemSoundBinding binding, BeatBox beatBox) {
        super(binding.getRoot());
        mBinding = binding;
        mBeatBox = beatBox;
        mBinding.setViewModel(new SoundViewModel(mBeatBox));

    }

    public void bind(Sound sound) {
        mBinding.getViewModel().setSound(sound);
        mBinding.executePendingBindings();
    }

}
