package soap.designpattern;

public class SoapBathCommand implements Command{
   Soap soap;
   public SoapBathCommand(Soap soap)
   {
	   this.soap = soap;
   }
   @Override
   public void execute() {
	  soap.bath();
   }
}
