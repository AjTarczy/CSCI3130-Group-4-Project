package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

/**
 * Created by User on 2018-04-04.
 */

public class CreatePlan extends AppCompatActivity {

    private Button submitButton;
    private EditText dateField, descriptionField;
    private Switch completedField;
    private MyApplicationData appState;
    private User selectedUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_plan);
        appState = ((MyApplicationData) getApplicationContext());
        selectedUser = (User)getIntent().getSerializableExtra("user");

        submitButton = (Button) findViewById(R.id.submitButton);
        dateField = (EditText) findViewById(R.id.date);
        descriptionField = (EditText) findViewById(R.id.description);
        completedField = (Switch) findViewById(R.id.completed);
    }

    public void submitPlan(View v) {
        String planID = appState.database.getReference().child("Plans").child(selectedUser.getUsername()).push().getKey();
        String date = dateField.getText().toString();
        String description = descriptionField.getText().toString();
        boolean completed = completedField.isChecked();
        comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication.Activity plan = new comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication.Activity(completed, description, date);

        appState.database.getReference().child("Plans").child(selectedUser.getUsername()).child(planID).setValue(plan);

        finish();
    }

}
