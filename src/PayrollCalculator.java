public class PayrollCalculator{


    public static double calculateWeeklyPay(String employeeType, double
            hoursWorked, double hourlyRate) {


        switch (employeeType){
            case "FULL_TIME":
                if (hoursWorked<=40){
                    return hourlyRate*hoursWorked;
                }else {
                    return (40*hourlyRate)+((hoursWorked-40)*hourlyRate*1.5);
                }

            case "PART_TIME":
                if (hoursWorked> 25){
                    hoursWorked=25;

                }
                return hourlyRate*hoursWorked;


            case "CONTRACTOR":
                return hourlyRate*hoursWorked;



            case "INTERN":

                if (hoursWorked>20){
                    hoursWorked=20;
                }
                return hoursWorked *(0.8*hourlyRate);

            default:
                System.out.println("Invalid employee type: "+ employeeType);
                return 0;
        }
    }

    public static double calculateTaxDeduction(double grossPay, boolean hasHealthInsurance){
        double tax;
        if (grossPay<500){
            tax = grossPay*0.10;
        }else if(grossPay<1000){
            tax = grossPay*0.15;
        }else if(grossPay<2000){
            tax = grossPay*0.20;

        }else{
            tax = grossPay*0.25;
        }

        if (hasHealthInsurance == true){
            tax -=50;
        }
        return tax;

    }
    public static void processPayroll(String[] employeeTypes, double[] hours, double[] rates, String[] names){

        // since we have lists we need first to check that they are on the same length
        if(employeeTypes.length!=hours.length || hours.length!= rates.length || rates.length!=names.length){
            System.out.println("ERROR: The length of array does not match");
            return;
        }


        double higestPay;
        double lowestPay;
        double totalPay;
        int overtime;

        for (int i = 0; i < names.length; i++) {
            double gross = calculateWeeklyPay(employeeTypes[i], hours[i], rates[i]);
            double tax = calculateTaxDeduction(gross, true);
            double net = gross - tax;


            System.out.printf("%-10s %-12s %-6.1f %-6.1f %-10.2f %-10.2f %-10.2f\n",
                    names[i], employeeTypes[i], hours[i], rates[i], gross, tax, net);

            // Track stats
            if (net > highestPay) {
                highestPay = net;
                highestPaid = names[i];
            }

            if (net < lowestPay) {
                lowestPay = net;
                lowestPaid = names[i];
            }

            totalPay += net;

            if (hours[i] > 40) overtimeCount++;
        }

        double avgPay = totalPay / names.length;

        System.out.println("\n--- Payroll Summary ---");
        System.out.println("Highest Paid: " + highestPaid + " ($" + highestPay + ")");
        System.out.println("Lowest Paid: " + lowestPaid + " ($" + lowestPay + ")");
        System.out.printf("Average Pay: ", avgPay);
        System.out.println("Employees with Overtime (>40h): " + overtimeCount);
    }




    public static void main(String[] args) {
        String[] types = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN",
                "FULL_TIME"};
        double[] hours = {45, 20, 35, 15, 50};
        double[] rates = {25.0, 18.0, 40.0, 12.0, 30.0};
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};

        processPayroll(types, hours, rates, names);
    }

}








































