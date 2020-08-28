package otpretrieved;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

public class GetOTP {

	public static String OutlookMailReader(String mailFolderName, String emailSubjectContent, String emailContent,
			int lengthOfOTP) {

		//imap-mail.outlook.com
		String host = "imap.gmail.com";// change it according to your mail
		String port = "993";

		String username = "uchandrakar143@gmail.com";// username

		String password = "Ullas15@";

		int messageCount;

		int unreadMsgCount;

		String emailSubject;

		Message emailMessage;

		// URLName url = new URLName("imaps", "imap.gmail.com", 993, mailFolderName,
		// username, password);
		String searchText = null;
//Class.forName("com.sun.net.ssl.internal.ssl.Provider");

		// Security.addProvider();

		Properties gmailProperties = new Properties();
		gmailProperties.put("mail.imap.starttls.enable", "true");
		gmailProperties.put("mail.imap.auth", "true");
		gmailProperties.put("mail.imap.host", host);
		gmailProperties.put("mail.imap.port", port);
		gmailProperties.put("mail.imap.ssl.trust", "*");
		gmailProperties.put("mail.imap.socketFactory.port", 993);
		gmailProperties.put("mail.imap.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		gmailProperties.put("mail.imap.socketFactory.fallback", "false");
		Session session = Session.getDefaultInstance(gmailProperties, null);

		// Session session = Session.getDefaultInstance(gmailProperties);

		try {

			// Session session = Session.getDefaultInstance(sysProps,null);

			Store store = session.getStore("imap");

			store.connect(host, username, password);

			Folder emailBox = store.getFolder(mailFolderName);

			emailBox.open(Folder.READ_WRITE);

			messageCount = emailBox.getMessageCount();

			System.out.println("Total Message Count: " + messageCount);

			unreadMsgCount = emailBox.getUnreadMessageCount();

			System.out.println("Unread Emails count:" + unreadMsgCount);

			for (int i = messageCount; i > (messageCount - unreadMsgCount); i--)

			{

				emailMessage = emailBox.getMessage(i);

				emailSubject = emailMessage.getSubject();

				if (emailSubject.contains(emailSubjectContent))

				{

					System.out.println("OTP mail found");

					String line;

					StringBuffer buffer = new StringBuffer();

					BufferedReader reader = new BufferedReader(new InputStreamReader(emailMessage.getInputStream()));

					while ((line = reader.readLine()) != null) {

						buffer.append(line);

					}

					String messageContent = emailContent;

					String result = buffer.toString().substring(buffer.toString().indexOf(messageContent));

					searchText = result.replaceAll("[^\\d]", "");

					System.out.println("Text found : " + searchText);

					emailMessage.setFlag(Flags.Flag.SEEN, true);

					break;

				}

				emailMessage.setFlag(Flags.Flag.SEEN, true);

			}

			emailBox.close(true);

			store.close();

		} catch (Exception mex) {

			mex.printStackTrace();

			System.out.println("OTP Not found ");

		}

		return searchText;

	}
}
