public class ejercicio1{
    public static void main (String args[]){

        int matematica = 5;
        int biologia = 8;
        int quimica = 7;
        int promedio = 0;

        promedio = (matematica + biologia + quimica)/3;
        if (promedio >=6){
            System.out.println("El alumno aprobó con " + promedio);
        }else{
            System.out.println("El alumno reprobó con " + promedio);
        }
    }
}