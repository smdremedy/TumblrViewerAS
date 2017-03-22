package com.soldiersofmobile.tumblrviewer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PostDetailsActivity extends AppCompatActivity {

    private static final String URL_EXTRA = "url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_details);

        String url = getIntent().getStringExtra(URL_EXTRA);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.details_container, PostDetailsFragment.newInstance(url))
                .commit();
    }

    public static Intent getIntent(
            Context context,
            String url
    ) {
        Intent intent = new Intent(context, PostDetailsActivity.class);
        intent.putExtra(URL_EXTRA, url);
        return intent;
    }
}
