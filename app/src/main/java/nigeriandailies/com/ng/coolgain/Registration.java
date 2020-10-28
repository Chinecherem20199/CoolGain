package nigeriandailies.com.ng.coolgain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Registration extends AppCompatActivity {
    private TextInputLayout userName;
    private TextInputLayout userEmail;
    private TextInputLayout userPass;
    private TextInputLayout confirmPass;
    private Button registeration;
    private TextView alreadyAcc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        userName = findViewById(R.id.user_name);
        userEmail = findViewById(R.id.email);
        userPass = findViewById(R.id.pass);
        confirmPass = findViewById(R.id.cpass);
        registeration = findViewById(R.id.registerBtn);
        alreadyAcc = findViewById(R.id.log);

        registeration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration.this, Login.class);
                startActivity(intent);
            }
        });
    }
}
