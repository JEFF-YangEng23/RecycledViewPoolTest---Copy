package com.example.recycledviewpooltest;

import android.widget.Spinner;


import java.util.List;

public class Item {
    private String mstructure;
    private String mtype;
    private List<SubItem> mList;
    private Spinner structureSpinner;
    private Spinner typeSpinner;

    public Item(String structure, String type, List<SubItem> List){
        mstructure = structure;
        mtype = type;
        mList = List;
    }

    public Spinner getStructureSpinner() {
        return structureSpinner;
    }

    public void setStructureSpinner(Spinner structureSpinner) {
        this.structureSpinner = structureSpinner;
    }

    public Spinner getTypeSpinner() {
        return typeSpinner;
    }

    public void setTypeSpinner(Spinner typeSpinner) {
        this.typeSpinner = typeSpinner;
    }

    public String getMstructure() {
        return mstructure;
    }

    public void setMstructure(String mstructure) {
        this.mstructure = mstructure;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public List<SubItem> getmList() {
        return mList;
    }

    public void setmList(List<SubItem> mList) {
        this.mList = mList;
    }
}

