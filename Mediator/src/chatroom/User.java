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
public abstract class User {
    protected ChatroomMediator mediator ;
    protected String name;
    public User(ChatroomMediator mediator, String name)
    {
        this.mediator = mediator;
        this.name = name;
    }
    
    public abstract void send(String msg);
    public abstract void receive(String msg);
}
