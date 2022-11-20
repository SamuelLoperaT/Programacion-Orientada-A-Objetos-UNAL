package Punto2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {
   public JPanel panel = new JPanel();
   public JTextField campo1, campo2, campo3, campo4, campo5, campo6, campo7, campo8, campo9;
   public JButton boton;
   JLabel nota1, nota2, nota3, nota4, nota5, promedio, desviacion, mayor, menor;

   public Ventana() {
      setSize(500, 500);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setTitle("Notas");
      panel.setLayout(null);

      this.getContentPane().add(panel);
      etiquetas1();
      etiquetas2();
      boton();
   }

   public void etiquetas1() {

      campo1 = new JTextField();
      campo1.setBounds(70, 20, 135, 23);
      nota1 = new JLabel();
      nota1.setText("Nota 1:");
      nota1.setBounds(20, 20, 135, 23);

      campo2 = new JTextField();
      campo2.setBounds(70, 50, 135, 23);
      nota2 = new JLabel();
      nota2.setBounds(20, 50, 135, 23);
      nota2.setText("Nota 2:");

      campo3 = new JTextField();
      campo3.setBounds(70, 80, 135, 23);
      nota3 = new JLabel();
      nota3.setBounds(20, 80, 135, 23);
      nota3.setText("Nota 3:");

      campo4 = new JTextField();
      campo4.setBounds(70, 110, 135, 23);
      nota4 = new JLabel();
      nota4.setBounds(20, 110, 135, 23);
      nota4.setText("Nota 4:");

      campo5 = new JTextField();
      campo5.setBounds(70, 140, 135, 23);
      nota5 = new JLabel();
      nota5.setBounds(20, 140, 135, 23);
      nota5.setText("Nota 5: ");

      panel.add(nota1);
      panel.add(nota2);
      panel.add(nota3);
      panel.add(nota4);
      panel.add(nota5);

      panel.add(campo1);
      panel.add(campo2);
      panel.add(campo3);
      panel.add(campo4);
      panel.add(campo5);

   }

   public void etiquetas2() {
      campo6 = new JTextField();
      campo6.setBounds(150, 170, 135, 23);
      promedio = new JLabel();
      promedio.setBounds(20, 170, 135, 23);
      promedio.setText("Promedio:");

      campo7 = new JTextField();
      campo7.setBounds(150, 200, 135, 23);
      desviacion = new JLabel();
      desviacion.setBounds(20, 200, 135, 23);
      desviacion.setText("Desviacion estandar:");

      campo8 = new JTextField();
      campo8.setBounds(150, 230, 135, 23);
      mayor = new JLabel();
      mayor.setBounds(20, 230, 135, 23);
      mayor.setText("Numero mayor:");

      campo9 = new JTextField();
      campo9.setBounds(150, 260, 135, 23);
      menor = new JLabel();
      menor.setBounds(20, 260, 135, 23);
      menor.setText("Numero menor:");

      panel.add(campo6);
      panel.add(campo7);
      panel.add(campo8);
      panel.add(campo9);

      panel.add(promedio);
      panel.add(desviacion);
      panel.add(mayor);
      panel.add(menor);
   }

   public void boton() {
      boton = new JButton();
      boton.setBounds(300, 80, 135, 23);
      boton.setText("Calcular");
      panel.add(boton);
   }

}
