import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class ItemManager 
{
    ArrayList<String> _items = new ArrayList<String>();

    public ItemManager()
    {

    }

    public void AddItem()
    {
        Scanner itemInput = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("What is the name of the Item?");
        String item = itemInput.nextLine();
        _items.add(item);
    }

    public void RemoveItem()
    {
        System.out.println("Currently not Functional");
    }

    public void SaveItems()
    {
        try {
            File myInventory = new File("Inventory.txt");
            if (myInventory.createNewFile()) {
              System.out.println(myInventory.getName());
            } else {
              
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("Inventory.txt");
            for (String item : _items) {
                myWriter.write(item);
                myWriter.write(" - ");
            }
            myWriter.close();
            System.out.println("Successfully saved your inventory.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
    }

    public void ListItems()
    {
        System.out.println("Currently not Functional");
    }

    public void LoadItems()
    {
        System.out.println("Currently not Functional");
    }
}
