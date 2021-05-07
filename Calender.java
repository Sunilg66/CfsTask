class Calender{
 
public static void main(String [] a){

System.out.println("main method started");

int count=0;

for(int i = 1; i<=31; i++) {

if(count < 7){

System.out.print(i +" ");
count++;

}else{

count=1;
System.out.println();
System.out.print(i +" ");
}
}
}
}