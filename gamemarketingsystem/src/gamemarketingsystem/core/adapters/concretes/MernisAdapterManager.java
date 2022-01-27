package gamemarketingsystem.core.adapters.concretes;

import java.rmi.RemoteException;

import gamemarketingsystem.core.adapters.abstracts.MernisAdapterService;
import gamemarketingsystem.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapterManager implements MernisAdapterService{

	@SuppressWarnings("deprecation")
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalIdentity()).longValue(),
					customer.getFirstName().toUpperCase() ,
					customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			
			return false;
		}
	}
}
