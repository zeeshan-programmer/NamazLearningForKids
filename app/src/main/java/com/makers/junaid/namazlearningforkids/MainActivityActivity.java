package com.makers.junaid.namazlearningforkids;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MainActivityActivity extends AppCompatActivity {

    Button fajarBtn;
    Button zoharBtn;
    Button asarBtn;
    Button maghribBtn;
    Button eshaBtn;
    Button infoBtn;

    AdView adView, adView1, adView2, adView3, adView4, adView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        fajarBtn=findViewById(R.id.fajarBtn);
        zoharBtn=findViewById(R.id.zoharBtn);
        asarBtn=findViewById(R.id.asarBtn);
        maghribBtn=findViewById(R.id.maghribBtn);
        eshaBtn=findViewById(R.id.eshaBtn);

        adView = findViewById(R.id.adView);
        adView1 = findViewById(R.id.adView1);
        adView2 = findViewById(R.id.adView2);
        adView3 = findViewById(R.id.adView3);
        adView4 = findViewById(R.id.adView4);
        adView5 = findViewById(R.id.adView5);

        infoBtn=findViewById(R.id.infoBtn);

        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        AdRequest adRequest1=new AdRequest.Builder().build();
        adView1.loadAd(adRequest1);
        AdRequest adRequest2=new AdRequest.Builder().build();
        adView2.loadAd(adRequest2);
        AdRequest adRequest3=new AdRequest.Builder().build();
        adView3.loadAd(adRequest3);
        AdRequest adRequest4=new AdRequest.Builder().build();
        adView4.loadAd(adRequest4);
        AdRequest adRequest5=new AdRequest.Builder().build();
        adView5.loadAd(adRequest5);

        fajarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colour();
                fajarBtn.setTextColor(getResources().getColor(R.color.white));
                    Intent i = new Intent(MainActivityActivity.this, Main2Activity.class);
                    startActivity(i);
            }
        });
        zoharBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colour();
                zoharBtn.setTextColor(getResources().getColor(R.color.white));
                Intent i=new Intent(MainActivityActivity.this,Main3Activity.class);
                startActivity(i);
            }
        });
        asarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colour();
                asarBtn.setTextColor(getResources().getColor(R.color.white));
                Intent i=new Intent(MainActivityActivity.this,Main3Activity.class);
                startActivity(i);
            }
        });
        maghribBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colour();
                maghribBtn.setTextColor(getResources().getColor(R.color.white));
                Intent i=new Intent(MainActivityActivity.this,Main4Activity.class);
                startActivity(i);
            }
        });
        eshaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colour();
                eshaBtn.setTextColor(getResources().getColor(R.color.white));
                Intent i=new Intent(MainActivityActivity.this,Main3Activity.class);
                startActivity(i);
            }
        });
        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colour();
                infoBtn.setTextColor(getResources().getColor(R.color.white));
                Intent i= new Intent(MainActivityActivity.this,MainIActivity.class);
                startActivity(i);
            }
        });
    }
    public void colour()
    {
        fajarBtn.setTextColor(getResources().getColor(R.color.black));
        zoharBtn.setTextColor(getResources().getColor(R.color.black));
        asarBtn.setTextColor(getResources().getColor(R.color.black));
        maghribBtn.setTextColor(getResources().getColor(R.color.black));
        eshaBtn.setTextColor(getResources().getColor(R.color.black));
        infoBtn.setTextColor(getResources().getColor(R.color.black));
    }
}
