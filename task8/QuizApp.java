import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        // Sample questions
        questions.add(new Question("What is the capital of France?",
                new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 'C'));

        questions.add(new Question("Which language is used for Android development?",
                new String[]{"Swift", "Kotlin", "Python", "C++"}, 'B'));

        questions.add(new Question("What is the result of 2 + 2 * 2?",
                new String[]{"6", "8", "4", "10"}, 'A'));
                
        questions.add(new Question("Which planet is known as the Red Planet?",
        new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 'B'));

	questions.add(new Question("Who wrote the play 'Romeo and Juliet'?",
		new String[]{"Leo Tolstoy", "William Shakespeare", "Charles Dickens", "Mark Twain"}, 'B'));

	questions.add(new Question("Which data structure uses FIFO (First In, First Out)?",
		new String[]{"Stack", "Array", "Queue", "Tree"}, 'C'));

	questions.add(new Question("What does HTTP stand for?",
		new String[]{"HyperText Transfer Protocol", "HighText Transfer Protocol", "HyperText Transmission Program", "None of the above"}, 'A'));

	questions.add(new Question("Which keyword is used to inherit a class in Java?",
		new String[]{"implement", "extends", "inherits", "super"}, 'B'));

	questions.add(new Question("What is the size of an `int` in Java?",
		new String[]{"2 bytes", "4 bytes", "8 bytes", "Depends on system"}, 'B'));

	questions.add(new Question("Which of the following is not a Java primitive type?",
		new String[]{"int", "boolean", "String", "char"}, 'C'));


        int score = 0;

        System.out.println("Welcome to the Quiz!");
        System.out.println("---------------------");

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            questions.get(i).displayQuestion();

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            if (questions.get(i).isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + questions.get(i).correctAnswer);
            }
        }

        System.out.println("\nQuiz Finished!");
        System.out.println("Your Score: " + score + " out of " + questions.size());
        scanner.close();
    }
}

