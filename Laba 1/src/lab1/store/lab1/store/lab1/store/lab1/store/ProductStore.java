package lab1.store.lab1.store.lab1.store.lab1.store;

import lab1.model.lab1.model.Wood;
import lab1.model.lab1.model.lab1.model.Timber;

import java.util.Arrays;

public class ProductStore
{
    private Timber[] tb = new Timber[3];
    private int count=0;

    public Timber[] getArr() {
        return Arrays.copyOf(tb, count);
    }

    public void add(Timber newTimber){
        if (tb.length == count) {
            tb = Arrays.copyOf(tb, count + count / 2);
        }
        tb[count++] = newTimber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Каталог брусочків:/n");
        for (int i = 0; i < count; i++) {
            sb.append(tb[i]).append("/n");
        }
        return sb.toString();
    }
}
