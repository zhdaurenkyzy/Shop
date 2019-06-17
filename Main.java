package com.company;

import com.company.Store.CashBox;
import com.company.Store.Shop;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();
        CashBox cashBox = new CashBox();

        Client client1 = new Client("John");
        Client client2 = new Client("Alice");
        Client client3 = new Client("Peter");

        cashBox.registerProducts(client1, shop.getProductsList(1), 2);
        cashBox.registerProducts(client3, shop.getProductsList(2), 5);
        cashBox.registerProducts(client2, shop.getProductsList(1), 4);

        System.out.println("Кто в очереди у кассы?");
        cashBox.getQueue();
                
        System.out.println("Вбиваем чек");
        cashBox.getCheckListToClient();
       
        System.out.println("Кто следующий?");
        cashBox.getQueue();
        
        System.out.println("Пришел следующий покупатель");
        Client client4 = new Client("Michael");
        cashBox.registerProducts(client4, shop.getProductsList(1), 4);
        
        System.out.println("Пришел снова первый покупатель");
        cashBox.registerProducts(client1, shop.getProductsList(1), 2);
       
        System.out.println("Кто в очереди у кассы?");
        cashBox.getQueue();

        System.out.println("Вбиваем чек");
        cashBox.getCheckListToClient();
       
        System.out.println("Кто остался теперь в очереди?");
        cashBox.getQueue();
        
        System.out.println("Список покупателей, приобретенные товары и количество.");
        for(int i=0; i<cashBox.getClientsArrayList().size(); i++){
            cashBox.getClientsList(i).getProductsAndCountFromBasket();
        }
    }
}
