package com.example.mycancercare.KankerHati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mycancercare.KankerServiks.KontakDokActivity;
import com.example.mycancercare.R;

public class LiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liver);
        defineButtons();
    }

    private void defineButtons() {
        findViewById(R.id.buttondetailliver1).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailliver2).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailliver3).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailliver4).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailliver5).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.buttondetailliver1:
                    Intent KenalLiver= new Intent(LiverActivity.this, KenalLiver.class);
                    startActivity(KenalLiver);
                    break;
                case R.id.buttondetailliver2:
                    Intent GejalaLiver= new Intent(LiverActivity.this, GejalaLiver.class);
                    startActivity(GejalaLiver);
                    break;
                case R.id.buttondetailliver3:
                    Intent ObatLiver= new Intent(LiverActivity.this, ObatLiver.class);
                    startActivity(ObatLiver);
                    break;
                case R.id.buttondetailliver4:
                    Intent CegahLiver= new Intent(LiverActivity.this, CegahLiver.class);
                    startActivity(CegahLiver);
                    break;
                case R.id.buttondetailliver5:
                    Intent KontakLiver= new Intent(LiverActivity.this, KontakDokActivity.class);
                    startActivity(KontakLiver);
                    break;
            }

        }
    };
}