package creacionales.factorymethod.sistemanotificaciones;

public class principal {

    public static void main(String[] args) {
        NotificacionFactory factory;
        Notificacion notificacion;

        System.out.println("este es un cambio desde la rama dev1");

        // Crear una notificación por Email
        factory = new EmailFactory();
        factory.enviarNotificacion("Hola, este es un mensaje de notificación por Email.");

        // Crear una notificación por SMS
        factory = new SmsFactory();
        factory.enviarNotificacion("Hola, este es un mensaje de notificación por SMS.");

        // Crear una notificación Push
        factory = new PushFactory();
        factory.enviarNotificacion("Hola, este es un mensaje de notificación Push.");

        factory = new FactoryWhatsApp();
        factory.enviarNotificacion("Hola, este es un mensaje de notificación por WhatsApp.");

        System.out.println("haciendo un cambio desde dev2");

        System.out.println("mensaje desde github1");

        System.out.println("mensaje desde github2");

        System.out.println("cambio de rama dev1 local");
    }
}
