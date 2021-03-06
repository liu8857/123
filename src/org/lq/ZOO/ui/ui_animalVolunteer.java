/**
 * 
 */
package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.TitledBorder;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.TextField;
import javax.swing.JTextPane;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JMenuBar;
import javax.swing.JTree;


/**
 * @author 第四组 王威
 *@data 2019年7月2日
*@project_nameZOO
 */
public class ui_animalVolunteer extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tab_main;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_animalVolunteer frame = new ui_animalVolunteer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_animalVolunteer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 996, 861);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setOpaque(false);
		tabbedPane.setBackground(new Color(153, 204, 204));
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(0, 0, 980, 813);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBackground(new Color(124, 252, 0));
		tabbedPane.addTab("服务模式简介",null, panel, null);
		panel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setOpaque(false);
		textPane.setForeground(new Color(0, 0, 0));
		textPane.setFont(new Font("宋体", Font.BOLD, 18));
		textPane.setBackground(new Color(153, 204, 204));
		textPane.setText("\u4E00\u3001\t\u8FD0\u884C\u6A21\u5F0F\r\n\r\n\uFF08\u4E00\uFF09\u4E3B\u8981\u7279\u5F81\r\n \r\n1.\u56FD\u9645\u5316\u3002\u91C7\u53D6\u7684\u662F\u56FD\u9645\u901A\u884C\u7684\u5FD7\u613F\u670D\u52A1\u6A21\u5F0F\uFF0C\u6CE8\u91CD\u5FD7\u613F\u670D\u52A1\u7684\u7CBE\u795E\u672C\u8D28\u3002\r\n 2.\u793E\u4F1A\u5316\u3002\u6240\u6709\u7684\u5FD7\u613F\u8005\u90FD\u662F\u4ECE\u793E\u4F1A\u4E0A\u62DB\u52DF\u7684\uFF0C\u5B9E\u884C\u6CE8\u518C\u5FD7\u613F\u8005\u5236\u5EA6\u3002\r\n 3.\u81EA\u4E3B\u5316\u3002\u5145\u5206\u5C0A\u91CD\u5FD7\u613F\u8005\u7684\u670D\u52A1\u65F6\u95F4\u3001\u670D\u52A1\u610F\u613F\u3002\u5728\u5FD7\u613F\u8005\u7EC4\u7EC7\u7684\u65E5\u5E38\u8FD0\u4F5C\u4E2D\uFF0C\u63D0\u5021\u81EA\u6211\u7BA1\u7406\u3002 \r\n\r\n\uFF08\u4E8C\uFF09\u4EBA\u5458\u6784\u6210 \r\n\r\n\u5317\u4EAC\u52A8\u7269\u56ED\u5FD7\u613F\u8005\u7EC4\u7EC7\u7684\u57FA\u7840\u662F\u6765\u81EA\u4E8E\u793E\u4F1A\u7684\u4E2A\u4F53\u5FD7\u613F\u8005\u3002\u516C\u56ED\u7684\u5728\u518C\u5FD7\u613F\u8005\u6570\u91CF\u5728300\u4EBA\u5DE6\u53F3\uFF0C\u5176\u4E2D\u7EA610%\u662F\u6765\u81EA\u4E8E\u9AD8\u6821\u7684\u5927\u5B66\u751F\uFF0C\u7EA610%\u662F\u793E\u4F1A\u9000\u4F11\u4EBA\u5458\uFF0C\u5176\u4ED6\u7EA680%\u5373\u4E3B\u4F53\u662F\u5404\u884C\u5404\u4E1A\u5728\u804C\u4EBA\u5458\u3002\u4ED6\u4EEC\u591A\u6570\u4EBA\u4F1A\u5229\u7528\u5468\u672B\u3001\u8282\u5047\u65E5\u6765\u52A8\u7269\u56ED\u670D\u52A1\u3002\u53E6\u5916\uFF0C\u5728\u9488\u5BF9\u5927\u578B\u6D3B\u52A8\u3001\u8282\u5047\u65E5\u670D\u52A1\u65F6\uFF0C\u516C\u56ED\u4E5F\u4F1A\u91C7\u53D6\u4E0E\u9AD8\u6821\u5408\u4F5C\u7684\u65B9\u5F0F\u63A8\u8FDB\u5FD7\u613F\u670D\u52A1\uFF0C\u4F5C\u4E3A\u8FD9\u4E2A\u7ED3\u6784\u7684\u8865\u5145\u3002\r\n\r\n\uFF08\u4E09\uFF09\u5DE5\u4F5C\u76EE\u6807 \r\n\r\n1.\u5229\u7528\u5317\u4EAC\u52A8\u7269\u56ED\u7684\u8D44\u6E90\u548C\u5FD7\u613F\u8005\u7684\u7406\u5FF5\u548C\u70ED\u60C5\uFF0C\u5171\u540C\u642D\u5EFA\u4E3A\u6E38\u5BA2\u670D\u52A1\u7684\u5DE5\u4F5C\u5E73\u53F0\u3002\r\n2.\u4E3A\u5317\u4EAC\u52A8\u7269\u56ED\u516C\u5171\u4FDD\u62A4\u6559\u80B2\u4E8B\u4E1A\u53D1\u5C55\u6CE8\u5165\u52A8\u529B\u3002\r\n3.\u4E3A\u5317\u4EAC\u52A8\u7269\u56ED\u5FD7\u613F\u8005\u901A\u8FC7\u793E\u4F1A\u5B9E\u8DF5\u8BFE\u5802\u548C\u5BA3\u4F20\u4FDD\u62A4\u6559\u80B2\u7684\u670D\u52A1\u573A\u6240\u3002 \r\n\r\n\u4E8C\u3001\u7BA1\u7406\u673A\u5236 \r\n\r\n\uFF08\u4E00\uFF09\u7BA1\u7406\u4E0A\uFF0C\u5317\u4EAC\u52A8\u7269\u56ED\u4E00\u76F4\u575A\u6301\u516C\u56ED\u652F\u6301\u3001\u5FD7\u613F\u8005\u81EA\u4E3B\u7BA1\u7406\u7684\u5DE5\u4F5C\u65B9\u5F0F\u3002 \u5FD7\u613F\u8005\u5168\u7A0B\u5B9E\u884C\u6807\u8BC6\u7BA1\u7406\u3002\u5FD7\u613F\u8005\u8FDB\u56ED\u51ED\u501F\u5165\u95E8\u8BC1\uFF0C\u4E0A\u5C97\u671F\u95F4\u4F69\u6234\u672C\u4EBA\u5DE5\u4F5C\u80F8\u724C\uFF0C\u7740\u7EDF\u4E00\u670D\u88C5\u3002\u540C\u65F6\u5B9E\u884C\u6CE8\u518C\u5FD7\u613F\u8005\u5236\u5EA6\uFF0C\u6BCF\u4F4D\u5728\u518C\u5FD7\u613F\u8005\u62E5\u6709\u4E00\u672C\u5FD7\u613F\u8005\u5DE5\u4F5C\u624B\u518C\u3002\u516C\u56ED\u5BF9\u5FD7\u613F\u8005\u5DE5\u4F5C\u7684\u6001\u5EA6\u603B\u7ED3\u4E3A\u5341\u4E2A\u5B57\uFF0C\u5373\uFF1A\u5C0A\u91CD\u3001\u6C9F\u901A\u3001\u9F13\u52B1\u3001\u5F15\u5BFC\u3001\u652F\u6301\u3002\r\n\uFF08\u4E8C\uFF09\u4E3A\u4E86\u4FBF\u4E8E\u5FD7\u613F\u8005\u7684\u81EA\u4E3B\u7BA1\u7406\uFF0C\u516C\u56ED\u4E13\u95E8\u8BBE\u7ACB\u4E86\u5FD7\u613F\u8005\u5DE5\u4F5C\u7AD9\u3002\u5DE5\u4F5C\u7AD9\u662F\u5FD7\u613F\u8005\u7684\u5927\u672C\u8425\uFF0C\u6709\u4E13\u95E8\u8BB0\u5F55\u670D\u52A1\u65F6\u95F4\u3001\u5FD7\u613F\u8005\u8BE6\u7EC6\u60C5\u51B5\u7684\u529E\u516C\u7CFB\u7EDF\u3002\u5DE5\u4F5C\u7AD9\u6BCF\u5929\u6709\u5FD7\u613F\u8005\u8001\u5E08\u503C\u73ED\uFF0C\u5BF9\u5FD7\u613F\u8005\u5DE5\u4F5C\u8FDB\u884C\u8BB0\u5F55\u3002");
		textPane.setEditable(false);
		textPane.setBounds(10, 5, 855, 793);
		panel.add(textPane);
		tabbedPane.setBackgroundAt(0, new Color(124, 252, 0));
		tabbedPane.setEnabledAt(0, true);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBackground(new Color(124, 252, 0));
		tabbedPane.addTab("如何加入志愿者", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("宋体", Font.BOLD, 14));
		textPane_1.setBackground(new Color(153, 204, 204));
		textPane_1.setEditable(false);
		textPane_1.setText("2019\u5E74\u5317\u4EAC\u52A8\u7269\u56ED\u793E\u4F1A\u5FD7\u613F\u8005\u62DB\u52DF\r\n\r\n\u4E00\u3001\u57FA\u672C\u60C5\u51B5\uFF1A \r\n\u5317\u4EAC\u52A8\u7269\u56ED\u5FD7\u613F\u8005\u7EC4\u7EC7\u6210\u7ACB\u4E8E2004\u5E74\uFF0C\u4ECA\u5E74\u6B63\u597D\u662F\u6210\u7ACB\u7684\u7B2C15\u4E2A\u5E74\u5934\uFF01\r\n\u5317\u4EAC\u52A8\u7269\u56ED\u5FD7\u613F\u8005\u7EC4\u7EC7\u662F\u5728\u516C\u56ED\u7ECF\u8425\u7BA1\u7406\u79D1\u9886\u5BFC\u4E0B\uFF0C\u7531\u6E38\u5BA2\u670D\u52A1\u4E2D\u5FC3\u5177\u4F53\u7BA1\u7406\u3001\u534F\u8C03\uFF0C\u4E13\u95E8\u4ECE\u4E8B\u5FD7\u613F\u670D\u52A1\u6D3B\u52A8\u7684\u7EC4\u7EC7\u7BA1\u7406\u673A\u6784\u30022014\u5E74\u88AB\u8BC4\u4E3A\u7B2C\u4E00\u6279\u9996\u90FD\u5B66\u96F7\u950B\u804C\u5458\u5FD7\u613F\u670D\u52A1\u793A\u8303\u7AD9\u3002 \r\n\u4E8C\u3001\u670D\u52A1\u8303\u56F4\uFF1A\r\n1\u3001\u670D\u52A1\u5C97\u4F4D\u548C\u9879\u76EE\uFF1A\u8BED\u8A00\u670D\u52A1\u3001\u52A8\u7269\u77E5\u8BC6\u8BB2\u89E3\u3001\u56ED\u53F2\u4ECB\u7ECD\u3001\u5F15\u5BFC\u6E38\u56ED\u3001\u7EF4\u6301\u79E9\u5E8F\u3001\u529D\u963B\u4E0D\u6587\u660E\u884C\u4E3A\u3001\u54A8\u8BE2\u5BA3\u4F20\u3001\u5E2E\u56F0\u52A9\u6B8B\u3001\u56ED\u5BB9\u536B\u751F\u7EF4\u62A4\u3001\u5E94\u6025\u670D\u52A1\u3001\u6E38\u5BA2\u8C03\u67E5\u6D4B\u8BC4\u7B49\u5DE5\u4F5C\u3002\r\n2\u3001\u627F\u62C5\u4E34\u65F6\u6027\u5FD7\u613F\u670D\u52A1\u4EFB\u52A1\u53CA\u5176\u4ED6\u5177\u6709\u4E13\u4E1A\u6280\u672F\u7279\u957F\u8981\u6C42\u7684\u5FD7\u613F\u670D\u52A1\u5DE5\u4F5C\u3002\r\n3\u3001\u5176\u5B83\u9700\u8981\u63D0\u4F9B\u5FD7\u613F\u670D\u52A1\u7684\u9879\u76EE\u3002\r\n\u4E09\u3001\u670D\u52A1\u5730\u70B9\uFF1A\r\n\u5317\u4EAC\u5E02\u897F\u57CE\u533A\u897F\u76F4\u95E8\u5916\u5927\u8857137\u53F7\u5317\u4EAC\u52A8\u7269\u56ED\u5185\u3002\r\n\u56DB\u3001\u670D\u52A1\u65F6\u95F4\uFF1A\r\n2019\u5E744\u6708\u81F310\u6708\r\n\u5468\u672B\u3001\u6CD5\u5B9A\u8282\u5047\u65E5\u548C\u91CD\u5927\u6D3B\u52A8 9:00-16:00\u3002\r\n\u4E94\u3001\u57FA\u672C\u6761\u4EF6\uFF1A\r\n1\u3001\u5E74\u9F84\uFF1A18\u5468\u5C81\u201460\u5468\u5C81\uFF1B\r\n2\u3001\u8EAB\u4F53\u5065\u5EB7\uFF0C\u5177\u5907\u53C2\u52A0\u5FD7\u613F\u670D\u52A1\u76F8\u5E94\u7684\u57FA\u672C\u80FD\u529B\uFF1B\r\n3\u3001\u5FD7\u613F\u8D21\u732E\u4E2A\u4EBA\u65F6\u95F4\u3001\u7CBE\u529B\u4E3A\u6E38\u5BA2\u3001\u516C\u56ED\u53CA\u793E\u4F1A\u63D0\u4F9B\u670D\u52A1\uFF1B\r\n4\u3001\u9075\u5B88\u56FD\u5BB6\u6CD5\u5F8B\u6CD5\u89C4\u3001\u5317\u4EAC\u52A8\u7269\u56ED\u53CA\u5317\u4EAC\u52A8\u7269\u56ED\u5FD7\u613F\u8005\u7EC4\u7EC7\u7684\u76F8\u5173\u7BA1\u7406\u89C4\u5B9A\u3002\r\n\u516D\u3001\u670D\u52A1\u4FDD\u969C\uFF1A\r\n1\u3001\u7B7E\u7F72\u5FD7\u613F\u670D\u52A1\u534F\u8BAE\uFF1B\r\n2\u3001\u63D0\u4F9B\u5FD7\u613F\u8005\u4FDD\u9669\uFF1B\r\n3\u3001\u63D0\u4F9B\u5FD7\u613F\u8005\u670D\u88C5\u3001\u8BB2\u89E3\u6559\u5177\uFF1B\r\n4\u3001\u63D0\u4F9B\u5DE5\u4F5C\u9910\uFF08\u9650\u6BCF\u6B21\u670D\u52A1\u65F6\u957F\u6EE13\u5C0F\u65F6\uFF09\uFF1B\r\n5\u3001\u63D0\u4F9B\u201C\u5FD7\u613F\u5317\u4EAC\u201D\u5FD7\u613F\u670D\u52A1\u65F6\u957F\u8BB0\u5F55\uFF1B\r\n6\u3001\u63D0\u4F9B\u76F8\u5173\u5FD7\u613F\u670D\u52A1\u57F9\u8BAD\uFF1B\r\n7\u3001\u4F18\u79C0\u5FD7\u613F\u8005\u63D0\u4F9B\u5916\u51FA\u4EA4\u6D41\u6D3B\u52A8\u673A\u4F1A\u3002\r\n\u4E03\u30012019\u5E74\u5FD7\u613F\u670D\u52A1\u4E3B\u8981\u5185\u5BB9\uFF1A\r\n1\u3001\u52A8\u7269\u79D1\u666E\u8BB2\u89E3\u7AD9\uFF1A\u8BBE\u718A\u7EC4\u3001\u6C34\u79BD\u6E56\u7EC4\u3001\u8C61\u7EC4\u4E09\u4E2A\u8BB2\u89E3\u7EC4\u3002\r\n\u718A\u7EC4\uFF1A\u4E9A\u6D32\u9ED1\u718A\u7684\u4E60\u6027\u3001\u751F\u5B58\u73AF\u5883\u53CA\u718A\u4FDD\u62A4\u7684\u610F\u4E49\u7B49\uFF1B\r\n\u6C34\u79BD\u6E56\u7EC4\uFF1A\u9E1F\u7C7B\u4E3A\u4EC0\u4E48\u4F1A\u98DE\u884C\uFF1B\u6839\u636E\u6C34\u79BD\u6E56\u9E1F\u7684\u79CD\u7C7B\u8BB2\u89E3\u4E60\u6027\u53CA\u751F\u5883\uFF1B\u9E1F\u7C7B\u4FDD\u62A4\u7684\u610F\u4E49\u7B49\uFF1B\r\n\u8C61\u7EC4\uFF1A\u4E9A\u6D32\u8C61\u548C\u975E\u6D32\u8C61\u7684\u533A\u522B\uFF1B\u8C61\u4FDD\u62A4\u7684\u610F\u4E49\u7B49\u3002\r\n2\u3001\u8282\u65E5\u79E9\u5E8F\u7EF4\u62A4\uFF1A\u5168\u5E74\u91CD\u5927\u8282\u5047\u65E5\u5728\u91CD\u70B9\u95E8\u533A\u8FDB\u884C\u79E9\u5E8F\u7EF4\u62A4\u3001\u54A8\u8BE2\u5F15\u5BFC\u7B49\u5DE5\u4F5C\u3002\r\n\u516B\u3001\u62A5\u540D\u7A0B\u5E8F\uFF1A \r\n1\u3001\u7533\u8BF7\u4EBA\u5728\u5317\u4EAC\u52A8\u7269\u56ED\u5B98\u65B9\u7F51\u7AD9\u4E0B\u8F7D\u300A\u5317\u4EAC\u52A8\u7269\u56ED\u5FD7\u613F\u8005\u6CE8\u518C\u767B\u8BB0\u8868\u300B\uFF0C\u8BA4\u771F\u586B\u5199\u540E\uFF0C\u53D1\u9001\u81F3\u90AE\u7BB1bjzoo2007@126.com\uFF1B\r\n2\u3001\u5317\u4EAC\u52A8\u7269\u56ED\u5FD7\u613F\u8005\u7EC4\u7EC7\u5BF9\u7533\u8BF7\u4EBA\u8FDB\u884C\u521D\u9009\u3001\u9762\u8BD5\u3001\u57F9\u8BAD\u3001\u8003\u6838\uFF1B\r\n3\u3001\u7ECF\u5BA1\u6838\u5408\u683C\uFF0C\u5317\u4EAC\u52A8\u7269\u56ED\u5FD7\u613F\u8005\u7EC4\u7EC7\u4E0E\u7533\u8BF7\u4EBA\u7B7E\u7EA6\uFF0C\u4E3A\u6CE8\u518C\u5FD7\u613F\u8005\u7F16\u5236\u672C\u5730\u7BA1\u7406\u670D\u52A1\u53F7\u7801\uFF0C\u9881\u53D1\u5FD7\u613F\u670D\u52A1\u8BC1\uFF1B\r\n4\u3001\u6CE8\u518C\u5FD7\u613F\u8005\u987B\u4E0E\u5317\u4EAC\u52A8\u7269\u56ED\u5FD7\u613F\u8005\u7EC4\u7EC7\u7B7E\u8BA2\u670D\u52A1\u534F\u8BAE\u4E66\u540E\u53C2\u52A0\u5FD7\u613F\u670D\u52A1\u3002\r\n\u62A5\u540D\u622A\u6B62\u65E5\u671F\uFF1A2019\u5E743\u67083\u65E5\r\n\u4E5D\u3001\u5176\u4ED6\u8BF4\u660E\uFF1A\r\n\u5BA1\u6838\u9762\u8BD5\u901A\u8FC7\u540E\u7684\u5FD7\u613F\u8005\uFF0C\u987B\u5728\u201C\u5FD7\u613F\u5317\u4EAC\u201D\u4E0A\u8FDB\u884C\u5B9E\u540D\u6CE8\u518C\uFF0C\u6BCF\u6B21\u5FD7\u613F\u670D\u52A1\u4F1A\u5728\u201C\u5FD7\u613F\u5317\u4EAC\u201D\u5E73\u53F0\u5F55\u5165\u5FD7\u613F\u65F6\u957F\u3002\u672A\u6CE8\u518C\u8005\uFF0C\u4E0D\u53EF\u53C2\u52A0\u516C\u56ED\u5FD7\u613F\u670D\u52A1\u6D3B\u52A8\u3002\r\n\u62A5\u540D\u54A8\u8BE2\u7535\u8BDD\uFF1A68390274\r\n\u62A5\u540D\u7535\u5B50\u90AE\u7BB1\uFF1Abjzoo2007@126.com \r\n\u8054\u7CFB\u4EBA\uFF1A\u5E9E\u8001\u5E08\r\n\u5317\u4EAC\u52A8\u7269\u56ED\u7F51\u7AD9\uFF1Awww.beijingzoo.com");
		textPane_1.setBounds(10, 10, 855, 798);
		panel_1.add(textPane_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBackground(new Color(153, 204, 204));
		tabbedPane.addTab("公益预告", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("宋体", Font.BOLD, 18));
		textPane_2.setText("\t\t\u201C\u53D1\u73B0\u8EAB\u8FB9\u7684\u98DE\u7FBD\u7CBE\u7075\u201D\u9879\u76EE\u5FD7\u613F\u8005\u706B\u70ED\u62DB\u52DF\u4E2D\r\n\r\n\u9879\u76EE\u65F6\u95F4\uFF1A2013\u5E7410\u6708\u52302014\u5E742\u6708\u5E95\r\n\u670D\u52A1\u5185\u5BB9: \u4EE5\u201C\u57CE\u5E02\u4E2D\u7684\u9E1F\u201D\u4E3A\u4E3B\u9898\uFF0C\u6CBF\u9014\u5FD7\u613F\u8005\u5BF9\u6C34\u79BD\u6E56\u3001\u9E1F\u82D1\u53CA\u968F\u673A\u89C2\u5BDF\u5230\u7684\u9E1F\u7C7B\u8FDB\u884C\u8BB2\u89E3\uFF0C\u666E\u53CA\u91CE\u751F\u9E1F\u7C7B\u89C2\u5BDF\u65B9\u6CD5\u53CA\u6CE8\u610F\u4E8B\u9879\uFF0C\u6E38\u89C8\u8FC7\u7A0B\u4E2D\u6E38\u5BA2\u53EF\u4EE5\u4F53\u9A8C\u4F7F\u7528\u671B\u8FDC\u955C\u89C2\u9E1F\u3002 \r\n\u670D\u52A1\u65F6\u95F4: \u6BCF\u5468\u516D10:00\u2014\u201411:30 \r\n\u5FD7\u613F\u8005\u6761\u4EF6:\r\n\r\n1\u3001\u5BF9\u9E1F\u7C7B\u77E5\u8BC6\u6709\u4E00\u5B9A\u7684\u4E86\u89E3\r\n2\u3001\u80FD\u591F\u9075\u5B88\u56ED\u65B9\u5404\u9879\u89C4\u7AE0\u5236\u5EA6\r\n3\u3001\u5177\u6709\u5FD7\u613F\u8005\u7684\u57FA\u672C\u7D20\u8D28\u548C\u6DB5\u517B\r\n4\u3001\u5E74\u6EE118\u5C81\u7684\u5FD7\u613F\u8005\u53EF\u81EA\u884C\u62A5\u540D\u53C2\u52A0\u3002\r\n\u9879\u76EE\u5F62\u5F0F: \u4EE5\u4EB2\u5B50\u4F53\u9A8C\u3001\u53C2\u4E0E\u5956\u52B1\u7684\u5F62\u5F0F\uFF0C\u9F13\u52B1\u5168\u5BB6\u603B\u52A8\u5458\uFF0C\u8D70\u8FD1\u81EA\u7136\u3001\u4E86\u89E3\u9E1F\u7C7B\u3002 \r\n\u9879\u76EE\u80CC\u666F:\r\n\r\n \u4E00\u3001\u6D3B\u52A8\u4E3B\u9898\r\n\r\n\u53D1\u73B0\u591A\u6837\u7684\u751F\u5883\u3001\u591A\u6837\u7684\u9E1F\u7C7B\u3001\u591A\u6837\u7684\u690D\u7269\uFF0C\u5BA3\u4F20\u5065\u5EB7\u65F6\u5C1A\u7684\u73AF\u4FDD\u7406\u5FF5\uFF0C\u589E\u8FDB\u4EB2\u5B50\u4EA4\u6D41\u3002\r\n\r\n\u4E8C\u3001\u6D3B\u52A8\u610F\u4E49\r\n\r\n\u5BA3\u4F20\u9E1F\u7C7B\u4FDD\u62A4\u77E5\u8BC6\uFF0C\u5411\u516C\u4F17\u4F20\u64AD\u6B63\u786E\u5BF9\u5F85\u91CE\u751F\u52A8\u7269\u7684\u65B9\u5F0F\u548C\u7406\u5FF5\uFF0C\u51CF\u5C11\u4E0D\u6587\u660E\u6295\u5582\u52A8\u7269\u7B49\u884C\u4E3A\u3002\r\n\r\n\u4E09\u3001\u6D3B\u52A8\u76EE\u7684\r\n\r\n\u521B\u5EFA\u5317\u4EAC\u52A8\u7269\u56ED\u6587\u5316\u6D3B\u52A8\u54C1\u724C\r\n\r\n\u56DB\u3001\u5408\u4F5C\u5355\u4F4D\u3001\u652F\u6301\u5355\u4F4D\r\n\r\n\u5317\u4EAC\u52A8\u7269\u56ED\u3001\u91CE\u6027\u4E2D\u56FD\u3001\u98DE\u7FBD\u73AF\u4FDD\u4FC3\u8FDB\u4F1A\uFF1B\u65BD\u534E\u6D1B\u4E16\u5947\u5149\u5B66\u80B2\u96CF\u57FA\u91D1");
		textPane_2.setBackground(new Color(153, 204, 204));
		textPane_2.setEditable(false);
		textPane_2.setBounds(10, 10, 865, 798);
		panel_2.add(textPane_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setBackground(new Color(124, 252, 0));
		tabbedPane.addTab("动物认养", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("      \r\n\t\t\t\t    \u52A8\u7269\u8BA4\u9886\u5B88\u5219\r\n\r\n\t(1)\u7B26\u5408\u9886\u517B\u52A8\u7269\u57FA\u672C\u6761\u4EF6:\u5E74\u6EE118\u5468\u5C81\uFF0C\u6709\u5408\u6CD5\u7684\u8EAB\u4EFD\u8BC1\u660E\uFF0C\u6709\u56FA\u5B9A\u4F4F\u6240\u3001\u6B63\u5F53\u804C\u4E1A\u6216\u7ECF\u6D4E\u80FD\u529B\u8005\uFF0C\u672A\u6EE118\u5468\u5C81\u8005\u9700\u7531\u5BB6\u957F\u966A\u540C\uFF0C\u53D6\u5F97\u5BB6\u957F\u540C\u610F\u5E76\u7B7E\u5B57\u3002\r\n\r\n      (2)\u5728\u9886\u517B\u6D41\u6D6A\u52A8\u7269(\u4EE5\u4E0B\u7B80\u79F0\u9886\u517B\u52A8\u7269)\u524D\uFF0C\u5F81\u5F97\u5BB6\u5EAD\u6210\u5458\u4E00\u81F4\u540C\u610F;\u7B7E\u7F72\u9886\u517B\u534F\u8BAE\u540E\uFF0C\u4E0D\u5F97\u56E0\u4E3A\u5BB6\u4EBA\u53CD\u5BF9\u3001\u5A5A\u59FB\u3001\u751F\u80B2\u3001\u5DE5\u4F5C\u53D8\u52A8\u3001\u52A8\u7269\u4E0D\u542C\u8BDD\u3001\u52A8\u7269\u751F\u75C5\u7B49\u539F\u56E0\u629B\u5F03\u9886\u517B\u52A8\u7269\u3002\r\n\r\n      (3)\u4E3A\u9886\u517B\u52A8\u7269\u63D0\u4F9B\u9002\u5408\u7684\u98DF\u7269\uFF0C\u63D0\u4F9B\u6D01\u51C0\u7684\u996E\u7528\u6C34\uFF0C\u505A\u5230\u79D1\u5B66\u5582\u517B\uFF0C\r\n\r\n      (4)\u6BCF\u5E74\u6309\u65F6\u4E3A\u9886\u517B\u52A8\u7269\u4F53\u68C0\u548C\u514D\u75AB(\u5305\u62EC\u75AB\u82D7\u3001\u9A71\u866B)\uFF0C\u9886\u517B\u52A8\u7269\u751F\u75C5\u65F6\u79EF\u6781\u6CBB\u7597\u3002\r\n\r\n      (5)\u5BF9\u9886\u517B\u65F6\u5C1A\u672A\u7EDD\u80B2\u7684\u9886\u517B\u52A8\u7269\uFF0C\u6309\u7167\u5EFA\u8BAE\u7EDD\u80B2\u65F6\u95F4\u8FDB\u884C\u7EDD\u80B2\r\n\r\n      (6)\u5728\u4F4F\u6240\u4E3A\u9886\u517B\u52A8\u7269\u63D0\u4F9B\u9002\u5F53\u7684\u6D3B\u52A8\u7A7A\u95F4\u5E76\u4FDD\u8BC1\u9886\u517B\u52A8\u7269\u7684\u5B89\u5168\uFF0C\u4E0D\u5F97\u6563\u517B\uFF0C\u4E0D\u5F97\u5C06\u6240\u9886\u517B\u52A8\u7269\u5F02\u7528\u548C\u5546\u4E1A\u7528\u9014\u3002\r\n\r\n      (7)\u5BF9\u9886\u517B\u7684\u72D7\u5FC5\u987B\u6309\u7167\u76F8\u5173\u8981\u6C42\u529E\u7406\u517B\u72AC\u767B\u8BB0\uFF0C\u505A\u5230\u4F9D\u6CD5\u3001\u6587\u660E\u517B\u72AC\u3002(8)\u5E26\u9886\u517B\u7684\u72D7\u51FA\u95E8\u5FC5\u987B\u6813\u597D\u7275\u5F15\u7EF3\uFF0C\u672A\u6210\u5E74\u4EBA\u4E0D\u5F97\u5355\u72EC\u905B\u72D7\u3002(9)\u5B9A\u671F\u5411\u7532\u65B9\u53D1\u9001\u9886\u517B\u52A8\u7269\u7167\u7247\u5982\u5B9E\u53CD\u9988\u9886\u517B\u52A8\u7269\u60C5\u51B5:\r\n\r\n      (10)\u4F4F\u5740\u3001\u8054\u7CFB\u7535\u8BDD\u7B49\u53D1\u751F\u53D8\u66F4\u65F6\uFF0C\u53CA\u65F6\u901A\u77E5\u7532\u65B9\uFF0C\u4EE5\u65B9\u4FBF\u7532\u65B9\u56DE\u8BBF\u3002\r\n\r\n      (11)\u4E0D\u5F97\u81EA\u884C\u8F6C\u8D60\u3001\u8F6C\u8BA9\u6216\u9057\u5954\u9886\u517B\u52A8\u7269\uFF0C \u5982\u65E0\u6CD5\u7EE7\u7EED\u9972\u517B\u3002\u987B\u4E0E\u7532\u65B9\u8054\u7CFB\uFF0C\u534F\u5546\u89E3\u51B3\uFF0C\r\n\r\n      (12)\u4EFB\u4F55\u60C5\u51B5\u4E0B\uFF0C\u4E59\u65B9\u4E0D\u5F97\u5E97\u5F85\u9886\u517B\u52A8\u7269\uFF0C\u4E0D\u5F97\u7ED9\u9886\u517B\u52A8\u7269\u65BD\u884C\u4E0D\u4EBA\u9053\u4E14\u4E0D\u5FC5\u8981\u7684\u624B\u672F\uFF0C\u5982\uFF0C\u53BB\u722A\uFF0C\u62D4\u9664\u5927\u9F7F\uFF0C\u53CA\u622A\u8033\u65AD\u5C3E\u7B49\u3002\r\n");
		textPane_3.setFont(new Font("宋体", Font.BOLD, 19));
		textPane_3.setBackground(new Color(153, 204, 204));
		textPane_3.setEditable(false);
		textPane_3.setBounds(10, 10, 844, 775);
		panel_3.add(textPane_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ui_ruleFive.class.getResource("/org/lq/ZOO/icon/bg/bg1.jpg")));
		lblNewLabel.setBounds(0, 0, 980, 813);
		contentPane.add(lblNewLabel);

	}
}
