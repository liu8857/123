package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lombok.extern.log4j.Log4j;

import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

/**
 * @author���
 * @2019��7��1��
 * @ui_touristCheck.java
 * @ZOO
 */
/**
 * @author ���
 * 2019��7��1��
 */
@Log4j
public class ui_touristCheck extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_touristCheck frame = new ui_touristCheck();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("Ʊ�۲�ѯ���ڴ���",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_touristCheck() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_touristCheck.class.getResource("/org/lq/ZOO/icon/bg/1.png")));
		setTitle("\u95E8\u7968\u67E5\u8BE2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 796);
		contentPane = new JPanel();
		contentPane.setBounds(194, 0, 776, 755);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 698, 748);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 10, 678, 728);
		textPane.setBackground(new Color(0, 255, 0));
		textPane.setForeground(new Color(0, 0, 0));
		textPane.setEditable(false);
		textPane.setFont(new Font("����", Font.BOLD, 16));
		textPane.setText("\u95E8\u7968\u67E5\u8BE2 :\r\n\r\n\u52A8\u7269\u56ED\u95E8\u7968\uFF1A\r\n\u65FA\u5B63\u6BCF\u5F2015\u5143\uFF084\u67081\u65E5\u8D77\u81F310\u670831\u65E5\u6B62\uFF09 \r\n\u6DE1\u5B63\u6BCF\u5F2010\u5143\uFF0811\u67081\u65E5\u8D77\u81F3\u6B21\u5E743\u670831\u65E5\u6B62\uFF09 \r\n\u52A8\u7269\u56ED\u95E8\u7968\u534A\u4EF7\u7968\uFF1A\r\n\u65FA\u5B63\u6BCF\u5F207.5\u5143\uFF084\u67081\u65E5\u8D77\u81F310\u670831\u65E5\u6B62\uFF09\r\n\u6DE1\u5B63\u6BCF\u5F205\u5143\uFF0811\u67081\u65E5\u8D77\u81F3\u6B21\u5E743\u670831\u65E5\u6B62\uFF09\r\n\u52A8\u7269\u56ED\u8054\u7968\uFF08\u542B\u718A\u732B\u9986\u53CA\u5317\u4EAC\u52A8\u7269\u56ED\u95E8\u7968\uFF09\uFF1A\r\n\u65FA\u5B63\u6BCF\u5F2019\u5143\uFF084\u67081\u65E5\u8D77\u81F310\u670831\u65E5\u6B62\uFF09 \r\n\u6DE1\u5B63\u6BCF\u5F2014\u5143\uFF0811\u67081\u65E5\u8D77\u81F3\u6B21\u5E743\u670831\u65E5\u6B62\uFF09 \r\n\u65FA\u5B63\u8054\u7968\u534A\u4EF7\u79689.5\u5143\uFF084\u67081\u65E5\u8D77\u81F310\u670831\u65E5\u6B62\uFF09\r\n\u6DE1\u5B63\u8054\u7968\u534A\u4EF7\u79687\u5143\uFF0811\u67081\u65E5\u8D77\u81F3\u6B21\u5E743\u670831\u65E5\u6B62\uFF09\r\n\u89C2\u89C8\u8F66\u7968\u4EF7\u6BCF\u5F2010\u5143\u3002\r\n\r\n\u52A8\u7269\u56ED\u4F18\u60E0\u95E8\u7968\u5B9E\u65BD\u529E\u6CD5\r\n\r\n\u4F18\u60E0\u5BF9\u8C61\uFF1A\r\n1\u3001\u8001\u5E74\u4EBA\u51ED\u8001\u5E74\u8BC1\u3002 \r\n2\u3001\u4EAB\u53D7\u793E\u4F1A\u4F4E\u4FDD\u4EBA\u5458\u51ED\u793E\u4F1A\u4FDD\u969C\u91D1\u9886\u53D6\u8BC1\u3002 \r\n3\u30016\u5468\u5C81\uFF08\u4E0D\u542B6\u5468\u5C81\uFF09\uFF5E18\u5468\u5C81\uFF08\u542B18\u5468\u5C81\uFF09\u672A\u6210\u5E74\u4EBA\u3001\u5168\u65E5\u5236\u5927\u5B66\u672C\u79D1\u53CA\u4EE5\u4E0B\u5B66\u5386\u5B66\u751F\u5B9E\u884C\u534A\u7968\u3002\u9752\u5C11\u5E74\u8D2D\u7968\u5165\u56ED\u65F6\u9700\u51FA\u793A\u5C45\u6C11\u8EAB\u4EFD\u8BC1\u6216\u5B66\u751F\u8BC1\u7B49\u6709\u6548\u8BC1\u4EF6\u3002\u9999\u6E2F\u3001\u6FB3\u95E8\u3001\u53F0\u6E7E\u7B49\u5165\u5883\u6E38\u9752\u5C11\u5E74\u51ED\u300A\u6E2F\u6FB3\u5C45\u6C11\u6765\u5F80\u5185\u5730\u901A\u884C\u8BC1\u300B\u3001\u300A\u53F0\u6E7E\u5C45\u6C11\u6765\u5F80\u5927\u9646\u901A\u884C\u8BC1\u300B\u6216\u5B66\u751F\u8BC1\u4EF6\u7B49\u6709\u6548\u8EAB\u4EFD\u8BC1\u660E\uFF0C\u5747\u53EF\u529E\u7406\u8D2D\u7968\u5165\u56ED\u624B\u7EED\uFF0C\u4EAB\u53D7\u95E8\u7968\u4F18\u60E0\u4EF7\u683C\u3002 \r\n\r\n\u514D\u95E8\u7968\u5BF9\u8C61\uFF1A \r\n1\u30016\u5468\u5C81\uFF08\u542B6\u5468\u5C81\uFF09\u6216\u8EAB\u9AD81.2\u7C73\uFF08\u542B1.2\u7C73\uFF09\u4EE5\u4E0B\u513F\u7AE5\uFF0C\u9700\u7531\u6210\u5E74\u4EBA\u5E26\u9886\u3002\r\n2\u3001\u73B0\u5F79\u3001\u79BB\u4F11\u3001\u9000\u4F11\u519B\u4EBA\uFF0C\u6B8B\u75BE\u4EBA\u58EB\u51ED\u6709\u6548\u8BC1\u4EF6\u3002\r\n3\u3001\u79BB\u4F11\u4EBA\u5458\u51ED\u79BB\u4F11\u8BC1\u3002\r\n4\u3001\u6301\u672C\u4EBA\u201C\u517B\u8001\u52A9\u6B8B\u5361\u201D\u6E38\u5BA2\u5237\u5361\u5165\u56ED\uFF1B60\u5468\u5C81\u53CA\u4EE5\u4E0A\u5916\u7701\u5E02\u3001\u5916\u7C4D\u6E38\u5BA2\u51ED\u672C\u4EBA\u8EAB\u4EFD\u8BC1\u3001\u62A4\u7167\u7B49\u6709\u6548\u8BC1\u4EF6\u6362\u7968\u5165\u56ED\u3002\r\n\u5F00\u653E\u65F6\u95F4\uFF1A\r\n4\u67081\u65E5\u2014\u201410\u670831\u65E5\r\n7\uFF1A30\u2014\u201418\uFF1A00\r\n11\u67081\u65E5\u2014\u20143\u670831\u65E5 \r\n7\uFF1A30\u2014\u201417\uFF1A00");
		textPane.setBounds(10, 10, 651, 728);
		panel.add(textPane);
	}

}
