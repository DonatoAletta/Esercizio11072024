import java.time.OffsetDateTime;

public class Main {

    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.now();
        CalendarioInternazionale calendarioInternazionale = new CalendarioInternazionale();


        Evento evento = new Evento("Compleanno", "Cagliari", "Festa bella", data);
        Evento evento1 = new Evento("Compleanno", "Cagliari", "Festa bella", data);

        try{
            calendarioInternazionale.aggiungiEvento(evento);
            calendarioInternazionale.aggiungiEvento(evento);
        }catch (EventoDuplicatoException ede){
            System.out.println(ede.getMessage());
        }

        System.out.println(calendarioInternazionale.trovaEventoPerLuogo("Cagliari"));


    }
}