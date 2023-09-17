package ua.com.yehorchevardin.java.patterns.behavioral.mediator.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.mediator.dto.Chat;
import ua.com.yehorchevardin.java.patterns.behavioral.mediator.dto.User;

public class SimpleUser implements User {
  private String name;
  private Chat chat;

  public void setName(String name) {
    this.name = name;
  }

  public void setChat(Chat chat) {
    this.chat = chat;
  }

  public String getName() {
    return name;
  }

  public Chat getChat() {
    return chat;
  }

  public SimpleUser(String name, Chat chat) {
    this.name = name;
    this.chat = chat;
  }

  @Override
  public void getMessage(String message) {
    System.out.println(name + " receiving message: " + message);
  }

  @Override
  public void sendMessage(String message) {
    chat.sendMessage(message, this);
  }
}
