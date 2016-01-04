public class KirkmanWeek{
	private KirkmanDay[] week = new KirkmanDay[7];

	week[0] = KirkmanDay(KirkmanRow(1,2,3), KirkmanRow(4,5,6), KirkmanRow(7,8,9), KirkmanRow(10,11,12), KirkmanRow(13,14,15));

	week[1] = week[0];

	public void abc(int day){
		if(!(week[day].abc())){
			week[day]
			week[day].setRow(0, 1, 2);
			week[day].setRow(0, 2, 3);
		}
			
	}

	
	
}