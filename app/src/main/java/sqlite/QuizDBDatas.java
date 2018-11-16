package sqlite;

import android.content.Context;

import java.util.ArrayList;


/**
 * Created by Pratik Vyas on 27/10/18.
 */

public class QuizDBDatas {
    public static ArrayList<QuestionnaireModel> mQuestionnaireList;

    public static ArrayList<QuestionnaireModel> getQuestionnaire(Context context) {
        mQuestionnaireList = QuizDBHelper.getInstance(context).getQuestionnaire();
        return mQuestionnaireList;
    }

    public static ArrayList<QuestionnaireModel> getRandomQuestionnaire(Context context, int limit) {
        mQuestionnaireList = QuizDBHelper.getInstance(context).getRandomQuestionnaire(limit);
        return mQuestionnaireList;
    }

    public static void addQuestionnaire(Context context, String question_id, String question, String title, String options_a, String options_b, String options_c, String options_d, String answer) {
        QuizDBHelper.getInstance(context).addQuestionnaire(question_id, question, title, options_a, options_b, options_c, options_d, answer);
    }

    public static int countAllRows(Context context, String table_name) {
        return QuizDBHelper.getInstance(context).countAllRows(table_name);
    }

    public static boolean isQuestionnaireExist(Context context, String question_id) {
        return QuizDBHelper.getInstance(context).isQuestionnaireExist(question_id);
    }
}
