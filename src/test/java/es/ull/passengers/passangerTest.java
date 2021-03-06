package es.ull.passengers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import es.ull.flights.Flight;

class passangerTest {
	
	private Flight f1;
	private Flight f2;
	private Passenger julen;
	private Passenger olatz;
	private Passenger miren;

	@BeforeEach
	void setUp() {
		f1 = new Flight("VF", 10);
		f2 = new Flight("VF", 0);
		julen = new Passenger("id1", "julen", "ES");
		olatz = new Passenger("id2", "olatz", "ES");
		miren = new Passenger("id3", "miren", "ES");
	}
	
	
	
	@Test
	void test() {

		assertAll("Kaixo hau proba bat da",
				() -> assertEquals("id1", julen.getIdentifier()),
				() -> assertEquals("julen", julen.getName())

				
				);	
	}
	
	
	@Test
	@DisplayName("Kaixo hau bigarren proba da")
	void test2() {
		assertAll("Hau akatsak ikusteko proba da",
				() -> assertThrows(RuntimeException.class,
						() -> {julen.joinFlight(f2);
						})
				);
				
	}
	

}
