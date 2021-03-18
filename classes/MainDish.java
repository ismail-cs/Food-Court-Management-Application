package classes;
import java.lang.*;

public class MainDish extends FoodItem
{

  private String category;

      public MainDish()
      {
       this("fid" , "name", 0 ,0.0," category");
      }

      public MainDish(String fid , String name,int availableQuantity, double price , String category )
      {
  	    super(fid, name , availableQuantity, price);
  	    this.category = category;
      }

      public void setCategory(String category)
      {
	      this.category = category;
      }
      public String getCategory()
      {
	      return category;
	  }

      public void showInfo()
      {
        System.out.println("\t -------------------------------------------");
        System.out.println("\t Food Id  : "+ getFid());
        System.out.println("\t Food Name  : "+ getName());
        System.out.println("\t Available Quantity  : "+ getAvailableQuantity());
        System.out.println("\t Food Price  : "+ getPrice());
  	    System.out.println("\t Food Category  : "+ category);
        System.out.println("\t -------------------------------------------\n\n");
      }

}