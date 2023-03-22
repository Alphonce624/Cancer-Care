package com.example.mycancercare.KankerPayudara;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mycancercare.KankerServiks.KontakDokActivity;
import com.example.mycancercare.R;

public class BreastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breast);
        defineButtons();
    }

    private void defineButtons() {
        findViewById(R.id.buttondetailbreast1).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailbreast2).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailbreast3).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailbreast4).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailbreast5).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.buttondetailbreast1:
                    Intent KenalBreast= new Intent(BreastActivity.this, KenalBreast.class);
                    startActivity(KenalBreast);
                    break;
                case R.id.buttondetailbreast2:
                    Intent GejalaBreast= new Intent(BreastActivity.this, GejalaBreast.class);
                    startActivity(GejalaBreast);
                    break;
                case R.id.buttondetailbreast3:
                    Intent ObatBreast= new Intent(BreastActivity.this, ObatBreast.class);
                    startActivity(ObatBreast);
                    break;
                case R.id.buttondetailbreast4:
                    Intent CegahBreast= new Intent(BreastActivity.this, CegahBreast.class);
                    startActivity(CegahBreast);
                    break;
                case R.id.buttondetailbreast5:
                    Intent KontakBreast= new Intent(BreastActivity.this, KontakDokActivity.class);
                    startActivity(KontakBreast);
                    break;
            }

        }
    };
}
