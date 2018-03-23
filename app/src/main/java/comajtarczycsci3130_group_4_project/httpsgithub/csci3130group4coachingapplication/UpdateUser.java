package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import java.util.List;

public class UpdateUser extends AppCompatActivity {

    MyApplicationData appState;

    // UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private View mProgressView;
    private View mRegistrationFormView;
    private TextView mUsernameView;
    private EditText mFirstNameView;
    private EditText mLastNameView;
    private EditText mDoBView;
    private EditText mHeightView;
    private EditText mWeightView;
    private Spinner mGenderView;
    private Switch mRoleView;
    private static final String[] genderListItems = {"Male", "Female", "Prefer not to specify"};
    User selectedUser;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        appState = (MyApplicationData)getApplicationContext();
        selectedUser = (User)getIntent().getSerializableExtra("user");

        setContentView(R.layout.activity_update_user);
        // Set up the login form.
        mEmailView = (AutoCompleteTextView) findViewById(R.id.email_update);
        mUsernameView = (TextView) findViewById(R.id.username_update);
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

        Button mUpdateButton = findViewById(R.id.update_user_button);

        if (selectedUser != null)
        {
            mEmailView.setText(selectedUser.getEmail());
            mUsernameView.setText(selectedUser.getUsername());
            mFirstNameView.setText(selectedUser.getFirstName());
            mLastNameView.setText(selectedUser.getLastName());
            mDoBView.setText(selectedUser.getdob());
            String height = String.valueOf(selectedUser.getHeight());
            mHeightView.setText(height);
            String weight = String.valueOf(selectedUser.getWeight());
            mWeightView.setText(weight);
            mDoBView.setText(selectedUser.getdob());

            String gender = selectedUser.getGender();

            if (gender != null) {
                int spinnerPosition = genderAdapter.getPosition(gender);
                mGenderView.setSelection(spinnerPosition);
            }

            String role = selectedUser.getRole();

            if (role.equals("Coach"))
            {
                mRoleView.setChecked(true);
            }

            else
            {
                mRoleView.setChecked(false);
            }

        }

        mUpdateButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                updateUser();
            }
        });

        mRegistrationFormView = findViewById(R.id.update_form);
        mProgressView = findViewById(R.id.login_progress);
    }

    /**
     *     pulls user data from fields, creates User object, pushes into the database, overwriting old entry
     */
    private void updateUser() {

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
        appState.userRef.child(username).setValue(newUser, insertListener);

    }


}
