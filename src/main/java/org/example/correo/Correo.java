package org.example.correo;

public class Correo {
    private String remitente;
    private String destinatario;
    private String asunto;
    private String mensaje;

    public Correo() {
    }

    public Correo(String remitente, String destinatario, String asunto, String mensaje) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public void mostrarInformacion() {
        String res = "Correo{" +
                "remitente='" + remitente + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", asunto='" + asunto + '\'' +
                ", mensaje='" + mensaje + '\'' +
                '}';
        System.out.println(res);

    }
}
