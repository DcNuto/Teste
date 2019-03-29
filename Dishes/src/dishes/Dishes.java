
package dishes;

// @author Bruno Teste para Toral

import java.util.Scanner;

 
public class Dishes {

    public static void main(String[] args) {
        
        int c1=0, c2=0, c3=0, c4=0, c=0;       
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please chose what kind of menu you want: \nMorning or Night" );
        String menu = input.next();
        
        if((menu.equalsIgnoreCase("Morning"))){
        
            System.out.println("You chose Morning menu\n" +
                               "Now choose by number which dishes you want\n" +
                               "Remember that you can choose only once each dish (except the coffee, "
                             + "for being very yummy!) \nand there is no dessert for this type of menu.\n" +
                               "Here are the options:\n" +
                               "1- Eggs\n" +
                               "2- Toast\n" +
                               "3- Coffee\n"
                             + "4- Close your order");
            while(c!=4){
                System.out.println("Make yor order:");
                c = input.nextInt();
                switch(c){
                    case 1:
                        c1++;
                        if(c1>1){
                            System.out.println("You order is: Eggs, Error");
                            c=4;
                        }
                        break;
                    case 2:
                        c2++;
                        if(c2>1 && c1==1 ){
                            System.out.println("You order is: Eggs, Toast, Error");
                            c=4;
                            break;
                        }
                        else if(c2>1){
                            System.out.println("You order is: Toast, Error");
                            c=4;
                            break;
                        }
                        break;
                    case 3:
                        c3++;
                        break;
                    case 4:
                        if(c1==1 && c2==0 && c3==0){
                            System.out.println( "You order is: Eggs.\nEnjoy Your Food!");
                            break;
                        }
                        else if (c1==1 && c2==1 && c3==0){
                            System.out.println( "You order is: Eggs and Toast.\nEnjoy Your Food!");
                            break;                            
                        }
                        else if(c1==1 && c2==0 && c3>0){
                            System.out.println("You order is: Eggs, and (x" + c3 + ")Coffee.\nEnjoy Your Food!");
                            break;
                        }
                        else if(c1==0 && c2==1 && c3>0){
                            System.out.println("You order is: Toast and (x" + c3 + ")Coffee.\nEnjoy Your Food!");
                            break;
                        }
                        else if(c1==0 && c2==0 && c3>0){
                            System.out.println("You order is:(x" + c3 + ")Coffee.\nEnjoy Your Food!");
                            break;
                        }
                        else if(c1==1 && c2==1 && c3>0){
                            System.out.println("You order is: Eggs, Toast and (x" + c3 + ")Coffee.\nEnjoy Your Food!");
                        break;
                        }
                        else{
                            System.out.println("Good Bye.");
                        }
                        break;
                    default:
                        System.out.println("Error: This number is not on the menu, please choose between: \n"
                                + "1- Eggs\n"
                                + "2- Toast\n"
                                + "3- Coffee\n"
                                + "4- Close your Order.");
                }
                        
                
            }
        }
        
        else if((menu.equalsIgnoreCase("Night"))){
        
            System.out.println("You chose Night menu\n" +
                               "Now choose by number which dishes you want\n" +
                               "Remember that you can choose only once each dish (except the potato, "
                             + "for being very nutritive) \nand now you can chose dessert.\n" +
                               "Here are the options:\n" +
                               "1- Steak\n" +
                               "2- Potato\n" +
                               "3- Wine\n"
                             + "4- Cake\n"
                             + "5- Close your Order");
            while(c!=5){
                System.out.println("Make yor order:");
                c = input.nextInt();
                switch(c){
                    case 1:
                        c1++;
                        if(c1>1){
                            System.out.println("You order is: Steak, Error");
                            c=5;
                        }
                        break;
                    case 2:
                        c2++;
                        break;
                    case 3:
                        c3++;
                        if(c3>1 && c2>=1 && c1==0){
                            System.out.println("You order is:(x" + c2 + ")Potato, Wine, Error");
                            c=5;
                            break;
                        }
                        else if(c3>1 && c2==0 && c1==1){
                            System.out.println("You order is: Steak, Wine, Error");
                            c=5;
                            break;
                        }
                        else if(c3>1 && c2==0 && c1==0){
                            System.out.println("You order is:Wine, Error");
                            c=5;
                            break;
                        }
                        else if(c3>1 && c2>=1 && c1==1){
                            System.out.println("You order is:Steak, (x" + c2 + ")Potato, Wine, Error");
                            c=5;
                            break;
                        }
                        break;
                    case 4:
                        c4++;
                        if(c4>1 && c1==1 && c2<1 && c3==0){
                            System.out.println("You order is: Steak, Cake, Error");  
                            c=5;
                            break;
                        }
                        else if(c4>1 && c1==0 && c2>=1 && c3==0){
                            System.out.println("You order is: (x" + c2 + ")Potato, Cake, Error");  
                            c=5;
                            break;
                        }
                        else if(c4>1 && c1==0 && c2<1 && c3==1){
                            System.out.println("You order is: Wine, Cake, Error");  
                            c=5;
                            break;
                        }
                        else if(c4>1 && c1==1 && c2>=1 && c3==0){
                            System.out.println("You order is: Steak, (x" + c2 + ")Potato, Cake, Error");  
                            c=5;
                            break;
                        }
                        else if(c4>1 && c1==1 && c2<1 && c3==1){
                            System.out.println("You order is: Steak, Wine, Cake, Error");  
                            c=5;
                            break;
                        }
                        else if(c4>1 && c1==0 && c2>=1 && c3==1){
                            System.out.println("You order is: (x" + c2 + ")Potato, Wine, Cake, Error");  
                            c=5;
                            break;
                        }
                        else if(c4>1 && c1==1 && c2>=1 && c3==1){
                            System.out.println("You order is: Steak, (x" + c2 + ")Potato, Wine, Cake, Error");  
                            c=5;
                            break;
                        }
                        break;                        
                    case 5:
                        if(c1==1 && c2==0 && c3==0 && c4==0){
                            System.out.println( "You order is: Steak.\nEnjoy Your Food!");
                            break;
                        }
                        else if(c1==1 && c2>=1 && c3==0 && c4==0){
                            System.out.println( "You order is: Steak and(x" + c2 + ")Potato.\nEnjoy Your Food!");
                            break;                           
                        }
                        else if(c1==1 && c2<1 && c3==1 && c4==0){
                            System.out.println( "You order is: Steak and Wine.\nEnjoy Your Food!");
                            break;                           
                        }
                        else if(c1==1 && c2<1 && c3==0 && c4==1){
                            System.out.println( "You order is: Steak and Cake.\nEnjoy Your Food!");
                            break;                           
                        }
                        else if(c1==1 && c2<1 && c3==0 && c4==1){
                            System.out.println( "You order is: Steak and Cake.\nEnjoy Your Food!");
                            break;                           
                        }
                        else if(c1==0 && c2>=1 && c3==1 && c4==0){
                            System.out.println( "You order is: (x" + c2 + ")Potato and Wine.\nEnjoy Your Food!");
                            break;
                        }
                        else if(c1==0 && c2>=1 && c3==0 && c4==1){
                            System.out.println( "You order is: (x" + c2 + ")Potato and Cake.\nEnjoy Your Food!");
                            break;
                        }
                        else if(c1==0 && c2<1 && c3==1 && c4==1){
                            System.out.println( "You order is: Wine and Cake.\nEnjoy Your Food!");
                            break;
                        }
                        else if(c1==1 && c2>=1 && c3==1 && c4==0){
                            System.out.println( "You order is: Steak, (x" + c2 + ")Potato and Wine.\nEnjoy Your Food!");
                            break;                           
                        }
                        else if(c1==1 && c2>=1 && c3==0 && c4==1){
                            System.out.println( "You order is: Steak, (x" + c2 + ")Potato and Cake.\nEnjoy Your Food!");
                            break;                           
                        }
                        else if(c1==0 && c2>=1 && c3==1 && c4==1){
                            System.out.println( "You order is: (x" + c2 + ")Potato, Wine and Cake.\nEnjoy Your Food!");
                            break;                           
                        }
                        else if(c1==1 && c2<1 && c3==1 && c4==1){
                            System.out.println( "You order is: Steak, Wine and Cake.\nEnjoy Your Food!");
                            break;
                        }
                        else if(c1==1 && c2>0 && c3==1 && c4==1){
                            System.out.println( "You order is: Steak, (x" + c2 + ")Potato, Wine and Cake.\nEnjoy Your Food!");
                            break;
                        }
                        else{
                            System.out.println("Good Bye.");
                        }
                        break;
                        
                    default:
                        System.out.println("Error: This number is not on the menu, please choose between: \n"
                                + "1- Steak\n"
                                + "2- Potato\n"
                                + "3- Wine\n"
                                + "4- Cake\n"
                                + "5- Close your Order.");
                }
                        
                
            }
            
        }
        
        else {
            System.out.println("Sorry we do not have this type of menu.");
         
        }
      
    }
    
}
