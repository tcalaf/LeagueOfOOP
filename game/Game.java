package game;

import heropack.Hero;
import heropack.HeroClass;
import map.MiniMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class Game {
   private MiniMap minimap;
   private ArrayList<Hero> heroes;
   private ArrayList<String> rounds;

   // Pair letter with position
   private static Map<Character, Position> chgPos = new HashMap<>() {{
       put('U', new Position(-1, 0));
       put('D', new Position(1, 0));
       put('L', new Position(0, -1));
       put('R', new Position(0, 1));
       put('_', new Position(0, 0));
   }};

   public Game(final MiniMap map) {
       this.minimap = map;
       heroes = new ArrayList<>();
       rounds = new ArrayList<>();
   }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void addHero(final Hero hero) {
       heroes.add(hero);
   }

   public void addRound(final String round) {
       rounds.add(round);
   }

   public boolean checkFight(final Hero a, final Hero b) {
       return (a.getPosition().getRow() == b.getPosition().getRow())
               && (a.getPosition().getColumn() == b.getPosition().getColumn());
   }

   public void play() {
       for (int round = 0; round < rounds.size(); round++) {
           for (int player = 0; player < heroes.size(); player++) {
               Hero hero = heroes.get(player);

               // Check incapacity
               if (hero.getMoveIncapacity() > 0) {
                    hero.setMoveIncapacity(hero.getMoveIncapacity() - 1);
                    continue;
               }

               // Make move
               Character move = rounds.get(player).charAt(round);
               Position newPosition = new Position(hero.getPosition().getRow()
                       + chgPos.get(move).getRow(),
                       hero.getPosition().getColumn() + chgPos.get(move).getColumn());
               hero.setPosition(newPosition);

               // Check overtime damage
               if (hero.getOverTimeDuration() > 0) {
                   hero.getInjured(hero.getOverTimeDmg());
                   hero.setOverTimeDuration(hero.getOverTimeDuration() - 1);
               }

           }

           for (int i = 0; i < heroes.size(); i++) {
               for (int j = i + 1; j < heroes.size(); j++) {
                    Hero hero1 = heroes.get(i);
                    Hero hero2 = heroes.get(j);

                    // Fight check
                    if (hero1.isDead() || hero2.isDead() || !checkFight(hero1, hero2)) {
                        continue;
                    }
                    // Wizard attacks last for deflect
                    if (hero1.getHeroClass() == HeroClass.WIZARD) {
                        hero2.fight(hero1, minimap);
                        hero1.fight(hero2, minimap);
                    } else {
                        hero1.fight(hero2, minimap);
                        hero2.fight(hero1, minimap);
                    }
               }

           }


       }

   }
}
