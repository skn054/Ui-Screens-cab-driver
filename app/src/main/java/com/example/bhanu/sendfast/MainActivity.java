package com.example.bhanu.sendfast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends Activity {
    @InjectView(R.id.input_email)
    EditText _emailText;
    @InjectView(R.id.input_password) EditText _passwordText;
    @InjectView(R.id.btn_login)
    Button _loginButton;
    String email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
       Intent i=getIntent();

        if(i!=null&&i.getBooleanExtra("EXIT",false))
        {
              finish();
        }
        _loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email=_emailText.getText().toString();
                String pass=_passwordText.getText().toString();
                if((email.length()>0&& Patterns.EMAIL_ADDRESS.matcher(email).matches())&&pass.length()>0)
                {
                    Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                    intent.putExtra("Email",email);
                    //intent.putExtra("Password",pass);

                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Enter Valid email address and Password", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
