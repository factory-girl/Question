import java.util.Scanner;

/**
   This program tests one multiple choice question.
*/
public class QuestionTest
{
   public static void main(String[] args)
   {
      MultiChoiceQuestion first = new MultiChoiceQuestion();
      first.setText("Which statement(s) about Java language is(are) correct?");
      first.addChoice("James Gosling is the inventor of Java.", true);
      first.addChoice("The inventor of Java was born in Canada.", true);
      first.addChoice("The original name of the Java language was Oak.", true);

      presentQuestion(first);
   }
   /**
      Presents a question to the user and checks the response.
      @param q the question
   */
   public static void presentQuestion(ChoiceQuestion q)
   {
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
   }
}