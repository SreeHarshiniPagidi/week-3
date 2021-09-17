package soap.designpattern;

public class CommandDesignTest {

	public static void main(String[] args) {
		Bath bath=new Bath();
		Soap soap=new Soap();
		bath.setCommand(new SoapBathCommand(soap));
		bath.takeBath();
		
		bath.setCommand(new SoapHandBathCommand(soap));
		bath.takeBath();
		
		bath.setCommand(new SoapShowerBathCommand(soap));
		bath.takeBath();

	}

}
