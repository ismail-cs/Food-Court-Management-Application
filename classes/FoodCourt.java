package classes;

import java.lang.*;
import interfaces.*;

public class FoodCourt implements RestaurantOperations, EmployeeOperations
{
	private Restaurant restaurants[] = new Restaurant[50];
	private Employee employees[] = new Employee[150];

	public boolean insertRestaurant(Restaurant r)
	{
		boolean flag = false;
		for(int i=0; i<restaurants.length; i++)
		{
			if(restaurants[i] == null)
			{
				restaurants[i] = r;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeRestaurant(Restaurant r)
	{
		boolean flag = false;
		for(int i=0; i<restaurants.length; i++)
		{
			if(restaurants[i] == r)
			{
				restaurants[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Restaurant searchRestaurant(String rid)
	{

		Restaurant r = null;
		
		for(int i=0; i<restaurants.length; i++)
		{
			if(restaurants[i] != null)
			{
				if(restaurants[i].getRid().equals(rid))
				{
					r = restaurants[i];
					break;
				}
			}
		}
		return r;
	}

	public void showAllRestaurants()
	{
		for(int i = 0; i<restaurants.length; i++)
		{
			if(restaurants[i]!=null)
			{
				System.out.println("\t ---------------------------------------------");
				System.out.println("\t Restaurant ID : "+restaurants[i].getRid());
				System.out.println("\t Restaurant Name : "+restaurants[i].getName());
				System.out.println("\t ---------------------------------------------");
				restaurants[i].showAllFoodItems();
			}
		}
	}


	public boolean insertEmployee(Employee e)
	{
		boolean flag = false;

		for(int i=0; i<employees.length; i++)
		{
			if(employees[i]==null)
			{
				employees[i]=e;
				flag =  true;
				break;
			}
			else
			{
				flag = false;
			}
		}
		return flag;
	}


	public boolean removeEmployee(Employee e)
	{
		boolean flag = false;

		for(int i=0; i<employees.length ; i++)
		{
			if(employees[i]==e)
			{
				employees[i]=null;
				flag =  true;
				break;
			}
			else
			{
				flag = false;
			}
		}
		return flag;
	}

	public Employee searchEmployee(String empId)
	{
		Employee e = null;
		for(int i=0; i<employees.length ; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e=employees[i];
					break;
				}
			}
		}
		return e;
	}

	public void showAllEmployees()
	{
		for(int i = 0; i<employees.length; i++)
		{
			if(employees[i]!=null)
			{
				System.out.println("\n\t _______________________________________________\n");
				System.out.println("\t\t Employee ID : "+employees[i].getEmpId());
				System.out.println("\t\t Employee Name : "+employees[i].getName());
				System.out.println("\t\t Employee Salary : "+employees[i].getSalary());
				System.out.println("\n\t ________________________________________________\n");
			}
		}
	}


}