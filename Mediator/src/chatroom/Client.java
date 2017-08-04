/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroom;

/**
 *
 * @author Tesfay
 */
public class Client {
    public static void main(String[] args){
        ChatroomMediator chatroom = new ChatroomMediatorImpl();
        
        User u1 = new UserImpl(chatroom, "Tesfay");
        User u2 = new UserImpl(chatroom, "Lwam");
        User u3 = new UserImpl(chatroom, "Sirak");
        User u4 = new UserImpl(chatroom, "Esayas");
        User u5 = new UserImpl(chatroom, "Desta");
        
        chatroom.addUser(u1);
        chatroom.addUser(u2);
        chatroom.addUser(u3);
        chatroom.addUser(u4);
        chatroom.addUser(u5);
        
        u1.send("Hi All");
        
    }
}
