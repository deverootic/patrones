package creacionales.factorymethod.sistemanotificaciones;

public class FactoryWhatsApp extends NotificacionFactory {

    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionWhatsApp();
    }
}
