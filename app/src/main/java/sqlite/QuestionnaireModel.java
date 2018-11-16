package sqlite;

import java.io.Serializable;

/**
 * Created by Pratik Vyas on 27/10/18.
 */

public class QuestionnaireModel implements Serializable {
    String questionId;
    String question;
    String title;
    String optionsA;
    String optionsB;
    String optionsC;
    String optionsD;
    String answer;

    public QuestionnaireModel() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionsA() {
        return optionsA;
    }

    public void setOptionsA(String optionsA) {
        this.optionsA = optionsA;
    }

    public String getOptionsB() {
        return optionsB;
    }

    public void setOptionsB(String optionsB) {
        this.optionsB = optionsB;
    }

    public String getOptionsC() {
        return optionsC;
    }

    public void setOptionsC(String optionsC) {
        this.optionsC = optionsC;
    }

    public String getOptionsD() {
        return optionsD;
    }

    public void setOptionsD(String optionsD) {
        this.optionsD = optionsD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
