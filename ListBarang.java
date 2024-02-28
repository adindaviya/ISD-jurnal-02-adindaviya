import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListBarang <E extends Comparable<? super E>> {
    public ArrayList<E> list;

    public ListBarang() {
        this.list = new ArrayList<E>();
    }

    public void addItem(E data) {
        list.add(data);
    }

    public void removeItem(int index) {
        list.remove(index);
    }

    public void editItem(int index, E data) {
        list.add(index, data);
    }

    public void print() {
        Collections.sort(list); 
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}