package com.fadhliismail.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fadhliismail.interactivestory.R;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    private EditText mTextPersonName;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextPersonName = (EditText) findViewById(R.id.textPersonName);
        mStartButton = (Button) findViewById(R.id.startButton);

        String name = mTextPersonName.getText().toString();

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mTextPersonName.getText().toString();
                startStory(name);
            }
        });
    }

    private void startStory(String name){
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra(getString(R.string.key_name), name);
        startActivity(intent);
    }

}
