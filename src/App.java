import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Tervetuloa pelaamaan Lucky 7-peliä!");

        System.out.println("Syötä rahamäärä.");


        Random r = new Random();
        Scanner in = new Scanner(System.in);
        String playAgain;
        String oikeaVastaus = "7";
        int raha= 10;

        raha = Integer.parseInt(in.nextLine());
        
        if(tätä)

        do {
            System.out.println("Arvotaan numerot");
            


            int num1 = r.nextInt(10)+1;
            int num2 = r.nextInt(10)+1;
            int num3 = r.nextInt(10)+1;
            
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);


            raha = raha-1;

            if(num1 == 7 && num2 == 7 && num3 == 7) {
                System.out.println("HULLU VOITTO!");
                raha = raha+6;

            }
            else if(num1 == 7 && num2 == 7 || num1 == 7 && num3 ==7 || num2 == 7 && num3 ==7) {
                System.out.println("Tupla!");
                raha = raha+4;
            }
            else if(num1 == 7 || num2 == 7 || num3 == 7) {
                System.out.println("Onnea, voitit!");
                raha = raha+2;
            } 
            else {
            
                System.out.println("Hävisit.");
            }
        
            System.out.println("Rahaa on "+raha);
            System.out.println("Uudestaan? (Y/N)");
            playAgain = in.nextLine();

            
            if(raha==0){
                System.out.println("Rahat loppu");
                break;
            }

        } while (playAgain.equalsIgnoreCase("y"));
        
    
        System.out.println("Kiitos pelaamisesta!");
        
        
        in.close();
       

   
      

    }

}
