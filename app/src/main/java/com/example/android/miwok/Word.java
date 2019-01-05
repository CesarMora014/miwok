package com.example.android.miwok;

public class Word {
    private String  mDefaultTranslation;
    private  String mMiwokTransaltion;

    public Word(String defaultTransaltion, String miwokTransaltion){
        mDefaultTranslation = defaultTransaltion;
        mMiwokTransaltion = miwokTransaltion;

    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTransaltion;
    }
}
