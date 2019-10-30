package Jobsheet10Praktikum;
public class InternshipEmployee extends Employee{
    private int length;
    public InternshipEmployee(String name, int length) {
        this.length = length;
        this.name = name;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo();
        info += " \nRegistered as internship employee for " + length + " month /s\n";
        return info;
    }
}