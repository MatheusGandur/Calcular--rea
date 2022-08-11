import javax.swing.JOptionPane;

public class Pentagono {
    
    double area;
    double perimetro;
    double lado;
    double apotema;


public Pentagono(){
}

public Pentagono(double area, double perimetro, double lado, double apotema){

    this.area= area;
    this.perimetro = perimetro;
    this.lado = lado;
    this.apotema = apotema;

}

void CadastrarPentagono(){

    //perimetro = Double.parseDouble(JOptionPane.showInputDialog("Digite o Perimetro por Favor ?"));
    lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o Lado por Favor ?"));
    apotema =Double.parseDouble(JOptionPane.showInputDialog("Digite Apontema por Favor ?"));
}

 void calcularPentagono(){

    perimetro = lado*5;
    area = (perimetro*apotema)/2;
}
void imprimirPentagono(){
     JOptionPane.showMessageDialog(null, "O valo do Pentagono é: "+ area);
 }


}