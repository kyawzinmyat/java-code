public class PhoneFactory {
	public Android create (char c){
			if(c == 'S'){
					return new Samsung();
				}	
			else if(c == 'A'){
					return new Asus();
				}
			return null;			
		}
}