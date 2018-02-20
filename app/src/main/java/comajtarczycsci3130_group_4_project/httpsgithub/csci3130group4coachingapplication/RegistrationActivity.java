package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
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
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class RegistrationActivity extends AppCompatActivity implements LoaderCallbacks<Cursor> {

    //class to store User data for entry into database
    public static class User {

        public String email;
        public String password;
        public String firstName;
        public String lastName;
        public String DoB;
        public double height;
        public double weight;
        public String gender;


        public User(String email, String password, String firstName, String lastName, String DoB, double height, double weight, String gender) {

        }
    }



    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference usersRef = database.getReference("users");

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
    private static final String[] listItems = {"Male", "Female", "Prefer not to specify"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


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
        mPasswordView = (EditText) findViewById(R.id.password);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(RegistrationActivity.this,
                android.R.layout.simple_spinner_item,listItems);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mGenderView.setAdapter(adapter);

        Button mRegisterButton = findViewById(R.id.register_button);
        mRegisterButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser();
            }
        });

        mRegistrationFormView = findViewById(R.id.registration_form);




        mProgressView = findViewById(R.id.login_progress);
    }







    /**
     * Attempts to sign in or register the account specified by the login form.
     * If there are form errors (invalid email, missing fields, etc.), the
     * errors are presented and no actual login attempt is made.
     */
    private void registerUser() {

        /* Store values at the time of the login attempt.
        String username = mUsernameView.getText().toString();
        String email = mEmailView.getText().toString();
        String password = mPasswordView.getText().toString();
        String firstName = mFirstNameView.getText().toString();
        String lastName = mLastNameView.getText().toString();
        String dob = mDoBView.getText().toString();
        String height = mHeightView.getText().toString();
        String weight = mWeightView.getText().toString();
        String gender = mGenderView.getSelectedItem().toString();*/




       // User newUser = new User(email, password, firstName, lastName, dob, height, weight, gender);

      //  User newUser = new User("test@test.com", "test", "first", "last", "1988/03/15", 172, 75, "Male");


        //Map<String, User> users = new HashMap<>();
        //users.put(username, newUser);

        //usersRef.setValue(users);

        //NOTE: Trying to figure out why this doesn't add data correctly to the database
        usersRef.child("rob").setValue(new User("test@test.com", "password", "First", "Last", "1988/03/15", 172, 75, "Male"));




    }






    @Override
    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this,
                // Retrieve data rows for the device user's 'profile' contact.
                Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI,
                        ContactsContract.Contacts.Data.CONTENT_DIRECTORY), ProfileQuery.PROJECTION,

                // Select only email addresses.
                ContactsContract.Contacts.Data.MIMETYPE +
                        " = ?", new String[]{ContactsContract.CommonDataKinds.Email
                .CONTENT_ITEM_TYPE},

                // Show primary email addresses first. Note that there won't be
                // a primary email address if the user hasn't specified one.
                ContactsContract.Contacts.Data.IS_PRIMARY + " DESC");
    }

    @Override
    public void onLoadFinished(Loader<Cursor> cursorLoader, Cursor cursor) {
        List<String> emails = new ArrayList<>();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            emails.add(cursor.getString(ProfileQuery.ADDRESS));
            cursor.moveToNext();
        }

        addEmailsToAutoComplete(emails);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> cursorLoader) {

    }

    private void addEmailsToAutoComplete(List<String> emailAddressCollection) {
        //Create adapter to tell the AutoCompleteTextView what to show in its dropdown list.
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(RegistrationActivity.this,
                        android.R.layout.simple_dropdown_item_1line, emailAddressCollection);

        mEmailView.setAdapter(adapter);
    }


    private interface ProfileQuery {
        String[] PROJECTION = {
                ContactsContract.CommonDataKinds.Email.ADDRESS,
                ContactsContract.CommonDataKinds.Email.IS_PRIMARY,
        };

        int ADDRESS = 0;
        int IS_PRIMARY = 1;
    }








}

