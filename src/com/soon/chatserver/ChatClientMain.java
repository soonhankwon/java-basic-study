package com.soon.chatserver;

import java.io.IOException;

public class ChatClientMain {

    public static void main(String[] args) throws IOException {

        ChatClient client;
        ChatClient client2;
        String nickname = "han";
        String nickname2 = "soon";

        client = new ChatClient(nickname, "localhost", 30000);
        client.setSize(300, 200);
        client.setTitle(nickname);
        client.setVisible(true);


        client2 = new ChatClient(nickname2, "localhost", 30000);
        client2.setSize(300, 200);
        client2.setTitle(nickname2);
        client2.setVisible(true);
    }
}
