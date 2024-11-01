package Mama;

class Trailer extends Vehicle {
    public Trailer(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfproduction,
                   String TypePlatenumber, double ageofTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, yearOfproduction,
                TypePlatenumber, ageofTheCar, TotalTax, transportMode, bondParkingFees);

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

        if (seatingCapacity > 5) {
            int extraSeatingCapacity = seatingCapacity - 5;
            TotalTax += extraSeatingCapacity*250000;
        }

        if (grossWeight >=1500 && grossWeight<=2000) {
            TotalTax += 0.15*cif;
        }
        else  if (grossWeight>2000)
        {
           TotalTax+=0.25*cif;
        }
        else if (grossWeight <=15000)
        {
            TotalTax+=0.05*cif;
        }

        if (engineCapacity > 20000) {
            TotalTax = 0.10*cif;
        } else if (engineCapacity >=15000 && engineCapacity <= 20000) {
            TotalTax = 0.05*cif;
        } else {
            TotalTax = 0.025*cif;
        }

        if (ageoftheCar > 15 )
        {
            System.out.println("cannot imported in this counytry");
        }

        if (ageoftheCar >= 10 && ageoftheCar <= 15) {
            TotalTax = 0.10*cif;
        } else if (ageoftheCar >= 5 && ageoftheCar <= 10) {
            TotalTax = 0.05*cif;
        } else {
            TotalTax = 0.015*cif;
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

