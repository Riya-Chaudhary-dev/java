class Prime{
public static void main(String args[]){
int a=23,i, counter=0;
for(i=2;i<a;i++){
if(a%i==0){
counter++;
}
}
if(counter!=0)
System.out.println("Not a prime");
else 
System.out.println("Prime");}}