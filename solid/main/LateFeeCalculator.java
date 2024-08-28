package main;

public class LateFeeCalculator {
    /*
     * Logic for calculate late fees
     * CalculateLateFees --> concereate interace/class rather than abstraction this principle is called dependency Inversion
     */

    private double totalLateFees;

    public double calculateTotalLateFees(CalculateLateFees[] items, int days) {
        totalLateFees = 0;
        for (CalculateLateFees item : items) {
            totalLateFees += item.calculateLateFees(days);
        }
        
        return totalLateFees;
     }
}
