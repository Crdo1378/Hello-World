package com.example.baitaplop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class DangNhap extends AppCompatActivity {

    EditText txUser, txPass;
    Button btDangNhap;
    CheckBox cbLuuThongTin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        anhXa();

        btDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txUser.getText().toString().equals("crdo") && txPass.getText().toString().equals("crdo")){
                    Toast.makeText(DangNhap.this, "OK", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(DangNhap.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(DangNhap.this, "No No No", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void anhXa() {
        txUser = findViewById(R.id.txUser);
        txPass = findViewById(R.id.txPass);
        btDangNhap = findViewById(R.id.btDangNhap);
        cbLuuThongTin = findViewById(R.id.cbLuuThongTin);
    }
}
