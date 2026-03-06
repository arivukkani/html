import java.util.Scanner;
public class inheritance{
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
class animal{
  String color = "white";
}
class cat extends animal{
  String color = "black";
  
  void printcolor(){
    System.out.println(color);
    System.out.println(super.color);
  }
}
}
}