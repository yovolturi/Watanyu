package sdu.cs58.watanyu.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActiviry extends AppCompatActivity {

    //Explicit
    EditText  nameEditText,usernameEditText, passwordEditText;
    Button loginButton;
    String nameString , userString ,passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activiry);

        //2.Initial view ผูกตัวเเฟร java ใฟ้รู้จักกับ element บน xml
        nameEditText = findViewById(R.id.txvName);
        usernameEditText = findViewById(R.id.txtUsername);
        passwordEditText = findViewById(R.id.txtPassword);
        loginButton = findViewById(R.id.btnLogin);
            //สั่งใฟ้use log in
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameString = nameEditText.getText().toString().trim();
                userString = usernameEditText.getText().toString().trim();
                passString = passwordEditText.getText().toString().trim();

                if ((nameString.length()==0)||(userString.length()==0)||(passString.length()==0)) {
                    Toast.makeText(getApplicationContext(),"กรุณาใส่ข้อมูลให้ครบทุกช่อง",Toast.LENGTH_LONG).show();
                }
        //ตรวจสอบการlogin
                if ((userString.equals("admin"))&&(passString.equals("1234"))) {
                    Toast.makeText(getApplicationContext(),"login Success",Toast.LENGTH_LONG).show();
                    //ส่งข้อมูลmainstarinfไปหน้าmain Activrty
                    Intent mainIntent = new Intent(LoginActiviry.this, MainActivity.class);
                    mainIntent.putExtra("nameString", nameString);
                    startActivity(mainIntent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"login Fail!!",Toast.LENGTH_LONG).show();
                }

                nameString =nameEditText.getText().toString().trim();
                Toast.makeText(getApplicationContext(), "hello "+nameString,Toast.LENGTH_SHORT) .show();


            }
        });


    }// end method onCreate
}//end class
