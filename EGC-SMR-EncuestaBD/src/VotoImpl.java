



public class VotoImpl implements Voto{

	private String voto;
//	private Tipos comunidad;
	private Comunidad comunidad;
	private Tipos comunity;
	private String ciudad;
	private String edad;
	private String sexo;
	private String provincia;
	private String numeroT;
	private String situacion;
	private String nacionalidad;
	
	public static Voto create(String voto,Comunidad comunidad,String ciudad,String edad,String sexo,String provincia,String numeroT,String situacion,String nacionalidad){
		return new VotoImpl(voto,comunidad,ciudad,edad,sexo,provincia,numeroT,situacion, nacionalidad);
	}
	public static Voto create(String voto,Comunidad comunidad){
		return new VotoImpl(voto, comunidad);
	}
public VotoImpl(String voto,Comunidad comunidad,String ciudad,String edad,String sexo,String provincia,String numeroT,String situacion,String nacionalidad){
	this.voto=voto;
	this.comunidad=comunidad;
	this.ciudad=ciudad;
	this.edad=edad;
	this.sexo=sexo;
	this.provincia=provincia;
	this.numeroT=numeroT;
	this.situacion=situacion;
	this.nacionalidad=nacionalidad;
}


public VotoImpl(String voto, Comunidad comunidad){
	this.voto= voto;
	this.comunidad=comunidad;
}
	@Override
	public String getVoto() {
		// TODO Auto-generated method stub
		return voto;
	}
	
	
	
	
// Si alguien encuentra el por que del error que lo haga y lo diga por wtas a ver que era.
	@Override
	public Comunidad getComunidad() {
		// TODO Auto-generated method stub
		return comunidad;
	}
	
	
 /*
	//el metodo de arriba es el bueno, a quien lo solucionara?
	public Tipos getComunidad(){
		return comunity;
	}
*/
	@Override
	public String getCiudad() {
		// TODO Auto-generated method stub
		return ciudad;
	}

	@Override
	public String getProvincia() {
		// TODO Auto-generated method stub
		return provincia;
	}

	@Override
	public String getSexo() {
		// TODO Auto-generated method stub
		return sexo;
	}

	@Override
	public String getNumeroT() {
		// TODO Auto-generated method stub
		return numeroT;
	}

	@Override
	public String getEdad() {
		// TODO Auto-generated method stub
		return edad;
	}

	@Override
	public String getSituacion() {
		// TODO Auto-generated method stub
		return situacion;
	}

	@Override
	public String getNacionalidad() {
		// TODO Auto-generated method stub
		return nacionalidad;
	}
	
	public String toString(){
		return "Ha votado: "+voto+" - Comunidad: " + comunidad;
	}
}
