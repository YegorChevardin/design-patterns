package ua.com.yehorchevardin.java.patterns.behavioral.mediator.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.mediator.dto.Chat;
import ua.com.yehorchevardin.java.patterns.behavioral.mediator.dto.User;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
  User admin;
  List<User> participants = new ArrayList<>();

  public void setAdmin(User admin) {
    this.admin = admin;
    addUserToChat(admin);
  }

  private void addUserToChat(User user) {
    participants.add(user);
  }

  public void addUser(User user) {
    addUserToChat(user);
  }

  @Override
  public void sendMessage(String message, User user) {
    for (User receiver : participants) {
      if (receiver != user) {
        receiver.getMessage(message);
      }
    }
  }
}
