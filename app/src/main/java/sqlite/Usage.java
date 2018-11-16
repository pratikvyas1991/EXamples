package sqlite;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import java.util.List;

/**
 * Created by Pratik Vyas on 16/11/18.
 */

public class Usage extends Activity {
    List<QuestionnaireModel> questionnaireModelList;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        QuizDBDatas.getRandomQuestionnaire(Usage.this, 5);
    }
}
