import javax.swing.JOptionPane;

public class C6_Calculadora{
    public static void main(String[] args) {
        double n1,n2,result=0;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer Numero"));
        String operador = JOptionPane.showInputDialog("Ingrese el Operador correspondiente [+] [-] [/] [*]");
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo Numero"));
        
        switch (operador){
            case "+": result = n1+n2;
            JOptionPane.showConfirmDialog(null,"el resultado es: "+result);
            break;
            case "-": result = n1-n2;
            JOptionPane.showConfirmDialog(null,"el resultado es: "+result);
            break;
            case "/": result = n1/n2;
            JOptionPane.showConfirmDialog(null,"el resultado es: "+result);
            break;
            case "*": result = n1*n2;
            JOptionPane.showConfirmDialog(null,"el resultado es: "+result);
            break;
        }   
    }
}