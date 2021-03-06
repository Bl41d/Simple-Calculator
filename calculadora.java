package Calculadora;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.PLAIN;

public class calculadora {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,igual,mult,sum,resta,divi,c;
    JMenuBar menu;
    JMenu creador;
    JMenuItem nombre,salir;
    double num1,num2;
    String numero = "", aux = "";
    Boolean ifSum,ifMult,ifResta,ifDivi;

    public calculadora(){
        setFrame();
        setPanel();
        setComponentes();
        setBotones();
        setMenu();
        controlarEventos();
        frame.setVisible(true);
    }

    public void setFrame(){
        frame = new JFrame();
        frame.setBounds(300,50,350,350);
        frame.setTitle("Calculadora");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setPanel(){
        panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(null);
        frame.getContentPane().add(panel);
    }

    public void setComponentes(){
        label = new JLabel("");
        label.setBounds(20,20,295,50);
        label.setOpaque(true);
        label.setBackground(Color.black);
        label.setForeground(Color.red);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setFont(new Font("MONOSPACED", PLAIN, 26));
        label.setBorder(new LineBorder(Color.GRAY));
        panel.add(label);
    }

    public void setBotones(){
        b1 = new JButton("1"); b1.setBounds(20, 90, 70,40); panel.add(b1);
        b1.setBackground(Color.darkGray); b1.setForeground(Color.WHITE); b1.setBorder(new LineBorder(Color.GRAY));
        b1.setFont(new Font("MONOSPACED", PLAIN, 18)); b1.setFocusPainted(false);
        b2 = new JButton("2"); b2.setBounds(95, 90, 70,40); panel.add(b2);
        b2.setBackground(Color.darkGray); b2.setForeground(Color.WHITE); b2.setBorder(new LineBorder(Color.GRAY));
        b2.setFont(new Font("MONOSPACED", PLAIN, 18)); b2.setFocusPainted(false);
        b3 = new JButton("3"); b3.setBounds(170, 90, 70,40); panel.add(b3);
        b3.setBackground(Color.darkGray); b3.setForeground(Color.WHITE); b3.setBorder(new LineBorder(Color.GRAY));
        b3.setFont(new Font("MONOSPACED", PLAIN, 18)); b3.setFocusPainted(false);
        sum = new JButton("+"); sum.setBounds(245, 90, 70,40); panel.add(sum);
        sum.setBackground(Color.darkGray); sum.setForeground(Color.WHITE); sum.setBorder(new LineBorder(Color.GRAY));
        sum.setFont(new Font("MONOSPACED", PLAIN, 18)); sum.setFocusPainted(false);
        b4 = new JButton("4"); b4.setBounds(20, 135, 70,40); panel.add(b4);
        b4.setBackground(Color.darkGray); b4.setForeground(Color.WHITE); b4.setBorder(new LineBorder(Color.GRAY));
        b4.setFont(new Font("MONOSPACED", PLAIN, 18)); b4.setFocusPainted(false);
        b5 = new JButton("5"); b5.setBounds(95, 135, 70,40); panel.add(b5);
        b5.setBackground(Color.darkGray); b5.setForeground(Color.WHITE); b5.setBorder(new LineBorder(Color.GRAY));
        b5.setFont(new Font("MONOSPACED", PLAIN, 18)); b5.setFocusPainted(false);
        b6 = new JButton("6"); b6.setBounds(170, 135, 70,40); panel.add(b6);
        b6.setBackground(Color.darkGray); b6.setForeground(Color.WHITE); b6.setBorder(new LineBorder(Color.GRAY));
        b6.setFont(new Font("MONOSPACED", PLAIN, 18)); b6.setFocusPainted(false);
        resta = new JButton("-"); resta.setBounds(245, 135, 70,40); panel.add(resta);
        resta.setBackground(Color.darkGray); resta.setForeground(Color.WHITE); resta.setBorder(new LineBorder(Color.GRAY));
        resta.setFont(new Font("MONOSPACED", PLAIN, 18)); resta.setFocusPainted(false);
        b7 = new JButton("7"); b7.setBounds(20, 180, 70,40); panel.add(b7);
        b7.setBackground(Color.darkGray); b7.setForeground(Color.WHITE); b7.setBorder(new LineBorder(Color.GRAY));
        b7.setFont(new Font("MONOSPACED", PLAIN, 18)); b7.setFocusPainted(false);
        b8 = new JButton("8"); b8.setBounds(95, 180, 70,40); panel.add(b8);
        b8.setBackground(Color.darkGray); b8.setForeground(Color.WHITE); b8.setBorder(new LineBorder(Color.GRAY));
        b8.setFont(new Font("MONOSPACED", PLAIN, 18)); b8.setFocusPainted(false);
        b9 = new JButton("9"); b9.setBounds(170, 180, 70,40); panel.add(b9);
        b9.setBackground(Color.darkGray); b9.setForeground(Color.WHITE); b9.setBorder(new LineBorder(Color.GRAY));
        b9.setFont(new Font("MONOSPACED", PLAIN, 18)); b9.setFocusPainted(false);
        mult = new JButton("x"); mult.setBounds(245, 180, 70,40); panel.add(mult);
        mult.setBackground(Color.darkGray); mult.setForeground(Color.WHITE); mult.setBorder(new LineBorder(Color.GRAY));
        mult.setFont(new Font("MONOSPACED", PLAIN, 18)); mult.setFocusPainted(false);
        c = new JButton("c"); c.setBounds(20, 225, 70,40); panel.add(c);
        c.setBackground(Color.darkGray); c.setForeground(Color.WHITE); c.setBorder(new LineBorder(Color.GRAY));
        c.setFont(new Font("MONOSPACED", PLAIN, 18)); c.setFocusPainted(false);
        b0 = new JButton("0"); b0.setBounds(95, 225, 70,40); panel.add(b0);
        b0.setBackground(Color.darkGray); b0.setForeground(Color.WHITE); b0.setBorder(new LineBorder(Color.GRAY));
        b0.setFont(new Font("MONOSPACED", PLAIN, 18)); b0.setFocusPainted(false);
        igual = new JButton("="); igual.setBounds(170, 225, 70,40); panel.add(igual);
        igual.setBackground(Color.darkGray); igual.setForeground(Color.WHITE); igual.setBorder(new LineBorder(Color.GRAY));
        igual.setFont(new Font("MONOSPACED", PLAIN, 18)); igual.setFocusPainted(false);
        divi = new JButton("/"); divi.setBounds(245, 225, 70,40); panel.add(divi);
        divi.setBackground(Color.darkGray); divi.setForeground(Color.WHITE); divi.setBorder(new LineBorder(Color.GRAY));
        divi.setFont(new Font("MONOSPACED", PLAIN, 18)); divi.setFocusPainted(false);
    }

    private void setMenu() {
        menu = new JMenuBar();
        frame.setJMenuBar(menu);
        creador = new JMenu("About");
        menu.add(creador);
        nombre = new JMenuItem("Author");
        nombre.setActionCommand("Autor");
        creador.add(nombre);
        salir = new JMenuItem("Salir");
        salir.setActionCommand("Salir");
        creador.add(salir);
    }

    public void controlarEventos() {
        ifSum = false;
        ifMult = false;
        ifResta = false;
        ifDivi = false;
        clickBoton click = new clickBoton();
        b1.addActionListener(click);
        b2.addActionListener(click);
        b3.addActionListener(click);
        b4.addActionListener(click);
        b5.addActionListener(click);
        b6.addActionListener(click);
        b7.addActionListener(click);
        b8.addActionListener(click);
        b9.addActionListener(click);
        b0.addActionListener(click);
        c.addActionListener(click);
        igual.addActionListener(click);
        sum.addActionListener(click);
        divi.addActionListener(click);
        resta.addActionListener(click);
        mult.addActionListener(click);
        clickBoton accion = new clickBoton();
        nombre.addActionListener(accion);
        salir.addActionListener(accion);
    }

    private class clickBoton implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if (numero.contains(".")) {
               numero = numero;
               if (e.getSource() == c) {
                    numero = "";
                    aux = "";
                    label.setText("");
                    ifSum = false;
                    ifSum = false;
                    ifResta = false;
                    ifDivi = false;
                }
                else if (e.getSource() == sum) {
                    label.setText("");
                    igual();
                    ifSum = true;
                }
                else if (e.getSource() == divi) {
                    label.setText("");
                    igual();
                    ifDivi = true;
                }
                else if (e.getSource() == mult) {
                    label.setText("");
                    igual();
                    ifMult = true;
                }
                else if (e.getSource() == resta) {
                    label.setText("");
                    igual();
                    ifResta = true;
                }
                else if (e.getSource() == igual) {
                    igual();
                }
            }
            else {
                if (e.getSource() == b1) {
                    numero = numero + "1";
                    label.setText(numero);
                }
                else if (e.getSource() == b2) {
                    numero = numero + "2";
                    label.setText(numero);
                }
                else if (e.getSource() == b3) {
                    numero = numero + "3";
                    label.setText(numero);
                }
                else if (e.getSource() == b4) {
                    numero = numero + "4";
                    label.setText(numero);
                }
                else if (e.getSource() == b5) {
                    numero = numero + "5";
                    label.setText(numero);
                }
                else if (e.getSource() == b6) {
                    numero = numero + "6";
                    label.setText(numero);
                }
                else if (e.getSource() == b7) {
                    numero = numero + "7";
                    label.setText(numero);
                }
                else if (e.getSource() == b8) {
                    numero = numero + "8";
                    label.setText(numero);
                }
                else if (e.getSource() == b9) {
                    numero = numero + "9";
                    label.setText(numero);
                }
                else if (e.getSource() == b0) {
                    if (numero.equalsIgnoreCase("")){
                        numero = numero + "";
                    }
                    else {
                        numero = numero + "0";
                    }
                    label.setText(numero);
                }
                else if (e.getSource() == c) {
                    numero = "";
                    aux = "";
                    label.setText("");
                    ifSum = false;
                    ifSum = false;
                    ifResta = false;
                    ifDivi = false;
                }
                else if (e.getSource() == sum) {
                    label.setText("");
                    igual();
                    ifSum = true;
                }
                else if (e.getSource() == divi) {
                    label.setText("");
                    igual();
                    ifDivi = true;
                }
                else if (e.getSource() == mult) {
                    label.setText("");
                    igual();
                    ifMult = true;
                }
                else if (e.getSource() == resta) {
                    label.setText("");
                    igual();
                    ifResta = true;
                }
                else if (e.getSource() == igual) {
                    igual();
                }
            }
            try {
                String comand = e.getActionCommand();
                if (comand.equals("Autor")) {
                    JOptionPane.showMessageDialog (frame, "Author - Blaid", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (comand.equals("Salir")){
                    System.exit(0);
                }
            }
            catch (Exception ea){

            }
        }

        public void igual(){
            if (!numero.equalsIgnoreCase("") && !aux.equalsIgnoreCase("")) {
                num2 = Double.parseDouble(numero);
                num1 = Double.parseDouble(aux);
                if (ifResta == true) {
                    num1 = num1 - num2;
                }
                else if (ifSum == true) {
                    num1 = num1 + num2;
                }
                else if (ifMult == true) {
                    num1 = num1 * num2;
                }
                else if (ifDivi == true) {
                    num1 = num1 / num2;
                }
                numero = String.valueOf(num1);
                aux = "";
                ifSum = false;
                ifMult = false;
                ifResta = false;
                ifDivi = false;
                label.setText(numero);
            }
            else {
                cambiar();
            }
        }

        public void cambiar(){
            if (!numero.equalsIgnoreCase("")) {
                aux = numero;
                numero = "";
            }
        }
    }

    public static void main(String[] args) {
        calculadora c = new calculadora();
    }
}