package literatura.src.main.java.com.challenge.literatura.service;

public class ReqFinal {

    String titulo ;
    String nombre ;
    Long fechanacimiento ;
    Long fechamuerte ;

    public ReqFinal(ReqFilter reqfilter){
        this.titulo = reqfilter.title();
        this.nombre = reqfilter.name();
        this.fechanacimiento = reqfilter.birth_year();
        this.fechamuerte = reqfilter.birth_death();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getFechanacimiento() {
        return fechanacimiento;
    }

    public Long getFechamuerte() {
        return fechamuerte;
    }




}
