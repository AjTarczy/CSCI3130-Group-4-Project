package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;

public class plans extends AppCompatActivity {

    MyApplicationData appState;
    private ListView ActivityListView;
    private FirebaseListAdapter<Activity> firebaseAdapter;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plans);
        appState = (MyApplicationData) getApplicationContext();

        ActivityListView = (ListView) findViewById(R.id.listView);


        //Set up the List View
        firebaseAdapter = new FirebaseListAdapter<Activity>(this, Activity.class,
                android.R.layout.simple_list_item_1, appState.userRef) {
            @Override
            protected void populateView( View v, Activity model, int position ) {
                TextView ActivityName = (TextView) v.findViewById(android.R.id.text1);
                ActivityName.setText(model.getDescription() + "%n" + model.getDate());
            }
        };
        ActivityListView.setAdapter(firebaseAdapter);
        ActivityListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // onItemClick method is called everytime a user clicks an item on the list
            @Override
            public void onItemClick( AdapterView<?> parent, View view, int position, long id ) {
                Activity act = (Activity) firebaseAdapter.getItem(position);
                showDetailView(act);
            }
        });
    }
    private void showDetailView(Activity act)
    {
        /**
         * method to go to detail view
         */
        //Intent intent = new Intent(this, DetailViewActivity.class);
        //intent.putExtra("Activity", act);
        //startActivity(intent);
    }

}
