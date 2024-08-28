package Items;
/*
 * Only the information about the item --> Single information
 * this is follow Single Responsibility Principle
 */

import main.CalculateLateFees;

public interface LibraryItem extends CalculateLateFees {
    String getTitle();

    String getUniqueId();

    // int calculateLateFees(int days);  // In LibraryItem interface interface thick then can segregate the interface

    double getValue();
}
