import java.util.*;
class demo2{

  public static void main(String[] args){
    int x,ch;

    Scanner sc = new Scanner(System.in);
    Polynomial p = new Polynomial();
    LinkedList<Integer> list = new LinkedList<Integer>();

    while(true){
      System.out.println("ENTER");
      System.out.println("1.create polynomial");
      System.out.println("2.print polynomial");
      System.out.println("3.addition");
      System.out.println("4.multiplication");
      System.out.println("5.exit");

                        ch = sc.nextInt();
                        switch(ch){


                          case 1:
                                System.out.println("ENTER DEGREE OF POLYNOMIAL :");
                                x = sc.nextInt();
                                list = p.createPoly(x);
                                break;
                          case 2:
                                p.displayPoly(list);
                                break;
                          case 3:
                                list = p.addPoly();
                                break;
                          case 4:
                                list = p.mutiplyPoly();
                                break;
                          case 5:
                                System.exit(0);
                                break;
                          default:
                                System.out.println("Done");

     }
    }

  }

}
class Polynomial{

  LinkedList<Integer> createPoly(int x){
    LinkedList<Integer> list = new LinkedList<Integer>();
    Scanner sc = new Scanner(System.in);

    do{
      System.out.println("ENTER COEFFICIENT FOR POWER "+x--+" : ");
      list.add(sc.nextInt());
    }while(x>=0);

    return list;
  }


  LinkedList<Integer> addPoly(){

    int max,m,n,k=0;

    LinkedList<Integer> a = new LinkedList<Integer>();
    LinkedList<Integer> b = new LinkedList<Integer>();
    LinkedList<Integer> list = new LinkedList<Integer>();
    Scanner sc = new Scanner(System.in);

    System.out.println("ENTER DEGREE OF POLYNOMIAL :");
    m = sc.nextInt();
    a = createPoly(m);
    System.out.println("ENTER DEGREE OF POLYNOMIAL :");
    n = sc.nextInt();
    b = createPoly(n);

    max = (m>=n)? m:n;
    k=max;
    for (int i = 0 ; i <= max ; i++)
        list.add(0);
    while(m>=0 && n>=0){
      list.set(k--,a.get(m--)+b.get(n--));
    }
    while(m>=0) list.set(k--,a.get(m--));
    while(n>=0) list.set(k--,b.get(n--));

    displayPoly(list);
    return list;
  }
  LinkedList<Integer> mutiplyPoly(){

    int max,m,n;

    LinkedList<Integer> a = new LinkedList<Integer>();
    LinkedList<Integer> b = new LinkedList<Integer>();
    LinkedList<Integer> list = new LinkedList<Integer>();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter degree of polynomial");
    m = sc.nextInt();
    a = createPoly(m);
    System.out.println("Enter degree of polynomial");
    n = sc.nextInt();
    b = createPoly(n);

    for (int i = 0 ; i < a.size() + b.size()-1 ; i++)
        list.add(0);

    for (int i = 0; i < a.size(); i++)

        for (int j = 0; j < b.size(); j++)

            list.set(i+j, ((a.get(i) * b.get(j))+list.get(i+j)));

   
    displayPoly(list);
     return list;
  }

  void displayPoly(LinkedList<Integer> a){
    int p = a.size()-1,i=0;

    do{
      System.out.print(a.get(i++)+"X^"+p--+"   ");
    }while(p>=0);
    System.out.println("");

  }



}