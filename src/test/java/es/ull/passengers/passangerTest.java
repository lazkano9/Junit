package es.ull.passengers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ull.flights.Flight;

class passangerTest {
	
	private Flight f1;
	private Flight f2;
	private Passenger joane;
	private Passenger olatz;

	@BeforeEach
	void setUp() {
		f1 = new Flight("VF", 10);
		f2 = new Flight("VF", 0);
		joane = new Passenger("id1", "joane", "ES");
		olatz = new Passenger("id2", "olatz", "ES");
		joane.setFlight(f1);
	}
	
	
	
	@Test
	void test() {

		assertAll("Kaixo hau proba bat da",
				() -> assertEquals("id1", joane.getIdentifier()),
				() -> assertEquals("joane", joane.getName())

				
				);
	
	}

}
