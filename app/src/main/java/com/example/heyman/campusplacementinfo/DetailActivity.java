package com.example.heyman.campusplacementinfo;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView mFlower;
    TextView mDescription;
    TextView mDetails;
    TextView mReviews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mToolbar=findViewById(R.id.toolbar);
        mFlower=findViewById(R.id.ivImage);
        mDescription=findViewById(R.id.tvDescription);
        mDetails=findViewById(R.id.details);
        mReviews=findViewById(R.id.reviews);
        Typeface customFont=Typeface.createFromAsset(getAssets(),"BebasNeuR.ttf");
        Typeface customFont2=Typeface.createFromAsset(getAssets(),"OswaldR.ttf");
        mDescription.setTypeface(customFont2);
        mDetails.setTypeface(customFont2);
        mReviews.setTypeface(customFont);


        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            mToolbar.setTitle(mBundle.getString("Title"));
            mFlower.setImageResource(mBundle.getInt("Image"));
            mDescription.setText(mBundle.getString("Description"));
            mDetails.setText(mBundle.getString("Details"));
            mReviews.setText(mBundle.getString("Reviews"));
        }
    }
}
