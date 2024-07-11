import java.time.OffsetDateTime;

public class Evento {
    private String nome;
    private String luogo;
    private String descrizione;
    OffsetDateTime data;

    public Evento(String nome, String luogo, String descrizione, OffsetDateTime data) {
        this.nome = nome;
        this.luogo = luogo;
        this.descrizione = descrizione;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public OffsetDateTime getData() {
        return data;
    }

    public void setData(OffsetDateTime data) {
        this.data = data;
    }
}


