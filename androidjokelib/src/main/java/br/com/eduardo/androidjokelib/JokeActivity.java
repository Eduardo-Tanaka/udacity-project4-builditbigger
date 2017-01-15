package br.com.eduardo.androidjokelib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private TextView mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mJoke = (TextView) findViewById(R.id.txtJoke);

        Intent intent = getIntent();

        mJoke.setText(intent.getStringExtra("joke"));
    }
}
