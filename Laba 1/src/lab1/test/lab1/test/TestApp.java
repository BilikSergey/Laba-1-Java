package lab1.test.lab1.test;

import lab1.model.lab1.model.lab1.model.Timber;
import lab1.store.lab1.store.WoodDirectory;
import lab1.store.lab1.store.lab1.store.lab1.store.ProductStore;

public class TestApp
{
    private WoodDirectory wd =new WoodDirectory();
    private ProductStore ps = new ProductStore();
    public static void main(String[] args)
    {
        TestApp app=new TestApp();
        TestByConsole tbc = new TestByConsole();
        tbc.Start();
        //app.startApp();
    }

    private void startApp()
    {
        ps.add(new Timber(wd.get(0), 5f, 0.5f, 0.4f));
        ps.add(new Timber(wd.get(0), 1f, 10f, 0.4f));
        System.out.println((wd));
        System.out.println((ps));
        System.out.printf("Загальна вага: %1.3f",calcWeight());
    }

    private float calcWeight()
    {
        float fullWeight=0;
        for(Timber timber: ps.getArr())
        {
            fullWeight+=timber.weight();
        }
        return fullWeight;
    }
}
