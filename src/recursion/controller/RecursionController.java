package recursion.controller;

import recursion.view.PopupDisplay;

public class RecursionController
{
	private PopupDisplay display;
	
	public RecursionController()
	{
		display = new PopupDisplay();
	}
	
	public void start()
	{
		recursivePop("Display sample");
	}
	
	private void recursivePop(String message)
	{
		if (message.length() == 1)
		{
			display.displayText(message);
		}
		else
		{
			recursivePop(message.substring(1, message.length()));
			display.displayText(message);
		}
	}
}
