package gameEngine;

import hero.Hero;
import map.MiniMap;;import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Game {
   private MiniMap map;
   private ArrayList<Hero> heroes;
   private ArrayList<String> rounds;

   private static Map<Character, Position> delta = new HashMap<>() {{
       put('U', new Position(-1,0));
       put('D', new Position(1,0));
       put('L', new Position(0,-1));
       put('R', new Position(0,1));
       put('_', new Position(0,0));
   }};

   public Game(MiniMap map) {
       this.map = map;
       heroes = new ArrayList<>();
       rounds = new ArrayList<>();
   }

   public void addHero(Hero hero) {
       heroes.add(hero);
   }

   public void addRound(String round) {
       rounds.add(round);
   }
}
