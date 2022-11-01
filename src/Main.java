import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr Alter an:");
        int AlterDerPerson = scan.nextInt();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Bitte geben Sie Ihre Dauer der Betriebszugehörigkeit an:");
        int GearbeiteteJahre = scan.nextInt();
        System.out.println("---------------------------------------------------------------------");
        boolean zugelassen = false;

        if (AlterDerPerson >= 65 || GearbeiteteJahre >= 30) {
            zugelassen = true;
        } else if (AlterDerPerson >= 60 && GearbeiteteJahre >= 25) {
            zugelassen = true;
        }
        if (zugelassen) {
            System.out.println("=====================================================================");
            System.out.println("Ihre Eingegebenen Daten:");
            System.out.println("    Alter: " + AlterDerPerson);
            System.out.println("    Betriebszugehörigkeit: " + GearbeiteteJahre);
            System.out.println("=====================================================================");
            System.out.println("=====================================================================");
            System.out.println("Herzlichen Glückwunsch Sie dürfen pensioniert werden!");
        } else {
            System.out.println("=====================================================================");
            System.out.println("Ihre Eingegebenen Daten:");
            System.out.println("    Alter: " + AlterDerPerson);
            System.out.println("    Betriebszugehörigkeit: " + GearbeiteteJahre);
            System.out.println("=====================================================================");
            System.out.println("=====================================================================");
            System.out.println("Leider dürfen Sie noch nicht pensioniert werden!");
        }
    }
}