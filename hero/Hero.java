package hero;

import gameEngine.Position;

public abstract class Hero {
    char hero;
    Position position;
    int id;

    public static Hero create (char hero, Position position, int id ) {
        switch (hero) {
            case 'P': return new Pyromancer(position, id);
            case 'K': return new Knight(position, id);
            case 'W': return new Wizard(position, id);
            case 'R': return new Rogue(position, id);
        }
        throw new IllegalArgumentException("No hero" + hero);
    }
}
