//package staticss.classes;

import java.util.Scanner;

public class MailBox {

   public static void main(String[] args) {

      System.out.println("Enter the number of mailboxes");

      boolean mailStatus[] = new boolean[50]; //creating a boolean variable
      Scanner input = new Scanner(System.in);//number scanner
      int number = input.nextInt(); //asking int from user

      for(int i=0;i<number;i++){

         mailStatus[i] = true; //setting all to close

      }

      int checkNum = 2; //startin checknumber from 2

      do{ //do while for checknum until it is less then or equal to mail box size

         for(int i=0;i<number;i++){ //loop through mail box

            if(checkNum==2){ //if 2 set all second to open

               if((i+1)%checkNum==0){ //this logic will allow only for sequence like 2 4 6 or 3 6 9 and so on

                  mailStatus[i] = false;

               }

         } else{ //if not 2 flip the status open to close and vise versa

            if((i+1)%checkNum==0){

               if(mailStatus[i]){ //if i position is true

                  mailStatus[i] = false; //set it false

         }else{

            mailStatus[i] = true; //else set to true

         }

      }

      }

   }

System.out.print("Step "+checkNum+"->");

      for(int i=0;i<number;i++){ //printing number after each loop// u can remove it if you want it at the end

         if(!mailStatus[i]){

            System.out.print(" "+(i+1));

         }

      }

      checkNum++;
      System.out.println();

   } while(checkNum<=number);

      System.out.println("Final mailboxes status those are open :");

      for(int i=0;i<number;i++){ //printing number after final loop

         if(!mailStatus[i]){

            System.out.print(" "+(i+1));

         }

      }

   }

}