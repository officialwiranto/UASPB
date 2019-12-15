package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BestPlayer extends FragmentActivity implements View.OnClickListener {

    Button btnplayer, btngoalkeeper, btntopscorer, btnexit;
    Player Player;
    Goalkeeper Goalkeeper;
    Topskor Topskor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_player);

        btnplayer=(Button)findViewById(R.id.player);
        btngoalkeeper=(Button)findViewById(R.id.keper);
        btntopscorer=(Button)findViewById(R.id.topskor);
        btnexit=(Button)findViewById(R.id.exit);

        btnplayer.setOnClickListener(this);
        btngoalkeeper.setOnClickListener(this);
        btntopscorer.setOnClickListener(this);
        btnexit.setOnClickListener(this);
    }

    void mplayer() {
        FragmentTransaction fTrans=getSupportFragmentManager().beginTransaction();
        Player=new Player();
        fTrans.replace(R.id.container, Player);
        fTrans.commit();

    }
    void mgoalkeeper() {
        FragmentTransaction fTrans=getSupportFragmentManager().beginTransaction();
        Goalkeeper=new Goalkeeper();
        fTrans.replace(R.id.container, Goalkeeper);
        fTrans.commit();

    }
    void mtopscorer() {
        FragmentTransaction fTrans=getSupportFragmentManager().beginTransaction();
        Topskor=new Topskor();
        fTrans.replace(R.id.container, Topskor);
        fTrans.commit();

    }

    @Override
    public void onClick(View view) {

        if (view==btnplayer) {
            mplayer();

        }

        if (view==btngoalkeeper) {
            mgoalkeeper();
        }
        if (view==btntopscorer) {
            mtopscorer();
        }
        if (view==btnexit) {
            finish();
        }



    }
}
