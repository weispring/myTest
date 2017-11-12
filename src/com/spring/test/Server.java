package com.spring.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	  private static final int SERVER_PORT = 9001;  //指定侦听端口
	  public Server() {
	    try {
	      ServerSocket ss = new ServerSocket(SERVER_PORT);  //创建服务器套接字
	      System.out.println("服务端已启动，正在等待客户端...");
	      Socket s = ss.accept();  //侦听来自客户端的请求
	      s.setOOBInline(true);
	      s.setKeepAlive(true);
	      InputStream in = s.getInputStream();     //获得输入流，用来接收数据
	      OutputStream out = s.getOutputStream();  //获得输出流，用来发送数据
	      byte[] buf = new byte[1024];
	      int len = in.read(buf);                  //从输入流中读取数据
	      String strFromClient = new String(buf, 0, len);
	      System.out.print("来自客户端的信息>>");
	      System.out.println(strFromClient);
	      String strToClient = "我也很好！";
	      out.write(strToClient.getBytes());       //往输出流中发送数据
	      s.setKeepAlive(true);
	      in.close(); out.close();  //关闭输入流和输出流
	      s.close(); ss.close();    //关闭通信套接字和服务器套接字
	      System.out.println("服务端已关闭。");
	    } catch (IOException ioe) { ioe.printStackTrace(); }
	  }

	  public static void main(String[] args) { 
		  
		  for (int i = 0; i < 10; i++) {
			  new Server();
		}
		  }
	}

