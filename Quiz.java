package quiz;

import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            int userChoice = getUserChoice(scanner);

            if (userChoice == question.getCorrectOption()) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " +
                        question.getOptions().get(question.getCorrectOption() - 1) + "\n");
            }
        }

        System.out.println("Quiz completed. Your score: " + score + "/" + questions.size());
    }

    private int getUserChoice(Scanner scanner) {
        int choice = -1;
        do {
            System.out.print("Your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 4) {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        } while (choice < 1 || choice > 4);
        return choice;
    }
}
