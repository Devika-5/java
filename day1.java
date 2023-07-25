  public class day1{
  public static void main(String args[]) {
      int firstnumber=10;
      int secondnumber=50;
      int thirdnumber=60;
      int x= firstnumber;
      int y=secondnumber;
      int z= thirdnumber;
      System.out.println("Before Swapping-- " +   "\n"+"x="+x+ "\n"+"y="+ y+"\n"+"z="+z);
      int h=x;
      x=y;
      y=z;
      z=h;
      System.out.println("After Swapping-- " +   "\n"+"x="+x+ "\n"+"y="+ y+"\n"+"z="+z);
    }
}