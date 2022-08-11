import javax.swing.JOptionPane;

public class Quadrado {

    double area;
    double lado;

public Quadrado(){

}

public Quadrado(Double area, Double lado){

    this.area = area;
    this.lado = lado;
}

void CadastrarQuadrado(){

    lado = Double.parseDouble(JOptionPane.showInputDialog("Por favor Digite o Lado ?"));
}

double CalcularQuadrado (){

    area = (lado * lado);
    return area;
}

void imprimirQuadrado(){
    JOptionPane.showMessageDialog(null, "A area do Quadrado é:" + area + "Cm");
}
    
}
