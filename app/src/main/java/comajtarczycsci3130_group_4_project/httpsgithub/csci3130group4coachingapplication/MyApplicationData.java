package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.app.Application;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Gashin on 3/9/2018.
 */


public class MyApplicationData extends Application {

    public DatabaseReference firebaseReference;
    public FirebaseDatabase firebaseDBInstance;

}