/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroom;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tesfay
 */
public class ChatroomMediatorImpl implements ChatroomMediator{

    List<User> users;
    public ChatroomMediatorImpl(){
        users = new ArrayList<>();
    }
    @Override
    public void sendMessage(String msg, User sender) {
        // send msg to everyone int the chatroom
        for(User u : users){
            if(u != sender){
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
       users.add(user);
    }
    
}
