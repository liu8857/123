package org.lq.ZOO.ui;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


/**
 * �޸�tabѡ��ı���
 * @author ����
 * @PROJECT SuperCRM1
 * @ʱ�� 2019��6��1��-����10:00:37
 *
 */
public class TabTitle extends JPanel {

	/**
	 * Create the panel.
	 */
	public TabTitle(JTabbedPane tab_main) {
		int index = tab_main.getTabCount()-1;
		//��ȡ�������ѡ����ı�
		String text = tab_main.getTitleAt(index);
		JLabel txt = new JLabel(text);//��������
		//�������ı���ӵ�panel��
		add(txt);
		//�����رհ�ť
		JButton btn = new JButton();
		//������������
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//�������ͼƬ
		btn.setRolloverIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/close_over.net.png")));
		//��갴�µ�ͼƬ
		btn.setPressedIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/close_active.net.png")));
		//����Ĭ��ͼƬ
		btn.setIcon(new ImageIcon(UI_Main2.class.getResource("/org/lq/ZOO/icon/close_out.net.png")));
		//ȥ����ť�߿�
		btn.setBorder(null);
		//����͸����ť
		btn.setContentAreaFilled(false);
		add(btn);
		//ȥ��panel�ı���
		setOpaque(false);
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int index = tab_main.indexOfTabComponent(TabTitle.this);
				tab_main.remove(index);
			}
		});
		
	}

}
