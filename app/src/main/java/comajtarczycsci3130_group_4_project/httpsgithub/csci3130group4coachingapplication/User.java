package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

/**
 * Created by robertnickerson on 2018-02-16.
 */

//class to store User data for entry into database
public class User
{

    //user photo
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String DoB;
    private double height;
    private double weight;

    public User()
    {

    }

    public User(String username, String password, String firstName, String lastName, String DoB, double height, double weight)
    {

    }

    public void setUserName(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setDoB(String DoB)
    {
        this.DoB = DoB;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getDoB()
    {
        return DoB;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWeight()
    {
        return weight;
    }



}
