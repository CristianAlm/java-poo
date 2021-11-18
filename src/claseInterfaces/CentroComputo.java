package claseInterfaces;

public class CentroComputo {
	
	private ColaEspera computadoras;
	private ColaEspera procesos;

	public CentroComputo() {
		this.computadoras = new ColaEspera();
		this.procesos = new ColaEspera();
	}
	public void addComputadoras(Computadora compu){//Hay que ordenar primero la mas rapida
		//Si hay procesos lo ejecute si no lo agrega
		if(compu == null) return;
		if(procesos.tieneElementos()){
			Proceso proc = (Proceso) procesos.getSiguiente();
			compu.ejecutarProceso(proc);
		}else computadoras.addElemento(compu);
	}
	public void addProcesos(Proceso proc){//Hay que ordenar primero la mas rapida
		if(proc == null) return;
		if(computadoras.tieneElementos()){
			Computadora libre = (Computadora)computadoras.getSiguiente();
			libre.ejecutarProceso(proc);
		}else{
			procesos.addElemento(proc);			
		}

	}
	public Computadora getSiguienteCompu(){
		//Hay que castear xq devuelve un elementoCola
		return (Computadora) computadoras.getSiguiente();
	}
	public Proceso getSiguienteProc(){
		return (Proceso) procesos.getSiguiente();
	}
}
