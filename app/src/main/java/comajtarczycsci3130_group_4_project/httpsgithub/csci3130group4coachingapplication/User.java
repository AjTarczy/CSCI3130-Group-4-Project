package comajtarczycsci3130_group_4_project.httpsgithub.csci3130group4coachingapplication;

/**
 * Created by robertnickerson on 2018-02-20.
 */

//class to store User data for entry into database
public class User {

    public String username;
    public String email;
    public String password;
    public String firstName;
    public String lastName;
    public String dob;
    public double height;
    public double weight;
    public String gender;
    public String role;

    public User()
    {

    }

    public User(String username, String email, String password, String firstName, String lastName, String dob, double height, double weight, String gender, String role)
    {
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.role = role;

    }
    public String getUsername()
    {
        return username;
    }

    public String getEmail()
    {
        return email;
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

    public String getdob()
    {
        return dob;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getGender()
    {
        return gender;
    }

    public String getRole()
    {
        return role;
    }

    public void setUsername()
    {
        this.username = username;
    }

    public void setEmail(String email)
    {
        this.email = email;
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

    public void setdob(String dob)
    {
        this.dob = dob;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setRole(String role)
    {
        this.role = role;
    }
}