package com.example.projectuas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Team extends AppCompatActivity {

    ListView listView;
    String mTitle [] = {"Persib Bandung","Arema FC","Badak Lampung FC","Bali United FC","PS Barito Putera","Bhayangkara FC","Pusamania Borneo FC","Kalteng Putera FC","Madura United FC","Semen Padang FC","Persebaya Surabaya","Persela Lamongan","Persija Jakarta","Persipura Jayapura","PSIS Semarang","PSM Makasar","PSS Sleman","PS Tira Persikabo"};
    int image[] = {R.drawable.persib,R.drawable.arema,R.drawable.badak,R.drawable.bali,R.drawable.barito,R.drawable.bhayangkara,R.drawable.borneo,R.drawable.kalteng,R.drawable.madura,R.drawable.padang,R.drawable.persebaya,R.drawable.persela,R.drawable.persija,R.drawable.persipura,R.drawable.psis,R.drawable.psm,R.drawable.pss,R.drawable.tira};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        listView = findViewById(R.id.mylistview);

        MyAdapter adapter = new MyAdapter(this, mTitle, image);
        listView.setAdapter(adapter);
    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        int rImg[];

        MyAdapter (Context c, String title[], int img[]){

            super(c, R.layout.row, R.id.textview1,title);
            this.context = c;
            this.rTitle = title;
            this.rImg = img;
        }

        @NonNull
        @Override
        public View getView (int position, View convertView, ViewGroup parent){

            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView image = row.findViewById(R.id.imagee);
            TextView myTitle = row.findViewById(R.id.textview1);

            image.setImageResource(rImg[position]);
            myTitle.setText(rTitle[position]);

            return row;
        }
    }

}
