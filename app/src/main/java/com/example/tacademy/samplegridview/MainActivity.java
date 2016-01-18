package com.example.tacademy.samplegridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final int [] IDS = {R.drawable.gallery_photo_1,
            R.drawable.gallery_photo_2,
            R.drawable.gallery_photo_3,
            R.drawable.gallery_photo_4,
            R.drawable.gallery_photo_5,
            R.drawable.gallery_photo_6,
            R.drawable.gallery_photo_7,
            R.drawable.gallery_photo_8
    };

    GridView gridView;
    ImageAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView)findViewById(R.id.gridView);
        mAdapter = new ImageAdapter();
        gridView.setAdapter(mAdapter);


        initData();
    }

    public void initData(){
        for(int i =0 ; i<IDS.length; i++){
            ImageTextData data = new ImageTextData();
            data.icon = getResources().getDrawable(IDS[i % IDS.length]);
            data.title = "title : "+ i ;
            mAdapter.add(data);
        }
    }
}
