package com.example.emanuellemenali.beatbox.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.emanuellemenali.beatbox.model.BeatBox;
import com.example.emanuellemenali.beatbox.model.Sound;

/**
 * Created by emanuellemenali on 04/10/17.
 */

public class SoundViewModel extends BaseObservable{

    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }
    public Sound getSound() {
        return mSound;
    }
    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }

    @Bindable
    public String getTitle() {
        return mSound.getName();
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }
}
