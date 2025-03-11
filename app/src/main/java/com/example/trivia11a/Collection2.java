
package com.example.trivia11a;

        import java.util.ArrayList;
        import java.util.Collections;

public class Collection2 {
    private ArrayList<Question> arr;
    private int index; // מספר השאלה הבאה בתור

    public Collection2() {
        // יצירת השאלות
        Question q1 = new Question("1 + 10", "7", "11", "3", "9", 2);
        Question q2 = new Question("1 + 2", "8", "2", "3", "7", 3);
        Question q3 = new Question("1 + 3", "6", "2", "4", "5", 3);
        Question q4 = new Question("1 + 4", "5", "2", "3", "6", 1);
        Question q5 = new Question("1 + 0", "1", "2", "3", "4", 1);

        // הוספת השאלות לרשימה
        arr = new ArrayList<>();
        arr.add(q1);
        arr.add(q2);
        arr.add(q3);
        arr.add(q4);
        arr.add(q5);
    }

    // פונקציה להערבב את השאלות
    public void shuffleQuestions() {
        Collections.shuffle(arr); // מערבב את השאלות ברשימה
    }

    // אתחול השאלות והערבוב מחדש
    public void initQuestion() {
        index = 0;
        shuffleQuestions(); // מערבב את השאלות בכל פעם שמתחילים מחדש
    }

    public Question getNextQuestion() {
        // מחזירה הפניה לשאלה הבאה
        Question q = arr.get(index);
        index++;
        return q;
    }

    public boolean isNotLastQuestion() {
        // מחזירה אמת אם יש שאלות נוספות
        return (index < arr.size());
    }

    public int getIndex() {
        return index;
    }
}
