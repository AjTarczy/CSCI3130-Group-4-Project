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

/**
 * shows a list of the athletes associated with the current coach
 * selecting an athlete launches the plan view for that athlete
 */
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
            // onItemClick method is called every time a user clicks an item on the list
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Athlete athlete = (Athlete) firebaseAdapter.getItem(position);

                showAthletePlans(athlete);


            }
        });

    }

    /**
     * launches the plan view activity for the selected athlete
     * @param athlete
     */
    private void showAthletePlans(Athlete athlete)
    {
        Intent intent = new Intent(this, plans.class);
        intent.putExtra("user", athlete);
        startActivity(intent);
    }
}
