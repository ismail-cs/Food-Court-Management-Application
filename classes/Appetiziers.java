package classes;
import java.lang.*;

public class Appetiziers extends FoodItem
{

   private String size;

    public Appetiziers()
    {
	    this("fid" ," name", 0, 0.0 , "size");
	}

    public Appetiziers(String fid , String name,int availableQuantity, double price , String size )
    {
        super(fid,name, availableQuantity,price);
        this.size = size;
    }

    public void setSize(String size)
    {
	      this.size = size;
	}
	  
    public String getSize()
	{
		return size;
	}

  public void showInfo()
  {
    System.out.println("\t -------------------------------------------");
    System.out.println("\t Food Id : "+ getFid());
    System.out.println("\t Food Name : "+ getName());
    System.out.println("\t Available Quantity : "+ getAvailableQuantity());
    System.out.println("\t Food Price : "+ getPrice());
  	System.out.println("\t Food Size : "+ size);
    System.out.println("\t -------------------------------------------\n\n");
  }

}