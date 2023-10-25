package org.mogul.behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        ChatUser eli = new ChatUser("Eli", mediator);
        ChatUser mogul = new ChatUser("Mogul", mediator);
        ChatUser soma = new ChatUser("Soma", mediator);

        mediator.addUser(eli).addUser(mogul).addUser(soma);

        soma.sendMessage("Hola ¬¬");

    }
}
