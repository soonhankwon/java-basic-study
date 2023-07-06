package com.soon.chatserver;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.Socket;

public class ChatClient extends Frame implements Runnable, ActionListener {

    private String nickname = null;
    private String servAddr = null;
    private int servPort = 0;
    private boolean flag = false;
    private Socket socket = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;
    private TextField tf1 = new TextField();
    private TextArea ta1 = new TextArea();

    public ChatClient(String nickname, String servAddr, int servPort) throws IOException {
        this.nickname = nickname;
        this.servAddr = servAddr;
        this.servPort = servPort;
        this.initGraphics(); // init graph, event register
        this.initNetwork(); // create socket, init stream, start thread
        new Thread(this).start();
    }

    public void initGraphics() {
        this.tf1.setBackground(Color.BLACK);
        this.ta1.setBackground(Color.YELLOW);
        this.add("North", tf1);
        this.add("Center", ta1);
        this.tf1.addActionListener(this);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                stop();
            }
        });
    }
    private void initNetwork() throws IOException {
        this.socket = new Socket(servAddr, servPort);
        bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.sendMessage("[" + nickname + "]:님이 입장했습니다.");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = tf1.getText();
        if(!msg.isEmpty()) {
            this.sendMessage("[" + nickname + "]" + msg);
            tf1.setText("");
        }
    }

    @Override
    public void run() {
        try {
            while(!flag) {
                String msg = br.readLine();
                if(msg!= null && !msg.equals("")) {
                    this.ta1.append(msg + "\n");
                } else {
                    flag = true;
                }
            }
            br.close();
            bw.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage(String msg) {
        try {
            this.bw.write(msg + "\n");
            this.bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void stop() {
        this.sendMessage("");
        this.flag = true;
    }
}