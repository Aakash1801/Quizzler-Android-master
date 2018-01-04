package com.londonappbrewery.quizzler;

/**
 * Created by Aakash on 1/4/2018.
 */

public class TrueFalse {

    private int mQuiestionID;
    private boolean mAnswer;

    public TrueFalse(int questionResourceID, boolean trueOrFalse)
    {
        mQuiestionID = questionResourceID;
        mAnswer = trueOrFalse;
    }

    public int getQuiestionID() {
        return mQuiestionID;
    }

    public void setQuiestionID(int mQuiestionID) {
        this.mQuiestionID = mQuiestionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}

