package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.Manifest.permission.READ_CONTACTS;

/**
 */
public class RegistrationActivity extends AppCompatActivity {

    MyApplicationData appState;
    
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

        appState = (MyApplicationData)getApplicationContext();

        setContentView(R.layout.activity_registration);
        // Set up the login form.
        mEmailView = (AutoCompleteTextView) findViewById(R.id.email);
        mUsernameView = (EditText) findViewById(R.id.username_input);
        mFirstNameView = (EditText) findViewById(R.id.first_name_input);
        mLastNameView = (EditText) findViewById(R.id.last_name_input);
        mDoBView = (EditText) findViewById(R.id.dob_input);
        mHeightView = (EditText) findViewById(R.id.height_input);
        mWeightView = (EditText) findViewById(R.id.weight_input);
        mGenderView = (Spinner) findViewById(R.id.gender_input);
        mRoleView = (Switch) findViewById(R.id.role_switch);
        mPasswordView = (EditText) findViewById(R.id.password);

        ArrayAdapter<String> genderAdapter = new ArrayAdapter<String>(RegistrationActivity.this,
                android.R.layout.simple_spinner_item, genderListItems);

        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mGenderView.setAdapter(genderAdapter);

        Button mRegisterButton = findViewById(R.id.submit_registration);

        mRegisterButton.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view) {
                registerUser();
            }
        });

        mRegistrationFormView = findViewById(R.id.registration_form);
        mProgressView = findViewById(R.id.login_progress);
    }

    /**
     * pulls user data from fields, creates User object, pushes into the database
     */
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
            public void onComplete(DatabaseError databaseError, DatabaseReference usersRef)
            {


                if (databaseError != null)
                {
                    Log.d("test", "failed insertion");

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


