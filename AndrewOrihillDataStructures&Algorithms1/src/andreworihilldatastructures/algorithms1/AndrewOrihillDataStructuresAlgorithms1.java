package andreworihilldatastructures.algorithms1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AndrewOrihillDataStructuresAlgorithms1 {


    public static void main(String[] args) {
        System.out.println("This is a sample program at the request of Donnie Santos");
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        Scanner keyboard = new Scanner(System.in);
        //***
        System.out.println("***********");
        //***
         class studentGrades{
            private double gradeOne;
            private double gradeTwo;
            private double gradeThree;
            private double midScore;
            private double finalScore;
         }
            studentGrades inputOne = new studentGrades();
            System.out.println("Please enter the student's first grade (10 possible points)");
            inputOne.gradeOne = keyboard.nextDouble();
            System.out.println("Please enter the student's second grade (10 possible points)");
            inputOne.gradeTwo = keyboard.nextDouble();
            System.out.println("Please enter the student's third grade (10 possible points)");
            inputOne.gradeThree = keyboard.nextDouble();
            System.out.println("Please enter the student's midterm grade (100 possible points)");
            inputOne.midScore = keyboard.nextDouble();
            System.out.println("Please enter the student's final test grade (100 possible points)");
            inputOne.finalScore = keyboard.nextDouble();
            
            class studentRecord {
            private double quizAverage;
            private double weightedQuiz;
            private double midtermAverage;
            private double weightedMidTerm;
            private double finalAverage;
            private double weightedFinal;
            private double totalWeightedAverageScore;
            }
            
            studentRecord gradeOutputs = new studentRecord();
            gradeOutputs.quizAverage = (inputOne.gradeOne + inputOne.gradeTwo + inputOne.gradeThree) / 30;
            gradeOutputs.weightedQuiz = gradeOutputs.quizAverage * .25;
            gradeOutputs.midtermAverage = inputOne.midScore / 100;
            gradeOutputs.weightedMidTerm = gradeOutputs.midtermAverage * .35;
            gradeOutputs.finalAverage = inputOne.finalScore / 100;
            gradeOutputs.weightedFinal = gradeOutputs.finalAverage * .40;
            gradeOutputs.totalWeightedAverageScore =(gradeOutputs.weightedQuiz + gradeOutputs.weightedMidTerm + gradeOutputs.weightedFinal) * 100;
            
            System.out.println(df.format(gradeOutputs.totalWeightedAverageScore));
            
            if (gradeOutputs.totalWeightedAverageScore >= 90)
                System.out.println("The letter grade is: A");
            else if (gradeOutputs.totalWeightedAverageScore >= 80)
                System.out.println("The letter grade is: B");
            else if (gradeOutputs.totalWeightedAverageScore >= 70)
                System.out.println("The letter grade is: C");
            else if (gradeOutputs.totalWeightedAverageScore >= 60)
                System.out.println("The letter grade is: D");
            else if (gradeOutputs.totalWeightedAverageScore <= 60)
                System.out.println("The letter grade is: F");
    }
    
}