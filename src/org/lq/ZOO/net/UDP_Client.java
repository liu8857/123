package org.lq.ZOO.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.swing.JOptionPane;

public class UDP_Client {
	public static void getNetMsg() {
		
		try {
			DatagramSocket datagramSocket = new DatagramSocket(9696);
			while(true) {
				byte []buf = new byte[1];
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				datagramSocket.receive(packet);//�߳�����
				String s = new String(buf);
				switch (s) {
				case "u":
					int num = JOptionPane.showConfirmDialog(null, "���������ʾ","�Ƿ����?",JOptionPane.OK_CANCEL_OPTION);
					if (num == 0) {
						System.out.println("�������......");
					}
					break;

				default:
					JOptionPane.showMessageDialog(null, "����һ�����....");
					break;
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
