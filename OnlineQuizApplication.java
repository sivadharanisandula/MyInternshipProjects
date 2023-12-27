
import quiz.Question;
import quiz.Quiz;

import java.util.ArrayList;
import java.util.List;
public class OnlineQuizApplication {
    public static void main(String[] args) {
    	 List<Question> questions = new ArrayList<>();
         // Add your questions with options and correct answers
         questions.add(new Question("What is the capital of France?",
        		 List.of("Berlin", "Madrid", "Paris", "Rome"), 3));
         questions.add(new Question("What is the capital of India?",
        		 List.of("Delhi", "Mumbai","Kolkatta","Hyderabad"), 1));
         questions.add(new Question("Who is the prime minister of India?",
        		 List.of("Amit shah","JaganMohanReddy", "Nirmala Seetharaaman", "Narendra Modi"),4));

        Quiz quiz = new Quiz(questions);
        quiz.startQuiz();
    }
}
