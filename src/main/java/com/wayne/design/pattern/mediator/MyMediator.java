package com.wayne.design.pattern.mediator;

public class MyMediator implements Mediator{

    private User user1;
    private User user2;

    @Override
    public void createMediator() {
        user1 = new User1(this);
        user1.setName("Jone");
        user2 = new User2(this);
        user2.setName("Wayne");
    }

    @Override
    public void chat() {
        user1.chat(user2,"How are you?");
        user2.chat(user1,"I‘m fine.Thx.");
    }
}
