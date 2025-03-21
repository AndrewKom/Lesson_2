package com.mirea.komkovaa.multiactivity;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MultiActivity extends AppCompatActivity {
    private EditText editTextStudent;

    public void onClickNewActivity(View view) {

        editTextStudent = (EditText) findViewById(R.id.editText);
        String Text123 = editTextStudent.getText().toString();

        if (Text123.matches("")){
            Intent intent = new Intent(MultiActivity.this, secondActivity.class);
            intent.putExtra("key", "MIREA - Комков Андрей Алексеевич");
            startActivity(intent);
            return;
        }

        Intent intent = new Intent(MultiActivity.this, secondActivity.class);
        intent.putExtra("key", Text123);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPostResume(){
        super.onPostResume();
        Log.i(TAG, "onPostResume()");
    }

    @Override
    public void onAttachedToWindow(){
        super.onAttachedToWindow();
        Log.i(TAG, "onAttachedToWindow()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart()");
    }

}