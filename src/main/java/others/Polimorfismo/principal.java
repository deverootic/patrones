package others.Polimorfismo;

public class principal {

    public static void main(String[] args) {

        SendService sendService = null;
        String typeSend = "Aire";

        if (typeSend.equals("Tierra")) {
            sendService = new SendEarth();
        } else if (typeSend.equals("Aire")) {
            sendService = new SendAir();
        } else {
            System.out.println("No existe el tipo de envio");
        }

        if (sendService != null) {
            sendService.listSend();
        }
    }
}
