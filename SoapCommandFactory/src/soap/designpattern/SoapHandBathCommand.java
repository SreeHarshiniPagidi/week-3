package soap.designpattern;

public class SoapHandBathCommand implements Command{
	Soap soap;
	   public SoapHandBathCommand(Soap soap)
	   {
		   this.soap = soap;
	   }
	   @Override
	   public void execute() {
		  soap.handBath();
	   }
}
