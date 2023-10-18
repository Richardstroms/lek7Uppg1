import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner tangentbordet = new Scanner(System.in);

    int poäng = 0;

    System.out.println("Välkommen till postkodlotteriet!");
    System.out.println("Första frågan är:");
    System.out.println("");

    //Fråga 1
    System.out.println("Vad är Sveriges huvudstad?");
    String svar1 = tangentbordet.nextLine();
    if (svar1.equalsIgnoreCase("Stockholm"))
    {
        poäng=poäng+1; //poäng++
        System.out.println("Korrekt! Du har nu "+poäng+" Poäng."); 
    }
    else {
    System.out.println("Fel! Rätt svar är Stockholm. Du har fortfarande "+poäng+" Poäng.");
    }    
    
    //Fråga 2
    System.out.println("");
    System.out.println("Andra frågan är: ");
    System.out.println("Vem är Superhjälten som är känd för att vara svag mot Kryptonit?");
    String svar2 = tangentbordet.nextLine();
    if (svar2.equalsIgnoreCase("Superman"))
    {
        poäng=poäng+1;
        System.out.println("Korrekt! Du har nu "+poäng+" Poäng. ");
    }
    else {
    System.out.println("Fel! Rätt svar är Superman. Du har fortfarande "+poäng+" Poäng.");
    }

    //Fråga 3
    System.out.println("");
    System.out.println("Tredje frågan är: ");
    System.out.println("Hur många dagar är i ett år?");
    String svar3 = tangentbordet.nextLine();
    if (svar3.equalsIgnoreCase("365"))
    {
        poäng=poäng+1;
        System.out.println("Korrekt! Du har nu "+poäng+" Poäng. ");
    }
    else {
    System.out.println("Fel! Rätt svar är 365 dagar. Du har fortfarande "+poäng+" Poäng.");
    }

    //Fråga 4
    System.out.println("");
    System.out.println("Fjärde frågan är: ");
    System.out.println("Vilket år avslutades andra världskriget?");
    String svar4 = tangentbordet.nextLine();
    if (svar4.equalsIgnoreCase("1945"))
    {
        poäng=poäng+1;
        System.out.println("Korrekt! Du har nu "+poäng+" Poäng. ");
    }
    else {
    System.out.println("Fel! Rätt svar är 1945. Du har fortfarande "+poäng+" Poäng.");
    }

    //Fråga 5
    System.out.println("");
    System.out.println("Femte frågan är: ");
    System.out.println("Hur många meter är en kilometer?");
    String svar5 = tangentbordet.nextLine();
    if (svar5.equalsIgnoreCase("1000"))
    {
        poäng=poäng+1;
        System.out.println("Korrekt! Du har nu "+poäng+" Poäng. ");
    }
    else {
    System.out.println("Fel! Rätt svar är 1000. Du har fortfarande "+poäng+" Poäng.");
    }

    //Vinnare eller förlorare
    int maxpoäng = 5;
    if (poäng==5) 
    {
    System.out.println("Grattis du har "+poäng+" poäng, du har vunnit lotteriet!!");
    }
    else {
    System.out.println("Du hade endast "+poäng+" poäng, för att vinna måste du ha "+maxpoäng+".");
    System.out.println("GAME OVER");

    }
    }
}
