package chatbot.control;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;

/**
 * Runs chatbot Project. Owns the model and associated views.
 * @author Quinn Andree
 *@version 1.2 10/2/14 - cleaned the quit method.
 */
public class ChatbotAppController	
{
	private ChatbotView applicationView;
	private Chatbot mySillyChatbot;
	private String startMessage;
	private String quitMessage;
	
	
	public ChatbotAppController()
	{
		applicationView = new ChatbotView(this);
		mySillyChatbot = new Chatbot("Tumadre");
		startMessage = "Welcome to the " + mySillyChatbot.getName() + " chatbot. What is your name?";
		quitMessage = "goodbye cuel user:(";
	}
	
	
	public Chatbot getMySillyChatbot()
	{
		return mySillyChatbot;
		
	}
	
	
	
	public void start()
	{
		String result = applicationView.showChatbotDialog("startMessage");
		
		while(!mySillyChatbot.quitChecker(result))
		{
			result = applicationView.showChatbotDialog(result);
		}
		
		quit();
	}
	
	private void quit()
	{
		applicationView.showChatbotDialog(quitMessage);
		System.exit(0);
	}
}
