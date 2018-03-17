package com.cognizance.cognizance18.models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Events{
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("tagline")
  @Expose
  private String tagline;
  @SerializedName("id")
  @Expose
  private int id;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;

  public void setName(String name){
   this.name=name;
  }
  public String getName(){
   return name;
  }
  public void setTagline(String tagline){
   this.tagline=tagline;
  }
  public String getTagline(){
   return tagline;
  }
  public void setId(int id){
   this.id=id;
  }
  public int getId(){
   return id;
  }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}