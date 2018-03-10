package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.app.Application;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.Serializable;

/**
 * Created by Gashin on 3/9/2018.
 */


public class MyApplicationData implements Serializable {

    public static FirebaseDatabase database;
    public DatabaseReference userRef;
    public DatabaseReference statRef;
    public User currentUser;

    public MyApplicationData(){
       database = FirebaseDatabase.getInstance();
       userRef = database.getReference("users");
       statRef = database.getReference("stats");
    }

    public void setCurrentUser(User currentUser){
        this.currentUser = currentUser;
    }





}