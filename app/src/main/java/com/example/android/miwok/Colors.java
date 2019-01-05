package com.example.android.miwok;

public class Colors {
    private  String mDefaultColor;
    private  String mMiwokColor;

    public Colors(String defaultColor, String miwokColor ){
        mDefaultColor = defaultColor;
        miwokColor = mMiwokColor;
    }

    public String getDefaultColor(){
        return mDefaultColor;
    }

    public String getMiwokColor(){
        return mMiwokColor;
    }

}
