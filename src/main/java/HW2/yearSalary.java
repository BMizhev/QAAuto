package HW2;

public class yearSalary {
    public static void main(String[] args){
        int hoursPerWeek = Integer.parseInt(args[0]);
        double amtPerHour = Double.parseDouble(args[1]);
        double taxRate = Double.parseDouble(args[2]);
        double monthWithoutTaxes = hoursPerWeek * 4 * amtPerHour;
        double monthWithTaxes = (hoursPerWeek * 4 * amtPerHour) - (hoursPerWeek * 4 * amtPerHour)*(taxRate/100);
        double yearWithoutTaxes = hoursPerWeek * 4 * 12 * amtPerHour;
        double yearWithTaxes = (hoursPerWeek * 4 * 12 * amtPerHour) - (hoursPerWeek * 4*12 * amtPerHour)*(taxRate/100);
        System.out.println("Salary per month before taxes is " + monthWithoutTaxes + ".");
        System.out.println("Salary per month after taxes collected is " + monthWithTaxes + ".");
        System.out.println("Salary per year before taxes is " + yearWithoutTaxes+".");
        System.out.println("Salary per year after taxes collected is "+yearWithTaxes+".");
    }
}
