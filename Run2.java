import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;


class Run2{
	
	public static void main(String args[]){
		ArrayList<Student> classroom = new ArrayList<Student>(); 
		
		Scanner sc = new Scanner(System.in);
		int sel0,sel1;
		int x,i,temp;

		Dateclass d1 = new Dateclass(11,9,1945);
		Integer p = new Integer(2065);
		Double m = new Double(100.0);
		classroom.add(classroom.size(),new Student(p,"Akhil",m,d1));
		
		d1 = new Dateclass(5,5,1945);
		p = new Integer(2070);
		m = new Double(15.50);
		classroom.add(classroom.size(),new Student(p,"Urvi",m,d1));

		d1 = new Dateclass(10,1,1945);
		p = new Integer(2071);
		m = new Double(35.0);
		classroom.add(classroom.size(),new Student(p,"Vaibhav",m,d1));
		
		d1 = new Dateclass(12,12,1945);
		p = new Integer(2053);
		m = new Double(80.0);
		classroom.add(classroom.size(),new Student(p,"Rajiv",m,d1));
		
		do{
			System.out.println("1. Add Students\n2. Display Students\n3. Search Students\n4. Delete Students\n");
			System.out.println("5. Grade them\n6. Edit data\n7. Sort by marks");
			System.out.println("Enter your choice: ");
			sel1 = sc.nextInt();	
			switch(sel1){
			case 1:
				System.out.println("How many to add? : ");
				x = sc.nextInt();
				temp = classroom.size();
				
				for(i=temp ; i < (x+temp) ; i++){
					Student s = new Student();
					classroom.add(i, s);
				}
				break;
			
			case 2:
				for(i=0;i<classroom.size();i++){
					System.out.println(classroom.get(i));
				}
				break;

			case 3:
				x = Student.search(classroom);
				System.out.println(classroom.get(x));
				break;

			case 4:
				Student.remove(classroom);
				break;

			case 5:
				for(i=0;i<classroom.size();i++){
					classroom.get(i).grading();
				}
				break;
			
			case 6:
				x = Student.search(classroom);
				classroom.get(x).edit();
				break;

			case 7:
				Collections.sort(classroom,new sortbymks());
				break;
			}
			System.out.println("Try again?(1/0): ");
			sel0 = sc.nextInt();
		}while(sel0 == 1);
	}

} 

class Dateclass{
	private Integer d,m,y; 


	public Dateclass(int d, int m, int y){
		this.d = d; this.m = m; this.y = y;
	}

	public Dateclass(){
		this.d = -1; this.m = -1; this.y = -1;		
	}

	public String toString(){
		return (d.intValue() + " / " + m.intValue() + " / " + y.intValue());
	}

	public static Dateclass getDate(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DoB: ");
		int dd = sc.nextInt();
		int mm = sc.nextInt();
		int yyyy = sc.nextInt();
		return(new Dateclass(dd,mm,yyyy));
	}
}


class Student{
	private Integer prn;
	private String name;
	private Double mks;
	private Dateclass dob;
	private String grade;

	public Student(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter PRN: ");
		this.prn = new Integer(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter name: ");
		this.name = new String(sc.nextLine());
		
		System.out.println("Enter mks: ");
		this.mks = new Double(sc.nextDouble());
		this.grading();
		
		System.out.println("Enter DoB: ");
		int dd = sc.nextInt();
		int mm = sc.nextInt();
		int yyyy = sc.nextInt();
		this.dob = new Dateclass(dd,mm,yyyy);
		
		System.out.println("Student data stored succesfully!");
	}

	public Student(Integer prn, String name, Double mks, Dateclass dob){
		this.prn = prn;
		this.name = name;
		this.mks = mks;
		this.grading();
		this.dob = dob;
		System.out.println("Student data recorded Explicitly!");
	}

	public String toString(){
		String filler = "\n=======================================================================\n";
		return (filler + "Name : "+this.name +"\nPRN : "+this.prn.intValue() + "\nDoB : "+this.dob.toString() + "\nMarks : "+this.mks.doubleValue()+"\nGrade : "+this.grade + filler);
	}

	public double getmks(){
		return this.mks.doubleValue(); 
	}


	public static int search(ArrayList<Student> clsrm){
		Scanner sc = new Scanner(System.in);
		int sel0=0,i=0;
		String nm;
		int p;
		System.out.println("Search by : \n1.PRN\n2.Name\n");
		sel0 = sc.nextInt();
		switch(sel0){
		case 1:
			p = sc.nextInt();
			for(i=0;i<clsrm.size();i++){
				if(clsrm.get(i).prn == p){
					return i;
				}
			}
			break;

		case 2:
			sc.nextLine();
			nm = sc.nextLine();
			for(i=0;i<clsrm.size();i++){
				if(clsrm.get(i).name.equals(nm)){
					return i;
				}
			}
			break;
		}
		return -1;	
	} 

	public static void remove(ArrayList<Student> clsrm){
		int index = Student.search(clsrm);			// get index for deletion
		if(index >= 0 && index < clsrm.size()){	
			clsrm.remove(index);
			System.out.println("Student removed succesfully!\n");
		}
		else{
			System.out.println("Either student not in database or index out of bounds!\n");
		}
	}

	public void grading(){
		if(this.mks >= 80){
			this.grade = "A";
		}
		else if(this.mks >= 60){
			this.grade = "B";
		}
		else if(this.mks >= 40){
			this.grade = "C";
		}
		else{
			this.grade = "F";
		}
	}

	public void edit(){
		int sel0;
		Scanner sc = new Scanner(System.in);

		System.out.println("======================\tEDITING MENU\t=========================");
		System.out.println("1. PRN\n2. Name\n3. DoB\n4. Marks");
		System.out.println("Please enter your choice: ");
		sel0 = sc.nextInt();
		switch(sel0){
		case 1:
			System.out.println("Enter new PRN : ");
			this.prn = new Integer(sc.nextInt());
			break;
		
		case 2:
			System.out.println("Enter new Name : ");
			sc.nextLine();
			this.name = sc.nextLine();
			break;
		
		case 3:
			System.out.println("Enter new Date(dd mm yyyy): ");
			this.dob = Dateclass.getDate();
			break;

		case 4:
			System.out.println("Enter new Marks: ");
			this.mks = new Double(sc.nextDouble());
			this.grading();
			break;

		}
	}

}


class sortbymks implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		int x = (s1.getmks() < s2.getmks())? 1 : -1;
		x= (s1.getmks() == s2.getmks())? 0 : x;
		return x; 		
	}
}