package Object_Oriented_Concept;

import java.util.Stack;

public class Document {
	private String text;

	public Document(String textDoc)
	{
		setText(textDoc);
	}
	public void setText(String newTextDoc) 
	{
		text = newTextDoc;
	}
	public String toString()
	{
		return text;
	}
	public class Email extends Document 
	{
		private String sender;
		private String recipient;
		private String title;

		public Email(String textDoc, String senderMsg, String recipientMsg, String titleMsg) 
		{

			super(textDoc);
			sender = senderMsg;
			recipient = recipientMsg;
			title = titleMsg;
		}

		public String getSender()
		{
			return sender;
		}

		public String getRecipient() 
		{
			return recipient;
		}

		public String getTitle() 
		{
			return title;
		}

		public String gettext()
		{
			return super.toString();
		}

		public void setSender(String newSenderMsg)
		{
			sender = newSenderMsg;
		}

		public void setRecipient(String newRecMsg)
		{
			recipient = newRecMsg;
		}

		public void setTitle(String newTitleMsg) 
		{
			title = newTitleMsg;
		}

		public String toString() 
		{
			return "From: " + sender + "\nTo: " + recipient + "\n" + title + "\n\n" + super.toString();

		}
	}
	public static void main(String args[]) 
	{
		String sample1 = "The childrens playing cricket" + " were extremely noisy.";
		String sample2 = "The lion stared at the dog " + "across the street.";
		Document d= new Document(sample1);
		Email e=d.new Email(sample1,"abc","cds","def");
		String k=e.toString();
		System.out.println(k);
	
	}
}
