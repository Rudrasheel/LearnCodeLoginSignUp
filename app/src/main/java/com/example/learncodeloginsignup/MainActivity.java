package com.example.learncodeloginsignup;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewDOntHaveAccount, textView;
    Button loginButton;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewDOntHaveAccount = findViewById(R.id.text_view_dont_have_an_account);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        loginButton = findViewById(R.id.login_button);
        Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in_animation);
        imageView.startAnimation(startAnimation);
        textView.startAnimation(startAnimation);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Testing Login Feature!", Snackbar.LENGTH_SHORT).show();
            }
        });

        textViewDOntHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDOntHaveAccount.setAlpha(0.3f);
                startActivity(new Intent(MainActivity.this, SignUpActivity.class));

            }
        });



    }
}
