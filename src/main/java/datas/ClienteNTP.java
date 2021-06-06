/**
 * 
 */
package datas;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;
import org.apache.commons.net.ntp.TimeStamp;

/**
 * @author Jeferson
 *
 */
public class ClienteNTP {
	
	/*
	 * Recebe o horário de um servidor NTP
	 * 
	 */

	public static void main(String[] args) {
		NTPUDPClient timeClient = new NTPUDPClient();
		
		// https://ntp.br/
		String timeServerUrl = "a.st1.ntp.br";
		
		try {
			//Traduz o nome em endereco de IP
			InetAddress timeServerAddress = InetAddress.getByName(timeServerUrl);
			
			//Recebe o endereco do servidor, recupera as informações e as retorna
			TimeInfo timeInfo = timeClient.getTime(timeServerAddress);
			
			//pacote de mensagem NTP
			TimeStamp timeStamp = timeInfo.getMessage().getTransmitTimeStamp();
			
			//Formata a data
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
			System.out.println(dateFormat.format(timeStamp.getDate()));
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
