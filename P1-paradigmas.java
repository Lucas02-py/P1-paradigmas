import java.util.*;
import java.lang.*;
import java.io.*;

abstract class Personagem{
	public abstract void fala();
}

class Goku extends Personagem{
	public void fala(){
		System.out.println("Freezaaaaa, seu desgraçado!!");
	}
}
	
class Vegeta extends Personagem{
	public void fala(){
		System.out.println("Kakarottooooo!!");
	}
}

class Freeza extends Personagem{
	public void fala(){
		System.out.println("Saiyajin miserável!!");
	}
}

class Main{
	public static void main (String[] args){
		Personagem goku = new Goku();
		Personagem vegeta = new Vegeta();
		Personagem freeza = new Freeza();
		goku.fala();
		vegeta.fala();
		freeza.fala();
	}
}
