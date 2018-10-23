package pizzas.tp_poo;

import java.util.List;

public class ClientDAO {
	private List<Client> listClient = null;
	public List<Client> findAllClients() {
		for (int i = 0; i < listClient.size(); i++) {
			Client client = listClient.get(i);
			System.out.println(client);
		}
		return listClient;
	}
}
