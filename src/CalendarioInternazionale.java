import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CalendarioInternazionale {

    //Evento duplicato exception
    List<Evento> listaEventi;

    public CalendarioInternazionale(){
        this.listaEventi = new ArrayList<>();
    }


    public void aggiungiEvento(Evento evento) throws EventoDuplicatoException{
        if(listaEventi.contains(evento)){
            throw new EventoDuplicatoException("L'evento è già esistente");
        }

        listaEventi.add(evento);

    }

    public void rimuoviEvento(Evento evento)throws EventoDuplicatoException{

        boolean exist = listaEventi.removeIf( p -> p.getNome().equals(evento.getNome()));
        if(!exist){
            throw new EventoDuplicatoException("L'evento non esiste");
        }
    }

    public List<Evento> trovaEventoPerLuogo(String luogo){
        return listaEventi.stream().filter( p -> p.getLuogo().equals(luogo)).toList();
    }

    public List<Evento> riordinaPerData(){
        listaEventi.sort(Comparator.comparing( l -> l.data));
        return listaEventi;
    }
}
