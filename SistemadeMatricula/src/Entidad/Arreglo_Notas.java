package Entidad;

import java.util.ArrayList;

public class Arreglo_Notas {
	private ArrayList<CalcularNotas>Notas;
	
	public Arreglo_Notas()
	{
		Notas = new ArrayList<CalcularNotas>();
	}
	public void Adicionar(CalcularNotas x)
	{
		Notas.add(x);
	}
	public int Tamaño()
	{
		return Notas.size();
	}
	public CalcularNotas Obtener(int x)//Metodos
	{
		return Notas.get(x);
	}
}
