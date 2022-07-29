package com.makers.junaid.namazlearningforkids;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Main0Activity extends AppCompatActivity {

    ImageView imageIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
        imageIv=findViewById(R.id.imageIv);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animationn);
        imageIv.setAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent i=new Intent(Main0Activity.this,MainActivityActivity.class);
                startActivity(i);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imageIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Main0Activity.this,MainActivityActivity.class);
                startActivity(j);
                finish();
            }
        });
    }
}
