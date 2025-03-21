package com.mirea.komkovaa.multiactivity;

import static android.content.ContentValues.TAG;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.mirea.komkovaa.multiactivity.databinding.ActivitySecondBinding;

public class secondActivity extends AppCompatActivity {
    private TextView textViewStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        textViewStudent = findViewById(R.id.textView);
        String text = (String) getIntent().getSerializableExtra("key");
        textViewStudent.setText(text);
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart()2");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume()2");
    }

    @Override
    protected void onPostResume(){
        super.onPostResume();
        Log.i(TAG, "onPostResume()2");
    }

    @Override
    public void onAttachedToWindow(){
        super.onAttachedToWindow();
        Log.i(TAG, "onAttachedToWindow()2");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause()2");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState()2");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop()2");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy()2");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart()2");
    }

}