
public class practica {

    public static void main(String[] args) {
        int mat = 3;
        int qui = 4;
        int bio = 7;
        int promedio = 0;

        promedio = ( mat + qui + bio )/3;

        if (promedio >= 6) {
            System.out.println("aprobó" + promedio );
            
        } else{
            System.out.println(" NO aprobó" + promedio );
        }
    }
}
