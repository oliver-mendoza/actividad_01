package actividad_01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer rectángulo:");
        System.out.print("Esquina 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Esquina opuesta: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Rectangulo A = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
        System.out.println("Ingrese las coordenadas del segundo rectángulo:");
        System.out.print("Esquina 1: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        System.out.print("Esquina opuesta: ");
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        Rectangulo B = new Rectangulo(new Coordenada(x3, y3), new Coordenada(x4, y4));
        System.out.println(A);
        System.out.println(B);
        if (Verificador.seSobreponen(A, B)) {
            System.out.println("Los rectángulos A y B se sobreponen.");
            Rectangulo sobreposicion = Verificador.rectanguloSobre(A, B);
            System.out.printf("Área de sobreposición = %.2f\n", sobreposicion.calculoArea());
        } else if (Verificador.estanJuntos(A, B)) {
            System.out.println("Los rectángulos A y B están juntos.");
        } else {
            System.out.println("Los rectángulos A y B son disjuntos.");
        }
        sc.close();
    }
}