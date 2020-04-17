package com.example.baitaplop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTinhToan, tvDangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();
        clickToActivity();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void clickToActivity() {

        //TinhToan
        tvTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TinhToanActivity.class);
                startActivity(intent);
            }
        });

        //DangNhap
        tvDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DangNhap.class);
                startActivity(intent);
            }
        });
    }

    private void anhXa() {
        tvTinhToan = findViewById(R.id.tvTinhToan);
        tvDangNhap = findViewById(R.id.tvDangNhap);
    }

    @Override
    protected void onPause() {
        Log.i("Crdo", "Pause 1");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("Crdo", "Stop 1");
        super.onStop();
    }

}
