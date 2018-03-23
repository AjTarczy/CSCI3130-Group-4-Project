package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class editProfile extends AppCompatActivity {

    Intent intent = getIntent();
    MyApplicationData appData = (MyApplicationData)intent.getSerializableExtra("data");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profile);
    }
}
