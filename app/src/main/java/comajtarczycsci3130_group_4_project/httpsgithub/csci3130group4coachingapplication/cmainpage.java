package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

/**
 * Created by lizzie on 2018-03-08.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class cmainpage extends AppCompatActivity
{
    MyApplicationData appState;

    User currentUser;

    String welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cmainpage);
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

    public void editProfile(View view)
    {
        Intent updateUser = new Intent(this, UpdateUser.class);
        updateUser.putExtra("user", currentUser);
        startActivity(updateUser);
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
