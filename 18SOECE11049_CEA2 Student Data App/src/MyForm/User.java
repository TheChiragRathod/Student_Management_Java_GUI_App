//This class stored the data of users..
package MyForm;
public class User
{
    private int id;
    private String enrollment,name,username,password,address,gender,java,python;
    
    public User(int id,String enrollment,String name,String username,String password,String address,String gender,String java,String python)
    {
        this.id=id;
        this.enrollment=enrollment;
        this.name=name;
        this.username=username;
        this.password=password;
        this.address=address;
        this.gender=gender;
        this.java=java;
        this.python=python;
    }
    public int getid()
    {
        return id;
    }
    public String getenrollment()
    {
        return enrollment;
    }
    public String getname()
    {
        return name;
    }
    public String getusername()
    {
        return username;
    }
    public String getpassword()
    {
        return password;
    }
    
    public String getaddress()
    {
        return address;
    }
    public String getgender()
    {
        return gender;
    }
    public String getjava()
    {
        return java;
    }
    public String getpython()
    {
        return python;
    }
}
