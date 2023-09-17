package ua.com.yehorchevardin.java.patterns.behavioral.command.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.command.dto.Command;
import ua.com.yehorchevardin.java.patterns.behavioral.command.dto.Database;

public class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
