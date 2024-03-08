public class Pregunta {
	
	private String pregunta;
	private String[] respuestas = new String[4];
	private Integer correcta;
	private String dificultad;
	
	public Pregunta(String pregunta, String[] respuestas, Integer correcta, String dificultad) {
		this.pregunta = pregunta;
		this.respuestas = respuestas;
		this.correcta = correcta;
		this.dificultad = dificultad;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String[] getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(String[] respuestas) {
		this.respuestas = respuestas;
	}

	public Integer getCorrecta() {
		return correcta;
	}

	public void setCorrecta(Integer correcta) {
		this.correcta = correcta;
	}
	
	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public void imprimirPregunta() {
		System.out.println(pregunta);
		char[] letras = {'A', 'B', 'C', 'D'};
		for(int i = 0; i < respuestas.length; i++) {
			System.out.println(letras[i] + ") " + respuestas[i]);
		}
	}
	
	
}
