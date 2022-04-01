public class Main {
	public static void main(String[] args) {
		String[] cars = {"car1"};
		String[] car = new String[4];
		car[1]="telsa";
		car[0] ="Bmw";
		car[2]="Hondar";
		car[3]="Probox";
		for(int i =0;i<car.length;i++){
			System.out.println(car[i]);
		}
		String [][] cake = new String[3][3];
		for(int j =0;j<3;j++){
				for(int x =0;x<3;x++){
						cake[j][x]="cake";
					}	
			}
		System.out.println(cake[0][1]);
	}
}