package main;

import game.Game;
import game.Position;
import heropack.Hero;
import heropack.HeroFactory;
import map.MiniMap;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public final class Main {
    private Main() {
        // just to trick checkstyle
    }

    static Game readInput(final Scanner input) {
        int rows = input.nextInt();
        int columns = input.nextInt();
        ArrayList<String> map = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            // Read map
            map.add(input.next());
        }
        Game game = new Game(new MiniMap(rows, columns, map));

        int heroes = input.nextInt();
        for (int heroId = 0; heroId < heroes; heroId++) {
            // Get heroes
            game.addHero(HeroFactory.create(input.next().charAt(0),
                    new Position(input.nextInt(), input.nextInt())));
        }
        int rounds = input.nextInt();
        for (int round = 0; round < rounds; round++) {
            // Add rounds
            game.addRound(input.next());
        }
        return game;
    }
    static void writeOutput(final PrintWriter output, final ArrayList<Hero> heroes) {
        // Print score
        for (Hero hero : heroes) {
            output.printf("%c ", hero.getRace());
            if (hero.isDead()) {
                output.printf("dead\n");
                continue;
            }
            output.printf("%d %d %d %d %d\n", Hero.getLvl(hero.getXp()), hero.getXp(),
                    hero.getHp(), hero.getPosition().getRow(), hero.getPosition().getColumn());
        }
        output.flush();
    }

    public static void main(final String[] args) throws IOException {
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        Game game = readInput(scanner);
        game.play();
        writeOutput(new PrintWriter(args[1]), game.getHeroes());
    }
}