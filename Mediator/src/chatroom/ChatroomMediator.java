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
public interface ChatroomMediator {
    public void sendMessage(String msg, User sender);
    public void addUser(User user);
}
