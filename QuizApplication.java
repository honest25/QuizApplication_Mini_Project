package project1;
import java.util.Scanner;
public class QuizApplication {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        String[][] questions = {
	            {"What is the capital of France?", "A. London", "B. Paris", "C. Berlin", "D. Madrid", "B"},
	            {"Who painted the Mona Lisa?", "A. Leonardo da Vinci", "B. Michelangelo", "C. Vincent van Gogh", "D. Pablo Picasso", "A"},
	            {"What is the highest mountain in the world?", "A. Mount Everest", "B. Mount Kilimanjaro", "C. Mount McKinley", "D. Mount Fuji", "A"}
	        };

	        int score = 0;

	        for (int i = 0; i < questions.length; i++) {
	            System.out.println(questions[i][0]);
	            for (int j = 1; j < questions[i].length - 1; j++) {
	                System.out.println(questions[i][j]);
	            }
	            System.out.print("Enter your answer (A, B, C, or D): ");
	            String answer = input.nextLine();
	            if (answer.equalsIgnoreCase(questions[i][5])) {
	                System.out.println("Correct!");
	                score++;
	            } else {
	                System.out.println("Incorrect.");
	            }
	            System.out.println();
	        }

	        System.out.println("Your score is " + score + " out of " + questions.length);
	    }
	}


