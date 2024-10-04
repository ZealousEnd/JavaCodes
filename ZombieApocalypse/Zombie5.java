import java.util.Scanner;
public class ZombieApocalypse
{
   public static void main( String[] args )
   {
  


   //Setup Game Data
   Scanner input = new Scanner(System.in);
   boolean gameOver = false;
   int colSize = 10;
   int rowSize = 10;
   String floorTile = ". ";

   int block1X = 2;
   int block1Y = 5;
   String block1 = "X ";
    
   int block2X = 7;
   int block2Y = 8;
   String block2 = "X ";

   int block3X = 6;
   int block3Y = 3;
   String block3 = "X ";

   int playerX = 0;
   int playerY = 0;
   String playerTile = "@ ";

   int exitX = colSize - 1;
   int exitY = rowSize - 1;
   String exitTile = "# ";

   int scottX = 2;
   int scottY = 2;
   String scottTile = "P ";

   int meghanX = 8;
   int meghanY = 4;
   String meghanTile = "P ";

   int lizzieX = 4;
   int lizzieY = 4;
   String lizzieTile = "P ";

   int joeyX = 3;
   int joeyY = 8;
   String joeyTile = "P ";
  


   //Game Loop
   while (gameOver == false) {

       //Draw Game Scene
       for( int y=0; y < rowSize; y++ ) {
           for( int x=0; x < colSize; x++ ) {

               if (x == playerX && y == playerY){
                   System.out.print(playerTile);
               }


               else if ( x == exitX && y == exitY){
                   System.out.print(exitTile);
               }


               else if ( x == scottX && y == scottY){
                   System.out.print(scottTile);
               }


               else if ( x == meghanX && y == meghanY){
                   System.out.print(meghanTile);
               }


               else if ( x == lizzieX && y == lizzieY){
                   System.out.print(lizzieTile);
               }


               else if ( x == joeyX && y == joeyY){
                   System.out.print(joeyTile);
               }


               else if ( x == block1X && y == block1Y){
                   System.out.print(block1);
               }


               else if ( x == block2X && y == block2Y){
                   System.out.print(block2);
               }


               else if ( x == block3X && y == block3Y){
                   System.out.print(block3);
               }


               else{
                   System.out.print(floorTile);
               }


           }
           System.out.print("\n");
       }
      


       //Get Player Input
       String choice = input.nextLine();
      





       //Execute Player Action
       if (choice.equals("w")){
          if(playerY > 0){
           playerY--;   
          }
          else{
              System.out.println("Don't run away! You have to get to the safe house!");
          }
           
           if(playerY == 5  && playerX == 2){
            playerY++;
            System.out.println("There is something in the way! Go around!");
           }

           if(playerY == 3  && playerX == 6){
            playerY++;
            System.out.println("There is something in the way! Go around!");
             }

           if(playerY == 8  && playerX == 7){
            playerY++;
            System.out.println("There is something in the way! Go around!");
           }
       }








       else if (choice.equals("s")){
            if(playerY < 9){
           playerY++;   
          }
          else{
              System.out.println("Don't run away! You have to get to the safe house!");
          }

            if(playerY == 5  && playerX == 2){
            playerY--;
            System.out.println("There is something in the way! Go around!");
           }

           if(playerY == 3  && playerX == 6){
            playerY--;
            System.out.println("There is something in the way! Go around!");
           }

           if(playerY == 8  && playerX == 7){
            playerY--;
            System.out.println("There is something in the way! Go around!");
           }

       }










       else if (choice.equals("d")){
            if(playerX < 9){
           playerX++;   
          }
          else{
              System.out.println("Don't run away! You have to get to the safe house!");
          }

          if(playerY == 5  && playerX == 2){
            playerX--;
            System.out.println("There is something in the way! Go around!");
           }

           if(playerY == 3  && playerX == 6){
            playerX--;
            System.out.println("There is something in the way! Go around!");
           }

           if(playerY == 8  && playerX == 7){
            playerX--;
            System.out.println("There is something in the way! Go around!");
           }

       }









       else if (choice.equals("a")){
           if(playerX > 0){
           playerX--;   
          }
          else{
              System.out.println("Don't run away! You have to get to the safe house!");
          }

          if(playerY == 5  && playerX == 2){
            playerX++;
            System.out.println("There is something in the way! Go around!");
           }

           if(playerY == 3  && playerX == 6){
            playerX++;
            System.out.println("There is something in the way! Go around!");
           }

           if(playerY == 8  && playerX == 7){
            playerX++;
            System.out.println("There is something in the way! Go around!");
           }

       }
      





       //Check Win Condition
       if (scottX == playerX && scottY == playerY){
           gameOver = true;
           System.out.println("Your brains were eaten by the zombies!");
       }
       if (meghanX == playerX && meghanY == playerY){
           gameOver = true;
           System.out.println("Your brains were eaten by the zombies!");
       }  
       if (lizzieX == playerX && lizzieY == playerY){
           gameOver = true;
           System.out.println("Your brains were eaten by the zombies!");
       }      
       if (joeyX == playerX && joeyY == playerY){
           gameOver = true;
           System.out.println("Your brains were eaten by the zombies!");
       }
       if (playerX == exitX && playerY == exitY){
           gameOver = true;
           System.out.println("You live to see another day!");
       }
      


       







       //Execute Monster Action
       int scottChoice = (int) (Math.random()*4 );
       if (scottChoice == 0) {
           scottX = (scottX + 1) % colSize;
       }
       else if (scottChoice == 1) {
           scottX = --scottX >=0 ? scottX : (colSize - 1);
       }
       else if (scottChoice == 2) {
           scottY = --scottY >=0 ? scottY : (rowSize - 1);
       }
       else if (scottChoice == 3) {
           scottY = (scottY + 1) % rowSize;
       }
       


       int meghanChoice = (int) (Math.random()*4 );
       if (meghanChoice == 0) {
           meghanX = (meghanX + 1) % colSize;
       }
       else if (meghanChoice == 1) {
           meghanX = --meghanX >=0 ? meghanX : (colSize - 1);
       }
       else if (meghanChoice == 2) {
           meghanY = --meghanY >=0 ? meghanY : (rowSize - 1);
       }
       else if (meghanChoice == 3) {
           meghanY = (meghanY + 1) % rowSize;
       }



       int lizzieChoice = (int) (Math.random()*4 );
       if (lizzieChoice == 0) {
           lizzieX = (lizzieX + 1) % colSize;
       }
       else if (lizzieChoice == 1) {
           lizzieX = --lizzieX >=0 ? lizzieX : (colSize - 1);
       }
       else if (lizzieChoice == 2) {
           lizzieY = --lizzieY >=0 ? lizzieY : (rowSize - 1);
       }
       else if (lizzieChoice == 3) {
           lizzieY = (lizzieY + 1) % rowSize;
       }



       int joeyChoice = (int) (Math.random()*4 );
       if (joeyChoice == 0) {
           joeyX = (joeyX + 1) % colSize;
       }
       else if (joeyChoice == 1) {
           joeyX = --joeyX >=0 ? joeyX : (colSize - 1);
       }
       else if (joeyChoice == 2) {
           joeyY = --joeyY >=0 ? joeyY : (rowSize - 1);
       }
       else if (joeyChoice == 3) {
           joeyY = (joeyY + 1) % rowSize;
       }



       //Check Lose Condition
   }
   }
}
