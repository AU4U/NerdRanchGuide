package org.freeman.hellomoon;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by freemanliu on 2017/1/22.
 */

public class HelloMoonFragment extends Fragment {
    private Button mPlayButton;
    private Button mStopButton;
    AudioPlayer audioPlayer  = new AudioPlayer();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_hello_moon,container,false);
        mPlayButton = (Button) v.findViewById(R.id.hellomoon_playButton);
        mStopButton = (Button) v.findViewById(R.id.hellomoon_stopButton);
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioPlayer.play(getActivity());
            }
        });
        mStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioPlayer.stop();
            }
        });
        return v;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        audioPlayer.stop();
    }
}
