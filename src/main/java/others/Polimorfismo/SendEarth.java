package others.Polimorfismo;

import java.util.List;

public class SendEarth implements SendService {

    @Override
    public List<Send> listSend() {
        System.out.println("Enviando orden por tierra");
        return null;
    }
}
