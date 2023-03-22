package com.example.mycancercare.KankerTulang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mycancercare.KankerServiks.KontakDokActivity;
import com.example.mycancercare.R;

public class BoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bone);
        defineButtons();
    }

    private void defineButtons() {
        findViewById(R.id.buttondetailbone1).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailbone2).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailbone3).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailbone4).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailbone5).setOnClickListener(buttonClickListener);

    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.buttondetailbone1:
                    Intent KenalBone= new Intent(BoneActivity.this, KenalBone.class);
                    startActivity(KenalBone);
                    break;
                case R.id.buttondetailbone2:
                    Intent GejalaBone= new Intent(BoneActivity.this, GejalaBone.class);
                    startActivity(GejalaBone);
                    break;
                case R.id.buttondetailbone3:
                    Intent ObatBone= new Intent(BoneActivity.this, ObatBone.class);
                    startActivity(ObatBone);
                    break;
                case R.id.buttondetailbone4:
                    Intent CegahBone= new Intent(BoneActivity.this, CegahBone.class);
                    startActivity(CegahBone);
                    break;
                case R.id.buttondetailbone5:
                    Intent KontakBone= new Intent(BoneActivity.this, KontakDokActivity.class);
                    startActivity(KontakBone);
                    break;
            }

        }
    };
}
