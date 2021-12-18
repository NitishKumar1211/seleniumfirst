package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	@Test (priority=-1)
		public void calls() {
		Reporter.log("calls,true");
	}
	@Test (priority=1)
	public void chats() {
	Reporter.log("chats,true");
}
	@Test (priority=1)
	public void status() {
	Reporter.log("status,true");
}


}
