/**
 * 
 */
package com.jsidlosky.javagfx.map;

/**
 * @author jsidlosky
 *
 */
public final class MapData {
	private final static int mapData[][] = 
		{ { 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 },
		  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
		  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		  { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 } };

	/**
	 * @return the map data
	 */
	public static int[][] getMapData() {
		return mapData;
	}
}
