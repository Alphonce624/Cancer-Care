package com.example.mycancercare.KankerDarah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mycancercare.KankerServiks.KontakDokActivity;
import com.example.mycancercare.R;

public class BloodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);
        defineButtons();
    }

    private void defineButtons() {
        findViewById(R.id.buttondetailblood1).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailblood2).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailblood3).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailblood4).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailblood5).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.buttondetailblood1:
                    Intent KenalBlood= new Intent(BloodActivity.this, KenalBlood.class);
                    startActivity(KenalBlood);
                    break;
                case R.id.buttondetailblood2:
                    Intent GejalaBlood= new Intent(BloodActivity.this, GejalaBlood.class);
                    startActivity(GejalaBlood);
                    break;
                case R.id.buttondetailblood3:
                    Intent ObatBlood= new Intent(BloodActivity.this, ObatBlood.class);
                    startActivity(ObatBlood);
                    break;
                case R.id.buttondetailblood4:
                    Intent CegahBlood= new Intent(BloodActivity.this, CegahBlood.class);
                    startActivity(CegahBlood);
                    break;
                case R.id.buttondetailblood5:
                    Intent KontakBlood= new Intent(BloodActivity.this, KontakDokActivity.class);
                    startActivity(KontakBlood);
                    break;
            }

        }
    };
}