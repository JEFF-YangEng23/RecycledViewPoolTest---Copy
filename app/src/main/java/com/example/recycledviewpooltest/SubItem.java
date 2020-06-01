package com.example.recycledviewpooltest;

import android.widget.Spinner;

public class SubItem {
    private String mWorkoutName;
    private String workoutNum;
    private String munit;
    private Spinner mUnitSpinner;
    public SubItem(String workoutName, String num, String unit) {
        mWorkoutName = workoutName;
        workoutNum = num;
        munit = unit;
    }

    public Spinner getmUnitSpinner() {
        return mUnitSpinner;
    }

    public void setSpinner (Spinner _mUnitSpinner) {
        mUnitSpinner = _mUnitSpinner;
    }


    public String getmWorkoutName() {
        return mWorkoutName;
    }

    public String getWorkoutNum() {
        return workoutNum;
    }

    public String getMunit() {
        return munit;
    }

    public void setmWorkoutName(String mWorkoutName) {
        this.mWorkoutName = mWorkoutName;
    }

    public void setWorkoutNum(String workoutNum) {
        this.workoutNum = workoutNum;
    }

    public void setMunit(String munit) {
        this.munit = munit;
    }


}
