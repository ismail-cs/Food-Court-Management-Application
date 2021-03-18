import java.lang.*;
import java.util.*;
import classes.*;
import fileio.*;
import java.io.IOException;

public class Start
{
	public static void main(String... arg) throws IOException, InterruptedException
	{

		Scanner sc = new Scanner(System.in);
		FoodCourt f = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
        System.out.println("\n");
		System.out.println("\n");
		System.out.println("                ____________________________________________");
		System.out.println("               |                                            |");
		System.out.println("               |                                            |");
		System.out.println("               |          WelCome to Food Court             |");
		System.out.println("               |                                            |");
		System.out.println("               |____________________________________________|\n");

		boolean repeat=true;
          
		   
		  
		while(repeat)
		{   
	
	      
			
	        System.out.println("\n");
			System.out.println("\t\t  ____________");
			System.out.println("\t\t | MAIN MANU  |");
			System.out.println("\t\t |____________|");
			System.out.println("\n\n");
			System.out.println("\t\t1. Employee Management");
			System.out.println("\t\t2. Restaurant Management");
			System.out.println("\t\t3. Restaurant FoodItem Management");
			System.out.println("\t\t4. FoodItem Quantity Add-Sell");
			System.out.println("\t\t5. Exit");
			System.out.println("\t -------------------------------------------");
			System.out.print("\t Eneter you choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{

				case 1: 
				
				         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
				
						System.out.println("\n\n\n\n\n\n         __________________________________");
						System.out.println("        |      Employee Management         |");
						System.out.println("        |__________________________________|\n\n");

						System.out.println("\t Select your option \n\n");
						System.out.println("\t\t1. Insert New Employee");
						System.out.println("\t\t2. Remove Existing Employee");
						System.out.println("\t\t3. Show All Employees");
						System.out.println("\t\t4. Search a Employee");
						System.out.println("\t\t5. Go Back");
						System.out.println("\t -------------------------------------------");
						System.out.print("\t Eneter you choice: ");
						int choice1 = sc.nextInt();

						switch(choice1)
						{
							case 1: 
							
							        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

									
									System.out.println("\n\n\n\n");
									System.out.println("\t ___________________________________________");
									System.out.println("\t             Insert New Employee            ");
									System.out.println("\t ___________________________________________");
							        System.out.println("\n\n\n\n");
									
									System.out.print("\t Employee  ID : ");
									String empId1 = sc.next();
									System.out.print("\t Employee Name : ");
									String name1 = sc.next();
									System.out.print("\t Employee Salary : ");
									double salary1 = sc.nextDouble();

									Employee e1 = new Employee(empId1, name1, salary1);
                                    
									System.out.print("\n\n\n");
									
									if(f.insertEmployee(e1))
									{
										System.out.println("\t Employee inserted  \n");
										System.out.println("\t Name :"+ name1);

										System.out.println("\t ID :"+ empId1);
									}
									else
									{
										System.out.println("\t Employee can not inserted. Try again ");
									}



									System.out.println("\n\n\t press 'm' to main manu :");						
									char dl = sc.next().charAt(0);		
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									
								break;

							case 2 :

									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("\n\n\n\n");
									System.out.println("\t __________________________________________");
									System.out.println("\t|          Remove Employee                 |");
									System.out.println("\t|__________________________________________|\n\n");
							        System.out.println("\t enter the id of the employee which you want remove\n");
									System.out.print("\t Employee  ID: ");
									String empId2 = sc.next();
									System.out.println("\n");

									Employee e2 = f.searchEmployee(empId2);
                                    	
									System.out.println("\t Are You sure you want to delete this Employee? \n");
									System.out.print("\t Press 'y' to delete Employee : ");

									char delete = sc.next().charAt(0);
									//String delete = sc.next();
									//char delete;
									//delete = input.next().charAt(0);

									if(delete== 'y' )
									{

										if(e2 != null)
										{
											if(f.removeEmployee(e2))
											{
												System.out.println("\t Employee ID :" +empId2 +" Removed Successfully.");
											}
											else
											{
												System.out.println("\t Employee can not be removed. Try again ");
											}
										}
										else{System.out.println("\t No Employee found.");}
									}
									else
									{
										System.out.println("\t Account is not deleted ");
									}


									System.out.println("\n\n\t press 'm' to main manu :");						
									char dl78 = sc.next().charAt(0);		
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

								break;
							case 3: 


									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									
									System.out.println("\n\n\n\n");
									System.out.println("\t  _____________________________________________");
									System.out.println("\t |                                             |");
									System.out.println("\t |            Show All Employee                |");
									System.out.println("\t |_____________________________________________|");

									f.showAllEmployees();


									
									
									System.out.println("\n\n press 'm' to main manu :");
									char dliy = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();


								break;

							case 4 :

									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									
									System.out.println("\n\n\n\n");
									System.out.println("\t  _________________________________________");
									System.out.println("\t |            Search Employee              |");
									System.out.println("\t |_________________________________________|");
									System.out.println("\n\n");
									
									System.out.print("\t Employee  ID: ");
									String empId4 = sc.next();

									Employee e4 = f.searchEmployee(empId4);

									if(e4!= null){
										System.out.println("\n\n\t____________________________________________________\n");
										System.out.println("\t Employee has found.\n");
										System.out.println("\t Employee ID : "+e4.getEmpId());
										System.out.println("\t Employee Name : "+e4.getName());
										System.out.println("\t Employee Salary : "+e4.getSalary());
										System.out.println("\n\t______________________________________________________\n");
									}
									else
									{
										System.out.println("No Employee found.");
									}


									System.out.println("\n\n press 'm' to main manu :");								
									char dli = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();


								break;

							case 5: 
									
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("\n\n\n");
									System.out.println("\t ___________________________________________");
									System.out.println("\t              Back to main menu            ");
									System.out.println("\t ___________________________________________");
									System.out.println("\n\n");

									

								break;

							default :

									System.out.println("\n\n\n");
									System.out.println("\t ___________________________________________");
									System.out.println("\t          Invalid option, Try again            ");
									System.out.println("\t ___________________________________________");
									System.out.println("\n\n");

                                     System.out.println("\n\n press 'm' to main manu :");								
									char dli2 = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

						
								break;
						}

					break;

				case 2 :

						
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						
						System.out.println("\n\n\n\n\n\n         __________________________________");
						System.out.println("        |      Restaurant Management       |");
						System.out.println("        |__________________________________|\n\n");

						System.out.println("\t Select your option \n\n");
						System.out.println("\t\t1. Insert New Restaurant");
						System.out.println("\t\t2. Remove Existing Restaurant");
						System.out.println("\t\t3. Show All Restaurants");
						System.out.println("\t\t4. Search a Restaurant");
						System.out.println("\t\t5. Go Back");
						System.out.println("\t -------------------------------------------");
						System.out.print("\t Eneter you choice: ");
						int choice2 = sc.nextInt();


						switch(choice2){
							case 1: 

									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("\n\n\n\n");
									System.out.println("\t _________________________________________");
									System.out.println("\t|         Insert New Restauran            |");
									System.out.println("\t|_________________________________________|\n\n");
							
									System.out.print("\t Restaurant  ID: ");
									String rid1 = sc.next();
									System.out.print("\t Restaurant Name: ");
									String name1 = sc.next();

									Restaurant r1 = new Restaurant(rid1, name1);

									if(f.insertRestaurant(r1))
									{
										System.out.print("\n\n\t Restaurant Inserted Successfully. \n\n");
										System.out.print("\t Name :"+ name1);
										System.out.print("\t ID :"+ rid1);
									}
									else{System.out.println("\n\n Restaurant can not be created now. Try again later");}

									System.out.println("\n\n press 'm' to main manu :");								
									char dli = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

								break;

							case 2 :

									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("\n\n_____________________________________________________\n\n");
									
									
									System.out.println("\t _________________________________________");
									System.out.println("\t|           Remove Restaurant             |");
									System.out.println("\t|_________________________________________|\n\n");
							
									System.out.print("\t Restaurant  ID: ");
									String rid2 = sc.next();

									Restaurant r2 = f.searchRestaurant(rid2);

									System.out.println("\n\t Are You sure you want to delete this Restaurant? ");
									System.out.print("\t Press 'y' to delete Restaurant :");

									
									char delete = sc.next().charAt(0);

									if(delete=='y')
									{

										if(r2 != null)
										{
											if(f.removeRestaurant(r2))
											{
												System.out.print("\n\t Restaurant ID " + rid2+ " Removed Successfully.");
											}
											else{System.out.println("\n\t Restaurant can not be removed now. Try again later");}
										}
										else{System.out.println("\n\t No Restaurant found.");}
									}
									else{System.out.println("\n\t Account is not deleted. Thanks for come back");}
									
									System.out.println("\n\n press 'm' to main manu :");								
									char dli3 = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

								break;
							case 3: 

									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("\n\n_______________________________________________________________\n\n");
									System.out.println("\t _________________________________________");
									System.out.println("\t|          Show All Restaurant            |");
									System.out.println("\t|_________________________________________|\n\n");

									f.showAllRestaurants();

									System.out.println("\n\n press 'm' to main manu :");								
									char dli4 = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

								break;

							case 4 :
                                    
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("\n\n____________________________________________________________\n\n");
									
									
									System.out.println("\t _________________________________________");
									System.out.println("\t|           Search Restaurant             |");
									System.out.println("\t|_________________________________________|\n\n");
									
									System.out.print("\t Restaurant  ID: ");
									String rid4 = sc.next();

									Restaurant r4 = f.searchRestaurant(rid4);

									if(r4!= null)
									{
										System.out.println("\n\t Restaurant has founded.");
										System.out.println("\t ---------------------------------------------");
										System.out.println("\t Restaurant ID : "+r4.getRid());
										System.out.println("\t Restaurant Name : "+r4.getName());
										System.out.println("\t ---------------------------------------------");
										r4.showAllFoodItems();
									}
									else
									{
										System.out.println("\t No Restaurant found.");
									}
									
									System.out.println("\n\n press 'm' to main manu :");								
									char dli5 = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

								break;

							case 5: 
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("\n\n\n");
									System.out.println("\t ___________________________________________");
									System.out.println("\t              Back to main menu            ");
									System.out.println("\t ___________________________________________");
									System.out.println("\n\n");
									
									System.out.println("\n\n press 'm' to main manu :");								
									char dli6 = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

								break;

							default :

									
									System.out.println("\n\n_____________________________________________________________\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("\t Invalid option . Try again");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n_____________________________________________________________\n\n");
									
									System.out.println("\n\n press 'm' to main manu :");								
									char dli7 = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

						
								break;
						}

					break;

				case 3: 
                         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

						System.out.println("\n\n\n\n\n\n         __________________________________");
						System.out.println("        |      FoodItem Management         |");
						System.out.println("        |__________________________________|\n\n");

						System.out.println("\t Select your option \n\n");
						System.out.println("\t\t1. Insert New Food Item");
						System.out.println("\t\t2. Remove Existing Food Item");
						System.out.println("\t\t3. Show All Food Item");
						System.out.println("\t\t4. Search a Food Item");
						System.out.println("\t\t5. Go Back");
						System.out.println("\t -------------------------------------------");
						System.out.print("\t Eneter you choice: ");
						int choice3 = sc.nextInt();


						switch(choice3)
						{

							case 1: 
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("\n\n_____________________________________________________________\n\n");
									
									
									System.out.println("\t _________________________________________");
									System.out.println("\t|         Insert New Food Items           |");
									System.out.println("\t|_________________________________________|\n\n");

									System.out.print("\t Restaurant ID: ");
									String rid3 = sc.next();

									if(f.searchRestaurant(rid3) != null)
									{

										System.out.println("\n\n\t Which types of food do you want to insert ?\n\n");
										System.out.println("\t1. Main Dish");
										System.out.println("\t2. Appitizers");
										System.out.println("\t3. Go Back\n\n");
								
										System.out.print("\t Enter Food Type: ");
										int choice31 = sc.nextInt();

										switch(choice31)
										{
											case 1: 
													new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
													System.out.println("\n\n_____________________________________________________________\n\n");
													System.out.print("\t Food Id : ");
													String fid31 = sc.next();

													System.out.print("\t Food Name: ");
													String name31 = sc.next();

													System.out.print("\t Available Quantity : ");             
													int availableQuantity31 = sc.nextInt();
									
													System.out.print("\t Food Price : ");
													double price31 = sc.nextDouble();
									
													System.out.print("\t Food Category : ");
													String category31 = sc.next();

													FoodItem m31 = new MainDish(fid31,name31,availableQuantity31 ,price31, category31 );
													
													if(f.searchRestaurant(rid3).insertFoodItem(m31))
													{
														System.out.println("\n\n\t Food Id Number :"+ fid31 +" inserted "+ rid3 +" id no. restaurant");
													}
													else
													{
														System.out.println("\t Food Item Can Not be inserted");
													}

													System.out.println("\n\n press 'm' to main manu :");								
									                char dli = sc.next().charAt(0);
								                 	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
													

												break;

											case 2 :

													
													new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
													System.out.println("\n\n_____________________________________________________________\n\n");
													System.out.print("\t Food Id : ");
													String fid32 = sc.next();

													System.out.print("\t Food Name: ");
													String name32 = sc.next();

													System.out.print("\t Available Quantity : ");
													int availableQuantity32 = sc.nextInt();
									
													System.out.print("\t Food Price : ");
													double price32 = sc.nextDouble();
									
													System.out.print("\t Food Size : ");
													String size32 = sc.next();

													FoodItem m32 = new Appetiziers(fid32,name32, availableQuantity32 ,price32, size32  );

													if(f.searchRestaurant(rid3).insertFoodItem(m32))
													{
														System.out.println("\n\n\t Food Id Number :"+ fid32 +" inserted "+ rid3 +" id no. restaurant");
													}
													else
													{
														System.out.println("\n\n\t Food Item Can Not be inserted");
													}

													System.out.println("\n\n press 'm' to main manu :");								
									                char dli8 = sc.next().charAt(0);
									                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
													

												break;

											case 3: 
													new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
													System.out.println("\n\n\n");
									System.out.println("\t ___________________________________________");
									System.out.println("\t              Back to main menu            ");
									System.out.println("\t ___________________________________________");
									System.out.println("\n\n");
									
									

												break;

											default: 

													
													System.out.println("\n\n_____________________________________________________________\n\n");
													System.out.println("-------------------------------------------");
													System.out.println("\t Invalid option . Try again");
													System.out.println("-------------------------------------------");
													System.out.println("\n\n_____________________________________________________________\n\n");
													
													System.out.println("\n\n press 'm' to main manu :");								
									char dli9 = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
													

												break;
											}
										}

									else
									{
										System.out.println("\n\n\t Restauran Id does not match. Try again.");
									}

											
								break;
			
							case 2 :

									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("\n\n_____________________________________________________________\n\n");
									
									System.out.println("\t _________________________________________");
									System.out.println("\t|           Remove Food Items             |");
									System.out.println("\t|_________________________________________|\n\n");

									System.out.print("\t Restaurant ID: ");
									String rid322 = sc.next();

									if(f.searchRestaurant(rid322) != null){
									Restaurant r322 = f.searchRestaurant(rid322);
									System.out.print("\t Food Item  ID: ");
									String fid322 = sc.next();

									FoodItem f322 = r322.searchFoodItem(fid322);

										if(f322!= null)
										{
											System.out.println("\n\n\t Are You sure you want to delete this Food Item? ");
											System.out.print("\t Press 'y' to delete Food Item : ");

											
											char delete = sc.next().charAt(0);

											if(delete=='y')
											{
												if(r322.removeFoodItem(f322))
												{
													System.out.print("\n\t Food Item Removed Successfully.");
												}
												else
												{
													System.out.println("\n\t Food Item can not be removed now. Try again later");
												}
											}
										
											else
											{
												System.out.println("\n\t Account is not deleted. Thanks for come back");
											}
											
										}
										else
										{
											System.out.println("\n\t No Food Item found.");
										}
									}
									else
									{
										System.out.println("\n\t No Restaurant found.");
									}


									System.out.println("\n\n press 'm' to main manu :");								
									char dli11 = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
													
									break;

							case 3: 

									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("\n\n_____________________________________________________________\n\n");			
									System.out.println("\t _________________________________________");
									System.out.println("\t|          Show All Food Item             |");
									System.out.println("\t|_________________________________________|\n\n");


									System.out.print("\t Restaurant  ID: ");
									String rid332 = sc.next();

									Restaurant r332 = f.searchRestaurant(rid332);

									if(f.searchRestaurant(rid332)!=null)
									{
									System.out.println("\n\t Restaurant has been founded.");
									r332.showAllFoodItems();
									}

									else
									{
										System.out.println("No Restaurant found.");
									}
									
									System.out.println("\n\n press 'm' to main manu :");								
									char dli13 = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

								break;
			
							case 4 : 

									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("\n\n_____________________________________________________________\n\n");	
									System.out.println("\t _________________________________________");
									System.out.println("\t|          Search Food Item               |");
									System.out.println("\t|_________________________________________|\n\n");
									
									System.out.print("\t Restaurant ID: ");
									String rid44 = sc.next();

									if(f.searchRestaurant(rid44) != null)
									{
									Restaurant r44 = f.searchRestaurant(rid44);
									
									System.out.print("\t Food Item  ID: ");
									String fid44 = sc.next();

									FoodItem f44 = r44.searchFoodItem(fid44);

									if(f44!= null)
									{
										System.out.println("\n\t FoodItem has found");
										System.out.println("\n\t __________________________________________________\n");
										r44.showAllFoodItems();
										System.out.println("\n\t __________________________________________________\n");
									}
									
									else
									{
										System.out.println("No FoodItem found.");
									}
									
									}

									else
									{
										System.out.println("No Restaurant found.");
									}

									System.out.println("\n\n press 'm' to main manu :");								
									char dli56 = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
								break;
							case 5: 
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("\n\n\n");
									System.out.println("\t ___________________________________________");
									System.out.println("\t              Back to main menu            ");
									System.out.println("\t ___________________________________________");
									System.out.println("\n\n");
			
								break;
			
							default :

									
									System.out.println("\n\n_____________________________________________________________\n\n");
									System.out.println("\t -------------------------------------------");
									System.out.println("\t Invalid option . Try again ");
									System.out.println("\t -------------------------------------------");
									System.out.println("\n\n_____________________________________________________________\n\n");
									
									System.out.println("\n\n press 'm' to main manu :");								
									char dli78 = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
								break;
						}



					break;

				case 4 :
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						System.out.println("\n\n\n\n\n\n         __________________________________");
						System.out.println("        |       FoodItem Quantity          |");
						System.out.println("        |__________________________________|\n\n");

						System.out.println("\t Select your option \n\n");
						System.out.println("\t\t1. Add  Food Item");
						System.out.println("\t\t2. Sell  Food Item");
						System.out.println("\t\t3. Show Add Sell History");
						System.out.println("\t\t4. Go Back");
						System.out.println("\t -------------------------------------------");
						System.out.print("\t Eneter you choice: ");
						int choice4 = sc.nextInt();
						
						switch(choice4)
						{
							case 1: 
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								
								System.out.println("\t _________________________________________");
								System.out.println("\t|            Add Food Item                |");
								System.out.println("\t|_________________________________________|\n\n");

								System.out.print("\n\t Enter Restaurant ID: ");
								
								String rid411 = sc.next();

								if(f.searchRestaurant(rid411) != null)
								{

									System.out.print("\t Enter Food Item ID: ");
								
									String fid411 = sc.next();

									if(f.searchRestaurant(rid411).searchFoodItem(fid411) != null)
									{

										System.out.print("\t Added Food Items Quantity: ");
										int amount1 = sc.nextInt();
										if(f.searchRestaurant(rid411).searchFoodItem(fid411).addQuantity(amount1)){

										System.out.println("\t Food Amount Added ");
										frwd.writeInFile("Amount : " +amount1 + " quantity added in "+ fid411+ " no. food "+ rid411+ " no. restaurant");
										}
										else
										{
											System.out.println("\t Can Not Added");
										}
									}
									else
									{
										System.out.println("\t Invalid Food Item Id Number");
									}

								}
								else
								{
									System.out.println("\t Restaurant ID  does not match");
								}
								System.out.println("\n\n press 'm' to main manu :");								
									char dli = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();


								break;

							case 2 : 
							
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								System.out.println("\n\n_____________________________________________________________\n\n");
							
								
							    System.out.println("\t _________________________________________");
								System.out.println("\t|            sell Food Item               |");
								System.out.println("\t|_________________________________________|\n\n");

								System.out.print("\n\t Enter Restaurant ID: ");
								
								String rid412 = sc.next();

								if(f.searchRestaurant(rid412) != null){

									System.out.print("\t Enter Food Item ID: ");
								
									String fid412 = sc.next();

									if(f.searchRestaurant(rid412).searchFoodItem(fid412) != null){

										System.out.print("\t Selled Food Item Quantity: ");
										int amount2 = sc.nextInt();
										if(f.searchRestaurant(rid412).searchFoodItem(fid412).sellQuantity(amount2))
										{

										System.out.println("\t Food Item Selled ");
										frwd.writeInFile("Amount : " +amount2 + "quantity Selled in "+ fid412+ " no. food "+ rid412+ " no. restaurant");
										
										
										}
										else{System.out.println("\n\t Can Not Selled");}
									}
									else{System.out.println("\n\t Invalid Food Item Id Number");}

								}
								else{System.out.println("\n\t Restaurant ID  does not MISMATCH");}
								
								System.out.println("\n\n press 'm' to main manu :");								
									char dli96 = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

								break;
							case 3: 
							
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								System.out.println("\n\n_____________________________________________________________\n\n"); 
								
								
								System.out.println("\t _________________________________________");
								System.out.println("\t|            ADD SELL History             |");
								System.out.println("\t|_________________________________________|\n\n");


								frwd.readFromFile();
								System.out.println("\n\n press 'm' to main manu :");								
									char dli567 = sc.next().charAt(0);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

								break;

							case 4 :
							
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("\n\n\n");
									System.out.println("\t ___________________________________________");
									System.out.println("\t              Back to main menu            ");
									System.out.println("\t ___________________________________________");
									System.out.println("\n\n");

								break;

							default :

									System.out.println("\n\n_____________________________________________________________\n\n");
									System.out.println("\t -------------------------------------------");
									System.out.println("\t Invalid option ...............");
									System.out.println("\t -------------------------------------------");
									System.out.println("\n\n_____________________________________________________________\n\n");


								break;
							}			

					break;
				case 5: 
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						System.out.println("\n\n\n\n");
						repeat=false;
						System.out.println("\t        ___________________________________________");
						System.out.println("\t       |                                           | ");
					    System.out.println("\t       |                Thank you                  | ");
						System.out.println("\t       |___________________________________________|");
						System.out.println("\n\n\n\n");
						
					break;

				default :

						
						System.out.println("\n\n\n");
									System.out.println("\t ___________________________________________");
									System.out.println("\t     you select wrong option, Try again     ");
									System.out.println("\t ___________________________________________");
									System.out.println("\n\n");


					break;

			}

		}
		
		
	}
}

       