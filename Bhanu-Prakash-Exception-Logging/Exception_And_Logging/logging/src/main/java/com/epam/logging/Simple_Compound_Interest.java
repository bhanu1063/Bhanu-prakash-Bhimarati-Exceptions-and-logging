package com.epam.logging;

import java.io.IOException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Simple_Compound_Interest {
	double principal_amount;
    double rate_of_interest;
    double time_in_years;
    Scanner s;
    public static Logger LOGGER = LogManager.getLogger(Simple_Compound_Interest.class);
	public void readData() throws IOException
	{
		    s=new Scanner(System.in);
		    LOGGER.info("Enter principal amount : ");
			principal_amount=s.nextDouble();
			LOGGER.info("Enter rate of interest per annum : ");
			rate_of_interest=s.nextDouble();
			LOGGER.info("Enter time in years : ");
			time_in_years=s.nextDouble();
	}
	
	public void calculateSimpleInterest() throws IOException
	{
		    double simple_interest=(principal_amount*time_in_years*rate_of_interest)/100;
		    LOGGER.info("Simple interest = "+simple_interest+"\n");
		    LOGGER.info("-----------------------------------------------------\n");
	}
	
	public void calculateCompoundInterest() throws IOException
	{
		    LOGGER.info("Enter number of times interest applied per time period : ");
			int no_of_times_interest_applied=s.nextInt();
			double final_amount=principal_amount*(Math.pow(1+rate_of_interest/(no_of_times_interest_applied*100),no_of_times_interest_applied*time_in_years));
			LOGGER.info("Compound interest = "+(final_amount-principal_amount)+"\n");
			LOGGER.info("-----------------------------------------------------\n");
	}
	
}

