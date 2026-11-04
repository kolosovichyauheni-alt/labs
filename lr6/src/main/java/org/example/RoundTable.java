package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RoundTable {
    private double diameter;
    private String material;
    private int amount;

    public int getAmount(){
        return amount;
    }
    public void setAmount(int Amount){
        this.amount = Amount;
    }

    public RoundTable(){}

    public RoundTable(double diameter, String material, int amount){
        this(diameter,material);
        setAmount(amount);
    }



    public RoundTable(double diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    public double area() {
        double r = diameter / 2.0;
        return Math.PI * r * r;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getMaterial() {
        return material;
    }

    public static void main(String[] args) {
        RoundTable x = new RoundTable(1.2, "дуб", 15);
        System.out.println(x.area());
    }
}