/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;
import java.util.*;
/**
 *
 * @author JorgeRicardo
 */
public class Equipo {
    private String deporte;
    private String nombreEquipo;
    private ArrayList <Participante> participantes;
    
    public Equipo(String deporte, String nombreEquipo, ArrayList<Participante>participantes) {
        this.deporte = deporte;
        this.nombreEquipo = nombreEquipo;
        this.participantes = participantes;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    
     public boolean addParticipante(String nombre, String matricula){
        if (findParticipante(matricula)==false){
            this.participantes.add(new Participante(nombre,matricula));
            return true;
        }else{
            return false;
        }
    }
    public boolean addParticipante(Participante participante){
        if (findParticipante(participante.getMatricula())==false){
            this.participantes.add(participante);
            return true;
        }else{
            return false;
        }
    }
    public boolean removeParticipante(Participante participante){
        if (findParticipante(participante.getMatricula())==true){
            this.participantes.remove(participante);
            return true;
        }else{
            return false;
        }
    }
    public boolean removeParticipante(String nombre, String matricula){
        if (findParticipante(matricula)==true){
            this.participantes.remove(new Participante(nombre,matricula));
            return true;
        }else{
            return false;
        }
    }
    private boolean findParticipante(String matricula){
        if (!this.participantes.isEmpty()){
            for (Participante participante: participantes){
                if (participante.getMatricula().equals(matricula)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String temp;
        temp= "Equipo: "+this.nombreEquipo+"\n Deporte: "+this.deporte;
        
        for (Participante participante: participantes){
            temp+="Participante["+participante.toString();
        }
        return temp;        
    }
}
    


