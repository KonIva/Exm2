package com.example.ivan.exm2;





import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;





public class Past  {

    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("description")
    @Expose
    private String description;

    public String getTime() {
        int i=Integer.parseInt(time);
        i%=1000000;
        time=String.valueOf(i);
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
}}

