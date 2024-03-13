package main;

public class student
{
   private int rollNo;
   private static String name,add,password;
   private String sub1,sub2,sub3,sub4;
    public student()
    {}
    public void setrollNo(int m)
    {
        rollNo=m;
    }
    public int  getrollNo()
    {
        return rollNo;
    }

    public void setname(String nm)
    {
        name=nm;
    }
    public String getname()
    {
        return name;
    }
    public void setaddress(String ad)
    {
        add=ad;
    }
    public String getaddress()
    {
        return add;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSub1() {
        return sub1;
    }

    public void setSub1(String sub1) {
        this.sub1 = sub1;
    }

    public String getSub2() {
        return sub2;
    }

    public void setSub2(String sub2) {
        this.sub2 = sub2;
    }

    public String getSub3() {
        return sub3;
    }

    public void setSub3(String sub3) {
        this.sub3 = sub3;
    }

    public String getSub4() {
        return sub4;
    }

    public void setSub4(String sub4) {
        this.sub4 = sub4;
    }
}
