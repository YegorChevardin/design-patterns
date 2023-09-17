package ua.com.yehorchevardin.java.patterns.behavioral.mediator;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.behavioral.mediator.dto.User;
import ua.com.yehorchevardin.java.patterns.behavioral.mediator.dto.impl.Admin;
import ua.com.yehorchevardin.java.patterns.behavioral.mediator.dto.impl.SimpleTextChat;
import ua.com.yehorchevardin.java.patterns.behavioral.mediator.dto.impl.SimpleUser;

public class MediatorPattern implements PatternExplanation {
  @Override
  public void execute() {
    SimpleTextChat chat = new SimpleTextChat();
    User admin = new Admin(chat, "Admin name");
    User user1 = new SimpleUser("Simple user 1", chat);
    User user2 = new SimpleUser("Simple user 2", chat);

    chat.setAdmin(admin);
    chat.addUser(user1);
    chat.addUser(user2);

    user1.sendMessage("Hello I am user number 1");
    System.out.println();
    admin.sendMessage("I'll kill you, if you spam here!");
  }
}
