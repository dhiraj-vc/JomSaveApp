package com.vibrantcube.jomsave.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.vibrantcube.jomsave.HomeActivity;
import com.vibrantcube.jomsave.R;

public class ForgotPassword extends AppCompatActivity {

    private TextView forgot_password_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        forgot_password_btn = findViewById(R.id.forgot_password_btn);
        forgot_password_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPassword.this, HomeActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
