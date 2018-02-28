package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
<<<<<<< HEAD
import android.widget.Button;
import android.widget.EditText;
=======
import android.widget.TextView;
>>>>>>> parent of 1e37f8e... Merge branch 'master' into US4


public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
        TextView text = findViewById(R.id.textView);
        text.setText(information);
<<<<<<< HEAD
        
>>>>>>> parent of 6268add... Revert "Merge pull request #28 from AjTarczy/US2-2"
=======

>>>>>>> parent of fe6b6a4... Merge branch 'master' of https://github.com/AjTarczy/CSCI3130-Group-4-Project
=======

>>>>>>> parent of 69d8294... Merge pull request #29 from AjTarczy/US4
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

=======
>>>>>>> parent of 1e37f8e... Merge branch 'master' into US4

    }
<<<<<<< HEAD

    private void register()
    {
        startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
    }



=======
    public void editProfile(View view)
    {
        Intent showEditProfile = new Intent(this, editProfile.class);
        startActivity(showEditProfile);
    }
    public void plans(View view)
    {
        Intent showPlans = new Intent(this, plans.class);
        startActivity(showPlans);
    }
    public void manageCoach(View view)
    {
        Intent showManageCoach = new Intent(this, manageCoach.class);
        startActivity(showManageCoach);
    }
    public void statistics(View view)
    {
        Intent showStatistics = new Intent(this, Statistics.class);
        startActivity(showStatistics);
    }
>>>>>>> parent of 1e37f8e... Merge branch 'master' into US4
}
