package main;

import Items.LibraryItem;
/*
 * this is the example of Liskov subsitution principle
 * Parent class can be adopt by child class without any effect
 */

public class Library {
    private LibraryItem[] items;

    public Library(LibraryItem[] items) {
        this.items = items;
    }

    public double calculateTotalValue() {
        double totalValue = 0;

        for (LibraryItem item : items) {
            totalValue += item.getValue();
        }

        return totalValue;
    }
}
