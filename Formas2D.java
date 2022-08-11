
import javax.swing.JOptionPane;

public class Formas2D {
    public static void main(String[] args) {
        
        Triangulo tri = new Triangulo();
        Circulo cir = new Circulo();
        Retangulo ret = new Retangulo();
        Quadrado quad = new Quadrado();
        Paralelogramo parale = new Paralelogramo();
        Pentagono penta = new Pentagono();
        Trapezio trap = new Trapezio();

       
  int x = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção Geométricas para Calcular: "
                                                    +"\n"+"1 - Triangulo" 
                                                    +"\n"+"2 - Circulo"
                                                    +"\n"+"3 - Retangulo"
                                                    +"\n"+"4 - Quadrado"
                                                    +"\n"+"5 - Paralelogramo"
                                                    +"\n"+"6 - Pentagono"
                                                    +"\n"+"7 - Trapezio"));



    switch(x){
          case 1:
                  System.out.println("Triangulo");
                  tri.CadastrarTriangulo();
                  tri.CalcularTriangulo();
                  tri.imprimirdadosTriangulo();
                  break;
          case 2:
                  System.out.println("Circulo");
                  cir.CadastrarCirculo();
                  cir.CalcularCirculo();
                  cir.imprimirCirculo();
                
                  break;
          case 3:
                  System.out.println("Retangulo");
                  ret.CadastrarRetangulo();
                  ret.CalcularRetangulo();
                  ret.imprimirRetangulo();
                  
                  break;
          case 4:
                  quad.CadastrarQuadrado();
                  quad.CalcularQuadrado();
                  quad.imprimirQuadrado();
                  
                  break;
          case 5:
                  parale.CadastrarParalelogramo();
                  parale.CalcularParalelogramo();
                  parale.imprimirParalelogramo();
                  
                  break;
          case 6:
                  penta.CadastrarPentagono();
                  penta.calcularPentagono();
                  penta.imprimirPentagono();
                  
                  break;
          case 7:
                  trap.CadastrarTrapezio();
                  trap.CalcularTrapezio();
                  trap.imprimirTrapezio();

                  break;
          default:
                  JOptionPane.showMessageDialog(null, "Opção numerica não existe, por favor tente ás opções disponíveis: ");
  }
}
}

