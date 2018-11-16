package sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;


/**
 * Created by Pratik Vyas on 27/10/18.
 */

public class QuizDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "QuizDataBase";
    private static final int DATABASE_VERSION = 1;
    String TAG = "@@@TTT";
    Context mContext;
    private static QuizDBHelper mInstance = null;
    private SQLiteDatabase dbWritable = this.getWritableDatabase();

    public QuizDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        mContext = context;
    }

    public static QuizDBHelper getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new QuizDBHelper(context);
        }
        return mInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE IF NOT EXISTS questionnaire (question_id TEXT PRIMARY KEY,question TEXT,title TEXT,options_a TEXT,options_b TEXT,options_c TEXT,options_d TEXT,answer TEXT)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean isQuestionnaireExist(String question_id) {
        boolean is_Visited = false;
        String selectQuery = "SELECT * FROM questionnaire WHERE question_id ='" + question_id+"'";
        Cursor cursor = dbWritable.rawQuery(selectQuery, null);
        cursor.moveToFirst();
        if(cursor.getCount()>0){
            is_Visited = true;
        }else {
            is_Visited = false;
        }
        if (cursor != null) {
            cursor.close();
            cursor = null;
        }
        return is_Visited;
    }

    public ArrayList<QuestionnaireModel> getRandomQuestionnaire(int limit) {
        ArrayList<QuestionnaireModel> allRec = new ArrayList<>();
        allRec.clear();
        String selectQuery = "SELECT * FROM questionnaire WHERE question_id IN (SELECT question_id FROM questionnaire ORDER BY RANDOM() LIMIT 5)";
        Cursor cursor = dbWritable.rawQuery(selectQuery, null);
        cursor.moveToFirst();
        QuestionnaireModel detailsF;
        if (cursor.moveToFirst()) {
            do {
                detailsF = new QuestionnaireModel();
                detailsF.setQuestionId(cursor.getString(cursor.getColumnIndex("question_id")));
                detailsF.setQuestion(cursor.getString(cursor.getColumnIndex("question")));
                detailsF.setTitle(cursor.getString(cursor.getColumnIndex("title")));
                detailsF.setOptionsA(cursor.getString(cursor.getColumnIndex("options_a")));
                detailsF.setOptionsB(cursor.getString(cursor.getColumnIndex("options_b")));
                detailsF.setOptionsC(cursor.getString(cursor.getColumnIndex("options_c")));
                detailsF.setOptionsD(cursor.getString(cursor.getColumnIndex("options_d")));
                detailsF.setAnswer(cursor.getString(cursor.getColumnIndex("answer")));
                allRec.add(detailsF);
            } while (cursor.moveToNext());
        }
        if (cursor != null) {
            cursor.close();
            cursor = null;
        }
        return allRec;
    }


    public ArrayList<QuestionnaireModel> getQuestionnaire() {
        ArrayList<QuestionnaireModel> allRec = new ArrayList<>();
        allRec.clear();
        String selectQuery = "SELECT * FROM questionnaire ";
        Cursor cursor = dbWritable.rawQuery(selectQuery, null);
        cursor.moveToFirst();
        QuestionnaireModel detailsF;
        if (cursor.moveToFirst()) {
            do {
                detailsF = new QuestionnaireModel();
                detailsF.setQuestionId(cursor.getString(cursor.getColumnIndex("question_id")));
                detailsF.setQuestion(cursor.getString(cursor.getColumnIndex("question")));
                detailsF.setTitle(cursor.getString(cursor.getColumnIndex("title")));
                detailsF.setOptionsA(cursor.getString(cursor.getColumnIndex("options_a")));
                detailsF.setOptionsB(cursor.getString(cursor.getColumnIndex("options_b")));
                detailsF.setOptionsC(cursor.getString(cursor.getColumnIndex("options_c")));
                detailsF.setOptionsD(cursor.getString(cursor.getColumnIndex("options_d")));
                detailsF.setAnswer(cursor.getString(cursor.getColumnIndex("answer")));
                allRec.add(detailsF);
            } while (cursor.moveToNext());
        }
        if (cursor != null) {
            cursor.close();
            cursor = null;
        }
        return allRec;
    }

    public void addQuestionnaire(String question_id, String question, String title, String options_a, String options_b, String options_c, String options_d, String answer) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question_id", question_id);
        contentValues.put("question", question);
        contentValues.put("title", title);
        contentValues.put("options_a", options_a);
        contentValues.put("options_b", options_b);
        contentValues.put("options_c", options_c);
        contentValues.put("options_d", options_d);
        contentValues.put("answer", answer);
        dbWritable.insert("questionnaire", null, contentValues);
        Log.v(TAG, "questionnaire  Added");
    }

    public int countAllRows(String tableName) {
        int count = 0;
        String selectQuery = "SELECT * FROM " + tableName;
        Cursor cursor = dbWritable.rawQuery(selectQuery, null);
        count = cursor.getCount();
        if (cursor != null) {
            cursor.close();
            cursor = null;
        }
        return count;
    }
}
