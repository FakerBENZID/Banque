	import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interfaces extends Remote {

    double readSolde()throws RemoteException;
    String crediteur(double y)throws RemoteException;
    String debiteur(double deb)throws RemoteException;
}
