package Mama;

public  abstract class Vehicle {

    protected double cif;
    protected int seatingCapacity;
    protected double grossWeight;
    protected int engineCapacity;
    protected int yearOfproduction;
    protected String TypePlatenumber ;
    protected double ageoftheCar;
    protected double TotalTax;
    protected String transportMode;
    protected int bondParkingFees;

public Vehicle( double cif,int seatingCapacity, double grossWeight,int engineCapacity,int yearOfproduction,
                String TypePlatenumber , double ageoftheCar, double TotalTax,String transportMode,int bondParkingFees)
{
    this.cif = cif;
    this.seatingCapacity = seatingCapacity;
    this.grossWeight = grossWeight;
    this.yearOfproduction =yearOfproduction;
    this.TypePlatenumber = TypePlatenumber;
    this.engineCapacity = engineCapacity;
    this.ageoftheCar = yearOfproduction;
    this.TotalTax = 0.0;
    this.transportMode = transportMode;
    this.bondParkingFees = bondParkingFees;
}
abstract void calculateTotalTaxRates();



    abstract void calculateTransportModeFee();



  abstract void printTotalTax();


    abstract void calculateBondParkingFees();


    public abstract void calculateTax();


}
