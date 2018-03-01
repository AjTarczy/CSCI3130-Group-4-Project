package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class amainpage extends AppCompatActivity
{
    String information = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amainpage);
        TextView text = findViewById(R.id.textView);
        text.setText(information);

    }
    public void editProfile(View view)
    {
        Intent showEditProfile = new Intent(this, editProfile.class);
        startActivity(showEditProfile);
    }
    public void plans(View view)
    {
        Intent showPlans = new Intent(this, plans.class);
        startActivity(showPlans);
    }
    public void manageCoach(View view)
    {
        Intent showManageCoach = new Intent(this, manageCoach.class);
        startActivity(showManageCoach);
    }
    public void statistics(View view)
    {
        Intent showStatistics = new Intent(this, Statistics.class);
        startActivity(showStatistics);
    }
}
