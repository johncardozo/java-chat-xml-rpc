package chat.model;

import java.util.ArrayList;

public class ChatRoom {
	
    private static ChatRoom instance = null; 
  
    private ArrayList<Chat> chats;
    private ArrayList<User> users;
    
    private ChatRoom() 
    { 
        this.chats = new ArrayList<Chat>();
        this.users = new ArrayList<User>();
    } 
  
    public static ChatRoom getInstance() 
    { 
        if (instance == null) 
            instance = new ChatRoom(); 
  
        return instance; 
    }

	/**
	 * @return the chats
	 */
	public ArrayList<Chat> getChats() {
		return chats;
	}

	/**
	 * @param chats the chats to set
	 */
	public void setChats(ArrayList<Chat> chats) {
		this.chats = chats;
	}

	/**
	 * @return the users
	 */
	public ArrayList<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}	
}
