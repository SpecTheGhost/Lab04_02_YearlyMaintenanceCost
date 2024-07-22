public class Main {
    public static void main(String[] args) {
        double springMaintenanceCost = 30;
        double summerMaintenanceCost = 40;
        double fallMaintenanceCost = 50;
        double winterMaintenanceCost = 60;
        double totalYearlyMaintenanceCost = springMaintenanceCost + summerMaintenanceCost +
                fallMaintenanceCost + winterMaintenanceCost;
        System.out.println("Spring maintenance cost: $" + springMaintenanceCost);
        System.out.println("Summer maintenance cost: $" + summerMaintenanceCost);
        System.out.println("Fall maintenance cost: $" + fallMaintenanceCost);
        System.out.println("Winter maintenance cost: $" + winterMaintenanceCost);
        System.out.println("Total yearly maintenance cost: $" + totalYearlyMaintenanceCost);
    }
}
