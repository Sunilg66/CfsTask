class Week{
public static void main(String[] args){
int day = 7;
int a = 23;
int b = (a % day);

if (b==0){
System.out.println("sunday");
}

else if(b==1){
System.out.println("monday");
}

else if(b==2){
System.out.println("tuesday");
}

else if(b==3){
System.out.println("wednesday");
}

else if(b==4){
System.out.println("thursday");
}

else if(b==5){
System.out.println("friday");
}

else if(b==6){
System.out.println("saturday");
}
}
}