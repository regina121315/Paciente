import java.util.Scanner;
 class MainPaciente {
    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);
        String c, a;
        int b;
       

        Paciente x = new Paciente();

        System.out.println("tu nombre es ");
        a = op.next();
        x.nombre = a;
        System.out.println("tu apellido es ");
        c= op.next();
        x.apellido = c;
        System.out.println("cual es tu nss");
        b = op.nextInt();
        x.Nss = b;
            x.mostrarNombre();
            x.mostrarNss();
}
 }