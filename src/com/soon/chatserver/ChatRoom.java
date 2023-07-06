package com.soon.chatserver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ChatRoom extends ArrayList<ChatRunner> {

    public synchronized void addChatRunner(ChatRunner cr) {
        add(cr);
    }

    public synchronized void removeChatRunner(ChatRunner cr) {
        if(this.contains(cr)) {
            this.remove(cr);
        }
    }
    
    public void sendMessageAll(String message) throws IOException {
        Iterator<ChatRunner> iterator = this.iterator();

        while(iterator.hasNext()) {
            ChatRunner runner = iterator.next();
            runner.sendMessage(message);
        }
    }
}
