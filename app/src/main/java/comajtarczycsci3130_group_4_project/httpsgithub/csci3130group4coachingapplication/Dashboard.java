package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Dashboard extends AppCompatActivity
{
    MyApplicationData appState;

    User currentUser;

    String welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amainpage);
        TextView text = findViewById(R.id.textView);
        appState = (MyApplicationData)getApplicationContext();
        currentUser = (User)getIntent().getSerializableExtra("user");
        welcome = "Welcome " + currentUser.getUsername();
        text.setText(welcome);

        Button mLogoutButton = findViewById(R.id.logout_button);

        mLogoutButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });

    }

    /**
     * launch user update page
     * @param view
     */
    public void editProfile(View view)
    {
        Intent updateUser = new Intent(this, UpdateUser.class);
        updateUser.putExtra("user", currentUser);
        startActivity(updateUser);
    }

    /**
     * launch user plans page
     * @param view
     */
    public void plans(View view)
    {
        Intent showPlans = new Intent(this, plans.class);
        startActivity(showPlans);
    }

    /**
     * launch manage coach page
     * @param view
     */
    public void manageCoach(View view)
    {
        Intent showManageCoach = new Intent(this, manageCoach.class);
        startActivity(showManageCoach);
    }

    /**
     * launch statistics page
     * @param view
     */
    public void statistics(View view)
    {
        Intent showStatistics = new Intent(this, StatisticsPage.class);
        startActivity(showStatistics);
    }
}
