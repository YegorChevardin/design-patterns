package ua.com.yehorchevardin.java.patterns.behavioral.command;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.behavioral.command.dto.Database;
import ua.com.yehorchevardin.java.patterns.behavioral.command.dto.Developer;
import ua.com.yehorchevardin.java.patterns.behavioral.command.dto.impl.DeleteCommand;
import ua.com.yehorchevardin.java.patterns.behavioral.command.dto.impl.InsertCommand;
import ua.com.yehorchevardin.java.patterns.behavioral.command.dto.impl.SelectCommand;
import ua.com.yehorchevardin.java.patterns.behavioral.command.dto.impl.UpdateCommand;

public class CommandPattern implements PatternExplanation {
  @Override
  public void execute() {
    Database database = new Database();
    Developer developer =
        new Developer(
            new InsertCommand(database),
            new SelectCommand(database),
            new UpdateCommand(database),
            new DeleteCommand(database));

    developer.insertRecord();
    developer.updateRecord();
    developer.selectRecord();
    developer.deleteRecord();
  }
}
