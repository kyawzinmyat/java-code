package Cs;

public class CustomerService {
	private String name;
	private String url;
	
	public String getName(){
			return this.name;
		}
	
	public void setName(String newName){
			this.name = newName;
		}
	
	public void setUrl(String newUrl){
			this.url = newUrl;
		}
		
	public void printUrl(){
			System.out.println("The url is "+this.url);
		}
	
	public void myInit(){
			System.out.println("Initilized by framework");
		}
	
	
}