package com.example.mycancercare.KankerOtak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mycancercare.KankerServiks.KontakDokActivity;
import com.example.mycancercare.R;

public class BrainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain);
        defineButtons();
    }

    private void defineButtons() {
        findViewById(R.id.buttondetailbrain1).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailbrain2).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailbrain3).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailbrain4).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailbrain5).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.buttondetailbrain1:
                    Intent KenalServiks= new Intent(BrainActivity.this, KenalBrain.class);
                    startActivity(KenalServiks);
                    break;
                case R.id.buttondetailbrain2:
                    Intent GejalaServiks= new Intent(BrainActivity.this, GejalaBrain.class);
                    startActivity(GejalaServiks);
                    break;
                case R.id.buttondetailbrain3:
                    Intent ObatServiks= new Intent(BrainActivity.this, ObatBrain.class);
                    startActivity(ObatServiks);
                    break;
                case R.id.buttondetailbrain4:
                    Intent CegahServiks= new Intent(BrainActivity.this, CegahBrain.class);
                    startActivity(CegahServiks);
                    break;
                case R.id.buttondetailbrain5:
                    Intent KontakBrain= new Intent(BrainActivity.this, KontakDokActivity.class);
                    startActivity(KontakBrain);
                    break;
            }

        }
    };
}