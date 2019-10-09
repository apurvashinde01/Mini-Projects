package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        int bread;
                        int butter;
                        int jam;
                        int calories;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	calories = cal.calculateCalories(bread);
                            System.out.printf("%.3f",cal.calculateEnergy());
                            System.out.println(" kJ of energy generated from "+calories+" calories");
                        	System.out.println();
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	calories = cal.calculateCalories(bread, jam);
                            System.out.printf("%.3f",cal.calculateEnergy());
                            System.out.println(" kJ of energy generated from "+calories+" calories");
                        	System.out.println();
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	calories = cal.calculateCalories(bread, butter, jam);
                            System.out.printf("%.3f",cal.calculateEnergy());
                            System.out.println(" kJ of energy generated from "+calories+" calories");
                        	System.out.println();
                        	break;
                        }
            }
}
class Calories {
	
			int bread_cal = 74;
			int butter_cal = 102;
			int jam_cal = 26;
			int cal;			
            double energy = 4.1868;
            
            int calculateCalories(int b) {
            	cal = b * bread_cal;	
            	return cal;
            }
            
            int calculateCalories(int b, int j) {
            	cal = (b * bread_cal + j * jam_cal);	
            	return cal;
            }
            
            int calculateCalories(int b, int bu, int j) {
            	cal = (b * bread_cal + bu * butter_cal + j * jam_cal);	
            	return cal;
            }
            
            double calculateEnergy() {
				return (cal * energy);       	
            }            
}