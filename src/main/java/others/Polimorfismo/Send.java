package others.Polimorfismo;

public class Send {

    private Integer id;
    private String codeSend;
    private String codeCustomer;

    public Send() {
    }

    public Send(Integer id, String codeSend, String codeCustomer) {
        this.id = id;
        this.codeSend = codeSend;
        this.codeCustomer = codeCustomer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeSend() {
        return codeSend;
    }

    public void setCodeSend(String codeSend) {
        this.codeSend = codeSend;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }
}
