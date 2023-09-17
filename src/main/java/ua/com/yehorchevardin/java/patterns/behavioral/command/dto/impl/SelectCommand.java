package ua.com.yehorchevardin.java.patterns.behavioral.command.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.command.dto.Command;
import ua.com.yehorchevardin.java.patterns.behavioral.command.dto.Database;

public class SelectCommand implements Command {
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
