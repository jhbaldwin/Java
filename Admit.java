import java.util.*;

public class Admit {
   public static void main(String[] args) {
      giveIntro();
      Scanner console = new Scanner(System.in);
      
      double applicant1 = getApplicant1(console);
      gpaScore(console);
      double applicant2 = getApplicant2(console);
      gpaScore(console);
      results(applicant1, applicant2);
      
   }
   
   //The introduction
   public static void giveIntro() {
      System.out.println("This program compares two applicants to");
      System.out.println("determine which one seems like the stronger");
      System.out.println("applicant. For each candidate I will need");
      System.out.println("either SAT or ACT score plus a weighted GPA.");
      System.out.println();
   }
   
   //The applicant1
   public static double getApplicant1(Scanner console) {
      System.out.println("Information for applicant #1: ");
      System.out.print("Do you have 1) SAT scores or 2) ACT scores? ");
      int scores = console.nextInt();
      
      System.out.print("SAT math? ");
      double satMath = console.nextInt();
      System.out.print("SAT critical reading? ");
      double satReading = console.nextInt();
      System.out.print("SAT writing? ");
      double satWriting = console.nextInt();
      double applicant1 = examScore(satMath, satReading, satWriting);
      System.out.println("exam score = " + applicant1);
      return applicant1;
   }  
   
   //The exam score
   public static double examScore(double satMath, double satReading, double satWriting) {
      return (2 * satMath + satReading + satWriting) / 32;
   }
   
   //The GPA score
   public static void gpaScore(Scanner console) {
      System.out.print("overall GPA? ");
      double gpa = console.nextDouble();
      System.out.print("max GPA? ");
      double mGPA = console.nextDouble();
      System.out.print("Transcript Multplier? ");
      double transcript = console.nextDouble();
      System.out.println("GPA score = " + (gpa / mGPA) * 100 * transcript);
      System.out.println();
   }
   
   //The applicant2
   public static double getApplicant2(Scanner console) {
      System.out.println("Information for applicant #2: ");
      System.out.print("Do you have 1) SAT scores or 2) ACT scores? ");
      int scores = console.nextInt();
      
      System.out.print("ACT english? ");
      double actEnglish = console.nextInt();
      System.out.print("ACT math? ");
      double actMath = console.nextInt();
      System.out.print("ACT reading? ");
      double actReading = console.nextInt();
      System.out.print("ACT science? ");
      double actScience = console.nextInt();
      double applicant2 = examActScore(actEnglish, actMath, actReading, actScience);
      System.out.println("exam score = " + applicant2);
      return applicant2;
      
   }
   
   //The exam ActScore
   public static double examActScore(double actEnglish, double actMath, double actReading, double actScience) {
      return (actEnglish + 2 * actMath + actReading + actScience) / 1.8;
   }
      
   //The results 
   public static void results(double applicant1, double applicant2) {
      System.out.println("First applicant overall score = " + Math.round(Double.sum(applicant1, 76.5)));
      System.out.println("Second applicant overall score = " + Math.round(Double.sum(applicant2, 78.4)));
      
      if (applicant1 > applicant2) 
         System.out.println("The first applicant seems to be better");
      else 
         System.out.println("The second applicant seems to be better");
    }
}