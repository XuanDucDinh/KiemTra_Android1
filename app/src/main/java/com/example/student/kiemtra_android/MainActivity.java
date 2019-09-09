package com.example.student.kiemtra_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edUser, edPass;
    Button btnDangNhap;
    CheckBox chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDangNhap = (Button)findViewById(R.id.buttonDangNhap);
        edUser=(EditText)findViewById(R.id.editTextTaiKhoan);
        edPass=(EditText)findViewById(R.id.editPass);
        chk =(CheckBox)findViewById(R.id.checkBoxLuu);
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = edUser.getText().toString();
                String passwords = edPass.getText().toString();
                if(userName.equals("") || passwords.equals(""))
                {
                    Toast.makeText(MainActivity.this, " Bạn nhâp thiếu thông tin", Toast.LENGTH_LONG).show();
                }
                else {
                    if (chk.isChecked() == true) {
                        Toast.makeText(MainActivity.this, "Chào mừng bạn đã đăng nhập, thông tin của bạn đã được lưu", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Chào mừng bạn đã đăng nhập, thông tin của bạn không được lưu", Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
    }
}
