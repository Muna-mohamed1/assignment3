package Mama;

public class Sedan extends Vehicle {

    public Sedan(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfproduction,
                 String TypePlatenumber, double ageofTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, yearOfproduction, TypePlatenumber, ageofTheCar,
                TotalTax, transportMode, bondParkingFees);
    }



    @Override
   public void calculateTotalTaxRates() {

    }

    @Override
    public void calculateTax() {
        TotalTax += 0.25 * cif;
        TotalTax += 0.18 * cif;
        TotalTax += 0.06 * cif;
        TotalTax += 150000;
        TotalTax += 35000;
        TotalTax += 20000;
        TotalTax += 200000;

        if (TypePlatenumber.equals("APS")) {
            TotalTax += 3000000;
        } else if (TypePlatenumber.equals("DPS")) {
            TotalTax += 7000000;
        }
    }

    public void calculateTransportModeFee() {
        if (transportMode.equals("Carrier")) {
            TotalTax += 0.005 * cif;
        } else if (transportMode.equals("Driven")) {
            TotalTax += 0.015 * cif;


            if (grossWeight >= 1500 && grossWeight <= 2000) {
                TotalTax += 0.10 * cif;
            } else if (grossWeight >= 2000) {
                TotalTax += 0.15 * cif;
            } else if (grossWeight <= 2000) {
                TotalTax += 0.02 * cif;
            }


            if (engineCapacity > 2000) {
                TotalTax += 0.1 * cif;
            } else if (engineCapacity <= 2000 && engineCapacity <= 1500) {
                TotalTax += 0.05 * cif;
            } else {
                TotalTax += 0.025 * cif;
            }
            if (ageoftheCar >= 15) {
                System.out.println("can not be imported in to the country ");
            } else if (ageoftheCar >= 10 && ageoftheCar <= 15) {
                TotalTax += 0.1 * cif;
            } else if (ageoftheCar >= 10 && ageoftheCar <= 5) {
                TotalTax += 0.05 * cif;
            } else {
                TotalTax += 0.015 * cif;
            }
        }
    }

    @Override
    void printTotalTax() {
            TotalTax=+250;
    }

    @Override
    void calculateBondParkingFees() {

    }




}

