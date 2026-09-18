public class Procedimento {
    protected String data;
    protected String descritivo;

    public Procedimento() {}

    public Procedimento(String data, String descritivo) {
        setData(data);
        setDescritivo(descritivo);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (data == null || data.trim().isEmpty()) {
            this.data = "01/01/2024";
        } else if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.data = "01/01/2024";
        } else {
            this.data = data;
        }
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        if (descritivo == null || descritivo.trim().isEmpty()) {
            this.descritivo = "Procedimento não especificado";
        } else {
            this.descritivo = descritivo.trim();
        }
    }

    public void consultar() {
        System.out.println("Consultando procedimento: " + descritivo + " em " + data);
    }

    public void mostrar() {
        System.out.println(getClass().getSimpleName()
                + " [data=" + data + ", descritivo=" + descritivo + "]");
    }
}