package com.example.mycancercare.KankerServiks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mycancercare.R;

import java.util.ArrayList;
import java.util.List;

public class KontakDokActivity extends AppCompatActivity {

    List<Kontak1> lstKontak1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak_dok);

        lstKontak1 = new ArrayList<>();
        lstKontak1.add(new Kontak1("dr.fred","0769014048/fredrickkaranja8514@gmail.com",
                "\n" +
                "\n" ,R.drawable.docewek));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstKontak1);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}
