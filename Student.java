public class Student
{
int rollNo;
String name;
int age;
String mailId;
public Student(int rollNo, String name,int age,String mailId);
{
this.rollNo=rollNo;
this.name=name;
this.age=age;
this.mailId=mailId;
}
public int setRollNo(int RollNo)
{
this.rollNo=rollNo;
}
public String setName(String name)
{
this.name=name;
}
public int age(int age)
{
this.age=age;
}
public String mailId(String mailId)
}
public int getRollNo()
{
return rollNo;
}
public String getName()
{
return name;
}
public int getAge()
{
return age;
}
public String getMailId()
{
return mailId;
}
}