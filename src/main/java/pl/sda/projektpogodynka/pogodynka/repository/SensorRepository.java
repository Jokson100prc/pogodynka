package pl.sda.projektpogodynka.pogodynka.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.sda.projektpogodynka.pogodynka.objects.Sensor;

@Repository
public interface SensorRepository extends MongoRepository<Sensor, String> {
}
