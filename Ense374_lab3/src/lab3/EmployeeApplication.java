package lab3;

import java.util.Scanner;

public class EmployeeApplication {
	
	public static void main(String[] args)
    {
		//eD=employeeId
    	Employee[] eD = new Employee[3];
     
		/**Variable not used, do we delete this line:
		int eDSize = 0;
		*/
		EmployeeApplication eA = new EmployeeApplication();
		eA.addEs(eD);
		eA.prints(eD);
		Employee[] sorted = new Employee[3];
		sorted = eA.sorteDByName(eD,3);
		eA.prints(sorted);

    }


	public Employee[] sorteDByName(Employee[] database, int databaseSize)
    {
		 Employee[] srtD = database;
		 
		 
        for(int i=1; i<(databaseSize); i++)
        {
        	
        	
        	
            for(int j=0; j<(databaseSize-i); j++)
            {
            	/**
            	getIn() no parameter pass 
            	we add parameter lastName
            	 */
                if (srtD[j].getlN(lastName).compareTo(srtD[j+1].getlN(lastName))>0)
                {
                   
                	
                	Employee temp = srtD[j+1];
                    srtD[j+1] = srtD[j];
                    srtD[j] = temp;
                }
            }
        }
        return srtD;
    }

	public void addEs(Employee[] eD)
	{	
		//Import 'Scanner(java.util)
		Scanner input = new Scanner(System.in);
		
		/**change these unclear variable name:
		 firstName=firstName
		 lastName=lastName
		 address=addressess
		 phoneNumber=phonephoneNumberber
		 startSalary=startSalary
		 */
		for (int i = 0; i < 3; ++i)
		{
			eD[i] = new Employee();
			System.out.print("Enter an Employee's First Name: ");
			String firstName = input.nextLine();
			System.out.print("Enter an Employee's Last  Name: ");
			String lastName = input.nextLine();
			System.out.print("Enter an Employee's addressess: ");
			String address = input.nextLine();
			System.out.print("Enter an Employee's Phone phoneNumberber: ");
			String phoneNumber = input.nextLine();
			System.out.print("Enter an Employee's Hire Date: ");
			String hireDate = input.nextLine();
			System.out.print("Enter an Employee's starting Salary: ");
			String startSalary = input.nextLine();

			
			
			eD[i].setSTUFFUP(firstName, lastName, address,  phoneNumber, hireDate,  startSalary);



		}
	}

	public void prints(Employee[] eD)
	{
		
		
		
		for (int i = 0; i < 3; ++i)
		{
			eD[i].printEmployeeData();

		}

	}

}
