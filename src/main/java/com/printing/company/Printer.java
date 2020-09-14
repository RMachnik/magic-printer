package com.printing.company;

public interface Printer {
    String print(String content);

    String queue();

    void cancel();
}
