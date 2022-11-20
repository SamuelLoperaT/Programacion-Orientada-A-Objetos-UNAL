package Punto2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Principal {

   public static void main(String[] args) {
      Ventana v1 = new Ventana();
      Calculo calulos = new Calculo();

      v1.setVisible(true);
      v1.boton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            List<Double> notas = new ArrayList<>();
            String[] notasString = { v1.campo1.getText(), v1.campo2.getText(), v1.campo3.getText(), v1.campo4.getText(),
                  v1.campo5.getText() };
            for (int i = 0; i < 5; i++) {
               notas.add(Double.parseDouble(notasString[i]));
            }
            v1.campo6.setText("" + calulos.promedio(notas));
            v1.campo7.setText("" + calulos.desviacion(notas, calulos.promedio(notas)));
            v1.campo8.setText("" + calulos.mayor(notas));
            v1.campo9.setText("" + calulos.menor(notas));

         }
      });
   }

}
