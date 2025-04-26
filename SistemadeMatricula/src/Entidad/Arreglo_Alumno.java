package Entidad;

import java.util.ArrayList;

public class Arreglo_Alumno {
	private ArrayList<Alumno>estu;
	
	public Arreglo_Alumno() 
	{
		estu = new ArrayList<Alumno>();
		
	}
	public void Adicionar(Alumno x)
	{
		estu.add(x);
	}
	public int Tamaño()
	{
		return estu.size();
	}
	public Alumno Obtener(int x)//Metodos
	{
		return estu.get(x);
	}
}
