package com.restutriew.submission3aplikasimoviecatalog.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.restutriew.submission3aplikasimoviecatalog.R;


public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvTitle = findViewById(R.id.title_detail);
        TextView tvYear = findViewById(R.id.year_detail);
        TextView tvDescription = findViewById(R.id.description_detail);
        ImageView imagephoto = findViewById(R.id.img_detail);

//        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);
//        String title = movie.getTitle();
//        String year = movie.getYear();
//        String description = movie.getDescription();
//        String photo = movie.getPhoto();
//
//        tvTitle.setText(title);
//        tvYear.setText(year);
//        tvDescription.setText(description);

    }

}
