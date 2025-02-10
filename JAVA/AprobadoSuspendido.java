public class AprobadoSuspendido {

    public static void main(String[] args) {
        
        int Matematicas = 5;
        int Biologia = 5;
        int Quimica = 5;
        int Media = 0;

        Media = (Matematicas + Biologia + Quimica)/3;

        if (Media >= 5) {
            System.out.println("El alumno esta aprobao " + Media);

        }else {
            System.out.println("El alumno no esta aprobao " + Media);



        }



    }
}