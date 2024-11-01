package Mama;

public class AnyVehicle extends Vehicle {


    public AnyVehicle(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfProduction, String plateTypeNumber, double ageOfTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, yearOfProduction, plateTypeNumber, ageOfTheCar, TotalTax, transportMode, bondParkingFees);
    }

    @Override
    void calculateTotalTaxRates() {
        System.out.println("calculate text rates");
    }

    @Override
    void calculateTransportModeFee() {

    }

    @Override
    void printTotalTax() {

    }

    @Override
    void calculateBondParkingFees() {

    }



    @Override
    public void calculateTax() {


        if (transportMode == "carrier") {
            TotalTax = 0.005 * cif;
        } else if (transportMode == "driven") {
            TotalTax = 0.015 * cif;
        } else {
            TotalTax = 0;
        }



        if (TypePlatenumber =="APS"){
            return ;
        } else if (TypePlatenumber == "DPS") {
            return;
        }
        else {
            TotalTax = 0;
        }

        if (bondParkingFees==24);{
            TotalTax=15000;
        }
    }
}


