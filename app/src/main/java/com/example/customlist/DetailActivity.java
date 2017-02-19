package com.example.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mToolbar = (Toolbar) findViewById(R.id.toolbar2);
        mImageView = (ImageView) findViewById(R.id.imageView2);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            mToolbar.setTitle(mBundle.getString("countryName"));
            mImageView.setImageResource(mBundle.getInt("countryFlag"));
        }
    }
}
