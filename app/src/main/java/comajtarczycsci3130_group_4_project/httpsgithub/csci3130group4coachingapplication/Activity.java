package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

/**
 * Created by robertnickerson on 2018-03-02.
 * Class to hold data about activities assigned to Athletes
 */

public class Activity
{
    private boolean isCompleted;
    private String description;
    private String date;

    public Activity()
    {

    }

    public Activity(boolean isCompleted, String description, String date)
    {
        this.isCompleted = isCompleted;
        this.description = description;
        this.date = date;
    }

    public void setCompleted(boolean isCompleted)
    {
        this.isCompleted = isCompleted;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public boolean getIsCompleted()
    {
        return isCompleted;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDate()
    {
        return date;
    }


}
