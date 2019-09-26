

import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

class Run{

  public static void main(String args[]){
    Vector<Employee> Emplist = new Vector<Employee>();
    int sel0=0,sel1=0;
    Scanner sc = new Scanner(System.in);
    int x=0,temp,i,y=0;
    sortbySalary sorter = new sortbySalary();
    int a;

    //Adding data explicitly for testing purposes...
    Emplist.add(new Employee(new Integer(65),new Integer(100000),"Akhil","Male","President","Intergalactic Empire"));
    Emplist.add(new Employee(new Integer(71),new Integer(50000),"Vaibhav","Male","Prime Minister","Intergalactic Empire"));
    Emplist.add(new Employee(new Integer(53),new Integer(30000),"Rajiv","Male","Ambassador","Intergalactic Empire"));
    Emplist.add(new Employee(new Integer(44),new Integer(50000),"Mohammed","Male","General","Intergalactic Empire"));
    Emplist.add(new Employee(new Integer(78),new Integer(50000),"Yash","Male","Admiral","Intergalactic Empire"));
    Emplist.add(new Employee(new Integer(75),new Integer(50000),"Vidisha","Female","Air Chief Marshall","Intergalactic Empire"));
    Emplist.add(new Employee(new Integer(70),new Integer(70000),"Urvi","Female","Chief-of-Staff","Intergalactic Empire"));
    Emplist.add(new Employee(new Integer(67),new Integer(30000),"Soumi","Female","Justice Supreme","Intergalactic Empire"));
                
    //Implicit additions are supported using case 1...

    do{
      
      System.out.println("========================\tEMPLOYEE DATABASE\t=============================");
      System.out.println("1. Add employee\n2. Display\n3. Delete employee\n4. Compare by salary");
      System.out.println("5. Search employee\n6. Sort by name");
      System.out.println("Enter your choice: ");
      sel1 = sc.nextInt();
      switch(sel1){

      case 1:
        System.out.println("How many to add? : ");  
        x = sc.nextInt();
        temp = Emplist.size();
        for(i=temp;i<x+temp;i++){
          Employee e = new Employee();
          Emplist.add(e);
        }
        break;


      case 2:
        for(i=0;i<Emplist.size();i++){
          System.out.println(Emplist.get(i));
        }
        break;
      
      case 3:
        x = Employee.search(Emplist);
        Emplist.remove(x);
        break;

      case 4:
        x = Employee.search(Emplist);
        y = Employee.search(Emplist);
        a = sorter.compare(Emplist.get(x),Emplist.get(y));
        if(a==1){
          System.out.println(Emplist.get(x));
        }
        else if(a==-1){
          System.out.println(Emplist.get(y)); 
        }
        else if(a==0){
          System.out.println("Both are paid equally!");
        }
        break;

      case 5:
        x = Employee.search(Emplist);
        System.out.println(Emplist.get(x));
        break;

      case 6:
        Collections.sort(Emplist,new sortbyName());
        break;
      }
      System.out.println("Try Again? (1/0) : ");
      sel0 = sc.nextInt();
    }while(sel0 == 1);


  }

}

class Employee{
  private Integer id,salary;
  private String name,sex,title;
  private String company;
  static int count = 0;

  public Employee(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter ID : ");
    this.id = new Integer(sc.nextInt());
    
    System.out.println("Enter Salary : ");
    this.salary = new Integer(sc.nextInt());

    System.out.println("Enter Name : ");
    sc.nextLine();
    this.name = sc.nextLine();
    
    System.out.println("Enter Sex : ");
    this.sex = sc.nextLine();

    System.out.println("Enter title : ");
    this.title = sc.nextLine();   
    
    System.out.println("Enter Company Name : ");
    this.company = sc.nextLine();
    count++;
  }

  public Employee(Integer id,Integer salary,String name,String sex,String title,String company){
    this.id = id;
    this.salary = salary;
    this.name = name;
    this.sex = sex;
    this.title = title;
    this.company = company;
    count++;
  }

  public static int getCount(){
    return Employee.count;
  }

  public String toString(){
    String filler = "\n======================================================================\n";
    return (filler +"Name : "+this.name+ "\nID : "+this.id + "\nGender : "+this.sex+ "\nCompany : "+this.company + "\nJob title : "+this.title+"\nSalary : "+this.salary + filler);
  }

  public String getName(){
    return this.name;
  }

  public int getSal(){
    return this.salary.intValue();
  } 

  public static int search(Vector<Employee> Emplist){
    Scanner sc = new Scanner(System.in);
    int sel0=0,i=0;
    String nm;
    int p;
    System.out.println("Search by : \n1.ID\n2.Name\n");
    sel0 = sc.nextInt();
    switch(sel0){
    case 1:
      p = sc.nextInt();
      for(i=0;i<Emplist.size();i++){
        if(Emplist.get(i).id.intValue() == p){
          return i;
        }
      }
      break;

    case 2:
      sc.nextLine();
      nm = sc.nextLine();
      for(i=0;i<Emplist.size();i++){
        if(Emplist.get(i).name.equals(nm)){
          return i;
        }
      }
      break;
    }
    return -1;  
  }




}


class sortbyName  implements Comparator<Employee>{
  public int compare(Employee e1,Employee e2){
    return (e1.getName().compareTo(e2.getName()));
  }

}

class sortbySalary implements Comparator<Employee>{
  public int compare(Employee e1,Employee e2){
    int x = (e1.getSal() > e2.getSal())? 1 : -1;
    x = (e1.getSal() == e2.getSal())? 0 : x;
    return x;
  }
}
