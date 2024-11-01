package Mama;

class SUV extends Vehicle{

    public SUV(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfproduction,
               String TypePlatenumber, double ageofTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, yearOfproduction,
                TypePlatenumber, ageofTheCar, TotalTax, transportMode, bondParkingFees);

    }
    @Override
    public void calculateTax(){




            if (seatingCapacity > 5) {
                TotalTax = 350000;
            } else if (grossWeight > 5000) {
                TotalTax = 0.15*cif;
            } else {
                TotalTax = 0;
            }

            if (ageoftheCar >= 1 && ageoftheCar <=5) {
                TotalTax = 0.01 * cif;
            } else if (ageoftheCar >= 5 && ageoftheCar <= 10) {
                TotalTax = 0.15 * cif;
            } else {
                ageoftheCar = 0.25 * cif;
            }


    }
    @Override
    void calculateTotalTaxRates() {

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
}