package map;

import game.Position;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public final class MiniMap {
    private int rows;
    private int columns;
    private Terrain[][] map;

    private static Map<Character, Terrain> terrainType = new HashMap<>() {{
        put('L', Terrain.LAND);
        put('V', Terrain.VOLCANIC);
        put('D', Terrain.DESERT);
        put('W', Terrain.WOODS);
    }};

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Terrain getTerrain(final Position position) {
        return map[position.getRow()][position.getColumn()];
    }

    public MiniMap(final int rows, final int columns, final ArrayList<String> type) {
        this.rows = rows;
        this.columns = columns;
        map = new Terrain[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                // Pair char - terrain type
                map[row][column] = terrainType.get(type.get(row).charAt(column));
            }
        }
    }


}
