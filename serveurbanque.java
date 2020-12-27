import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}
    private double solde;

    public String debiteur(double deb){
        if (solde==0)
        {
            return "solde + ";
        }
        else {
            solde-=deb;
            return "solde -";
        }
    }
    public String crediteur (double y) {
        solde+=y;
        return "solde +";
    }
    public double readSolde()
    {
        return solde;
    }
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server serveur= new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", serveur);
    }