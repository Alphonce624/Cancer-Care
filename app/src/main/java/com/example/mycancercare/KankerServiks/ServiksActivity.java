package com.example.mycancercare.KankerServiks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.mycancercare.KankerPayudara.ObatBreast;
import com.example.mycancercare.R;

public class ServiksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serviks);
        defineButtons();
    }

    private void defineButtons() {
        findViewById(R.id.buttondetailserviks1).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailserviks2).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailserviks3).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailserviks4).setOnClickListener(buttonClickListener);
        findViewById(R.id.buttondetailserviks5).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.buttondetailserviks1:
                    Intent KenalServiks= new Intent(ServiksActivity.this, KenalServiks.class);
                    startActivity(KenalServiks);
                    break;
                case R.id.buttondetailserviks2:
                    Intent GejalaServiks= new Intent(ServiksActivity.this, GejalaServiks.class);
                    startActivity(GejalaServiks);
                    break;
                case R.id.buttondetailserviks3:
                    Intent ObatServiks= new Intent(ServiksActivity.this, ObatServiks.class);
                    startActivity(ObatServiks);
                    break;
                case R.id.buttondetailserviks4:
                    Intent CegahServiks= new Intent(ServiksActivity.this, CegahServiks.class);
                    startActivity(CegahServiks);
                    break;
                case R.id.buttondetailserviks5:
                    Intent KontakServiks= new Intent(ServiksActivity.this, KontakDokActivity.class);
                    startActivity(KontakServiks);
                    break;
            }

        }
    };
}
