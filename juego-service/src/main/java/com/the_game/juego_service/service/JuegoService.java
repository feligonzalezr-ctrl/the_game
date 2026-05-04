package com.the_game.juego_service.service;
import com.the_game.juego_service.model.Juego;
import com.the_game.juego_service.repository.JuegoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JuegoService {
    private final JuegoRepository juegoRepository;
    public JuegoService(JuegoRepository juegoRepository) {
        this.juegoRepository = juegoRepository;
    }

    public List<Juego> listarJuegos() {
        return juegoRepository.findAll();
    }

    public Juego agregarJuego(Juego juego) {
        return juegoRepository.save(juego);
    }

    public boolean datosValidos(Juego juego) {
        if (juego.getNombre() == null || juego.getNombre().isBlank()) {
            return false;
        }
        if (juego.getCategoria() == null || juego.getCategoria().isBlank()) {
            return false;
        }
        if (juego.getCantidadMinimaJugadores() < 0) {
            return false;
        }
        if (juego.getCantidadMaximaJugadores() < 0) {
            return false;
        }
        if (juego.getContenido() == null || juego.getContenido().isBlank()) {
            return false;
        }
        if (juego.getDificultad() == null ||   juego.getDificultad().isBlank()) {
            return false;
        }
        if(juego.getDuracionMinima() < 0){
            return false;
        }
        if(juego.getDuracionMaxima() < 0){
            return false;
        }
        if (juego.getJugabilidad() == null ||   juego.getJugabilidad().isBlank()) {
            return false;
        }
        return true;
    }
}
