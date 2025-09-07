package comportamiento.factorymethod.sistemanotificaciones;

public class principal {

    public static void main(String[] args) {
        NotificacionFactory factory;
        Notificacion notificacion;

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
    }
}
