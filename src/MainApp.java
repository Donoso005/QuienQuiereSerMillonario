import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class MainApp {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Pregunta> preguntas = new ArrayList<>();
		Integer[][] preguntasSeleccionadas = new Integer[15][2];
		ArrayList<Integer> premios = new ArrayList<>();
		ArrayList<String> comodines = new ArrayList<>(Arrays.asList("50/50", "Cambiar Pregunta", "Publico"));
		
		int respuesta;
		boolean acierto=true, continuar=true;
		
		añadirPreguntasPremios(preguntas, premios);
		
		seleccionarPreguntas(preguntas, preguntasSeleccionadas, premios);
		
		do {
			for(int i=0;i<preguntasSeleccionadas.length;i++) {
				System.out.println("Pregunta número " + (i+1) + ":");
				preguntas.get(preguntasSeleccionadas[i][0]).imprimirPregunta();
				//llamarComodines(preguntasSeleccionadas, i);
				System.out.println("¿Cuál es su respuesta:");
				respuesta = sc.nextInt();
				if(respuesta == preguntas.get(preguntasSeleccionadas[i][0]).getCorrecta()) {
					System.out.println("Enhorabuena, has acertado");
					do {
						System.out.println("¿Que quieres hacer? \n 1. Seguir jugando \n 2. Plantarse");
						respuesta = sc.nextInt();
						switch(respuesta) {
						case 1:
							System.out.println("Vamos a por la siguiente pregunta");
							break;
						case 2:
							System.out.println("Un placer haber jugado, te llevas " + premios.get(i) + "€");
							continuar = false;						
							break;
						default:
							System.out.println("Opción no válida");
							break;
						}
					}while(respuesta<1 || respuesta>2);
				}else {
					System.out.println("Lo siento, has fallado");
					if(comodines.size()>0) {
						System.out.println("Se te ha eliminado un comodín, puedes seguir jugando");
						comodines.remove((int)(Math.random()*comodines.size()));
					}else {
						System.out.println("No te quedan más comodines para salvarte la vida, fin del juego");
						acierto = false;
						if(i>9) {
							System.out.println("Ganas " + premios.get(9) + "€ gracias al seguro");						
						}else if(i>4) {
							System.out.println("Ganas " + premios.get(4) + "€ gracias al seguro");	
						}else {
							System.out.println("Te vas con las manos vacías, no has podido asegurar nada");
						}
					}
					
				}	
			}
		}while(acierto && continuar);

	}
	
	public static void seleccionarPreguntas(ArrayList<Pregunta> preguntas, Integer[][] preguntasSeleccionadas, ArrayList<Integer> premios) {
		ArrayList<Integer> tipoPreguntas = new ArrayList<>();
		int contador = 0, numero;
		
		// Obtener Preguntas Faciles
		for(int i = 0; i < preguntas.size(); i++) {
			if(preguntas.get(i).getDificultad().equalsIgnoreCase("F")) {
				tipoPreguntas.add(i);
			}
		}
		
		do {
			numero = (int) (Math.random() * tipoPreguntas.size());

			preguntasSeleccionadas[contador][0] = numero;
			preguntasSeleccionadas[contador][1] = premios.get(contador);
			contador++;
			tipoPreguntas.remove(numero);
		}while(contador != 5);
		tipoPreguntas.clear();

		// Obtener Preguntas Medianas
		for(int i = 0; i < preguntas.size(); i++) {
			if(preguntas.get(i).getDificultad().equalsIgnoreCase("M")) {
				tipoPreguntas.add(i);
			}
		}
		
		do {
			numero = (int) (Math.random() * tipoPreguntas.size());

			preguntasSeleccionadas[contador][0] = numero;
			preguntasSeleccionadas[contador][1] = premios.get(contador);
			contador++;
			tipoPreguntas.remove(numero);
		}while(contador != 10);
		tipoPreguntas.clear();
		
		// Obtener Preguntas Dificiles
		for(int i = 0; i < preguntas.size(); i++) {
			if(preguntas.get(i).getDificultad().equalsIgnoreCase("D")) {
				tipoPreguntas.add(i);
			}
		}
		
		do {
			numero = (int) (Math.random() * tipoPreguntas.size());

			preguntasSeleccionadas[contador][0] = numero;
			preguntasSeleccionadas[contador][1] = premios.get(contador);
			contador++;
			tipoPreguntas.remove(numero);
		}while(contador != 15);
		tipoPreguntas.clear();

	}
	
	public static void llamarComodines(Integer[][] preguntasSeleccionadas, int indice) {
		System.out.println("Comodines Disponibles: ");
		
	}
	public static void usar5050(Integer[][] preguntasSeleccionadas, int indice) {
		for (int i=0;i<preguntasSeleccionadas.length;i++) {
			
		}
	}
	
	public static void añadirPreguntasPremios(ArrayList<Pregunta> preguntas, ArrayList<Integer> premios) {
        preguntas.add(new Pregunta("¿Cuál es el río más largo del mundo?", new String[]{"Nilo", "Mississippi", "Yangtsé", "Amazonas"}, 3, "M"));
        preguntas.add(new Pregunta("¿Quién escribió 'Don Quijote de la Mancha'?", new String[]{"García Márquez", "Borges", "Shakespeare", "Cervantes"}, 4, "F"));
        preguntas.add(new Pregunta("¿Cuál es el elemento químico más abundante en la Tierra?", new String[]{"Hierro", "Hidrógeno", "Carbono", "Oxígeno"}, 4, "F"));
        preguntas.add(new Pregunta("¿Cuál es el animal más grande del planeta Tierra?", new String[]{"Elefante", "Jirafa", "Tiburón ballena", "Ballena azul"}, 4, "D"));
        preguntas.add(new Pregunta("¿Cuál es la capital de Australia?", new String[]{"Melbourne", "Sídney", "Brisbane", "Canberra"}, 4, "M"));
        preguntas.add(new Pregunta("¿Qué famoso pintor cortó parte de su oreja?", new String[]{"Picasso", "Dalí", "Michelangelo", "Van Gogh"}, 4, "F"));
        preguntas.add(new Pregunta("¿Qué país tiene forma de bota?", new String[]{"España", "Grecia", "Portugal", "Italia"}, 4, "M"));
        preguntas.add(new Pregunta("¿Quién fue el primer presidente de los Estados Unidos?", new String[]{"Abraham Lincoln", "Thomas Jefferson", "Benjamin Franklin", "George Washington"}, 4, "D"));
        preguntas.add(new Pregunta("¿Cuál es el metal más caro del mundo?", new String[]{"Oro", "Platino", "Diamante", "Rodio"}, 4, "F"));
        preguntas.add(new Pregunta("¿En qué año comenzó la Segunda Guerra Mundial?", new String[]{"1945", "1929", "1918", "1939"}, 4, "D"));
        preguntas.add(new Pregunta("¿Qué animal es el símbolo de la paz?", new String[]{"León", "Paloma", "Elefante", "Tortuga"}, 2, "M"));
        preguntas.add(new Pregunta("¿Cuál es el país más poblado del mundo?", new String[]{"India", "Estados Unidos", "China", "Brasil"}, 3, "F"));
        preguntas.add(new Pregunta("¿Cuál es el océano más grande del mundo?", new String[]{"Atlántico", "Índico", "Pacífico", "Ártico"}, 3, "M"));
        preguntas.add(new Pregunta("¿Quién pintó la Mona Lisa?", new String[]{"Botticelli", "Michelangelo", "Rafael", "Leonardo da Vinci"}, 4, "F"));
        preguntas.add(new Pregunta("¿Cuál es la montaña más alta del mundo?", new String[]{"Mont Blanc", "K2", "Kilimanjaro", "Everest"}, 4, "D"));
        preguntas.add(new Pregunta("¿Qué idioma se habla en Brasil?", new String[]{"Español", "Inglés", "Portugués", "Italiano"}, 3, "F"));
        preguntas.add(new Pregunta("¿Cuál es el país más grande del mundo en términos de área?", new String[]{"Canadá", "Estados Unidos", "China", "Rusia"}, 4, "M"));
        preguntas.add(new Pregunta("¿Quién fue el primer hombre en la Luna?", new String[]{"Neil Armstrong", "Buzz Aldrin", "Michael Collins", "Yuri Gagarin"}, 1, "D"));
        preguntas.add(new Pregunta("¿Cuál es la capital de Rusia?", new String[]{"San Petersburgo", "Kiev", "Moscú", "Minsk"}, 3, "F"));
        preguntas.add(new Pregunta("¿Qué famoso científico desarrolló la teoría de la relatividad?", new String[]{"Isaac Newton", "Galileo Galilei", "Albert Einstein", "Stephen Hawking"}, 3, "M"));
        preguntas.add(new Pregunta("¿Cuál es la capital de Francia?", new String[]{"Madrid", "Roma", "Berlín", "París"}, 4, "F"));
        preguntas.add(new Pregunta("¿Cuál es el hueso más largo del cuerpo humano?", new String[]{"Húmero", "Radio", "Tibia", "Fémur"}, 4, "M"));
        preguntas.add(new Pregunta("¿Qué gas necesitan las plantas para realizar la fotosíntesis?", new String[]{"Oxígeno", "Nitrógeno", "Dióxido de carbono (CO2)", "Metano"}, 3, "F"));
        preguntas.add(new Pregunta("¿Cuál es el animal más rápido del mundo?", new String[]{"Águila", "Leopardo", "Guepardo", "Antílope"}, 3, "M"));
        preguntas.add(new Pregunta("¿Quién fue el primer emperador romano?", new String[]{"Julio César", "Marco Aurelio", "Augusto", "Nerón"}, 3, "D"));
        preguntas.add(new Pregunta("¿Qué año comenzó la Primera Guerra Mundial?", new String[]{"1914", "1918", "1921", "1905"}, 1, "F"));
        preguntas.add(new Pregunta("¿Cuál es el planeta más grande del sistema solar?", new String[]{"Marte", "Saturno", "Júpiter", "Neptuno"}, 3, "M"));
        preguntas.add(new Pregunta("¿Quién fue el líder de la Revolución Cubana?", new String[]{"Che Guevara", "Raúl Castro", "Fidel Castro", "Hugo Chávez"}, 3, "F"));
        preguntas.add(new Pregunta("¿En qué año terminó la Segunda Guerra Mundial?", new String[]{"1945", "1942", "1939", "1948"}, 1, "M"));
        preguntas.add(new Pregunta("¿Cuál es la capital de Argentina?", new String[]{"Montevideo", "Santiago", "Bogotá", "Buenos Aires"}, 4, "D"));
        
        premios.add(100);
		premios.add(250);
		premios.add(500);
		premios.add(750);
		premios.add(1500);
		premios.add(2500);
		premios.add(5000);
		premios.add(10000);
		premios.add(16000);
		premios.add(20000);
		premios.add(30000);
		premios.add(50000);
		premios.add(100000);
		premios.add(300000);
		premios.add(1000000);
	}

}
