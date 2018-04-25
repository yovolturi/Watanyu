package sdu.cs58.watanyu.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //1.ประกาศตัวเเปลบนjava
    TextView nameTextView;
    String getNameString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///ผูกตัวเเปลบนjavaกัน ui
        nameTextView = findViewById(R.id.txvName);
        //รับค่าจากnameSterig เข้าหน้า login
        getNameString = getIntent().getStringExtra("nameString");
        nameTextView.setText("ยินดีต้อนรับ "+ getNameString +"เข้าสุ่ระบบ");

    }//
}
