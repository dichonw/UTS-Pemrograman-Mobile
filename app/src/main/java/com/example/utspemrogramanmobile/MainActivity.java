package com.example.utspemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ImageButton IButton1, IButton2, IButton3, IButton4, IButton5, IButton6, IButton7, IButton8, IButton9, IButton10;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IButton1 = findViewById(R.id.imageButton1);
        IButton2 = findViewById(R.id.imageButton2);
        IButton3 = findViewById(R.id.imageButton3);
        IButton4 = findViewById(R.id.imageButton4);
        IButton5 = findViewById(R.id.imageButton5);
        IButton6 = findViewById(R.id.imageButton6);
        IButton7 = findViewById(R.id.imageButton7);
        IButton8 = findViewById(R.id.imageButton8);
        IButton9 = findViewById(R.id.imageButton9);
        IButton10 = findViewById(R.id.imageButton10);

        IButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat1);
                Snackbar snackbar = Snackbar.make(view, "Anda Menekan Tombol Kucing 1", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                snackbar.show();
            }
        });

        IButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat2);
                Snackbar snackbar = Snackbar.make(view, "Anda Menekan Tombol Kucing 2", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                snackbar.show();
            }
        });

        IButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat3);
                Snackbar snackbar = Snackbar.make(view, "Anda Menekan Tombol Kucing 3", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                snackbar.show();
            }
        });

        IButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat4);
                Snackbar snackbar = Snackbar.make(view, "Anda Menekan Tombol Kucing 4", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                snackbar.show();
            }
        });

        IButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat5);
                Snackbar snackbar = Snackbar.make(view, "Anda Menekan Tombol Kucing 5", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                snackbar.show();
            }
        });

        IButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat6);
                Snackbar snackbar = Snackbar.make(view, "Anda Menekan Tombol Kucing 6", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                snackbar.show();
            }
        });

        IButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat7);
                Snackbar snackbar = Snackbar.make(view, "Anda Menekan Tombol Kucing 7", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                snackbar.show();
            }
        });

        IButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat8);
                Snackbar snackbar = Snackbar.make(view, "Anda Menekan Tombol Kucing 8", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                snackbar.show();
            }
        });

        IButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat9);
                Snackbar snackbar = Snackbar.make(view, "Anda Menekan Tombol Kucing 9", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                snackbar.show();
            }
        });

        IButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat10);
                Snackbar snackbar = Snackbar.make(view, "Anda Menekan Tombol Kucing 10", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                snackbar.show();
            }
        });

    }
    private void playSound(int soundId) {
        if (mediaPlayer != null){
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this,soundId);
        mediaPlayer.start();
    }
}