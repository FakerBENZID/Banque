import java.rmi.Naming;


public class ClientBanque {

    public static void main(String[] args) {
        try {
            interfaces service = (interfaces) Naming.lookup("rmi://127.0.0.1:1250/serveur");
            service1.debiteur(456);

service.crediteur(9050);
            
            System.out.println(service.readSolde());

        } catch (Exception er) {

            System.out.println(er.toString());
            System.out.println("failed");
        }
    }

}
