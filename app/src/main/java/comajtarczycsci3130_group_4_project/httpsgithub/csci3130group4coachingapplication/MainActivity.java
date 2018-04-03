package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApplicationData appData = (MyApplicationData) getApplication();

        appData.database = FirebaseDatabase.getInstance();
        appData.userRef = appData.database.getReference("users");

        final DatabaseReference localUserRef = appData.userRef;

        Button mLoginButton = findViewById(R.id.login_button);
        Button mRegisterButton = findViewById(R.id.register_button);


        /**
         * set event listener for login button press
         */
        mLoginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mUsernameView = (EditText) findViewById(R.id.main_username_input);
                mPasswordView = (EditText) findViewById(R.id.main_password);

                //create database event listener to query database for user login info
                localUserRef.addListenerForSingleValueEvent(new ValueEventListener()
                    {
                    @Override
                    public void onDataChange(DataSnapshot data) {


                        String username = mUsernameView.getText().toString();
                        String password = mPasswordView.getText().toString();

                        //if username is blank
                        if (username.equals("")) {
                            return;
                        }
                        //if username is in the database
                        if (data.child("coaches").child(username).exists()) {

                            //if password in database matches entered password
                            if (data.child("coaches").child(username).child("password").getValue().equals(password)) {

                                Coach retrievedUser = data.child("coaches").child(username).getValue(Coach.class);

                                login(retrievedUser);
                            }

                        } else if (data.child("athletes").child(username).exists()) {
                            if (data.child("athletes").child(username).child("password").getValue().equals(password)) {
                                Athlete retrievedUser = data.child("athletes").child(username).getValue(Athlete.class);

                                login(retrievedUser);
                            }

                        }
                    };


                    @Override
                    public void onCancelled(DatabaseError databaseError)
                    {

                    }
                });

            }
        });

        //set event listener for register button press
        mRegisterButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                register();
            }
        });
    }

    /**
     * login with the user retrieved from the database
     * @param user
     */
    private void login(User user)
    {
        Intent intent = new Intent(this, Dashboard.class);
        intent.putExtra("user", user);

        startActivity(intent);


    }

    /**
     * launch the registration page
     */
    private void register()
    {

        Intent registrationIntent = new Intent(this, RegistrationActivity.class);
        startActivity(registrationIntent);
    }

}
