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

    //create database reference
    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference usersRef = database.getReference("users");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
<<<<<<< HEAD

=======
        TextView text = findViewById(R.id.textView);
        text.setText(information);
        
>>>>>>> parent of 6268add... Revert "Merge pull request #28 from AjTarczy/US2-2"
=======

>>>>>>> parent of fe6b6a4... Merge branch 'master' of https://github.com/AjTarczy/CSCI3130-Group-4-Project
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
                usersRef.addListenerForSingleValueEvent(new ValueEventListener()
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
        startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
    }



}
