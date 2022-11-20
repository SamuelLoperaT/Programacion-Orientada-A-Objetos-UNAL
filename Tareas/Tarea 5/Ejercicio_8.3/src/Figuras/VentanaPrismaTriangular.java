package Figuras;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrismaTriangular extends JFrame implements ActionListener {

    private Container contenedor;
    
    private JLabel ladotriangulo, ladoMayor, volumen, superficie;
    
    private JTextField campoladotriangular, campoladoMayor;
    
    private JButton calcular;
    
    public VentanaPrismaTriangular() {
        inicio();
        setTitle("Prisma Triangular"); 
        setSize(280,210); 
        setLocationRelativeTo(null); 
        
        setResizable(false); 
        }
        
        private void inicio() {
        contenedor = getContentPane(); 
        contenedor.setLayout(null); 
        ladotriangulo = new JLabel();
        ladotriangulo.setText("Lado Triangulo Equliatero (cms):");
        ladotriangulo.setBounds(20, 20, 165, 23); 
        campoladotriangular = new JTextField();
        
        campoladotriangular.setBounds(165, 20, 70, 23);
        
        ladoMayor = new JLabel();
        ladoMayor.setText("Lado Rectangulo (cms):");
        ladoMayor.setBounds(20, 50, 165, 23); 
        campoladoMayor = new JTextField();
        campoladoMayor.setBounds(165, 50, 70, 23);
       
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(120, 80, 115, 23); 
        calcular.addActionListener(this);
        
        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        
        volumen.setBounds(20, 110, 155, 23);
        
        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        
        superficie.setBounds(20, 140, 155, 23);
        
        contenedor.add(ladotriangulo);
        contenedor.add(campoladotriangular);
        contenedor.add(ladoMayor);
        contenedor.add(campoladoMayor);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
        }
        
        public void actionPerformed(ActionEvent event) {
        // Se inicializan el radio y la altura del cilindro
        boolean error = false; /* Se inicializa variable para determinar si 
        ocurre un error */
        double ladotriangulo = 0;
        double ladoMayor = 0;
        try {
        
        ladotriangulo = Double.parseDouble(campoladotriangular.getText());
        
        ladoMayor = Double.parseDouble(campoladoMayor.getText());
        PrismaTriangular prismaTriangular = new PrismaTriangular(ladotriangulo, ladoMayor);
        volumen.setText("Volumen (cm3): " + String.format("%.2f", prismaTriangular.CalcularVolumen()));
        // Se calcula y muestra la superficie
        superficie.setText("Superficie (cm2): " + String.format("%.2f", prismaTriangular.CalcularSuperficie()));
        } catch (Exception e){
        error = true; 
        } finally {
        if(error) { 
        JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de numero","Error", JOptionPane.ERROR_MESSAGE);
        }
        }
        }
        }

