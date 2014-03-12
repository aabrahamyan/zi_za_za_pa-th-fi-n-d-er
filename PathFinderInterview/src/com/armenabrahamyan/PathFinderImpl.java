package com.armenabrahamyan;

/**
 * Starting point
 * @author armenabrahamyan
 *
 */
public class PathFinderImpl {
	
	public static void main(String[] args) {
		final int rows = 5;
		final int columns = 5;
		final char [][] matrix = new char[rows][columns];		
		final String input = "    AAAAA " +
							 "	  AAXAA " +
							 "	  XAXAA " +
							 "	  XAAXX " +
							 "	  FAXAA";
		
			final String [] convertedInputArray = input.split("\\t");						
			
			for (int count = 0; count < convertedInputArray.length; count++) {
				final String currentRow = convertedInputArray[count].trim();
				matrix[count] = currentRow.toCharArray();				
			}
			
			final PathFinderExecutor executor = new PathFinderExecutor();
			
			System.out.println("Is path there :" +executor.leeThePath(matrix, rows, columns));

        
	}
	
}
