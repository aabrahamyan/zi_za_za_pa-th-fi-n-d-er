package com.armenabrahamyan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import com.armenabrahamyan.bean.Point;
import com.armenabrahamyan.exception.NotASquareException;

public class PathFinderExecutor {

	/**
	 * Lee Algorithm method
	 * 
	 * @param arr
	 * @param row
	 * @param col
	 * @return
	 */
	public boolean leeThePath(char[][] arr, int row, int col) {
		if (row != col) {
			throw new NotASquareException(
					"Provided matrix is not a square, cols != rows");
		}

		final int[][] grid = new int[row][col];
		PriorityQueue<Point> queue = new PriorityQueue<Point>(col * row,
				new Comparator<Point>() {

					@Override
					public int compare(Point o1, Point o2) {
						if (grid[o1.row][o1.col] < grid[o2.row][o2.col])
							return -1;
						else if (grid[o1.row][o1.col] > grid[o2.row][o2.col])
							return 1;
						else
							return 0;
					}
				});

		// Start element is 0,0
		queue.offer(new Point(0, 0));
		grid[0][0] = 0;

		// while there are neighbours in queue
		while (!queue.isEmpty()) {

			// Polling the queue
			Point current = queue.poll();
			List<Point> blocks = getNeighbourForBlock(current, row, col);

			for (Point neighbour : blocks) {

				// Check if element is a non blocked member and add to the queue
				if (!(arr[neighbour.row][neighbour.col] == 'X')
						&& grid[neighbour.row][neighbour.col] == 0) {

					grid[neighbour.row][neighbour.col] = grid[current.row][current.col] + 1;
					queue.offer(neighbour);

				}

				// Means we have reached the end, but need to check if last elem
				// is not blocked point
				if (arr[neighbour.row][neighbour.col] == 'F'
						&& arr[neighbour.row][neighbour.col + 1] != 'X') {
					return true;
				}
			}

		}

		return false;
	}

	/**
	 * Finds neighbours based on current block position and Lee Algorithm's
	 * neighbour definition (finds neighbours based on Marcin's provided
	 * adjacent moves)
	 * 
	 * @param p
	 * @param row
	 * @param col
	 * @return
	 */
	private static List<Point> getNeighbourForBlock(Point p, int row, int col) {
		List<Point> neighours = new ArrayList<Point>();

		Point posLeft = p.getLeft();
		if (posLeft.row >= 0 && posLeft.row < row && posLeft.col >= 0
				&& posLeft.col < col)
			neighours.add(posLeft);
		Point posRight = p.getRight();
		if (posRight.row >= 0 && posRight.row < row && posRight.col >= 0
				&& posRight.col < col)
			neighours.add(posRight);
		Point posUp = p.getUp();
		if (posUp.row >= 0 && posUp.row < row && posUp.col >= 0
				&& posUp.col < col)
			neighours.add(posUp);
		Point posDownRight = p.getBottomRight();
		if (posDownRight.row >= 0 && posDownRight.row < row
				&& posDownRight.col >= 0 && posDownRight.col < col)
			neighours.add(posDownRight);
		Point posDownLeft = p.getBottomLeft();
		if (posDownLeft.row >= 0 && posDownLeft.row < row
				&& posDownLeft.col >= 0 && posDownLeft.col < col)
			neighours.add(posDownLeft);

		// NOTE: You can enable this call for direct move, but in that case, it
		// is required to disable getBottomLeft() and getBottomRight()
		// neighbours calculation
		// in order to avoid duplicates A.A.
		/*
		 * Point directBottom = p.getDirectBottom(); if (posDownLeft.row >= 0 &&
		 * posDownLeft.row < row && posDownLeft.col >= 0 && posDownLeft.col <
		 * col)
		 */

		return neighours;

	}

}
