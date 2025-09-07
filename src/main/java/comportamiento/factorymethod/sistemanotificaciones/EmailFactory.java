package comportamiento.factorymethod.sistemanotificaciones;

public class EmailFactory extends NotificacionFactory {

    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionEmail();
    }
}
