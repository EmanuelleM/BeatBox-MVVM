package com.example.emanuellemenali.beatbox.view.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.emanuellemenali.beatbox.R;
import com.example.emanuellemenali.beatbox.databinding.ListItemSoundBinding;
import com.example.emanuellemenali.beatbox.model.BeatBox;
import com.example.emanuellemenali.beatbox.model.Sound;

import java.util.List;

/**
 * Created by emanuellemenali on 04/10/17.
 */

public class SoundAdapter extends RecyclerView.Adapter<SoundHolder> {

    private List<Sound> mSounds;

    private Context mContext;

    private BeatBox mBeatBox;

    public SoundAdapter(List<Sound> sounds, Context context, BeatBox beatBox) {
        mSounds = sounds;
        mContext = context;
        mBeatBox = beatBox;
    }

    @Override
    public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ListItemSoundBinding binding = DataBindingUtil
                .inflate(inflater, R.layout.list_item_sound, parent, false);
        return new SoundHolder(binding, mBeatBox);
    }

    @Override
    public void onBindViewHolder(SoundHolder holder, int position) {

        Sound sound = mSounds.get(position);
        holder.bind(sound);

    }

    @Override
    public int getItemCount() {
        return mSounds.size();
    }
}
