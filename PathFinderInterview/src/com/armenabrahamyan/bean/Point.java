package com.armenabrahamyan.bean;

/**
 * Used to hit neighbours of current block
 * @author armenabrahamyan
 *
 */
public class Point {

	public int row; 
    public int col;
 
    /**
     * 
     * @param row
     * @param col
     */
    public Point(int row, int col) {
        this.row = row;
        this.col = col;
    }
 
    public Point getLeft() {
        return new Point(row, col - 1);
    }
 
    public Point getRight() {
        return new Point(row, col + 1);
    }
 
    public Point getBottomRight() {
        return new Point(row + 1, col + 1);
    }
    
    public Point getBottomLeft() {
        return new Point(row + 1, col - 1);
    }
 
    public Point getUp() {
        return new Point(row - 1, col);
    }
 
    public String toString() {
        return "row:" + row + " col:" + col;
    }
}
