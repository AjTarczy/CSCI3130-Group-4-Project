package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity
{

    private EditText mUsernameView;
    private EditText mPasswordView;
    //Get the app wide shared variables
    public MyApplicationData appData = new MyApplicationData();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mLoginButton = findViewById(R.id.login_button);





        //set event listener for login button press
        mLoginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mUsernameView = (EditText) findViewById(R.id.main_username_input);
                mPasswordView = (EditText) findViewById(R.id.main_password);


                //create database event listener to query database for user login info
                appData.userRef.addListenerForSingleValueEvent(new ValueEventListener()
                    {
                    @Override
                    public void onDataChange(DataSnapshot data)
                    {

                        String username = mUsernameView.getText().toString();
                        String password = mPasswordView.getText().toString();

                        //if username is blank
                        if (username.equals(""))
                        {
                            return;
                        }

                            //if username is in the database
                            if (data.child(username).exists())
                            {

                                //if password in database matches entered password
                                if (data.child(username).child("password").getValue().equals(password))
                                {
                                    login();
                                }

                            }

                            //if user enters an unrecognized username, go to registration page
                            else
                            {
                                register();
                            }
                        }


                    @Override
                    public void onCancelled(DatabaseError databaseError)
                    {

                    }
                });

            }
        });
    }

    private void login()
    {
        startActivity(new Intent(MainActivity.this, LoggedInActivity.class));
    }

    private void register()
    {
        Intent registrationIntent = new Intent(MainActivity.this, RegistrationActivity.class);
        registrationIntent.putExtra("data", appData);
        startActivity(registrationIntent);
    }



}
