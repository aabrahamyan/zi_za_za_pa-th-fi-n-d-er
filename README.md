zi_za_za_pa-th-fi-n-d-er
========================

A pathfinder, implements famous Lee Algorithm in order to find a path of squared Matrix. It uses 

     a 
    axa   
     a   

movements adjucence. This way it will move down in diagonal. There is a method in Point.java called "getDirectBottom()" which allows to be moved directly down. I have just changed an adjucence, this way just because it was in scope of requirements, you can enable getDirectBottom() and it will work with direct movement to down as well.
     

How to run:

Modify            ``` final int rows = 5;
		      final int columns = 5; 
		  ```

in PathFinderImpl.java. Note that rows must be equal to columns, otherwise NotASquareMatrix exception will be thrown.
		   
Mofiy                           ``` final String input = "        AAAAA " +
							 "	  AAXAA " +
							 "	  XAXAA " +
							 "	  XAAXX " +
							 "	  FAXAA";```  

You should add a "\t" sign before every new row. This is just a matter of formatting, code splits a string by "\t". This is pretty much it. You are free to run and check.
 As a start point solution looks  at (0,0), to identify desired path you must add "F" before desired end block in matrix, F=Finish. Though it is not really neccessary, but I thought maybe you would like to play around with destination point as well.
 
P.S. Though programm accepts nxn matrix and throws exception, it works for non square matrixes as well, just need to remove a check for square condition (and runtime exception throwing) in PathFinderExecutor.java in leeThePath(char[][] arr, int row, int col) method.
							
     
