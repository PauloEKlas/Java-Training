import java.util.Scanner;
//o paulo é gay
public class School {
    public static void main(String [] args){

        // Teacher verifier
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your first name:");

        String professor = myObj.nextLine();

        // System.out.println(professor == "Paulo");

        Boolean wtv = (professor.equals("Paulo"));
        if(!wtv){    
            System.out.println("Sorry but only Paulo is allowed in this program.");
            System.exit(0);
        }
 
        // End of teacher verifier
        // Grading time
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the grade:");
        int grade = scan.nextInt();

        if(grade > 100 || grade < 0){
            while(grade > 100 || grade < 0){
                System.out.println("This kind of grade doesn't exist, please input a proper grade:");
                grade = scan.nextInt();
            }
        }
        scan.close();
        if(grade <= 100 && grade >= 90){
            System.out.println("Nota: Muito bom.");
        }else if(grade >=80 && grade <= 90){
            System.out.println("Nota: Bom.");
        }else if(grade >=50 && grade <= 75){
            System.out.println("Nota: Suficiente.");
        }else if(grade >=20 && grade <= 49){
            System.out.println("Nota: Insuficiente.");
        }else if(grade >=0 && grade <= 20){
            System.out.println("Nota: Fraco.");
        }
        // End of grading time
    }
}
