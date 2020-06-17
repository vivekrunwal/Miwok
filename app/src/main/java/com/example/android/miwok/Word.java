package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private int mAudioResourceID;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String DefaultTranslation, String MiwokTranslation, int audioResouceID) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResourceID = audioResouceID;
    }


    public Word(String DefaultTranslation, String MiwokTranslation, int imageResourceID, int audioResouceID) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResouceID;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceID() {
        return mAudioResourceID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
