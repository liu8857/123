package org.lq.ZOO.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by msi on 2016/12/17
 */

@SuppressWarnings("serial")
public class Minder extends JFrame {
    private boolean thread1B = false;   //��¼�߳�1������״̬
    private boolean thread2B = false;   //��¼�߳�2������״̬
    private boolean thread3B = false;   //��¼�߳�3������״̬

    private boolean thread1A = false;   //��¼�Ƿ��������1
    private boolean thread2A = false;   //��¼�Ƿ��������2
    private boolean thread3A = false;   //��¼�Ƿ��������3

    //���¶���JP2����µ������ı���
    private JTextField JP2_JTF1 = new JTextField(20);
    private JTextField JP2_JTF2 = new JTextField("5", 4);
    //���¶���JP3����µ������ı���
    private JTextField JP3_JTF1 = new JTextField(20);
    private JTextField JP3_JTF2 = new JTextField("5", 4);
    //���¶���JP4����µ������ı���
    private JTextField JP4_JTF1 = new JTextField(20);
    private JTextField JP4_JTF2 = new JTextField("5", 4);

    Minder() {
        //�������ڵĲ�������
        Container cp = getContentPane();
        //        cp.setLayout(new FlowLayout());
        cp.setLayout(new GridLayout(5, 1));
        //        setBounds(450, 250, 500, 245);
        setBounds(450, 250, 550, 300);
        setTitle("��������");
       // setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        //�������
        JPanel JP1 = new JPanel();
        JPanel JP2 = new JPanel();
        JPanel JP3 = new JPanel();
        JPanel JP4 = new JPanel();
        JPanel JP5 = new JPanel();

        //������������в��ֵĴ���
        JLabel JP1_JL = new JLabel("����д����");
        JP1.add(JP1_JL);

        JLabel JP2_JL1 = new JLabel("����1");
        JLabel JP2_JL2 = new JLabel("����");
        JLabel JP2_JL3 = new JLabel("���Ӻ����ѣ���������");
        JP2.add(JP2_JL1);
        JP2.add(JP2_JTF1);
        JP2.add(JP2_JL2);
        JP2.add(JP2_JTF2);
        JP2.add(JP2_JL3);

        JLabel JP3_JL1 = new JLabel("����2");
        JLabel JP3_JL2 = new JLabel("����");
        JLabel JP3_JL3 = new JLabel("���Ӻ����ѣ���������");
        JP3.add(JP3_JL1);
        JP3.add(JP3_JTF1);
        JP3.add(JP3_JL2);
        JP3.add(JP3_JTF2);
        JP3.add(JP3_JL3);

        JLabel JP4_JL1 = new JLabel("����3");
        JLabel JP4_JL2 = new JLabel("����");
        JLabel JP4_JL3 = new JLabel("���Ӻ����ѣ���������");
        JP4.add(JP4_JL1);
        JP4.add(JP4_JTF1);
        JP4.add(JP4_JL2);
        JP4.add(JP4_JTF2);
        JP4.add(JP4_JL3);

        JButton JP5_JBStart = new JButton("��ʼ�ƻ�");
        JP5.add(JP5_JBStart);
        JButton JP5_JBReset = new JButton("���üƻ�");
        JP5.add(JP5_JBReset);

        //�������������в��ֵĴ���
        cp.add(JP1);
        cp.add(JP2);
        cp.add(JP3);
        cp.add(JP4);
        cp.add(JP5);

        JP5_JBStart.addActionListener(e -> {
            //�������������1,��������1Ϊ��,�෴���߳����б��Ϊ�״̬,��Ϊtrue.����ͬ.
            if (JP2_JTF1.getText().length() == 0) {
                thread1A = false;
                thread1B = true;
            } else thread1A = true;
            //����������1,���߳����б����������ĳ���ν��и�ֵ,��ʱ�߳�״̬��Ϊfalse.����ͬ.
            if (JP3_JTF1.getText().length() == 0) {
                thread2A = false;
                thread2B = true;
            } else thread2A = true;
            if (JP4_JTF1.getText().length() == 0) {
                thread3A = false;
                thread3B = true;
            } else thread3A = true;

            String TimeLong1 = JP2_JTF2.getText();
            final long TimeLongNum1 = (Integer.parseInt(TimeLong1)) * 1000 * 60;
            if (thread1A) {
                //�����ڲ����߳�1
                new Thread(() -> {
                    try {
                        //������ͣһ��ʱ��
                        Thread.sleep(TimeLongNum1);
                    } catch (InterruptedException e13) {
                        // TODO Auto-generated catch block
                        e13.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,
                            "ʱ���ѵ���������������:\n" + JP2_JTF1.getText());
                    //����������1,�ҵ�����1��ɺ�(���̴߳�sleep״̬����),���߳����б�Ǹ�ֵΪtrue.����ͬ.
                    thread1B = true;
                    //����SetClose()����,�ж���������,�������,���˳�ϵͳ.����ͬ.
                    SetClose();
                }).start();
            }

            String TimeLong2 = JP3_JTF2.getText();
            final long TimeLongNum2 = (Integer.parseInt(TimeLong2)) * 1000 * 60;
            if (thread2A) {
                //�����ڲ����߳�1
                new Thread(() -> {
                    try {
                        //������ͣһ��ʱ��
                        Thread.sleep(TimeLongNum2);
                    } catch (InterruptedException e12) {
                        // TODO Auto-generated catch block
                        e12.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,
                            "ʱ���ѵ���������������:\n" + JP3_JTF1.getText());
                    thread2B = true;
                    SetClose();
                }).start();
            }

            String TimeLong3 = JP4_JTF2.getText();
            final long TimeLongNum3 = (Integer.parseInt(TimeLong3)) * 1000 * 60;
            if (thread3A) {
                //�����ڲ����߳�1
                new Thread(() -> {
                    try {
                        //������ͣһ��ʱ��
                        Thread.sleep(TimeLongNum3);
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,
                            "ʱ���ѵ���������������:\n" + JP4_JTF1.getText());
                    thread3B = true;
                    SetClose();
                }).start();
            }

            //���ֻҪ��һ������,�򵥻�"��ʼ�ƻ�"�����ش���
            if (thread1A || thread2A || thread3A) {
                JOptionPane.showMessageDialog(null,
                        "�����������ں�̨����,���񴰿ڽ��ر�");
                SetHide();
            }
        });

        //��"��λ�ƻ�"��ť��Ӵ����¼�
        JP5_JBReset.addActionListener(e -> {
            //��λ����������е��ı����е��������������Ĭ��ֵ
            if (!((JP2_JTF1.getText()).equals(""))) {
                JP2_JTF1.setText(null);
                JP2_JTF2.setText("5");
            }
            if (!((JP3_JTF1.getText()).equals(""))) {
                JP3_JTF1.setText(null);
                JP3_JTF2.setText("5");
            }
            if (!((JP4_JTF1.getText()).equals(""))) {
                JP4_JTF1.setText(null);
                JP4_JTF2.setText("5");
            }
        });
    }

    //���ش���,��Ϊ�ڴ���Ĺ��췽���еİ�ť�ڲ�����ʹ��this�ؼ���,������дһ����������,���ڳ�Ա������this�ؼ���
    private void SetHide() {
        this.setVisible(false);
    }

    private void SetClose() {
        //���������,�����������Ѿ��������,���˳�ϵͳ,����,û��������ڿ�ʼʱ�ͱ����Ӧ�߳�״̬Ϊtrue,
        //���������,����������ϳ�����е��߳�������(���������)�ű����Ӧ�߳�״̬Ϊtrue,Ϊ�˱����ж�����
        //��������ʾ���.
        if (this.thread1B && this.thread2B && this.thread3B)
            System.exit(0);
    }

    public static void main(String[] args) {
        new Minder();
    }
}
