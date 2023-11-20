package com.telran.org.homeworktwelve;

import java.util.List;
import java.util.Map;

public class StorageApp {
    public static void main(String[] args) {

        Storage storage = new Storage();

        User user1 = new User("User1");
        UserRequest request1 = new UserRequest(Ansver.APPROVED, "www.de.de");
        storage.addUserRequest(user1, request1);
        UserRequest request2 = new UserRequest(Ansver.ERROR, "www.ebay.blabla");
        storage.addUserRequest(user1, request2);

        User user2 = new User("User2");
        UserRequest request3 = new UserRequest(Ansver.DENIED, "www.ebay.de");
        storage.addUserRequest(user2, request3);
        UserRequest request4 = new UserRequest(Ansver.DENIED, "www.amazon.de");
        storage.addUserRequest(user2, request4);

        User user3 = new User("User3");
        UserRequest request5 = new UserRequest(Ansver.APPROVED, "www.carfax.com");
        storage.addUserRequest(user3, request5);
        UserRequest request6 = new UserRequest(Ansver.ERROR, "www.auto.ru");
        storage.addUserRequest(user3, request6);
        UserRequest request7 = new UserRequest(Ansver.DENIED, "www.av.by");
        storage.addUserRequest(user3, request7);

        User user4 = new User("User4");
        UserRequest request8 = new UserRequest(Ansver.APPROVED, "www.netflix.com");
        storage.addUserRequest(user4, request8);
        UserRequest request9 = new UserRequest(Ansver.ERROR, "www.canada.kz");
        storage.addUserRequest(user4, request9);

        Map<User, List<UserRequest>> data = storage.getData();

        for (Map.Entry<User, List<UserRequest>> entry : data.entrySet()){
            User user = entry.getKey();
            System.out.println("User: " + user.getUserName());
            List<UserRequest> requests = entry.getValue();
            for (UserRequest request : requests){
                System.out.println("Ansver: " + request.getAnsver());
                System.out.println("Address: " + request.getAddress());
            }
        }
    }
}
// Работает не корректно, но не могу понять почему. Цикл добавления в классе Storage вроде бы описан
//описан правильно, но почему то не добавляет все действия
// руки опустились... Спасибо вам за подсказку