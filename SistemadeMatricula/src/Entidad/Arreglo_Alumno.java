package Entidad;

import java.util.ArrayList;

public class Arreglo_Alumno {
	private ArrayList<Alumno>estu;
	
	public Arreglo_Alumno() 
	{
		estu = new ArrayList<Alumno>();
			Adicionar(new Alumno(003331, "76200369", "Ismael", "Yactayo", true));
			Adicionar(new Alumno(105831, "75669115", "Piero", "Sanchez", true));
			Adicionar(new Alumno(003331, "76450039", "Jose", "Perez", true));
		
	}
	public void Adicionar(Alumno x)
	{
		estu.add(x);
	}
	public int Tamaño()
	{
		return estu.size();
	}
	public Alumno Obtener(int x)
	{
		return estu.get(x);
	}
}
