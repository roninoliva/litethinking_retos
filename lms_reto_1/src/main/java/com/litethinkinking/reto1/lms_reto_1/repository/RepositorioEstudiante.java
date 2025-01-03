package com.litethinkinking.reto1.lms_reto_1.repository;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import org.jeasy.random.api.Randomizer;
import org.springframework.stereotype.Component;

import com.litethinkinking.reto1.lms_reto_1.model.Direccion;
import com.litethinkinking.reto1.lms_reto_1.model.Estudiante;

import net.datafaker.Faker;

@Component
public class RepositorioEstudiante {

    public List<Estudiante> getAll(){
        Faker faker = new Faker();
        Random rand = new Random();

        // Generamos de forma aleatoria los datos de la direccion
        EasyRandomParameters direccionParameters = new EasyRandomParameters()
            .randomize(field -> field.getName().equals("calle"), (Randomizer<String>) faker.address()::streetName)
            .randomize(field -> field.getName().equals("ciudad"), (Randomizer<String>) faker.address()::city)
            .randomize(field -> field.getName().equals("estado"), (Randomizer<String>) faker.address()::state)
            .randomize(field -> field.getName().equals("codigoPostal"), (Randomizer<String>) faker.address()::zipCode)
            .randomize(field -> field.getName().equals("pais"), (Randomizer<String>) faker.address()::country);
        EasyRandom direccionRandom = new EasyRandom(direccionParameters);

        // Generamos de forma aleatoria los datos de los estudiantes
        EasyRandomParameters estudianteParameters = new EasyRandomParameters()
            .randomize(field -> field.getName().equals("nombre"), (Randomizer<String>) faker.name()::fullName)
            .randomize(field -> field.getName().equals("numeroCelular"), (Randomizer<String>) faker.phoneNumber()::cellPhone)
            .randomize(field -> field.getName().equals("correoElectronico"), (Randomizer<String>) faker.internet()::emailAddress)
            .randomize(field -> field.getName().equals("correoElectronico"), (Randomizer<String>) faker.internet()::emailAddress)
            .randomize(field -> field.getName().equals("numeroEstudiante"), () -> rand.nextInt(999))
            .randomize(field -> field.getName().equals("promedioNotas"), () -> {
                Float randomFloat = rand.nextFloat(1.0f, 10.0f);
                return Float.parseFloat(String.format("%.1f", randomFloat));
            });
        EasyRandom estudianteRandom = new EasyRandom(estudianteParameters);

        return Stream.generate(() -> {
            Direccion direccion = direccionRandom.nextObject(Direccion.class);
            Estudiante estudiante = estudianteRandom.nextObject(Estudiante.class);

            estudiante.setDireccion(direccion);

            return estudiante;
        }).limit(10).toList();
    }
}
