package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Athletes extends AppCompatActivity {

    String

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.athletes);
    }

    public void plans(View view)
    {
        Intent showPlans = new Intent(this, plans.class);
        startActivity(showPlans);
    }

    public void statistics(View view)
    {
        Intent showStatistics = new Intent(this, Statistics.class);
        startActivity(showStatistics);
    }
}
