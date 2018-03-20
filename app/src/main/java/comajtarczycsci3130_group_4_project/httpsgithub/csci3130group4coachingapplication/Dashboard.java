package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Dashboard extends AppCompatActivity
{
    Intent intent = getIntent();
    MyApplicationData appData = (MyApplicationData)intent.getSerializableExtra("data");

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
        showEditProfile.putExtra("data", appData);
        startActivity(showEditProfile);
    }
    public void plans(View view)
    {
        Intent showPlans = new Intent(this, plans.class);
        showPlans.putExtra("data", appData);
        startActivity(showPlans);
    }
    public void manageCoach(View view)
    {
        Intent showManageCoach = new Intent(this, manageCoach.class);
        showManageCoach.putExtra("data", appData);
        startActivity(showManageCoach);
    }
    public void statistics(View view)
    {
        Intent showStatistics = new Intent(this, StatisticsPage.class);
        showStatistics.putExtra("data", appData);
        startActivity(showStatistics);
    }
}
