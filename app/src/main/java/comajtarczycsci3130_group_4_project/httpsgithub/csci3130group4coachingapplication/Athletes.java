package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Athletes extends AppCompatActivity {

    String[] names={"jhvcd","jchvdcjh","jhcd","chvdshcj","jcvds"};
    TextView[] textView = new  TextView[5];
    int[] ids = {R.id.textView2, R.id.textView8, R.id.textView9,R.id.textView10,R.id.textView11};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.athletes);
        for(int i=0;i<5;i++){
            textView[i]=(TextView) findViewById(ids[i]);
            textView[i].setText(names[i]);
        }
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
