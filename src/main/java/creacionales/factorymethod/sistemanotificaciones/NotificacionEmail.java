package creacionales.factorymethod.sistemanotificaciones;

public class NotificacionEmail implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación por Email: " + mensaje);
    }
}
