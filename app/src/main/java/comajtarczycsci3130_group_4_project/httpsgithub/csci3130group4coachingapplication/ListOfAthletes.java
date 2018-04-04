package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.FirebaseDatabase;

public class ListOfAthletes extends AppCompatActivity {

    MyApplicationData appState;
    private ListView athleteListView;
    private FirebaseListAdapter<Athlete> firebaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coach_plans);

        Coach selectedUser = (Coach)getIntent().getSerializableExtra("user");

        //Get the app wide shared variables
        appState = (MyApplicationData) getApplication();

        //Get the reference to the UI contents
        athleteListView = (ListView) findViewById(R.id.coachPlanView);

        //Set up the List View
        firebaseAdapter = new FirebaseListAdapter<Athlete>(this, Athlete.class,
                android.R.layout.simple_list_item_1, appState.database.getReference().child("AthleteList").child(selectedUser.getUsername())) {
            @Override
            protected void populateView(View v, Athlete athlete, int position) {
                TextView athleteUsername = (TextView) v.findViewById(android.R.id.text1);
                athleteUsername.setText(athlete.getUsername());
            }
        };
        athleteListView.setAdapter(firebaseAdapter);
        athleteListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // onItemClick method is called everytime a user clicks an item on the list
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Athlete athlete = (Athlete) firebaseAdapter.getItem(position);
                //TODO: Do something with the plan
            }
        });
    }
}
