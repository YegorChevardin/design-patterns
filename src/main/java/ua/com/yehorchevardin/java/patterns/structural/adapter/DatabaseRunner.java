package ua.com.yehorchevardin.java.patterns.structural.adapter;

public class DatabaseRunner {
    public void run() {
        Database database = new ProgramToDatabaseAdapter();
        database.update();
        database.delete();
    }
}
