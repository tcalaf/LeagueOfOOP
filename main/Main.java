package main;

import gameEngine.Game;
import hero.Hero;
import gameEngine.Position;
import map.MiniMap;

import java.io.*;
import java.util.*;

public final class Main {
    private Main() {
        // just to trick checkstyle
    }

    static Game readInput(Scanner input) {
        int rows = input.nextInt();
        int columns = input.nextInt();
        ArrayList<String> map = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            map.add(input.next());
        }
        Game game = new Game(new MiniMap(rows, columns, map));

        int heroes = input.nextInt();
        for (int heroId = 0; heroId < heroes; heroId++)
            game.addHero(Hero.create(input.next().charAt(0), new Position(input.nextInt(), input.nextInt()), heroId));

        int rounds = input.nextInt();
        for (int round = 0; round < rounds; round++)
            game.addRound(input.next());

        return game;
    }

    public static void main(final String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        Game game = readInput(scanner);
        //game.play();
    }
}