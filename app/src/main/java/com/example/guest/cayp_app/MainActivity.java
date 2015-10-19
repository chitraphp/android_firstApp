package com.example.guest.cayp_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText) findViewById(R.id.userName);
        Button loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String name = userName.getText().toString();
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();
                startFavorite(name);
            }
        });
    }

    private void startFavorite(String name){
        Intent intent = new Intent(this, FavoritesActivity.class);
        intent.putExtra(getString(R.string.key_name), name);
        startActivity(intent);
    }

}
