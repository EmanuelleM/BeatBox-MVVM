package com.example.emanuellemenali.beatbox.view.activity;

import android.support.v4.app.Fragment;

import com.example.emanuellemenali.beatbox.view.fragment.BeatBoxFragment;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
