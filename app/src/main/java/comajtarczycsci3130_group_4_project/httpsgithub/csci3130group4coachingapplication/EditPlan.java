package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

/**
 * Created by User on 2018-04-05.
 */

public class EditPlan extends AppCompatActivity {

    private Button editButton, deleteButton;
    private EditText dateField, descriptionField;
    private Switch completedField;
    private MyApplicationData appState;
    private User selectedUser;
    private Activity selectedPlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_plan);

        appState = ((MyApplicationData) getApplicationContext());

        selectedUser = (User) getIntent().getSerializableExtra("user");
        selectedPlan = (Activity) getIntent().getSerializableExtra("plan");

        dateField = (EditText) findViewById(R.id.dateEdit);
        descriptionField = (EditText) findViewById(R.id.descriptionEdit);
        completedField = (Switch) findViewById(R.id.completedEdit);

        if(selectedPlan != null) {
            dateField.setText(selectedPlan.getDate());
            descriptionField.setText(selectedPlan.getDescription());
            completedField.setChecked(selectedPlan.isCompleted());
        }
    }

    public void updatePlan(View v) {

        String id = selectedPlan.getId();
        String description = descriptionField.getText().toString();
        String date = dateField.getText().toString();
        boolean completed = completedField.isChecked();
        Activity plan = new Activity(id, completed, description, date);

        appState.database.getReference().child("Plans").child(selectedUser.getUsername()).child(id).setValue(plan);

        finish();
    }

    public void erasePlan(View v) {

        String planId = selectedPlan.getId();
        appState.database.getReference().child("Plans").child(selectedUser.getUsername()).child(planId).setValue(null);

        finish();
    }

}
