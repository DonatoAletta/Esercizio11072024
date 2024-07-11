import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import static org.junit.Assert.assertEquals;

public class CalendarioInternazionaleTest {

	CalendarioInternazionale testing = new CalendarioInternazionale();

	@Test
	public void testAggiungiEvento() throws EventoDuplicatoException{

		Evento evento1 = new Evento("Festa", "Casa", "Festa", OffsetDateTime.now()) ;
		testing.aggiungiEvento(evento1);

		assertEquals(1, testing.listaEventi.size());

	}

	@Test
	public void testTrovaEventiInIntervallo() throws EventoDuplicatoException {
		OffsetDateTime start =  OffsetDateTime.of(2025,01, 15, 12, 15 ,00,00, ZoneOffset.UTC);
		OffsetDateTime end =  OffsetDateTime.of(2025,01, 15, 12, 15 ,00,00, ZoneOffset.UTC);

		Evento evento1 = new Evento("Festa", "Casa", "Festa", OffsetDateTime.now());
		Evento evento2 = new Evento("Compleanno", "Casa", "Party", OffsetDateTime.of(2025,01, 15, 12, 15 ,00,00, ZoneOffset.UTC));
		testing.aggiungiEvento(evento1);
		testing.aggiungiEvento(evento2);

		assertEquals(1, testing.trovaEventiInIntervallo(start, end).size());
	}

}
