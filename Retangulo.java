import javax.swing.JOptionPane;

public class Retangulo {
    double area;
    double Rbase;
    double Raltura;
    

public Retangulo(){
}

public Retangulo(Double area, Double Rbase, Double Raltura){

    this.area = area;
    this.Rbase = Rbase;
    this.Raltura = Raltura;
}
void CadastrarRetangulo(){
    Rbase = Double.parseDouble(JOptionPane.showInputDialog("Por favor Digite a área ?"));
    Raltura = Double.parseDouble(JOptionPane.showInputDialog("Por favor Digite a Altura ?"));
}
double CalcularRetangulo(){

    area = (Rbase*Raltura);
    return area;
}
void imprimirRetangulo(){
JOptionPane.showMessageDialog(null, "A area do Retângulo é:" + area + "Cm");

  }

}
