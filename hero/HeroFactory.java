package hero;

import gameEngine.Position;

public class HeroFactory {

    public static Hero create (char hero, Position position) {
        switch (hero) {
            case 'P': return new Pyromancer(position);
            case 'K': return new Knight(position);
            case 'W': return new Wizard(position);
            case 'R': return new Rogue(position);
        }
        throw new IllegalArgumentException("No hero" + hero);
    }
}
