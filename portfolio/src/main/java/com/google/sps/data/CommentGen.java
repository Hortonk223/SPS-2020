package com.google.sps.data;
import java.util.ArrayList;

public final class CommentGen {
  private final String comment;
  private final long timestamp;
  public CommentGen(long timestamp, String comment) {
    this.timestamp = timestamp;
    this.comment = comment;
  }

  public String toString(){
      return timestamp + ": " + comment;
  }
}