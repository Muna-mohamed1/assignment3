package Mama;

class Estate extends Vehicle {

    public Estate(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfproduction,
                  String TypePlatenumber, double ageofTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, yearOfproduction, TypePlatenumber, ageofTheCar,
                TotalTax, transportMode, bondParkingFees);
    }



    @Override
    void printTotalTax() {

            System.out.println("The Total Tax payable is :" + TotalTax + "UGX");


        }


    @Override
    void calculateTotalTaxRates() {






    TotalTax += 0.25 * cif;
                TotalTax += 0.18 * cif;
                TotalTax += 0.06 * cif;
                TotalTax += 150000;
                TotalTax += 35000;
                TotalTax += 20000;
                TotalTax += 200000;
                if (seatingCapacity > 5) {
                    TotalTax += 250000;

                }
        if (seatingCapacity > 5) {
            int extraSeatingCapacity = seatingCapacity - 5;
            TotalTax += extraSeatingCapacity*250000;
        }
                if (grossWeight >= 1500 && grossWeight <= 2000) {
                    TotalTax += 0.15 * cif;
                } else if (grossWeight > 2000) {
                    TotalTax += 0.1 * cif;
                } else {
                    TotalTax += 0.02 * cif;
                }
                if (engineCapacity > 1800) {
                    TotalTax += 0.05 * cif;
                } else {
                    TotalTax += 0.025 * cif;
                }

                if (ageoftheCar >= 1 && ageoftheCar <= 5) {
                    TotalTax += 0.01 * cif;
                } else if (ageoftheCar >= 5 && ageoftheCar <= 10) {
                    TotalTax += 0.05 * cif;
                } else {
                    TotalTax += 0.15 * cif;
                }
            }
    void calculateTransportModeFee() {

    }

    @Override
    void calculateBondParkingFees() {

    }

    @Override
    public void calculateTax() {

    }


        }







