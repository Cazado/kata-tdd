/*
	Escribir un programa que muestre en pantalla

	Los números del 1 al 100.
	Sustituye los múltiplos de 3 por la palabra “Tic”
	Sustituye los múltiplos de 5 por la palabra “Tac”
	Sustituye los múltiplos de 3 y 5 por la palabra “TicTac”


*/
class TicTacGame {

	String getNumber(int number) {
		if (number % 3 == 0 && number % 5 == 0 || String.valueOf(number).contains("5") && String.valueOf(number).contains("3")){
			return "TICTAC";
		}
		else if (number % 3 == 0 || String.valueOf(number).contains("3")){
			return "TIC";
		}
		else if (number % 5 == 0 || String.valueOf(number).contains("5")){
			return "TAC";
		}
		else {
			return String.valueOf(number);
		}
	}
}
