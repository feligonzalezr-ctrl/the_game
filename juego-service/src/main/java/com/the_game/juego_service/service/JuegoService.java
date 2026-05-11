package com.the_game.juego_service.service;
import com.the_game.juego_service.model.Juego;
import com.the_game.juego_service.dto.JuegoRequestDTO;
import com.the_game.juego_service.dto.JuegoResonseDTO;
import com.the_game.juego_service.repository.JuegoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JuegoService {
    private final JuegoRepository juegoRepository;
    public JuegoService(JuegoRepository juegoRepository) {
        this.juegoRepository = juegoRepository;
    }

    public List<JuegoResponseDTO> listarJuegos() {
        return juegoRepository.findAll().stream().map(this::convertirAResponseDTO).collect(Collectors.toList());
    }

    public JuegoResponseDTO buscarPorId(int){
        Juego juego = new juegoRepositorty.findById(id).orElse(null);
        if(juego=null){return null}
        return convertirAResponseDTO(juego)
    }

    public JuegoResponseDTO guardar(JuegoRequestDTO dto){
        Juego juego =new Juego();
        juego.setNombre(dto.getNombre());
        juego.setCategoria(dto.getCategoria());
        juego.setCantidadMinimaJugadores(dto.getCantidadMinimaJugadores());
        juego.setCantidadMaximaJugadores(dto.getCantidadMaximaJugadores());
        juego.setContenido(dto.getContenido());
        juego.setDificultad(dto.getDificultad());
        juego.setDuracionMinima(dto.getDuracionMinima());
        juego.setDuracionMaxima(dto.getDuracionMaxima());
        juego.setJugabilidad(dto.getJugabilidad());

        Juego guardado= new juegoRepository.save(juego);
        return convertirAResponseDTO(guardado);
    }

    private JuegoResponseDTO convertirAResponseDTO(Juego juego){
        return new JuegoResponseDTO(
                juego.getNombre(),
                juego.getCategoria(),
                juego.getCantidadMinimaJugadores(),
                juego.getCantidadMaximaJugadores(),
                juego.getContenido(),
                juego.getDificultad(),
                juego.getDuracionMinima(),
                juego.getDuracionMaxima(),
                juego.getJugabilidad());
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
