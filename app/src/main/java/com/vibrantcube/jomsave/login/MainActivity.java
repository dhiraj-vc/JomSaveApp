package com.vibrantcube.jomsave.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vibrantcube.jomsave.R;

public class MainActivity extends AppCompatActivity {

    private Button OtpPasswordBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OtpPasswordBtn = findViewById(R.id.OtpPasswordBtn);
        OtpPasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SignInPassword.class);
                startActivity(intent);
            }
        });




    }
}
