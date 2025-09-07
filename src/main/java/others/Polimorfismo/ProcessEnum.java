package others.Polimorfismo;

public enum ProcessEnum {


    AIR(1,"Air"),
    EARTH(2,"Earth");

    private Integer code;
    private String process;

    ProcessEnum(Integer code, String process) {
        this.code = code;
        this.process = process;
    }

    public Integer getCode() {
        return code;
    }

    public String getProcess() {
        return process;
    }

    public static ProcessEnum getProcessEnumByCode(Integer code) {
        for (ProcessEnum processEnum : ProcessEnum.values()) {
            if (processEnum.getCode().equals(code)) {
                return processEnum;
            }
        }
        return null; // o lanzar una excepción si el código no es válido
    }

}
