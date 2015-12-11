package by.ansgar.store.command;

import by.ansgar.store.command.impl.LogInCommand;
import by.ansgar.store.command.impl.LogOutCommand;
import by.ansgar.store.command.impl.MainPageCommand;
import by.ansgar.store.command.impl.ProductsPageCommand;
import by.ansgar.store.command.impl.ProfilePageCommand;
import by.ansgar.store.command.impl.RegistrationCommand;
import by.ansgar.store.command.impl.ViewProductPageCommand;

public enum CommandEnum {

	MAIN {
		{
			this.command = new MainPageCommand();
		}
	},

	PRODUCTS {
		{
			this.command = new ProductsPageCommand();
		}
	},
	VIEW_PRODUCT {
		{
			this.command = new ViewProductPageCommand();
		}
	},
	PROFILE {
		{
			this.command = new ProfilePageCommand();
		}
	},
	LOGIN {
		{
			this.command = new LogInCommand();
		}
	},
	LOGOUT {
		{
			this.command = new LogOutCommand();
		}
	},
	REGISTRATION {
		{
			this.command = new RegistrationCommand();
		}
	};

	public Command command;

	public Command getCurrentCommand() {
		return command;
	}

}
