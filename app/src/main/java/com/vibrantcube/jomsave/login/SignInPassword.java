package com.vibrantcube.jomsave.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vibrantcube.jomsave.HomeActivity;
import com.vibrantcube.jomsave.R;

public class SignInPassword extends AppCompatActivity {


   private TextView forgotPasswordTxtView;
   private Button forgot_password_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_password);

        forgotPasswordTxtView = findViewById(R.id.forgotPasswordTxtView);
        forgotPasswordTxtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInPassword.this,ForgotPassword.class);
                startActivity(intent);
                finish();
            }
        });

        forgot_password_btn = findViewById(R.id.forgot_password_btn);
        forgot_password_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SignInPassword.this, HomeActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
