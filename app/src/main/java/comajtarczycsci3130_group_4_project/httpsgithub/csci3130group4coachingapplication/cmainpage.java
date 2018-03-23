package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

/**
 * Created by lizzie on 2018-03-08.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class cmainpage extends AppCompatActivity
{
    String information = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cmainpage);
        TextView text = findViewById(R.id.textView);
        text.setText(information);

    }
    public void editProfile(View view)
    {
        Intent showEditProfile = new Intent(this, editProfile.class);
        startActivity(showEditProfile);
    }
    public void manageAthlete(View view)
    {
        Intent showManageAthlete = new Intent(this, manageAthlete.class);
        startActivity(showManageAthlete);
    }
    public void listOfAthlete(View view)
    {
        Intent showListOfAthlete = new Intent(this, ListOfAthletes.class);
        startActivity(showListOfAthlete);
    }
}
