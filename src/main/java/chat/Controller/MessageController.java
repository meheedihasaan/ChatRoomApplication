package chat.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import chat.model.Message;

@RestController
public class MessageController {

	public Message getContent(@RequestBody Message message) {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		return message;
	}
	
}
