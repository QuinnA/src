package chatbot.model;

import java.util.ArrayList;

/**
 * The chatbot model class. Used for checking and manipulating Strings.
 * @author qand5129
 *
 */

public class Chatbot
{
	private ArrayList<String> memeList;
	private String name;
	private int chatCount;
	
	/**
	 * Creates Chatbot object with the supplied name and initializes the current number of chats to zero.
	 * @param name The supplied name for the Chatbot.
	 */
	
	public Chatbot(String name)
	{
		this.name = name;
		chatCount = 0;
	}
	
	
	/**
	 * Returns the name of the Chatbot object.
	 * @return The current name of the Chatbot.
	 */
	
	public String getName()
	{
		return name;
	}
	
	
	/**
	 * Returns chat count.
	 * @return
	 */
	
	public int getChatCount()
	{
		return chatCount;
	}
	
	/**
	 * Sets name of Chatbot.
	 * @param name
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	/**
	 * Updates chat count by one.
	 */
	private void updateChatCount()
	{
		chatCount++;
	}
	
	
	/**
	 * The quit process or checker.
	 * @param input
	 * @return
	 */
	
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input.equalsIgnoreCase("yes"))
		{
			okToQuit = true;
		}
		
		return okToQuit;
	}
}
