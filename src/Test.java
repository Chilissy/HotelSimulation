import model.Reservation;
import model.Room;

import java.time.LocalDate;

public class Test
{
	public static void main(String args[])
	{
		System.out.println("Test");
		System.out.println("axaxa");

		Room room = new Room(100, 1, 2, 3);

		Reservation reservation = new Reservation(room, LocalDate.now(), LocalDate.now().plusDays(2));
	}

}
