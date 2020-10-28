package nigeriandailies.com.ng.coolgain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {
    private TextInputLayout email;
    private TextInputLayout password;
    private Button loginBtn;
    private TextView create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        accountLogin();
    }

    private void accountLogin() {
        email = findViewById(R.id.login_email);
        password = findViewById(R.id.login_password);
        loginBtn = findViewById(R.id.loginBtn);
        create = findViewById(R.id.create_ac);

    }
}
