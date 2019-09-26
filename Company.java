
import java.util.*;

class Company{
	public static void main(String[] args) {
		NormalEmployee ne = new NormalEmployee();
		ne.setName("Ruya");
		ne.setBasicSalary(12000000);
		ne.setAddress("White house");
		System.out.println("Monthly salary of "+ne.getName()+ " who lives in "+ne.getAddress() + " is "+ne.getMonthlySalary() );
		BonusEmployee be = new BonusEmployee();
		be.setName("Akal");
		be.setAddress("LOC");
		be.setBasicSalary(120000);
		be.setmonthlyBonus(2390909);
		System.out.println("Monthly salary of "+be.getName() +" who lives on the "+be.getAddress() + " is "+be.getMonthlySalary());
	}
}

abstract class Employees 
{
private String name, address;
protected int basicSalary;
public String getName(){
return name;
}
public String getAddress(){
return address;
}
public int getBasicSalary(){
return basicSalary;
}
public void setAddress(String add){
address = add;
}
public void setName(String nm){
name = nm;
}
public void setBasicSalary(int sal){
basicSalary = sal;
}
public abstract int getMonthlySalary();
}
class NormalEmployee extends Employees{
	public int getMonthlySalary(){
		return(basicSalary/12);
	}

}
class BonusEmployee extends Employees{
	int bonus;
	public void setmonthlyBonus(int bonus){
		this.bonus=bonus;	}
	public int getMonthlySalary(){
		return(basicSalary/12+bonus);
	}

}


