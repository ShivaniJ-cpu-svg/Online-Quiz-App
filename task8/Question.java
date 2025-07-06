public class Question {
    String questionText;
    String[] options;
    char correctAnswer;

    public Question(String questionText, String[] options, char correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {
        System.out.println(questionText);
        char optionLabel = 'A';
        for (String option : options) {
            System.out.println(optionLabel + ") " + option);
            optionLabel++;
        }
    }

    public boolean isCorrect(char userAnswer) {
        return Character.toUpperCase(userAnswer) == correctAnswer;
    }
}

