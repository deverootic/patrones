package creacionales.factorymethod.sistemanotificaciones;

public class SmsFactory extends NotificacionFactory {

    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionSMS();
    }
}
