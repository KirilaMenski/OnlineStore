package by.ansgar.store.command;

import javax.servlet.http.HttpServletRequest;

public class CommandFactory {
	
	private static final String COMMAND = "command";
	public static Command defineCommand(HttpServletRequest request){
		
		String commandName = request.getParameter(COMMAND);
		CommandEnum commandEnum = CommandEnum.valueOf(commandName.toUpperCase());
		Command currentCommand = commandEnum.getCurrentCommand();
		
		return currentCommand;
	}
	
}
