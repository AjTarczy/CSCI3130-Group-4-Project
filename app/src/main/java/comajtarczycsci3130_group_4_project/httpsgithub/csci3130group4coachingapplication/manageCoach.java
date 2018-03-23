package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import java.util.ArrayList;

public class manageCoach extends AppCompatActivity {

    private Athlete sample=new Athlete();
    private ArrayList<Coach> coaches=sample.getCoaches();
    EditText editText = null;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage__coach);
        String textToShow="empty";
        editText=(EditText) findViewById(R.id.addCoachID);

        for (int i=0;i<5;i++){
//            if(coaches.get(i)==null){
//                textToShow="";}
//            else{
//                textToShow="sampleee";
//            }
            int id = getResources().getIdentifier("coach"+(i+1), "id", getPackageName());
            TextView text = findViewById(id);
            text.setText(textToShow);

        }}
    public void delete(View view)
    {
        int i=0;
        switch (view.getId()) {
            case R.id.coachDelete1:
                i=0;
                break;
            case R.id.coachDelete2:
                i=1;
                break;
            case R.id.coachDelete3:
                i=2;
                break;
            case R.id.coachDelete4:
                i=3;
                break;
            case R.id.coachDelete5:
                i=4;
                break;
        }
        // if(coaches.get(i)!=null){
        //sample.removeCoach(coaches.get(i).getUsername());
        //appState.firebaseReference.child(sample.username).child("athletes").setValue(sample.getAthletes());
        //should write the code to remove the coach from the athlete coach list as well
        //}
    }

    public void add(View view){
        String UN = editText.getText().toString();
        // String newrequest=appState.firebaseReference.child(UN).child("Requests").push();
        //newrequest.setvalue(sample.username)


    }
}

