package org.mogul.behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        ChatUser mogul = new ChatUser("Mogul", mediator);
        ChatUser soma = new ChatUser("Soma", mediator);
        ChatUser eli = new ChatUser("Eli", mediator);

        mediator.addUser(eli).addUser(mogul).addUser(soma);

        soma.sendMessage("Hola ¬¬");

    }
}
