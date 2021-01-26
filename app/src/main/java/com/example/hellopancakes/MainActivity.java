package com.example.hellopancakes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showPancakes(View view) {
        Toast pancakes = Toast.makeText(this, R.string.pancakes_message, Toast.LENGTH_SHORT);

        pancakes.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void countReset(View view) {
        mCount = 0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}