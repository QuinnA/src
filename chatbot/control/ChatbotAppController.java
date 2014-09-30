package chatbot.control;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;

public class ChatbotAppController	
{
	private ChatbotView applicationView;
	private Chatbot mySillyChatbot;
	
	public ChatbotAppController()
	{
		applicationView = new ChatbotView(this);
		mySillyChatbot = new Chatbot("Tumadre");
	}
	
	public void start()
	{
		String result = applicationView.showChatbot("Quinn");
		
		while(!mySillyChatbot.quitChecker(result))
		{
			result = applicationView.showChatbot(result);
		}
		
		quit();
	}
	
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "good bye cruel world");
		System.exit(0);
	}
}
