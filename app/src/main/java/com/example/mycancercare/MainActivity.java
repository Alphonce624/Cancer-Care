package com.example.mycancercare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mycancercare.KankerDarah.BloodActivity;
import com.example.mycancercare.KankerHati.LiverActivity;
import com.example.mycancercare.KankerOtak.BrainActivity;
import com.example.mycancercare.KankerPayudara.BreastActivity;
import com.example.mycancercare.KankerServiks.ServiksActivity;
import com.example.mycancercare.KankerTulang.BoneActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defineButtons();
    }

    private void defineButtons() {
        findViewById(R.id.buttonbreast).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttonserviks).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttonblood).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttonheart).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttonbrain).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttonbone).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.buttonbreast:
                    Intent MenuBreast= new Intent(MainActivity.this, BreastActivity.class);
                    startActivity(MenuBreast);
                    break;
                case R.id.buttonserviks:
                    Intent MenuServiks= new Intent(MainActivity.this, ServiksActivity.class);
                    startActivity(MenuServiks);
                    break;
                case R.id.buttonblood:
                    Intent MenuBlood= new Intent(MainActivity.this, BloodActivity.class);
                    startActivity(MenuBlood);
                    break;
                case R.id.buttonheart:
                    Intent MenuHeart= new Intent(MainActivity.this, LiverActivity.class);
                    startActivity(MenuHeart);
                    break;
                case R.id.buttonbrain:
                    Intent MenuBrain= new Intent(MainActivity.this, BrainActivity.class);
                    startActivity(MenuBrain);
                    break;
                case R.id.buttonbone:
                    Intent MenuBone= new Intent(MainActivity.this, BoneActivity.class);
                    startActivity(MenuBone);
                    break;

            }

        }
    };
}
