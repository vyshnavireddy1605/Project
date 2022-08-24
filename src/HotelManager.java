
public class HotelManager 
{
	private Hotels TajFalakumaPalace;
	private Hotels FourSeasonsHotel;
	public HotelManager()
	{
		TajFalakumaPalace=new TajFalakumaPalace();
		FourSeasonsHotel=new FourSeasonsHotel();
}
	public void TajFalakumaPalace()
	{
		TajFalakumaPalace.Hotelname();
		TajFalakumaPalace.Rooms();
		TajFalakumaPalace.Price();
	}
	public void FourSeasonsHotel()
	{
		FourSeasonsHotel.Hotelname();
		FourSeasonsHotel.Rooms();
		FourSeasonsHotel.Price();
	}
}