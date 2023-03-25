import javax.swing.JOptionPane;

public class C6_Trabajo_Practico {
    public static void main(String[] args) {
        int opcion = 0;
    do {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(
             "_____-:  Calculadora de Superficie  :-______\n"
             +"\n"
            +"                .: 1 :.   > Cuadrado  \n"
            +"                .: 2 :.   > Rectángulo  \n"
            +"                .: 3 :.   > Círculo  \n"
            +"                .: 4 :.   > Salir y terminar  \n"
            +"\n"
            +"_____-: Indique un número y Enter.. :-______"));

        switch (opcion){
            case 1:
                cuadrado();
                break;
            case 2:
                rectangulo();
                break;
            case 3:
                circulo();
                break;
            case 4: salir ();
                break;
            default: 
            JOptionPane.showMessageDialog(null,"La opcion ingresada es invalida .: Enter para seguir :.");
        }
        } while (opcion != 4);
    }

        static void cuadrado(){ 
            int lado = Integer.parseInt(JOptionPane.showInputDialog(".: Ingrese la longitud del lado en cm :."));
            int superficie = lado * lado;
            JOptionPane.showConfirmDialog(null, "La Area del cuadrado de lado "+lado+"cm \n"+"\n" +"es igual a .: "+superficie+"cm2 :. \n"+"\n"+ "Enter para seguir...");         
        }
        static void rectangulo(){
            int lado1 = Integer.parseInt(JOptionPane.showInputDialog(".: Ingrese la longitud del primer lado en cm :."));
            int lado2 = Integer.parseInt(JOptionPane.showInputDialog(".: Ingrese la longitud del segundo Lado en cm :."));
            int superficie = lado1 * lado2;
            JOptionPane.showConfirmDialog(null, "La Area del rectangulo de lados .: "+lado1+"cm y "+lado2+"cm :. \n"+"\n"+"es igual a .: "+superficie+"cm2 :. \n"+"\n"+ "Enter para seguir...");
        }
        static void circulo(){
            int radio = Integer.parseInt(JOptionPane.showInputDialog(".: Ingrese el radio del circulo en cm :."));
            double Area = Math.PI * Math.pow(radio, 2) ; 
            JOptionPane.showConfirmDialog(null, "El área del circulo es de .: "+ Area+"cm2 :. ");
        }
        static void salir (){
        JOptionPane.showMessageDialog(null,".: El programa finalizo correctamente! :. ¬(^_^)¬");
    }
}