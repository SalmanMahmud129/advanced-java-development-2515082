package _02_04.before;

import java.util.ArrayList;
import java.util.List;

public class ClothingSite {

    public static void main(String[] args){
        ShirtItem shirtItem = new ShirtItem();

        checkoutItem(shirtItem);

        JacketItem jacket = new JacketItem();
        

        checkoutItem(jacket);
        

        List<ClothingItem> clothingItems = new ArrayList<>();
        clothingItems.add(shirtItem);
        clothingItems.add(jacket);

        checkoutAll(clothingItems);
    }

    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }

    static void checkoutAll(List<ClothingItem> clothingItems){

        for(ClothingItem item : clothingItems){
            checkoutItem(item);
        }

    }


}
