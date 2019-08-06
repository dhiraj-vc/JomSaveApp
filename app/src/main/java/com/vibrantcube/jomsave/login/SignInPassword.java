package com.vibrantcube.jomsave.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vibrantcube.jomsave.R;
import com.vibrantcube.jomsave.commonActivity.HomeButtomNavigationActivity;

public class SignInPassword extends AppCompatActivity {


   private TextView forgotPasswordTxtView;
   private  Button signInSignInBtn;

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

        signInSignInBtn  = findViewById(R.id.signInSignInBtn);
        signInSignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signIn = new Intent(SignInPassword.this, HomeButtomNavigationActivity.class);
                startActivity(signIn);
            }
        });
    }
}
