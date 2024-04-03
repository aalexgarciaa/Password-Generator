import java.util.Scanner;

public class Generator {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Password Generator! Let's first go over some of your need."); 

        /*
         * Asking for the user's needs regarding characters needed. Boolean values 
         *  will represent what is needed by true or false. 'false' not allowed. 'true'
         *  meaning it is requried.
         */
        
            // Lower Case/ Upper Case Requirements.
            boolean characters = false;
            boolean clear = false;
            String response;

            System.out.println("Do you need both upper and lower case letters?");
            response = input.nextLine();
            do{
                if(response.equalsIgnoreCase("Yes")){
                    characters = true;
                    clear = true;
                }
                else if(response.equalsIgnoreCase("No")){
                    characters = false;
                    clear = true;
                }else{
                    System.out.println("Please enter 'Yes' or 'No'.");
                    response = input.nextLine();
                }    
            }while(clear == false);
        
            //Number requirements
            boolean numbers = false;
            clear = false;

            System.out.println("Do you need numbers?");
            response = input.nextLine();
            do{
                if(response.equalsIgnoreCase("Yes")){
                    numbers = true;
                    clear = true;
                }
                else if(response.equalsIgnoreCase("No")){
                    numbers = false;
                    clear = true;
                }else{
                    System.out.println("Please enter 'Yes' or 'No'.");
                    response = input.nextLine();
                }    
            }while(clear == false);
            
            //Symbol requirements
            boolean symbols = false;
            clear = false;

            System.out.println("Do you need numbers?");
            response = input.nextLine();
            do{
                if(response.equalsIgnoreCase("Yes")){
                    symbols = true;
                    clear = true;
                }
                else if(response.equalsIgnoreCase("No")){
                    symbols = false;
                    clear = true;
                }else{
                    System.out.println("Please enter 'Yes' or 'No'.");
                    response = input.nextLine();
                }    
            }while(clear == false);           

            input.close();
    }

    public String upperLowerPassword(){
        String x;
        return x;
    }
}
