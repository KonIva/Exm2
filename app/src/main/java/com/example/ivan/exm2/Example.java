package com.example.ivan.exm2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Example {

    @SerializedName("past")
    @Expose
    private List<Past> past = new ArrayList<>();
    @SerializedName("future")
    @Expose
    private List<Future> future = new ArrayList<>();

    public List<Past> getPast() {
        return past;
    }

    public void setPast(List<Past> past) {
        this.past = past;
    }

    public List<Future> getFuture() {
        return future;
    }

    public void setFuture(List<Future> future) {
        this.future = future;
    }

}
