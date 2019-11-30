package main;

import gameEngine.Game;
import gameEngine.Position;
import hero.HeroFactory;
import map.MiniMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


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
            game.addHero(HeroFactory.create(input.next().charAt(0), new Position(input.nextInt(), input.nextInt())));

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