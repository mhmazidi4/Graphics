package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Warehouse implements Upgradable {
    int Level;

    private int capacity;
    private ArrayList<Item> items = new ArrayList<>(0);


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    //Finished
    @Override
    public boolean upgrade(Integer CurrentMoney) {
        if (CurrentMoney < getUpgradeCost()) {
            return false;
        }
        CurrentMoney -= getUpgradeCost();
        return true;
    }


    @Override
    public int getUpgradeCost() {
        //todo
    }


    private int getMaxCapacity() {
        //todo
    }

    //finished
    public List<Item> findSpecificItem(ItemType itemType, int MaxNumberToFind) {
        ArrayList<Item> methodOutput = new ArrayList<>(0);
        int numberFound = 0;
        Iterator iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator;
            if (item.itemType.equels(itemType)) {
                methodOutput.add((Item) iterator);
                iterator.remove();
            }
            numberFound++;
            if (numberFound == MaxNumberToFind) {
                break;
            }


            iterator.next();
        }
        return methodOutput;


    }
}