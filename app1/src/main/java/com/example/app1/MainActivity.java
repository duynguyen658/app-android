package com.example.app1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtUserName;
    private EditText edtInput;
    private Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // gắn layout

        // ánh xạ view
        txtUserName = findViewById(R.id.txtUserName);
        edtInput = findViewById(R.id.edtInput);
        btnGo = findViewById(R.id.btnGo);

        // xử lý sự kiện bấm nút
        btnGo.setOnClickListener(v -> {
            String name = edtInput.getText().toString();
            txtUserName.setText("User Name: " + name);
        });
    }
}
