package nigeriandailies.com.ng.coolgain;

<<<<<<< HEAD
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
=======
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    EditText mEmail, mPassword;
    Button mLoginBtn;
    TextView mCreateBtn;
    ProgressBar progressBar;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_login);
        getSupportActionBar ().hide ();


        mEmail = findViewById (R.id.Email);
        mPassword = findViewById (R.id.Password);
        progressBar = findViewById (R.id.progressBar);
        fAuth = FirebaseAuth.getInstance ();
        mLoginBtn = findViewById (R.id.loginBtn);
        mCreateBtn = findViewById (R.id.createText);

        mLoginBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                String email = mEmail.getText ().toString ().trim ();
                String password = mPassword.getText ().toString ().trim ();

                if (TextUtils.isEmpty (email)) {
                    mEmail.setError ("Email is Required");
                    return;
                }

                if (TextUtils.isEmpty (password)) {
                    mPassword.setError ("Password is Required");
                    return;
                }

                if (password.length () < 6) {
                    mPassword.setError ("Invalid password");
                    return;
                }

                progressBar.setVisibility (View.VISIBLE);

                /* Authenticate the user! */
                fAuth.signInWithEmailAndPassword (email, password).addOnCompleteListener (new OnCompleteListener<AuthResult> () {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful ()){
                            Toast.makeText (Login.this, "Logged in successfully", Toast.LENGTH_SHORT).show ();
                            startActivity (new Intent (getApplicationContext (), MainActivity.class));
                        }else {
                            Toast.makeText (Login.this, "Error ! " + task.getException ().getMessage (), Toast.LENGTH_SHORT).show ();
                            progressBar.setVisibility (View.GONE);
                        }

                    }
                });

            }
        });

        mCreateBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (getApplicationContext (),Register.class));
            }
        });


        }
    }
>>>>>>> origin/master
