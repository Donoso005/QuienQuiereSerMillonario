import java.util.ArrayList;
import java.util.HashMap;

public class MainApp {

	public static void main(String[] args) {
		HashMap<Integer, Pregunta> preguntas = new HashMap<>();
		Integer[] preguntasSeleccionadas = new Integer[15];
		
		añadirPreguntasGenerales(preguntas);
		seleccionarPreguntas(preguntas, preguntasSeleccionadas);
	}
	
	public static void seleccionarPreguntas(HashMap<Integer, Pregunta> preguntas, Integer[] preguntasSeleccionadas) {
		ArrayList<Integer> tipoPreguntas = new ArrayList<>();
		int contador = 0, numero;
		boolean contiene = false;
		
		// Obtener Preguntas Faciles
		do {
			
		}while(contador != 5);
	}
	
	public static void añadirPreguntasGenerales(HashMap<Integer, Pregunta> preguntas) {
        preguntas.put(1, new Pregunta("¿Cuál es el río más largo del mundo?", new String[]{"Nilo", "Mississippi", "Yangtsé", "Amazonas"}, 3, "M"));
        preguntas.put(2, new Pregunta("¿Quién escribió 'Don Quijote de la Mancha'?", new String[]{"García Márquez", "Borges", "Shakespeare", "Cervantes"}, 4, "F"));
        preguntas.put(3, new Pregunta("¿Cuál es el elemento químico más abundante en la Tierra?", new String[]{"Hierro", "Hidrógeno", "Carbono", "Oxígeno"}, 4, "F"));
        preguntas.put(4, new Pregunta("¿Cuál es el animal más grande del planeta Tierra?", new String[]{"Elefante", "Jirafa", "Tiburón ballena", "Ballena azul"}, 4, "D"));
        preguntas.put(5, new Pregunta("¿Cuál es la capital de Australia?", new String[]{"Melbourne", "Sídney", "Brisbane", "Canberra"}, 4, "M"));
        preguntas.put(6, new Pregunta("¿Qué famoso pintor cortó parte de su oreja?", new String[]{"Picasso", "Dalí", "Michelangelo", "Van Gogh"}, 4, "F"));
        preguntas.put(7, new Pregunta("¿Qué país tiene forma de bota?", new String[]{"España", "Grecia", "Portugal", "Italia"}, 4, "M"));
        preguntas.put(8, new Pregunta("¿Quién fue el primer presidente de los Estados Unidos?", new String[]{"Abraham Lincoln", "Thomas Jefferson", "Benjamin Franklin", "George Washington"}, 4, "D"));
        preguntas.put(9, new Pregunta("¿Cuál es el metal más caro del mundo?", new String[]{"Oro", "Platino", "Diamante", "Rodio"}, 4, "F"));
        preguntas.put(10, new Pregunta("¿En qué año comenzó la Segunda Guerra Mundial?", new String[]{"1945", "1929", "1918", "1939"}, 4, "D"));
        preguntas.put(11, new Pregunta("¿Qué animal es el símbolo de la paz?", new String[]{"León", "Paloma", "Elefante", "Tortuga"}, 2, "M"));
        preguntas.put(12, new Pregunta("¿Cuál es el país más poblado del mundo?", new String[]{"India", "Estados Unidos", "China", "Brasil"}, 3, "F"));
        preguntas.put(13, new Pregunta("¿Cuál es el océano más grande del mundo?", new String[]{"Atlántico", "Índico", "Pacífico", "Ártico"}, 3, "M"));
        preguntas.put(14, new Pregunta("¿Quién pintó la Mona Lisa?", new String[]{"Botticelli", "Michelangelo", "Rafael", "Leonardo da Vinci"}, 4, "F"));
        preguntas.put(15, new Pregunta("¿Cuál es la montaña más alta del mundo?", new String[]{"Mont Blanc", "K2", "Kilimanjaro", "Everest"}, 4, "D"));
        preguntas.put(16, new Pregunta("¿Qué idioma se habla en Brasil?", new String[]{"Español", "Inglés", "Portugués", "Italiano"}, 3, "F"));
        preguntas.put(17, new Pregunta("¿Cuál es el país más grande del mundo en términos de área?", new String[]{"Canadá", "Estados Unidos", "China", "Rusia"}, 4, "M"));
        preguntas.put(18, new Pregunta("¿Quién fue el primer hombre en la Luna?", new String[]{"Neil Armstrong", "Buzz Aldrin", "Michael Collins", "Yuri Gagarin"}, 1, "D"));
        preguntas.put(19, new Pregunta("¿Cuál es la capital de Rusia?", new String[]{"San Petersburgo", "Kiev", "Moscú", "Minsk"}, 3, "F"));
        preguntas.put(20, new Pregunta("¿Qué famoso científico desarrolló la teoría de la relatividad?", new String[]{"Isaac Newton", "Galileo Galilei", "Albert Einstein", "Stephen Hawking"}, 3, "M"));
        preguntas.put(21, new Pregunta("¿Cuál es la capital de Francia?", new String[]{"Madrid", "Roma", "Berlín", "París"}, 4, "F"));
        preguntas.put(22, new Pregunta("¿Cuál es el hueso más largo del cuerpo humano?", new String[]{"Húmero", "Radio", "Tibia", "Fémur"}, 4, "M"));
        preguntas.put(23, new Pregunta("¿Qué gas necesitan las plantas para realizar la fotosíntesis?", new String[]{"Oxígeno", "Nitrógeno", "Dióxido de carbono (CO2)", "Metano"}, 3, "F"));
        preguntas.put(24, new Pregunta("¿Cuál es el animal más rápido del mundo?", new String[]{"Águila", "Leopardo", "Guepardo", "Antílope"}, 3, "M"));
        preguntas.put(25, new Pregunta("¿Quién fue el primer emperador romano?", new String[]{"Julio César", "Marco Aurelio", "Augusto", "Nerón"}, 3, "D"));
        preguntas.put(26, new Pregunta("¿Qué año comenzó la Primera Guerra Mundial?", new String[]{"1914", "1918", "1921", "1905"}, 1, "F"));
        preguntas.put(27, new Pregunta("¿Cuál es el planeta más grande del sistema solar?", new String[]{"Marte", "Saturno", "Júpiter", "Neptuno"}, 3, "M"));
        preguntas.put(28, new Pregunta("¿Quién fue el líder de la Revolución Cubana?", new String[]{"Che Guevara", "Raúl Castro", "Fidel Castro", "Hugo Chávez"}, 3, "F"));
        preguntas.put(29, new Pregunta("¿En qué año terminó la Segunda Guerra Mundial?", new String[]{"1945", "1942", "1939", "1948"}, 1, "M"));
        preguntas.put(30, new Pregunta("¿Cuál es la capital de Argentina?", new String[]{"Montevideo", "Santiago", "Bogotá", "Buenos Aires"}, 4, "D"));
	}

}
