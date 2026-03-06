class Throwdemo{
  public static void checkage(int age){
    if(age<18){
      throw new ArithmeticException("not eligible to vote");
    }
    else{
      System.out.println("eligible to vote");
    }
  }
public static void main(String[] args){
  checkage(19);
}
}