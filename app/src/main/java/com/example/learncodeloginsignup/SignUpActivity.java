package com.example.learncodeloginsignup;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    TextView textViewHaveAccount;
    Button register_button;
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        textView = findViewById(R.id.textView);
        textViewHaveAccount = findViewById(R.id.text_view_have_an_account);
        register_button = findViewById(R.id.register_button);
        imageView = findViewById(R.id.imageView);
        Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in_animation);
        imageView.startAnimation(startAnimation);
        textView.startAnimation(startAnimation);

        textViewHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewHaveAccount.setAlpha(0.3f);
                startActivity(new Intent(SignUpActivity.this, MainActivity.class));
            }
        });
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Testing SignUp Feature!", Snackbar.LENGTH_SHORT).show();
            }
        });



    }
}
