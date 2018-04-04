package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.firebase.ui.database.FirebaseListAdapter;
import com.firebase.ui.database.FirebaseListOptions;
import com.google.firebase.database.FirebaseDatabase;

public class plans extends AppCompatActivity {

    MyApplicationData appState;
    private ListView ActivityListView;
    private User selectedUser;
    private FirebaseListAdapter<User> firebaseAdapter;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plans);
        appState = (MyApplicationData) getApplicationContext();
        appState.database = FirebaseDatabase.getInstance();
        appState.userRef = appState.database.getReference("users");

        selectedUser=new User();
        //selectedUser = (User)getIntent().getSerializableExtra("user");
        FirebaseListOptions<User> options = new FirebaseListOptions.Builder<User>()
                .setQuery(appState.userRef, User.class)
                .setLayout(android.R.layout.simple_list_item_1)
                .setLifecycleOwner(this)
                .build();
        ActivityListView = (ListView) findViewById(R.id.planList);

        //Set up the List View
        firebaseAdapter = new FirebaseListAdapter<User>(options) {
            @Override
            protected void populateView( View v, User model, int position ) {
                TextView ActivityName = (TextView) v.findViewById(android.R.id.text1);
                //ActivityName.setText(model.getDescription() + "%n" + model.getDate());
                ActivityName.setText(model.getUsername());
            }
        };
        ActivityListView.setAdapter(firebaseAdapter);
        ActivityListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // onItemClick method is called everytime a user clicks an item on the list
            @Override
            public void onItemClick( AdapterView<?> parent, View view, int position, long id ) {
                User act = (User) firebaseAdapter.getItem(position);
                showDetailView(act);
            }
        });
    }
    private void showDetailView(User act)
    {
        /**
         * method to go to detail view
         */
        Intent intent = new Intent(this, CreatePlan.class);
        //change this to send the activity later
        intent.putExtra("user", act);
        startActivity(intent);
    }
    public void createPlan(View view)
    {
        /**
         * method to go to Create Plan view
         */
        Intent intent = new Intent(this, CreatePlan.class);
        //intent.putExtra("user", selectedUser);
        startActivity(intent);
    }

}
