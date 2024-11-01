package Mama;

class Ambulance extends Vehicle {

    public Ambulance(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfproduction,
                     String TypePlatenumber, double ageofTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, yearOfproduction, TypePlatenumber, ageofTheCar,
                TotalTax, transportMode, bondParkingFees);
    }

    @Override
    void printTotalTax() {
        System.out.println("tax ");
    }

    @Override
    public void calculateTax() {
        TotalTax +=35000;
        TotalTax +=20000;
        TotalTax +=200000;

        if (ageoftheCar > 10) {
            TotalTax += 0.15*cif;
        } else {
            TotalTax += 150000;
        }

    }
    @Override
    void calculateTotalTaxRates() {

    }

    @Override
    void calculateTransportModeFee() {

    }

    @Override
    void calculateBondParkingFees() {

    }
}

