package chat.model;

import java.util.ArrayList;

public class Chat {
	
	private ArrayList<Message> messages;
	private User user1;
	private User user2;
	
	public Chat(User user1, User user2) {
		this.messages = new ArrayList<Message>();
		this.user1 = user1;
		this.user2 = user2;		
	}

	/**
	 * @return the messages
	 */
	public ArrayList<Message> getMessages() {
		return messages;
	}

	/**
	 * @param messages the messages to set
	 */
	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}

	/**
	 * @return the user1
	 */
	public User getUser1() {
		return user1;
	}

	/**
	 * @param user1 the user1 to set
	 */
	public void setUser1(User user1) {
		this.user1 = user1;
	}

	/**
	 * @return the user2
	 */
	public User getUser2() {
		return user2;
	}

	/**
	 * @param user2 the user2 to set
	 */
	public void setUser2(User user2) {
		this.user2 = user2;
	}

}
