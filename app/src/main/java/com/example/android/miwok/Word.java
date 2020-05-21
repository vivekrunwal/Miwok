package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    public Word(String DefaultTranslation,String MiwokTranslation){
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
    }


    public Word(String DefaultTranslation,String MiwokTranslation,int imageResourceID){
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageResourceID=imageResourceID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageResourceID(){ return mImageResourceID;}

    public boolean hasImage(){
    return mImageResourceID!=NO_IMAGE_PROVIDED;
    }
}
