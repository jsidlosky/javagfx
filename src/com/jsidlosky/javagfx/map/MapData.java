/**
 *
 */
package com.jsidlosky.javagfx.map;

import org.jetbrains.annotations.NotNull;

/**
 * @author jsidlosky
 */
public final class MapData {
    @NotNull
    private final static int mapData[][] =
            {{0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {1, 1, 1, 1, 0, 1, 1, 1, 1, 1}};

    /**
     * @return the map data
     */
    @NotNull
    public static int[][] getMapData() {
        return mapData;
    }
}
