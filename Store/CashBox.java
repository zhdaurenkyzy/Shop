package com.company.Store;

import com.company.Client;
import java.util.*;

public class CashBox {

    private ArrayList<Client> clientsList = new ArrayList<>();
    private Queue<Client> queue = new LinkedList<>();
    
    public Client getClientsList(int i) {
        return clientsList.get(i);
    }

    public ArrayList<Client> getClientsArrayList() {
        return clientsList;
    }

    public void getQueue() {
        for (Client client : queue)
            System.out.println(client.getName());
    }

    public void registerProducts(Client client, Products products, Integer count) {
        queue.add(client);
        if (!client.getBasket().containsKey(products))
            client.getBasket().put(products, 0);
        Integer firstCount = client.getBasket().get(products);
        client.getBasket().put(products, firstCount + count);
    }

    public void getCheckListToClient() {
        try {
            clientsList.add(queue.remove());

        } catch (NoSuchElementException e) {
            System.out.println("В очереди нет покупателей! Ждите прихода новых покупателей.");
        }
    }
}
