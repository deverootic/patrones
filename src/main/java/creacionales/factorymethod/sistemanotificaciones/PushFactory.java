package creacionales.factorymethod.sistemanotificaciones;

public class PushFactory extends NotificacionFactory {

    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionPush();
    }
}
