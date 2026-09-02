package app.domain;

public enum DocumentTypeEnum {
    CEDULA("Cedula de Ciudadania"),
    PASAPORTE("Pasaporte"),
    CEDULA_EXTRANJERIA("Cedula de Extranjeria"),
    NIT("NIT");

    private final String value;

    DocumentTypeEnum(String value) {
    this.value = value;
    }
    public String getValue() {
        return value;
    }
}