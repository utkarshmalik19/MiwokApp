package com.example.miwokapp;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Word(String DefaultTranslation, String MiwokTranslation, int imageResourceId,int audioResourceId ){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public Word(String DefaultTranslation, String MiwokTranslation,int audioResourceId){
     mDefaultTranslation = DefaultTranslation;
     mMiwokTranslation = MiwokTranslation;
        mAudioResourceId = audioResourceId;

    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
public int getImageResourceId(){
        return mImageResourceId;
}
public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
}
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
