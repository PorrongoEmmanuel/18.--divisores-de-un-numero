import javax.swing.*;

public class divisor {

    public void div(){

        int numeroDi=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero "));
        System.out.print("los divisores del "+ numeroDi+" son:\n");

        for (int i=1;i<=numeroDi;i++){

            if ((numeroDi%i)== 0){
                System.out.print("\n"+i);
    }
}}}
