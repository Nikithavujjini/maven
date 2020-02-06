package com.ab.epam;

public class Kheer extends Sweets
{

    public Kheer(int sugar_content, int weight, int price, String sweetname,String type) {
      
        super(sugar_content, weight, price, sweetname,type); 
    }

    @Override
    void description() 
    {
    System.out.println("I am Halwa and I like to be more orange");
    }
    
}
