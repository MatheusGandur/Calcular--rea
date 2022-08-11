import javax.swing.JOptionPane;

public class Trapezio {
    
    float area;
    float Bmaior;
    float Bmenor;
    float Altura;

public Trapezio(){

}

public Trapezio (float area, float Bmaior, float Bmenor, float altura){

    this.area = area;
    this.Bmaior = Bmaior;
    this.Bmenor = Bmenor;
    this.Altura = altura;
}

void CadastrarTrapezio(){
   Bmaior = Float.parseFloat(JOptionPane.showInputDialog("Digite a base maior do Trapezio ?"));
   Bmenor = Float.parseFloat(JOptionPane.showInputDialog("Digite a base menor do Trapezio ?"));
   Altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a Altura ?"));
}
float CalcularTrapezio(){

    area = (Altura *(Bmaior + Bmenor))/2;
    return area;
}

void imprimirTrapezio (){
    JOptionPane.showMessageDialog(null, "A area do Trapezio é: " + area + "Cm" );
  }


}
