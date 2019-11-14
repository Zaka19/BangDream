package com.example.bangdream;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvintro;
    private AlphaAnimation fadeIn;
    private AlphaAnimation fadeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        tvintro = (TextView) findViewById(R.id.tvIntro);

        Animacion();

        tvintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),InformationMembers.class);
                startActivity(intent);
            }
        });
    }

    public void Animacion(){
        fadeIn = new AlphaAnimation(0.0f,1.0f);
        fadeIn.setDuration(500);
        fadeIn.setStartOffset(1);
        fadeIn.setFillAfter(true);

        fadeOut = new AlphaAnimation(1.0f,0.0f);
        fadeOut.setDuration(500);
        fadeOut.setStartOffset(1);
        fadeOut.setFillAfter(true);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                tvintro.setText(tvintro.getText());
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                tvintro.startAnimation(fadeOut);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                tvintro.startAnimation(fadeIn);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        tvintro.startAnimation(fadeIn);
    }
}
