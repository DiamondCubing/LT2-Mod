package diamondgaming.lt2.handler;

import diamondgaming.lt2.init.BlockInit;

public class RegistryHandler {
	
	public static void Client() {
		
		
		
	}
	
	public static void Common() {
		
		BlockInit.init();
		BlockInit.register();
		BlockInit.registerRenders();
		
	}

}
