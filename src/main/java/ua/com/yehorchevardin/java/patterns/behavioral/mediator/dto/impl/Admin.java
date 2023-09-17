package ua.com.yehorchevardin.java.patterns.behavioral.mediator.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.mediator.dto.Chat;
import ua.com.yehorchevardin.java.patterns.behavioral.mediator.dto.User;

public class Admin implements User {
  private Chat chat;
  private String name;

  public Admin(Chat chat, String name) {
    this.chat = chat;
    this.name = name;
  }

  public void setChat(Chat chat) {
    this.chat = chat;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Chat getChat() {
    return chat;
  }

  public String getName() {
    return name;
  }

  @Override
  public void getMessage(String message) {
    System.out.println(name + " admin receiving message: " + message);
  }

  @Override
  public void sendMessage(String message) {
    chat.sendMessage(message, this);
  }
}
