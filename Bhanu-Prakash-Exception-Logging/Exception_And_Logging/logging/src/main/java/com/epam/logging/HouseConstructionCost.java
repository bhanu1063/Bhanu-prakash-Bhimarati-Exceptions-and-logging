package com.epam.logging;

import java.io.IOException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseConstructionCost {
	
	Scanner s;
    int material_standard;
    double total_area_of_the_house;
    boolean fully_automated;
    public static Logger LOGGER = LogManager.getLogger(Simple_Compound_Interest.class);
    public void readData() throws IOException
    {
    	s=new Scanner(System.in);
    	LOGGER.info("Enter material standard:\n1.Standard material\n2.Above standard material\n3.High standard material\n");
        material_standard=s.nextInt();
        LOGGER.info("Enter total area of the house : ");
        total_area_of_the_house=s.nextDouble();
        LOGGER.info("Enter True/False for fully automated home : ");
        fully_automated=s.nextBoolean();
    }
    public void calculateHouseConstructionCost() throws IOException
    {
    	double total_cost = 0;
    	switch(material_standard) {
    	case 1 : total_cost=1200*total_area_of_the_house;
    	         break;
    	case 2 : total_cost=1500*total_area_of_the_house;
                 break;     
    	case 3 : if(fully_automated)  
    		         total_cost=2500*total_area_of_the_house;
    	         else
    	        	 total_cost=1800*total_area_of_the_house;
    	         break;
    	default: LOGGER.info("Enter valid input");
    	        	 
    	}
    	LOGGER.info("Total construction cost of the house is Rs."+total_cost);
    }
}



