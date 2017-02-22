/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

/**
 *
 * @author JorgeRicardo
 */
public class Partido {

    private int numeroPartido;
    private String horario;
    private Equipo equipo1;
    private Equipo equipo2;

    public Partido(int numeroP, String horario, Equipo equipo1, Equipo equipo2) {
        this.numeroPartido = numeroPartido;
        this.horario = horario;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public int getNumeroPartido() {
        return numeroPartido;
    }

    public void setNumeroP(int numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
    
    @Override
    public String toString(){
        return "Partido \n"+getNumeroPartido()+"["+this.equipo1.getNombreEquipo()+" vs "+
                this.equipo2.getNombreEquipo()+"]"+ "\n Horario: "+getHorario();
                
    }
}
    

