import javax.swing.JOptionPane;

public class Triangulo{
     float base;
     float altura;
     Float area;

     public Triangulo(){}
    
     public Triangulo (float base, float altura) {
         this.base = base;
         this.altura = altura;

 
     }

     void CadastrarTriangulo(){
        base = Float.parseFloat(JOptionPane.showInputDialog("Por fabor digite a Base ?"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite a altura ?"));
         
     }

     float CalcularTriangulo(){

        area = (base * altura)/2;
        return area;
     }
     
     void imprimirdadosTriangulo(){
         JOptionPane.showMessageDialog(null, "Area do Triangulo: " + area);
     }


}