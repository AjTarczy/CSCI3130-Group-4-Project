package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Statistics extends AppCompatActivity {

    MyApplicationData appState;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistics);
        appState = (MyApplicationData)getApplicationContext();

    }
}
