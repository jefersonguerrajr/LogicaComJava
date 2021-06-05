package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class FormatandoDatas {

	public static void main(String[] args) throws ParseException {

		// criando o "Molde" para as datas
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // sigla para o mes e a hora em maiusculo
		// cria uma data
		Date y1 = sdf1.parse("04/06/2021");
		// cria uma data com horario
		Date y2 = sdf2.parse("25/06/2018 15:00:01");

		System.out.println(y1 + " Sem formato");
		System.out.println(y2 + " Sem formato + Horário");

		System.out.println(sdf1.format(y1) + " Formatado");
		System.out.println(sdf2.format(y2) + " Formatado com horario");

		//Recebe a data atual do sistema
		Date x1 = new Date();
		System.out.println(sdf2.format(x1) + " Data atual do sistema");
		//Recebe a data atual em milisegundos
		Date x2 = new Date(System.currentTimeMillis());
		System.out.println(sdf2.format(x2) + " Data em milisegundos");

		System.out.println(System.currentTimeMillis() + " Tempo agora em Milisegundos desde 1970");
		
		Date x21 = new Date(Long.MAX_VALUE);
		System.out.println(sdf2.format(x21) + " Passando Long.MAX_VALUE");

		Date x3 = new Date(0L);
		System.out.println(sdf2.format(x3) + " Inicio da contagem da data em GMT"); // No Brasil o horário é GMT-3

		Date x4 = new Date(1000L * 60L * 60L * 5L);
		System.out.println(sdf2.format(x4) + " Acrescentando +5 horas ao horario Default");

		// padrão ISO8671 e classe instant
		// horario GMT
		Date x5 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		// Converte automaticamente para o timezone configurado na maquina, no caso
		// GMT-3
		System.out.println(sdf2.format(x5));
		sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(sdf2.format(x5)); // imprime agora no horario GMT0

	}

}
