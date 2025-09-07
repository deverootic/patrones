package comportamiento.factorymethod.sistemanotificaciones;

public class NotificacionPush implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación por Push: " + mensaje);
    }
}
