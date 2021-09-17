package soap.designpattern;

public class SoapShowerBathCommand implements Command{
	   Soap soap;
	   public SoapShowerBathCommand(Soap soap)
	   {
		   this.soap = soap;
	   }
	   @Override
	   public void execute() {
		  soap.handBath();
	   }
}
