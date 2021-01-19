package services;
import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;
import java.time.LocalDate;
// Type your code
public class FareCalculator extends Booking{
	public double book(Hotel hotel) {
		double a=0;
		if(hotel.getFromdate().isBefore(hotel.getTodate())){
			a=super.booking(hotel.getNoOfPersons(),hotel.getRates());
		}
		return a;
	}
	public double book(Flight flight) {
		double a=0;
		if(!flight.getTriptype().equals("one-way")) {
			if(flight.getFrom().isBefore(flight.getTo())) {
				a=super.booking(flight.getNoOfPersons(), flight.getRates());
			}
		}
		else {
			a=super.booking(flight.getNoOfPersons(), flight.getRates());
		}
		return a;
	}
	public double book(Train train) {
		return super.booking(train.getNoOfPersons(), train.getRates());
	}
	public double book(Bus bus) {
		return super.booking(bus.getNoOfPersons(), bus.getRates());
	}
}