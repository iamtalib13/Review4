package com.bridgelabz;

import java.util.ArrayList;

class Marble {
    ArrayList<Marble> marbleArrayList = new ArrayList<Marble>();
    public String color;
    public int price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMarble(String color, int price) {
        Marble marbleObj = new Marble();

        marbleObj.setColor(color);
        marbleObj.setPrice(price);

        marbleArrayList.add(marbleObj);
    }


    public void findLowest() {
        Marble min = marbleArrayList.get(0);

        int size = marbleArrayList.size();

        for (int i = 1; i < size; i++) {
            if (min.getPrice() > marbleArrayList.get(i).getPrice()) {
                if (marbleArrayList.get(i).getColor() == "red") {
                    min = marbleArrayList.get(i);
                }
            }
        }
        System.out.println("Lowest " + min.getColor() + " marble Price is : " + min.getPrice());

    }

    public void displayMarble() {
        for (Marble marble : marbleArrayList) {
            if (marble.getColor() == null && marble.getColor() == null) {
                System.out.println("Contact Details Not Available");
            } else {
                System.out.println("Marble Details -");
                System.out.println("Marble Color = " + marble.getColor());
                System.out.println("Marble Price = " + marble.getPrice());
                System.out.println("------------------------");
            }
        }
    }
}


public class Marbles {
    public static void main(String[] args) {
        Marble obj = new Marble();

        obj.setMarble("purple", 2000);
        obj.setMarble("purple", 42);
        obj.setMarble("Blue", 4520);
        obj.setMarble("red", 420);
        obj.setMarble("red", 452);
        obj.setMarble("red", 45);
        obj.setMarble("red", 42);
        obj.setMarble("purple", 2);


        obj.findLowest();


    }
}