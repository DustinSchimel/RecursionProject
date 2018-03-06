package recursion.controller;

import recursion.controller.RecursionController;

/**
 * Runs the project by calling the RecursionController
 * @author Dustin Schimel
 *
 */
public class RecursionRunner
{
	public static void main (String [] args)
	{
		RecursionController app = new RecursionController();
		app.start();				
	}
}