package com.briamcarrasco.gestiondeeventos.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.briamcarrasco.gestiondeeventos.model.Mascota;

@Service
public class MascotaService {
    private final List<Mascota> mascotas = new ArrayList<>();
    
    public MascotaService(){
        mascotas.add(new Mascota(1, "Negro", 6, "Perro", "Labrador", "Negro", "Macho"));
        mascotas.add(new Mascota(2, "Blanca", 4, "Gato", "Persa", "Blanco", "Hembra"));
        mascotas.add(new Mascota(3, "Rex", 5, "Perro", "Pastor Aleman", "Marron", "Macho"));
        mascotas.add(new Mascota(4, "Luna", 3, "Gato", "Siamés", "Gris", "Hembra"));
        mascotas.add(new Mascota(5, "Rocky", 2, "Perro", "Bulldog", "Blanco", "Macho"));
        mascotas.add(new Mascota(6, "Mimi", 1, "Gato", "Bengalí", "Naranja", "Hembra"));
        mascotas.add(new Mascota(7, "Toby", 7, "Perro", "Beagle", "Tricolor", "Macho"));
        mascotas.add(new Mascota(8, "Rob", 5, "Perro", "RedNoise", "Café", "Macho"));
    }

    public List<Mascota> obtenerMascotas() {
        return mascotas;
    } //Devuelve la lista de mascotas.

    public Optional<Mascota> obtenerMascotaPorId(int id) {
        return mascotas.stream()
                       .filter(mascota -> mascota.getId() == id)
                       .findFirst();
    } //Devuelve un mascota por su id.
}
