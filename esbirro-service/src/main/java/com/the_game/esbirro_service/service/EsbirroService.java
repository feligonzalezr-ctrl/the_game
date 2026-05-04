package com.the_game.esbirro_service.service;

import com.the_game.esbirro_service.repository.EsbirroRepository;
import com.the_game.esbirro_service.model.Esbirro;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EsbirroService {

    private static EsbirroRepository esbirroRepository = null;
    public EsbirroService(EsbirroRepository esbirroRepository) {
        EsbirroService.esbirroRepository = esbirroRepository;
    }

    public List<Esbirro> listarEsbirrros(){
        return esbirroRepository.findAll();
    }

    public static Esbirro agregarEsbirro(Esbirro esbirro){
        return esbirroRepository.save(esbirro);
    }

    public boolean datosValidos(Esbirro esbirro){
        if(esbirro.getNombre() == null || esbirro.getNombre().isBlank()){
            return false;
        }
        if(esbirro.getRun() == null || esbirro.getRun().isBlank()){
            return false;
        }
        if(esbirro.getNick() == null || esbirro.getNick().isBlank()){
            return false;
        }
        if(esbirro.getEdad() <18 ){
            return false;
        }
        if(esbirro.getDisponibilidad() == null || esbirro.getDisponibilidad().isBlank()){
            return false;
        }
        return false;
    }
}
