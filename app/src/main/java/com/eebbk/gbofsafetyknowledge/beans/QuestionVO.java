package com.eebbk.gbofsafetyknowledge.beans;

import java.io.Serializable;

/**
 * decription ：答题信息类
 * author ： zhua
 * Created at 2016/6/14.
 */
public class QuestionVO implements Serializable {

    //答案
    public String mAnswer;
    //标题
    public String mTitle;
    //选项内容
    public String mOptionA;
    public String mOptionB;
    public String mOptionC;
    public String mOptionD;
    //题目格式   1  选项都为图片  2 选项都为文字
    public int mQuestionFormat;
    //对应图片的ID
    public String mPicID;
    //对应音频的ID

    public void setmAnswer(String mAnswer) {
        this.mAnswer = mAnswer;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmOptionA(String mOptionA) {
        this.mOptionA = mOptionA;
    }

    public void setmOptionB(String mOptionB) {
        this.mOptionB = mOptionB;
    }

    public void setmOptionC(String mOptionC) {
        this.mOptionC = mOptionC;
    }

    public void setmOptionD(String mOptionD) {
        this.mOptionD = mOptionD;
    }

    public void setmQuestionFormat(int mQuestionFormat) {
        this.mQuestionFormat = mQuestionFormat;
    }

    public void setmPicID(String mPicID) {
        this.mPicID = mPicID;
    }

    public void setmVoiceID(String mVoiceID) {
        this.mVoiceID = mVoiceID;
    }

    public void setmQuestionType(int mQuestionType) {
        this.mQuestionType = mQuestionType;
    }

    public String mVoiceID;
    //题目类型   1  纯粹   2  产品
    public int mQuestionType;

    public String getmAnswer() {
        return mAnswer;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmOptionA() {
        return mOptionA;
    }

    public String getmOptionB() {
        return mOptionB;
    }

    public String getmOptionC() {
        return mOptionC;
    }

    public String getmOptionD() {
        return mOptionD;
    }

    public int getmQuestionFormat() {
        return mQuestionFormat;
    }

    public String getmPicID() {
        return mPicID;
    }

    public String getmVoiceID() {
        return mVoiceID;
    }

    public int getmQuestionType() {
        return mQuestionType;
    }
}
