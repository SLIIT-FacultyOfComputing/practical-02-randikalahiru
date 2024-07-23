import java.util.Scanner;

public class  task1{
 public static void main(String[] args){
 
 Scanner key = new Scanner(System.in);
 
 System.out.println("enter First Name");
 String fName =key.nextLine();
 System.out.println("enter Middle Name");
  String mName =key.nextLine();
  System.out.println("enter SurName");
  String sName =key.nextLine();
  
  StringBuilder sb=new StringBuilder();
   sb.append(sName);
   sb.append(" ");
  sb.append(fName);
  sb.append(" ");
  sb.append(mName);
  String F1= sb.toString();
  System.out.println("Full name"+F1);
  
  
  //q2
  
  System.out.println("enter First Name");
 fName =key.nextLine();
 System.out.println("enter Middle Name");
  mName =key.nextLine();
  System.out.println("enter SurName");
  sName =key.nextLine();
  
  
   sb.append(sName);
   sb.append(" ");
  sb.append(fName);
  sb.append(" ");
  sb.append(mName);
  String F2= sb.toString();
  
  if( F1==F2 ){
  System.out.println("Names are same");
  
  }else{
  System.out.println("Names  are not the same");
  }
  
  //Q3
  char old='a';
  char neww='@';
  String modeF1 = F1.replace(old, neww);
  old='e';
  neww='3';
  modeF1 = F1.replace(old, neww);
  System.out.println("new name "+modeF1);
  
  }
 }
