package com.google.sps.data;
import java.util.ArrayList;
import java.time.LocalDateTime;

public final class CommentGen {
    private ArrayList<String> comments;

  public CommentGen() {
    comments = new ArrayList<String>();
  }
  public void addComment(String comment){
      LocalDateTime time = LocalDateTime.now();
      comments.add(time + ": " +comment);
  }
  public String toString(){
      String comment = "";
      for (String i : comments){
        comment += (i+ "\n");
      }
      return comment;
  }
}