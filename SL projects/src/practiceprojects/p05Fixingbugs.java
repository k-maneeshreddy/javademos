package practiceprojects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p05Fixingbugs {

    public static void main(String[] args) {
    	
        System.out.println("Hello !");
        System.out.println("\n**************\n");
        System.out.println("\tWelcome to The Desk \n");
        System.out.println("**************");
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        optionsSelection(expenses);

    }
    private static void optionsSelection(ArrayList<Integer> expenses) {
        String[] arr = {"1. I want to review my expenditure",
                "2. I want to add my expenditure",
                "3. I want to delete my expenditure",
                "4. I want to sort the expenditures",
                "5. I want to search for a particular expenditure",
                "6. Close the app"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
 
        System.out.println("\nEnter your Option:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
                
        	switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection(expenses);
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        System.out.println(expenses+"\n");
                        optionsSelection(expenses);
                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection(expenses);
                        break;
                    case 4:
                        sortExpenses(expenses);
                        optionsSelection(expenses);
                        break;
                    case 5:
                        searchExpenses(expenses);
                        optionsSelection(expenses);
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("invalid choice!");
                        break;
                }
            }
        

    
    private static void closeApp() {
        System.out.println("Closing your app... \nThank you!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
    	Scanner in=new Scanner(System.in);
        int leng = arrayList.size();
        System.out.println("Enter the expense need to search:\t");
        //Complete the method
        int key=in.nextInt();
        int found=0;
        int index=0;
        for(int i=0; i<leng; i++) {
            
            if(arrayList.get(i)==key) {
                found=1;
                index=i;
            }
        }
        if(found==1) {
        	System.out.println(key+ " is found at index " +index);
        }

   }
        

    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
       //Complete the method. The expenses should be sorted in ascending order.

        for (int i = 0; i < arrlength ; i++) {

            for (int j = arrlength - 1; j > i; j--) {
                if (arrayList.get(i) > arrayList.get(j)) {

                    int temp = arrayList.get(i);
                    arrayList.set(i,arrayList.get(j)) ;
                    arrayList.set(j,temp);

                }

            }

        }
        for (int i: arrayList) {
            System.out.print(i+ "   ");
        }
        System.out.println();
        
        
    }
}