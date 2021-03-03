package lab1.test.lab1.test;

import lab1.model.lab1.model.Wood;
import lab1.model.lab1.model.lab1.model.Timber;
import lab1.store.lab1.store.WoodDirectory;
import lab1.store.lab1.store.lab1.store.lab1.store.ProductStore;

import java.util.Scanner;

public class TestByConsole
{
    private WoodDirectory wd = new WoodDirectory();
    private ProductStore ps = new ProductStore();
    private Scanner scan=new Scanner(System.in);

    public void Start(){
        boolean exit = true;
        while(exit){
            System.out.println("1 додати деревину");
            System.out.println("2 додати брусок");
            System.out.println("3 підрахувати загальну вагу");
            System.out.println("4 завершити роботу");
            int command = scan.nextInt();
            switch(command){
                case 1:
                    System.out.println(1);
                    addWood();
                    break;
                case 2:
                    System.out.println(2);
                    addTimber();
                    break;
                case 3:
                    System.out.println(3);
                    calcWeight();
                    break;
                case 4:
                    System.out.println(4);
                    exit=false;
                    break;

            }
        }
    }
    public void addWood(){
        System.out.print("id ");
        int id = scan.nextInt();
        System.out.print("name ");
        scan.nextLine();
        String name = scan.next();
        System.out.print("density ");
        float density = scan.nextFloat();
        wd.add(new Wood(id, name, density));
        System.out.println(wd);
    }
    public void addTimber(){
        System.out.print("id ");
        int id = scan.nextInt();
        System.out.print("lenght ");
        float lenght = scan.nextFloat();
        System.out.print("height" );
        float height = scan.nextFloat();
        System.out.print("width ");
        float width = scan.nextFloat();
        ps.add(new Timber(wd.get(id), lenght, height, width));
        System.out.println(ps);
    }
    public void calcWeight()
    {
        float fullWeight=0;
        for(Timber timber: ps.getArr())
        {
            fullWeight+=timber.weight();
        }
        System.out.println(fullWeight);
    }
}
