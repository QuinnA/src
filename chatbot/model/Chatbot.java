package chatbot.model;

public class Chatbot
{

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
	
	public int getChatCount()
	{
		return chatCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	private void updateChatCount()
	{
		chatCount++;
	}
	
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