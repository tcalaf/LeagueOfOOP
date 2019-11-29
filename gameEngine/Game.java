package gameEngine;

import hero.Hero;
import map.MiniMap;
import java.util.*;

public class Game {
   protected MiniMap map;
   protected ArrayList<Hero> heroes;
   protected ArrayList<String> rounds;

   private static Map<Character, Position> delta = new HashMap<>() {{
       put('U', new Position(-1,0));
       put('D', new Position(1,0));
       put('L', new Position(0,-1));
       put('R', new Position(0,1));
       put('_', new Position(0,0));
   }};

   public Game(MiniMap map) {
       this.map = map;
       heroes = new ArrayList<Hero>();
       rounds = new ArrayList<String>();
   }

   public void addHero(Hero hero) {
       heroes.add(hero);
   }

   public void addRound(String round) {
       rounds.add(round);
   }
}
