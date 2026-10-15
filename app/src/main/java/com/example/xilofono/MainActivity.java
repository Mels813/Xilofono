package com.example.xilofono;


import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private SoundPool mSoundPool;

    private int mDoSoundId;
    private int mReSoundId;
    private int mMiSoundId;
    private int mFaSoundId;
    private int mSolSoundId;
    private int mLaSoundId;
    private int mSiSoundId;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build();

        mSoundPool = new SoundPool.Builder()
                .setMaxStreams(NR_OF_SIMULTANEOUS_SOUNDS)
                .setAudioAttributes(audioAttributes)
                .build();

        mDoSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mReSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mMiSoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFaSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mSolSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mLaSoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mSiSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);

    }

    public void PlayDo(View view) {
        mSoundPool.play(mDoSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayRe(View view) {
        mSoundPool.play(mReSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayMi(View view) {
        mSoundPool.play(mMiSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayFa(View view) {
        mSoundPool.play(mFaSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlaySol(View view) {
        mSoundPool.play(mSolSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayLa(View view) {
        mSoundPool.play(mLaSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlaySi(View view) {
        mSoundPool.play(mSiSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
}