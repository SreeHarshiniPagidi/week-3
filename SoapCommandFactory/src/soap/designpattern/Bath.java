package soap.designpattern;

public class Bath {
   Command command;
   public void setCommand(Command command)
   {
	   this.command=command;
   }
   public void takeBath()
   {
	   command.execute();
   }
}
