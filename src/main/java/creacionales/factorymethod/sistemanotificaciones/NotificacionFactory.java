package creacionales.factorymethod.sistemanotificaciones;

public abstract class NotificacionFactory {

    public abstract Notificacion crearNotificacion();

    //logica comun para todas las notificaciones
    public void enviarNotificacion(String mensaje) {
        Notificacion notificacion = crearNotificacion();
        notificacion.enviar(mensaje);
    }
}
