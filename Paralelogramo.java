import javax.swing.JOptionPane;

public class Paralelogramo {

    float area;
    float base;
    float altura;

public Paralelogramo(){

}

public Paralelogramo(float area, float base, float altura){

    this.area = area;
    this.base = base;
    this.altura = altura;
}

void CadastrarParalelogramo(){
   
    base = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite a base ?"));
    altura = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite a altua ?"));
}

float CalcularParalelogramo (){

    area = (base*altura);
    return area;
}

void imprimirParalelogramo(){
    JOptionPane.showMessageDialog(null, "O valor total do Paralelogramo é:" + area + "Cm2");
}
    
}
