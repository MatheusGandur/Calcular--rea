import javax.swing.JOptionPane;

public class Circulo {
    double area;
    double raio;
    double Pi = 3.1416;

public Circulo(){
}

public Circulo(Double area, Double raio ){

    this.area = area;
    this.raio = raio;
    //this.Pi = Pi;
}

void CadastrarCirculo(){
    
    raio = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite o Raio ?"));
    //Pi = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite o valor de Pi ?"));
    
}

double CalcularCirculo(){

    area = Pi *(raio*raio);
    return area;
}
void imprimirCirculo(){
JOptionPane.showMessageDialog(null, "A area do Círculo é" + area + "m2");

  }

}
