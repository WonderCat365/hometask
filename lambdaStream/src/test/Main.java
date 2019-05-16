package test;

import annotations.StreamTask;

public class Main {

    public static void main(String[] args) {

        StreamTask streamTask = new StreamTask();

        streamTask.streamFromList();

        streamTask.streamFromEnumeration();

        streamTask.streamFromArray();

        streamTask.streamFromFile();

        streamTask.streamFromString();

        streamTask.parallelStream();

        streamTask.powerStream();

        streamTask.fibonacciStream();

        streamTask.filterArray();
    }
}
