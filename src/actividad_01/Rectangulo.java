package actividad_01;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = new Coordenada(Math.min(c1.getX(), c2.getX()), Math.min(c1.getY(), c2.getY()));
        this.esquina2 = new Coordenada(Math.max(c1.getX(), c2.getX()), Math.max(c1.getY(), c2.getY()));
    }
    public void setEsquina1(Coordenada coo) { this.esquina1 = coo; }
    public void setEsquina2(Coordenada coo) { this.esquina2 = coo; }
    public Coordenada getEsquina1() { return esquina1; }
    public Coordenada getEsquina2() { return esquina2; }
    public double calculoArea() {
        return (esquina2.getX() - esquina1.getX()) * (esquina2.getY() - esquina1.getY());
    }
    public String toString() {
        return String.format("Rectangulo = (%s, %s)", esquina1, esquina2);
    }
}