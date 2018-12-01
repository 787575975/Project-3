package Keywords;

public class TestDriveway {

		public static void main(String[] args ){
		Driveway tofael = new Driveway(); 
		tofael.setDriveWaySize(6);
		System.out.println("tofael's drive way size:" + tofael.getDriveWaySize());
				
		Driveway arif = new Driveway();
		arif.setDriveWaySize(7);
		System.out.println("Arif's drive way size:" + arif .getDriveWaySize());
		
		System.out.println("Tofael's drive way size" + tofael.getDriveWaySize());
		int totalsize = tofael.getDriveWaySize() + arif.getDriveWaySize();
		System.out.println(totalsize);
		
		Driveway.buildDriveWay();

}
		
}