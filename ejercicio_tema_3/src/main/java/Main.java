public class Main {
    public static void main(String [] args){
        Main obj = new Main();
        System.out.println("La suma es: "+  obj.sum(5, 10, 15));

        Coche miCoche = new Coche();
        int numero_puertas = miCoche.incrementarPuertas(1);
        System.out.println("El número de puertas es: "+ numero_puertas);
    }

    public int sum(int a, int b, int c){
        return a + b + c;
    }
}
