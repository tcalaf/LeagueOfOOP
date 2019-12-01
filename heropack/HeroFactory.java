package heropack;

import game.Position;

public final class HeroFactory {

    private HeroFactory() {
    }
    // Create heroes by a design patter
    public static Hero create(final char hero, final Position position) {
        switch (hero) {
            case 'P': return new Pyromancer(position);
            case 'K': return new Knight(position);
            case 'W': return new Wizard(position);
            case 'R': return new Rogue(position);
            default : return null;
        }
    }
}
