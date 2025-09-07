package comportamiento.factorymethod.sistemanotificaciones;

public class NotificacionSMS implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación por SMS: " + mensaje);
    }
}
