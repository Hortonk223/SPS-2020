package com.google.sps.data;
import java.util.ArrayList;

public final class CommentGen {
    public ArrayList<String> comments;

  public CommentGen() {
    comments = new ArrayList<String>();
    // comments.add("Woah a new comment!");
    // comments.add("WELCOME TO SPS!");
    // comments.add("How do I program anything?");
  }
  public void addComment(String comment){
      comments.add(comment);
  }
  public String toString(){
      String comment = "";
      for (String i : comments){
        comment += (i+ "\n");
      }
      return comment;
  }
}