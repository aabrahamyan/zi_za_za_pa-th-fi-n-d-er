zi_za_za_pa-th-fi-n-d-er
========================

A pathfinder, implements famous Lee Algorithm in order to find a path of squared Matrix. It uses 

     a 
    axa   
     a   

movements adjucence. This way it will move down in diagonal. There is a method in Point.java called "getDirectBottom()" which allows to be moved directly down. I have just changed an adjucence, this way just because it was interesting to me, you can enable getDirectBottom() and it will work with direct movement to down as well.
     

How to run:

Modify final int rows = 5;   
		   final int columns = 5; in PathFinderImpl.java. Note that rows must be equal to columns, otherwise NotASquareMatrix exception will be thrown.
		   
Mofiy  final String input = "    AAAAA " +
							 "	  AAXAA " +
							 "	  XAXAA " +
							 "	  XAAXX " +
							 "	  FAXAA";  You should add a "\t" sign before every new row. This is just a matter of formatting, code splits a string by "\t". This is pretty much it. You are free to run and check.
							
     
