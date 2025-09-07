package others.Polimorfismo;

import java.util.List;

public class SendAir implements SendService {

    @Override
    public List<Send> listSend() {
        System.out.println("Enviando orden por aire");
        return null;
    }
}
