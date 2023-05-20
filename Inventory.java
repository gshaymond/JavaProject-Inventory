import java.util.Scanner;

public class Inventory {
  public static void main(String[] args) {
    boolean quit = false;

    ItemManager manager = new ItemManager();

    while (quit == false) {
      int m = DisplayMenu();
      
      if (m == 1)
      {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        manager.AddItem();
      }
      else if (m  == 2)
      {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        manager.ListItems();
      }
      else if (m  == 3)
      {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        manager.SaveItems();
      }
      else if (m  == 4)
      {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        manager.RemoveItem();
      }
      else if (m  > 5 || m  < 1)
      {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        System.out.println("Please Type only 1 - 5");
        System.out.println("");
      }  
      else
      {
        quit = true;
      }
    }

  }
  static int DisplayMenu()
  {
    Scanner menuInput = new Scanner(System.in);
    System.out.println("");
    System.out.println("1) Add Item to Inventory ");
    System.out.println("2) List Items in Inventory ");
    System.out.println("3) Save Item in Inventory ");
    System.out.println("4) Remove Item from Inventory ");
    System.out.println("5) Quit. ");
    System.out.println("");

    System.out.print("Input number 1-5: ");
    int m = menuInput.nextInt();

    return m;
  }
}