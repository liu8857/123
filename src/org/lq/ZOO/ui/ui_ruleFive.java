package org.lq.ZOO.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import lombok.extern.log4j.Log4j;

import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;

/**
 * @author许浩
 * @2019年7月3日
 * @ui_ruleOne.java
 * @ZOO
 */
/**
 * @author 许浩
 * 2019年7月3日
 */
@Log4j
public class ui_ruleFive extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui_ruleFive frame = new ui_ruleFive();
					frame.setVisible(true);
				} catch (Exception e) {
					log.error("规定5窗口错误",e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui_ruleFive() {
		setResizable(false);
		setType(Type.POPUP);
		setTitle("\u52A8\u7269\u56ED\u56ED\u89C4");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui_ruleFive.class.getResource("/org/lq/ZOO/icon/bg/zoo.ico")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 815);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setBounds(0, 0, 733, 757);
		panel.add(scrollPane);
		
		
		
		JTextPane textPane_1 = new JTextPane();
		
		textPane_1.setFont(new Font("宋体", Font.BOLD, 16));
		textPane_1.setOpaque(false);
		textPane_1.setText("\t\t\t\t\t\t\u7B2C\u4E94\u7AE0\u6CD5\u5F8B\u8D23\u4EFB\r\n\t\u7B2C\u4E94\u5341\u6761 \u8FDD\u53CD\u672C\u6761\u4F8B\u7684\u884C\u4E3A\uFF0C\u6CD5\u5F8B\u3001\u6CD5\u89C4\u5DF2\u7ECF\u89C4\u5B9A\u6CD5\u5F8B\u8D23\u4EFB\u7684\uFF0C\u4F9D\u7167\u5176\u89C4\u5B9A\u8FFD\u7A76\u6CD5\u5F8B\u8D23\u4EFB\u3002\r\n\r\n\t\u7B2C\u4E94\u5341\u4E00\u6761 \u8FDD\u53CD\u672C\u6761\u4F8B\u7B2C\u5341\u4E00\u6761\u7B2C\u4E00\u6B3E\u89C4\u5B9A\uFF0C\u6709\u4E0B\u5217\u884C\u4E3A\u7684\uFF0C\u6309\u4E0B\u5217\u89C4\u5B9A\u5904\u7F5A\uFF1A\r\n\r\n\u64C5\u81EA\u6539\u53D8\u516C\u56ED\u529F\u80FD\u7684\uFF0C\u8D23\u4EE4\u9650\u671F\u6539\u6B63\uFF0C\u6062\u590D\u539F\u529F\u80FD\uFF0C\u5E76\u53EF\u4EE5\u5904l\u4E07\u5143\u4EE5\u4E0A10\u4E07\u5143\u4EE5\u4E0B\u7F5A\u6B3E\uFF1B\r\n\u4FB5\u5360\u516C\u56ED\u7528\u5730\u7684\uFF0C\u8D23\u4EE4\u7ACB\u5373\u817E\u9000\uFF0C\u6062\u590D\u539F\u72B6\uFF0C\u5E76\u53EF\u4EE5\u6309\u7167\u4FB5\u5360\u9762\u79EF\u6BCF\u5E73\u65B9\u7C73\u5904300\u5143\u7F5A\u6B3E\uFF1B\u9020\u6210\u635F\u5931\u7684\uFF0C\u4F9D\u6CD5\u627F\u62C5\u8D54\u507F\u8D23\u4EFB\u3002\r\n\r\n\r\n\t\u7B2C\u4E94\u5341\u4E8C\u6761 \u8FDD\u53CD\u672C\u6761\u4F8B\u7B2C\u5341\u516B\u6761\u7B2C\u4E8C\u6B3E\u89C4\u5B9A\uFF0C\u516C\u56ED\u672A\u7ECF\u9A8C\u6536\u4EA4\u4ED8\u4F7F\u7528\u7684\uFF0C\u8D23\u4EE4\u6539\u6B63\uFF0C\u5E76\u53EF\u4EE5\u5904l\u4E07\u5143\u4EE5\u4E0A10\u4E07\u5143\u4EE5\u4E0B\u7F5A\u6B3E\u3002\r\n\r\n\t\u7B2C\u4E94\u5341\u4E09\u6761 \u8FDD\u53CD\u672C\u6761\u4F8B\u7B2C\u4E8C\u5341\u4E5D\u6761\u7B2C\u4E00\u6B3E\u89C4\u5B9A\uFF0C\u5728\u5386\u53F2\u540D\u56ED\u4FDD\u62A4\u533A\u5185\u5EFA\u8BBE\u5F71\u54CD\u539F\u6709\u98CE\u8C8C\u548C\u683C\u5C40\u7684\u5EFA\u7B51\u7269\u3001\u6784\u7B51\u7269\u7684\uFF0C\u8D23\u4EE4\u9650\u671F\u62C6\u9664\uFF0C\u6062\u590D\u539F\u8C8C\uFF1B\u5BF9\u8FDD\u6CD5\u5EFA\u8BBE\u5EFA\u7B51\u7269\u3001\u6784\u7B51\u7269\u7684\uFF0C\u5E76\u53EF\u4EE5\u6309\u7167\u8FDD\u6CD5\u5EFA\u7B51\u7269\u3001\u6784\u7B51\u7269\u7684\u9762\u79EF\u6BCF\u5E73\u65B9\u7C73\u5904300\u5143\u4EE5\u4E0A3000\u5143\u4EE5\u4E0B\u7F5A\u6B3E\u3002\u5BF9\u539F\u6709\u6587\u7269\u5EFA\u7B51\u53CA\u5176\u9644\u5C5E\u7269\u635F\u6BC1\u3001\u6539\u5EFA\u3001\u62C6\u9664\u7684\uFF0C\u6309\u7167\u6587\u7269\u4FDD\u62A4\u7684\u6CD5\u5F8B\u3001\u6CD5\u89C4\u89C4\u5B9A\u4E88\u4EE5\u5904\u7F5A\u548C\u8D54\u507F\u3002\u8FDD\u53CD\u672C\u6761\u4F8B\u7B2C\u4E8C\u5341\u4E5D\u6761\u7B2C\u4E8C\u6B3E\u89C4\u5B9A\uFF0C\u5728\u5386\u53F2\u540D\u56ED\u5468\u8FB9\u5EFA\u8BBE\u63A7\u5236\u5730\u5E26\u5185\u7684\u5EFA\u7B51\u4E0D\u7B26\u5408\u5EFA\u8BBE\u63A7\u5236\u6807\u51C6\u7684\uFF0C\u8D23\u4EE4\u9650\u671F\u6574\u6CBB\u3001\u6539\u5EFA\u6216\u8005\u62C6\u9664\u3002\r\n\r\n\r\n\t\u7B2C\u4E94\u5341\u56DB\u6761 \u8FDD\u53CD\u672C\u6761\u4F8B\u7B2C\u4E09\u5341\u6761\u7B2C\u4E8C\u6B3E\u89C4\u5B9A\uFF0C\u64C5\u81EA\u6539\u53D8\u65E0\u6CD5\u4EE5\u4EBA\u529B\u518D\u9020\u548C\u65E0\u6CD5\u518D\u751F\u7684\u81EA\u7136\u666F\u89C2\u6216\u8005\u5177\u6709\u7279\u6B8A\u5386\u53F2\u6587\u5316\u4EF7\u503C\u7684\u4EBA\u6587\u666F\u89C2\u539F\u6709\u98CE\u8C8C\u548C\u683C\u5C40\u7684\uFF0C\u8D23\u4EE4\u505C\u6B62\u8FDD\u6CD5\u884C\u4E3A\uFF0C\u5E76\u59041\u4E07\u5143\u4EE5\u4E0A10\u4E07\u5143\u4EE5\u4E0B\u7F5A\u6B3E\u9020\u6210\u635F\u5931\u7684\uFF0C\u4F9D\u6CD5\u627F\u62C5\u8D54\u507F\u8D23\u4EFB\uFF1B\u6784\u6210\u72AF\u7F6A\u7684\uFF0C\u4F9D\u6CD5\u8FFD\u7A76\u5211\u4E8B\u8D23\u4EFB\u3002\r\n\r\n\r\n\t\u7B2C\u4E94\u5341\u4E94\u6761 \u516C\u56ED\u7BA1\u7406\u673A\u6784\u6709\u4E0B\u5217\u884C\u4E3A\u4E4B\u4E00\u7684\uFF0C\u8D23\u4EE4\u6539\u6B63\uFF0C\u5E76\u53EF\u4EE5\u5904100\u5143\u4EE5\u4E0A1000\u5143\u4EE5\u4E0B\u7F5A\u6B3E\uFF1A\r\n\u672A\u6309\u7167\u6807\u51C6\u505A\u597D\u6E05\u626B\u4FDD\u6D01\u7684\uFF1B\r\n\u642D\u5EFA\u68DA\u820D\u3001\u64C5\u81EA\u6446\u644A\u8BBE\u70B9\u7684\uFF1B\r\n\u968F\u610F\u5806\u653E\u7269\u6599\u3001\u62C9\u7EF3\u6302\u7269\u7684\uFF1B\r\n\u724C\u793A\u6C61\u635F\u3001\u4E22\u5931\u4E0D\u53CA\u65F6\u66F4\u6362\u6216\u8005\u8865\u8BBE\u7684\u3002\r\n\r\n\r\n\t\u7B2C\u4E94\u5341\u516D\u6761 \u8FDD\u53CD\u672C\u6761\u4F8B\u7B2C\u56DB\u5341\u516D\u6761\u89C4\u5B9A\uFF0C\u6709\u4E0B\u5217\u884C\u4E3A\u7684\uFF0C\u6309\u4E0B\u5217\u89C4\u5B9A\u5904\u7F5A\uFF1A\r\n\u7FFB\u8D8A\u56F4\u5899\u3001\u680F\u6746\u3001\u7EFF\u7BF1\uFF0C\u5728\u7981\u70DF\u533A\u5438\u70DF\uFF0C\u5728\u975E\u6E38\u6CF3\u533A\u6E38\u6CF3\uFF0C\u5728\u975E\u6ED1\u51B0\u533A\u6ED1\u51B0\uFF0C\u5728\u975E\u9493\u9C7C\u533A\u9493\u9C7C\uFF0C\u5728\u975E\u4F53\u80B2\u8FD0\u52A8\u573A\u6240\u8E22\u7403\u3001\u6ED1\u65F1\u51B0\uFF0C\u968F\u5730\u5410\u75F0\u3001\u4FBF\u6EBA\uFF0C\u4E71\u4E22\u679C\u76AE(\u6838)\u3001\u70DF\u5934\u3001\u53E3\u9999\u7CD6\u7B49\u5E9F\u5F03\u7269\u7684\uFF0C\u8D23\u4EE4\u6539\u6B63\uFF0C\u5E76\u53EF\u4EE5\u590420\u5143\u4EE5\u4E0A50\u5143\u4EE5\u4E0B\u7F5A\u6B3E\uFF1B\u9020\u6210\u635F\u5931\u7684\uFF0C\u4F9D\u6CD5\u627F\u62C5\u8D54\u507F\u8D23\u4EFB\u3002\r\n\u8425\u706B\u3001\u70E7\u70E4\uFF0C\u6355\u635E\u3001\u6355\u6349\u52A8\u7269\uFF0C\u91C7\u6316\u690D\u7269\uFF0C\u6050\u5413\u3001\u6295\u6253\u3001\u4F24\u5BB3\u52A8\u7269\u6216\u8005\u5728\u975E\u6295\u5582\u533A\u6295\u5582\u52A8\u7269\u7684\uFF0C\u8D23\u4EE4\u6539\u6B63\uFF0C\u5E76\u53EF\u4EE5\u590450\u5143\u4EE5\u4E0A100\u5143\u4EE5\u4E0B\u7F5A\u6B3E\uFF1B\u9020\u6210\u635F\u5931\u7684\uFF0C\u4F9D\u6CD5\u627F\u62C5\u8D54\u507F\u8D23\u4EFB\uFF1B\u6784\u6210\u72AF\u7F6A\u7684\uFF0C\u4F9D\u6CD5\u8FFD\u7A76\u5211\u4E8B\u8D23\u4EFB\u3002\r\n\u5728\u5EFA\u7B51\u7269\u3001\u6784\u7B51\u7269\u3001\u8BBE\u65BD\u3001\u6811\u6728\u4E0A\u6D82\u5199\u3001\u523B\u5212\uFF0C\u6500\u6298\u82B1\u6728\uFF0C\u635F\u574F\u8349\u576A\u3001\u6811\u6728\u7684\uFF0C\u7ED9\u4E88\u8B66\u544A\uFF0C\u5E76\u59045\u5143\u4EE5\u4E0A50\u5143\u4EE5\u4E0B\u7F5A\u6B3E\uFF1B\u9020\u6210\u635F\u5931\u7684\uFF0C\u4F9D\u6CD5\u627F\u62C5\u8D54\u507F\u8D23\u4EFB\u3002\u5BF9\u5176\u4ED6\u5F71\u54CD\u56ED\u5BB9\u548C\u6E38\u89C8\u79E9\u5E8F\u7684\u884C\u4E3A\uFF0C\u8D23\u4EE4\u6539\u6B63\u3002\u5BF9\u4E3B\u8981\u516C\u56ED\u5185\u7684\u4E0A\u8FF0\u8FDD\u6CD5\u884C\u4E3A\u7684\u884C\u653F\u5904\u7F5A\uFF0C\u7531\u5E02\u56ED\u6797\u884C\u653F\u7BA1\u7406\u90E8\u95E8\u5B9E\u65BD\uFF1B\u5BF9\u5176\u4ED6\u516C\u56ED\u5185\u7684\u4E0A\u8FF0\u8FDD\u6CD5\u884C\u4E3A\u7684\u884C\u653F\u5904\u7F5A\uFF0C\u7531\u57CE\u5E02\u7BA1\u7406\u7EFC\u5408\u6267\u6CD5\u7EC4\u7EC7\u5B9E\u65BD\u3002\u4E3B\u8981\u516C\u56ED\u7684\u8303\u56F4\u7531\u5E02\u4EBA\u6C11\u653F\u5E9C\u786E\u5B9A\u3002\r\n\r\n\r\n\t\u7B2C\u4E94\u5341\u4E03\u6761 \u8FDD\u53CD\u672C\u6761\u4F8B\u7B2C\u56DB\u5341\u4E03\u6761\u89C4\u5B9A\uFF0C\u5728\u516C\u56ED\u5185\u8FFD\u9010\u6E38\u5BA2\u5F3A\u884C\u515C\u552E\u7269\u54C1\uFF0C\u5F71\u54CD\u6E38\u89C8\u79E9\u5E8F\u7684\uFF0C\u8D23\u4EE4\u6539\u6B63\uFF0C\u6CA1\u6536\u8FDD\u6CD5\u6240\u5F97\uFF0C\u5E76\u590450\u5143\u4EE5\u4E0A500\u5143\u4EE5\u4E0B\u7F5A\u6B3E\u3002\r\n\r\n\r\n\t\u7B2C\u4E94\u5341\u516B\u6761 \u672C\u6761\u4F8B\u7B2C\u4E94\u5341\u4E00\u6761\u7B2C(\u4E00)\u9879\u3001\u7B2C\u4E94\u5341\u4E8C\u6761\u3001\u7B2C\u4E94\u5341\u56DB\u6761\u3001\u7B2C\u4E94\u5341\u4E94\u6761\u3001\u7B2C\u4E94\u5341\u4E03\u6761\u89C4\u5B9A\u7684\u884C\u653F\u5904\u7F5A\uFF0C\u7531\u5E02\u56ED\u6797\u884C\u653F\u7BA1\u7406\u90E8\u95E8\u5B9E\u65BD\uFF1B\u7B2C\u4E94\u5341\u4E00\u6761\u7B2C(\u4E8C)\u9879\u3001\u7B2C\u4E94\u5341\u4E09\u6761\u89C4\u5B9A\u7684\u884C\u653F\u5904\u7F5A\uFF0C\u7531\u5E02\u56ED\u6797\u884C\u653F\u7BA1\u7406\u90E8\u95E8\u4F1A\u540C\u6709\u5173\u884C\u653F\u7BA1\u7406\u90E8\u95E8\u5B9E\u65BD\u3002\u57CE\u5E02\u7BA1\u7406\u7EFC\u5408\u6267\u6CD5\u7EC4\u7EC7\u6309\u7167\u5E02\u4EBA\u6C11\u653F\u5E9C\u6388\u6743\u7684\u8303\u56F4\uFF0C\u4F9D\u6CD5\u5BF9\u672C\u6761\u4F8B\u89C4\u5B9A\u7684\u8FDD\u6CD5\u884C\u4E3A\u5B9E\u65BD\u884C\u653F\u5904\u7F5A\u3002\r\n\r\n\r\n\t\u7B2C\u4E94\u5341\u4E5D\u6761 \u5BF9\u6E38\u4EBA\u5728\u516C\u56ED\u5185\u56E0\u610F\u5916\u4E8B\u6545\u9020\u6210\u4EBA\u8EAB\u4F24\u5BB3\u548C\u8D22\u4EA7\u635F\u5931\u7684\uFF0C\u5E94\u5F53\u5206\u6E05\u8D23\u4EFB\uFF0C\u4F9D\u6CD5\u5904\u7406\u3002\r\n\r\n\r\n\t\u7B2C\u516D\u5341\u6761 \u8D1F\u8D23\u7BA1\u7406\u3001\u76D1\u7763\u3001\u4FDD\u62A4\u516C\u56ED\u7684\u884C\u653F\u673A\u5173\u53CA\u5176\u5DE5\u4F5C\u4EBA\u5458\u8FDD\u53CD\u672C\u6761\u4F8B\u89C4\u5B9A\uFF0C\u4E0D\u5C65\u884C\u6CD5\u5B9A\u804C\u8D23\u6216\u8005\u6EE5\u7528\u804C\u6743\u7684\uFF0C\u7531\u4E0A\u7EA7\u884C\u653F\u673A\u5173\u6216\u8005\u6709\u5173\u90E8\u95E8\u8D23\u4EE4\u6539\u6B63\uFF0C\u5BF9\u76F4\u63A5\u8D1F\u8D23\u7684\u4E3B\u7BA1\u4EBA\u5458\u548C\u5176\u4ED6\u76F4\u63A5\u8D23\u4EFB\u4EBA\u5458\u4F9D\u6CD5\u7ED9\u4E88\u884C\u653F\u5904\u5206\uFF1B\u6784\u6210\u72AF\u7F6A\u7684\uFF0C\u4F9D\u6CD5\u8FFD\u7A76\u5211\u4E8B\u8D23\u4EFB\u3002");
		scrollPane.setViewportView(textPane_1);
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ui_ruleFive.class.getResource("/org/lq/ZOO/icon/bg/bg1.jpg")));
		lblNewLabel.setBounds(0, 0, 733, 757);
		panel.add(lblNewLabel);
	}
}
