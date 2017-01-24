package org.freeman.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by freemanliu on 2017/1/22.
 */
public class AudioPlayer {

    private MediaPlayer mPlayer;

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context context) {
        stop();
        mPlayer = MediaPlayer.create(context,R.raw.one_small_step);
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
        mPlayer.start();
    }

    public boolean isPlaying() {
        return mPlayer != null;
    }
}
