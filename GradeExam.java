/**
 * ITEC 2150
 * Created By Joseph Grados
 * 8/30/2022
 * Purpose is to check the grade of each student from the exam
 */
public class GradeExam {
    public static void main(String[] args) {
        char[][] studentAnswers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
   //(1)
        //for each loop
       // for (int i = 0; i < studentAnswers.length; i++){
            //Grade one Student
          //  int correctCount = 0;
          //  for(int j = 0; j < studentAnswers[i].length; j++){
           //     if (studentAnswers[i][j] == keys[j]){
            //        correctCount++;
         //       }

           // }
           // System.out.println("Student " + (i + 1) + "'s correct count is " + correctCount);
       // }
        for(char [] studentData: studentAnswers){
            int correctCount = 0;
            for(char answer : studentData){
                int i = 0;
                if(answer == keys[i]){
                    correctCount++;
                }
            }
            System.out.println("Student " + studentData + "'s correct count is " + correctCount);
        }

   }
}
