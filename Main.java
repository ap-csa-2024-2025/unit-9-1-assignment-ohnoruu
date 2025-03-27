import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Create objects and test code here.
    SpecialtyCoffee c1 = new SpecialtyCoffee();
    SpecialtyCoffee c2 = new SpecialtyCoffee("large", "latte", "strawberry");
    SpecialtyCoffee c3 = new SpecialtyCoffee("large", true, 5, "latte", "vanilla");

    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());
  }
}
