public class Employee
{
int empId;
String empName;
double salary;
String emailId;
public Employee(int empId,String empName,double salary,String emailId)
{
this.empId=empId;
this.empName=empName;
this.salary=salary;
this.emailId=emailId;
}
public int setEmpId(int empId)
{
this.empId=empId;
}
public String setEmpName(String empName)
{
this.empName=empName;
}
public double setSalary(double salary)
{
this.salary=salary;
}
public String setEmailId(String emailId)
{
this.emailId=emailId;
}
public int getEmpId()
{
return empId;
}
public String getEmpName()
{
return empName;
}
public int getSalary()
{
return salary;
}
public String getEmailId()
{
return emailId;
}
}
