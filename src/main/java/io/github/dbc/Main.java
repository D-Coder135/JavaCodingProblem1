package io.github.dbc;

public class Main {
    public static void main(String[] args) {
        DuplicateCharactersCounter counter = new DuplicateCharactersCounter();
        var duplicateCharacters = counter.countDuplicateCharacters("aabcc");
        System.out.println(duplicateCharacters);
    }
}