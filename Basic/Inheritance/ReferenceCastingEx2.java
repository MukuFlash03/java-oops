package Java.Basic.Inheritance;

public class ReferenceCastingEx2 {
public static void main(String[] args) {
	notification(new TextMessage());
	System.out.println("-------------");
	notification(new Gmail());
	System.out.println("------------");
	notification(new WhatsApp());
    System.out.println("------------\n");
}

static void notification(Message msg) {
	msg.newMsgReceived();
	//i shud do typecast if i receive only whatsApp obj
	if(msg instanceof WhatsApp) {
			WhatsApp whatsapp=(WhatsApp)msg;
			whatsapp.viewStatus();
	}
    if(msg instanceof Gmail) {
        Gmail gmail=(Gmail)msg;
        gmail.viewInbox();
}
}
}
class Message{
	void newMsgReceived() {
		System.out.println("U hv a msg");
	}
}
class TextMessage extends Message{
	
}
class Gmail extends Message{
	void newMsgReceived() {
		System.out.println("U hv a mail");
	}

    void viewInbox() {
        System.out.println("Checking Inbox...");
    }
}
class WhatsApp extends Message{
	void newMsgReceived() {
		System.out.println("U hv a WhatsApp msg");
	}
	
	void viewStatus() {
		System.out.println("Viewing Whats App status");
	}
}