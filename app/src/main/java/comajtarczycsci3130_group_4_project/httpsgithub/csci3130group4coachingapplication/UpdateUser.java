package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import java.util.List;

public class UpdateUser extends AppCompatActivity {

    Intent i = getIntent();
    MyApplicationData appData = (MyApplicationData)i.getSerializableExtra("data");

    // UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private View mProgressView;
    private View mRegistrationFormView;
    private EditText mUsernameView;
    private EditText mFirstNameView;
    private EditText mLastNameView;
    private EditText mDoBView;
    private EditText mHeightView;
    private EditText mWeightView;
    private Spinner mGenderView;
    private Switch mRoleView;
    private static final String[] genderListItems = {"Male", "Female", "Prefer not to specify"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_update_user);
        // Set up the login form.
        mEmailView = (AutoCompleteTextView) findViewById(R.id.email_update);
        mUsernameView = (EditText) findViewById(R.id.username_update);
        mFirstNameView = (EditText) findViewById(R.id.first_name_update);
        mLastNameView = (EditText) findViewById(R.id.last_name_update);
        mDoBView = (EditText) findViewById(R.id.dob_update);
        mHeightView = (EditText) findViewById(R.id.height_update);
        mWeightView = (EditText) findViewById(R.id.weight_update);
        mGenderView = (Spinner) findViewById(R.id.gender_update);
        mRoleView = (Switch) findViewById(R.id.role_update);
        mPasswordView = (EditText) findViewById(R.id.password_update);

        ArrayAdapter<String> genderAdapter = new ArrayAdapter<String>(UpdateUser.this,
                android.R.layout.simple_spinner_item, genderListItems);

        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mGenderView.setAdapter(genderAdapter);

        Button mRegisterButton = findViewById(R.id.update_button);

        mRegisterButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                registerUser();
            }
        });

        mRegistrationFormView = findViewById(R.id.update_form);
        mProgressView = findViewById(R.id.login_progress);
    }

    //pulls user data from fields, creates User object, pushes into the database
    private void registerUser() {

        // Store values at the time of the login attempt.
        String username = mUsernameView.getText().toString();
        String email = mEmailView.getText().toString();
        String password = mPasswordView.getText().toString();
        String firstName = mFirstNameView.getText().toString();
        String lastName = mLastNameView.getText().toString();
        String dob = mDoBView.getText().toString();
        double height = Double.parseDouble(mHeightView.getText().toString());
        double weight = Double.parseDouble(mWeightView.getText().toString());
        String gender = mGenderView.getSelectedItem().toString();
        String role;

        //if role switch is in "on" position
        if (mRoleView.isChecked())
        {
            role = mRoleView.getTextOn().toString();
        }

        //if role switch is in "off" position
        else
        {
            role = mRoleView.getTextOff().toString();
        }

        //check if insertion is successful or not
        DatabaseReference.CompletionListener insertListener = new DatabaseReference.CompletionListener()
        {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference useRef)
            {

                if (databaseError != null)
                {
                    //Failed insertion
                }

                else
                {
                    //Successful insertion, return to main activity
                    finish();
                }

            }
        };

        //create user object, push into database
        User newUser = new User(username, email, password, firstName, lastName, dob, height, weight, gender, role);
        appData.userRef.child(username).setValue(newUser, insertListener);

    }


}
