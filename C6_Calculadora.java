import javax.swing.JOptionPane;
public class C6_Calculadora {
    public static void main(String[] args) {
    int opcion = 0;
    do {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(
             "________-:  Calculadora  :-______\n"
             +"\n"
            +"                .: 1 :.   > Suma  \n"
            +"                .: 2 :.   > Resta  \n"
            +"                .: 3 :.   > Multiplicacion  \n"
            +"                .: 4 :.   > Division  \n"
            +"                .: 5 :.   > Salir  \n"
            +"\n"
            +"_____-: Indique un número y Enter.. :-______"));

        switch (opcion){
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            case 4: 
                division ();
                break;
            case 5:
                salir();
            default: 
            JOptionPane.showMessageDialog(null,"La opcion ingresada es invalida .: Enter para seguir :.");
        }
        } while (opcion != 5);
    }

        static void suma(){ 
            double a = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero a sumar"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero a sumar"));
            double result = a + b;
            System.out.println(result);

        }
        static void resta(){

        }
        static void multiplicacion(){

        }
        static void division(){

        }
        static void salir (){
        }
}