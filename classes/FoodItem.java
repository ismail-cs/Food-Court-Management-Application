package classes;

import java.lang.*;
import interfaces.*;

public abstract class FoodItem implements IQuantity
{

	String fid;
	String name;
	double price;
	int availableQuantity;

	public FoodItem()
	{
		
	};

	public FoodItem(String fid, String name, int availableQuantity,double price)
	{
		this.fid = fid;
		this.name = name;
		this.availableQuantity= availableQuantity;
		this.price= price; 
	}
	
	
	void setFid(String fid)
	{
		this.fid = fid;
	}
	void setName(String name)
	{
		this.name = name;
	}
	void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	void setPrice(double price)
	{
		this.price = price;
	}
	
	
	
	String getFid()
	{
		return fid;
	}
	String getName()
	{
		return name;
	}	
	int getAvailableQuantity()
	{
		return availableQuantity;
	}
	double getPrice()
	{
		return price;
	}
	
	
	
	
	public boolean addQuantity(int amount)
	{
		if(amount>0)
		{

			System.out.println("\t -----------------------------------------");
			System.out.println("\t Previous Quantity: "+ availableQuantity);
			System.out.println("\t Added Amount: "+ amount);

			availableQuantity = availableQuantity+amount;
			
			System.out.println("\t Current Quantity: "+ availableQuantity);
			
			System.out.println("\t -------------------------------------------\n\n");
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
    public boolean sellQuantity(int amount)
	{

		if(amount>0 && amount<= availableQuantity)
		{

			System.out.println("\t -------------------------------------------");
			System.out.println("\t Previous Quantity: "+ availableQuantity);
			System.out.println("\t Selled Amount: "+ amount);

			availableQuantity = availableQuantity-amount;
			
			System.out.println("\t Current Quantity: "+ availableQuantity);
			System.out.println("\t -------------------------------------------\n\n");
			
			return true;
		}
		else
		{
			return false;
		}
		
    }
	
	
	
	abstract void showInfo();

}

