package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.app.Application;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.Serializable;

/**
 * Created by Gashin on 3/9/2018.
 */


public class MyApplicationData extends Application {

    public  FirebaseDatabase database;
    public  DatabaseReference userRef;
    public  DatabaseReference statRef;
    public  User currentUser;

}