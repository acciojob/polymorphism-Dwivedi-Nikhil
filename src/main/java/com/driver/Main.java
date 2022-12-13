package com.driver;

public class Main {

    public static class Product{

        public int product(int x, int y) {
            return x*y; }
        public int product(int x, int y, int z) {
            return x*y*z;
            }

        public double product(double x, double y) {
            return x*y;
        }

    }//Product

    public static void main(String[] args) {

        Product p = new Product();
        //int x=0,y=0,z=0;
        int ans = p.product( 1,2);
        int ans2 = p.product( 1,2,3);
        double ans3 = p.product(1.2,2.3);
        //System.out.println(ans+ans2+ans3);
    }
}//Main