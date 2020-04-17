package com.example.baitaplop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TinhToanActivity extends AppCompatActivity {

    Button btCong, btTru, btNhan, btChia;
    TextView tvKetQua;
    EditText txSoA, txSoB;
    float soA, soB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh_toan);

        anhXa();

        btCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txSoA != null && txSoB != null){
                    soA = Float.valueOf(txSoA.getText().toString());
                    soB = Float.valueOf(txSoB.getText().toString());
                }
                float tong;
                tong = soA + soB;
                tvKetQua.setText(tvKetQua.getText().toString() + " " + tong);
            }
        });
        btTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txSoA != null && txSoB != null){
                    soA = Float.valueOf(txSoA.getText().toString());
                    soB = Float.valueOf(txSoB.getText().toString());
                }
                float hieu = soA - soB;
                tvKetQua.setText(tvKetQua.getText().toString() + " " + hieu);
            }
        });
        btNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txSoA != null && txSoB != null){
                    soA = Float.valueOf(txSoA.getText().toString());
                    soB = Float.valueOf(txSoB.getText().toString());
                }
                float tich = soA * soB;
                tvKetQua.setText(tvKetQua.getText().toString() + " " + tich);
            }
        });
        btChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txSoA != null && txSoB != null){
                    soA = Float.valueOf(txSoA.getText().toString());
                    soB = Float.valueOf(txSoB.getText().toString());
                }
                if(soB == 0){
                    Toast.makeText(TinhToanActivity.this, "Số B phải khác 0", Toast.LENGTH_SHORT).show();
                }
                else {
                    float thuong = soA / soB;
                    tvKetQua.setText(tvKetQua.getText().toString() + " " + thuong);
                }
            }
        });
    }


    private void anhXa() {
        btCong = findViewById(R.id.btCong);
        btTru = findViewById(R.id.btTru);
        btNhan = findViewById(R.id.btNhan);
        btChia = findViewById(R.id.btChia);
        txSoA = findViewById(R.id.txSoA);
        txSoB = findViewById(R.id.txSoB);
        tvKetQua = findViewById(R.id.tvKetQua);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_custom, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itback:
                Intent intent = new Intent(TinhToanActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Back to Main", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStop() {
        Log.i("Crdo", "Stop 2");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.i("Crdo", "Pause 2");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.i("Crdo", "Destroy 2");
        super.onDestroy();
    }
}
