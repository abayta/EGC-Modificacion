import java.util.ArrayList;
import java.util.List;

public class BaseDatos{
	public static Voto Voto(String voto, Comunidad comunidad, String ciudad, String edad,
			String sexo, String provincia, String numeroT, String situacion,
			String nacionalidad) {
	
		 return new VotoImpl( voto,  comunidad,  ciudad,  edad,
			 sexo,  provincia,  numeroT,  situacion,
			 nacionalidad);		
		 // TODO Auto-generated constructor stub
	}
	public static Voto Voto(String voto,Comunidad comunidad){
		return new VotoImpl(voto,comunidad);
	}
	
	 public static void main(String args[]){
	Voto v1 = Voto("SI",Comunidad.GALICIA);
	Voto v2 = Voto("NO",Comunidad.ASTURIAS);
	Voto v3 = Voto("SI",Comunidad.CANTABRIA);
	Voto v4 = Voto("NO",Comunidad.PAISVASCO);
	Voto v5 = Voto("SI",Comunidad.NAVARRA);
	Voto v6 = Voto("NO",Comunidad.LARIOJA);
	Voto v7 = Voto("SI",Comunidad.ARAGON);
	Voto v8 = Voto("NO",Comunidad.CATALUNHA);
	Voto v9 = Voto("SI",Comunidad.MADRID);
	Voto v10 = Voto("NO",Comunidad.CASTILLAYLEON);
	Voto v11 = Voto("SI",Comunidad.EXTREMADURA);
	Voto v12 = Voto("NO",Comunidad.CASTILLALAMANCHA);
	Voto v13 = Voto("SI",Comunidad.COMUNIDADVALENCIANA);
	Voto v14 = Voto("NO",Comunidad.ANDALUCIA);
	Voto v15 = Voto("SI",Comunidad.REGIONDEMURCIA);
	Voto v16 = Voto("NO",Comunidad.ISLASBALEARES);
	Voto v17 = Voto("SI",Comunidad.ISLASCANARIAS);
	List<Voto> lvc= new ArrayList<Voto>();
		
		lvc.add(v1);
		lvc.add(v2);
		lvc.add(v3);
		lvc.add(v4);
		lvc.add(v5);
		lvc.add(v6);
		lvc.add(v7);
		lvc.add(v8);
		lvc.add(v9);
		lvc.add(v10);
		lvc.add(v11);
		lvc.add(v12);
		lvc.add(v13);
		lvc.add(v14);
		lvc.add(v15);
		lvc.add(v16);
		lvc.add(v17);
		
	System.out.println("Por criterio de Referendum hay una cantidad de votos en islas canarias de : "+ CriteriosDeModificacion.votosReferendum(lvc, true, Comunidad.ISLASCANARIAS));
	
	/*
	Voto v1X = Voto("SI","ANDALUCIA", "SEVILLA", "SEVILLA", "MUJER","924245856", "25","PARADO", "ESPANHsOL");
	Voto v2X = Voto("","","","","","","","","");
	Voto v3X = Voto("","","","","","","","","");
	Voto v4X = Voto("","","","","","","","","");
	Voto v5X = Voto("","","","","","","","","");
	Voto v6X = Voto("","","","","","","","","");
	Voto v7X = Voto("","","","","","","","","");
	Voto v8X = Voto("","","","","","","","","");
	Voto v9X = Voto("","","","","","","","","");
	Voto v10X = Voto("","","","","","","","","");
	Voto v11X = Voto("","","","","","","","","");
	Voto v12X = Voto("","","","","","","","","");
	Voto v13X = Voto("","","","","","","","","");
	Voto v14X = Voto("","","","","","","","","");
	Voto v15X = Voto("","","","","","","","","");
	Voto v16X = Voto("","","","","","","","","");
	Voto v17X = Voto("","","","","","","","","");
*/
}}
