public enum TipoEnum {
    RETTANGOLO("rettangolo"),
    TRIANGOLO("triangolo");

    private String tipo;
    TipoEnum(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}


