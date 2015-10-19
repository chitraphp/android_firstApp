package com.example.guest.cayp_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

        TextView userName = (TextView) findViewById(R.id.userName);
        userName.setText("Hello " + name + "!!");

    }

}
