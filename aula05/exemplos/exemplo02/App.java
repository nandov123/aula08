package aula05.exemplos.exemplo02;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<User> lista = new ArrayList<>();


        User user1 = new User("usuário1","usuário1@gmail.com");
        User user2 = new User("usuário2","usuário2@gmail.com");
        User user3 = new User("usuário3","usuário3@gmail.com");

        lista.add(user1);
        lista.add(user2);
        lista.add(user3);

        for (User user : lista) {
            System.out.println(user.getNome() + "-" + user.getEmail());            
        }
        //System.out.println(lista);
        


    }
}
