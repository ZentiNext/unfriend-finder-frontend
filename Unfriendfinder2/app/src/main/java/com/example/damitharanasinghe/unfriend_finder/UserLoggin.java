package com.example.damitharanasinghe.unfriend_finder;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserLoggin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_loggin);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userAuthenticate(v);
            }

        });

    }

    public void userAuthenticate(View v){

        Intent intent = new Intent(this, userFriendsDetails.class);
        startActivity(intent);

        HttpGetRequest httpget = new HttpGetRequest();
        httpget.doInBackground();

    }

}
