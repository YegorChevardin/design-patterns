package ua.com.yehorchevardin.java.patterns.behavioral.observer.dto;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
